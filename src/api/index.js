const express = require('express');
const { Pool } = require('pg');
const cors = require('cors');
const helmet = require('helmet');
const morgan = require('morgan');
require('dotenv').config();

const app = express();
const PORT = process.env.PORT || 3000;

// Middleware
app.use(helmet());
app.use(cors());
app.use(morgan('combined'));
app.use(express.json());

// Database Pool
const pool = new Pool({
  host: process.env.DB_HOST || 'localhost',
  port: process.env.DB_PORT || 5432,
  database: process.env.DB_NAME || 'iot_sensor',
  user: process.env.DB_USER || 'postgres',
  password: process.env.DB_PASSWORD || 'postgres',
  schema: 'iot_sensor'
});

// Test DB Connection
pool.query('SELECT NOW()', (err) => {
  if (err) console.error('Database connection error', err);
  else console.log('✅ Connected to PostgreSQL (iot_sensor schema)');
});

// ====================== GENERIC CRUD HELPER ======================
const createCRUD = (table, idField = 'id') => {
  const base = `/api/${table.replace(/_/g, '-')}`;
  
  // GET ALL
  app.get(base, async (req, res) => {
    try {
      const result = await pool.query(`SELECT * FROM iot_sensor.${table} ORDER BY ${idField}`);
      res.json(result.rows);
    } catch (err) {
      res.status(500).json({ error: err.message });
    }
  });

  // GET ONE
  app.get(`${base}/:id`, async (req, res) => {
    try {
      const result = await pool.query(`SELECT * FROM iot_sensor.${table} WHERE ${idField} = $1`, [req.params.id]);
      if (result.rows.length === 0) return res.status(404).json({ message: `${table} not found` });
      res.json(result.rows[0]);
    } catch (err) {
      res.status(500).json({ error: err.message });
    }
  });

  // CREATE
  app.post(base, async (req, res) => {
    const columns = Object.keys(req.body);
    const values = Object.values(req.body);
    const placeholders = columns.map((_, i) => `$${i+1}`).join(', ');
    
    try {
      const result = await pool.query(
        `INSERT INTO iot_sensor.${table} (${columns.join(', ')}) VALUES (${placeholders}) RETURNING *`,
        values
      );
      res.status(201).json(result.rows[0]);
    } catch (err) {
      res.status(400).json({ error: err.message });
    }
  });

  // UPDATE
  app.put(`${base}/:id`, async (req, res) => {
    const updates = Object.keys(req.body).map((key, i) => `${key} = $${i+1}`);
    const values = [...Object.values(req.body), req.params.id];
    
    try {
      const result = await pool.query(
        `UPDATE iot_sensor.${table} SET ${updates.join(', ')} WHERE ${idField} = $${values.length} RETURNING *`,
        values
      );
      if (result.rows.length === 0) return res.status(404).json({ message: `${table} not found` });
      res.json(result.rows[0]);
    } catch (err) {
      res.status(400).json({ error: err.message });
    }
  });

  // DELETE
  app.delete(`${base}/:id`, async (req, res) => {
    try {
      const result = await pool.query(`DELETE FROM iot_sensor.${table} WHERE ${idField} = $1 RETURNING *`, [req.params.id]);
      if (result.rows.length === 0) return res.status(404).json({ message: `${table} not found` });
      res.json({ message: `${table} deleted successfully`, deleted: result.rows[0] });
    } catch (err) {
      res.status(500).json({ error: err.message });
    }
  });
};

// ====================== APPLY CRUD TO ALL ENTITIES ======================
createCRUD('sensor_node');
createCRUD('microcontroller_unit');
createCRUD('sensor_module');
createCRUD('actuator_module');
createCRUD('communication_module');
createCRUD('power_module');
createCRUD('server');

// Junction Tables
createCRUD('server_communication', 'server_id');   // Note: composite PK, adjust queries if needed
createCRUD('server_power', 'server_id');

// ====================== VIEWS & FUNCTIONS ======================
app.get('/views/sensor-node-full', async (req, res) => {
  try {
    const result = await pool.query('SELECT * FROM iot_sensor.sensor_node_full');
    res.json(result.rows);
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
});

app.get('/views/node-summary', async (req, res) => {
  try {
    const result = await pool.query('SELECT * FROM iot_sensor.node_summary');
    res.json(result.rows);
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
});

app.get('/views/node-module-counts', async (req, res) => {
  try {
    const result = await pool.query('SELECT * FROM iot_sensor.node_module_counts');
    res.json(result.rows);
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
});

app.get('/functions/power-consumption/:nodeName', async (req, res) => {
  try {
    const result = await pool.query('SELECT get_node_power_consumption($1)', [req.params.nodeName]);
    res.json({ node_name: req.params.nodeName, total_power: result.rows[0].get_node_power_consumption });
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
});

app.get('/functions/active-modules/:nodeName', async (req, res) => {
  try {
    const result = await pool.query('SELECT get_active_modules($1)', [req.params.nodeName]);
    res.json({ node_name: req.params.nodeName, active_modules: result.rows[0].get_active_modules });
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
});

// Health Check
app.get('/', (req, res) => {
  res.json({ 
    message: 'IoT Sensor REST API is running!',
    endpoints: 'Visit /api/sensor-nodes, /api/sensor-modules, etc.'
  });
});

app.listen(PORT, () => {
  console.log(`🚀 Server running on http://localhost:${PORT}`);
});