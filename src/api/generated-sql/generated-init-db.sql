

DROP SCHEMA IF EXISTS iot_sensor CASCADE;
CREATE SCHEMA iot_sensor;
SET search_path TO iot_sensor;


CREATE TABLE sensor_node (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    sampling_rate INTEGER NOT NULL,
    location VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE server (
    id SERIAL PRIMARY KEY,
    sensor_node_id INTEGER NOT NULL REFERENCES sensor_node(id) ON DELETE CASCADE,
    name VARCHAR(100) NOT NULL,
    cpu_frequency INTEGER,
    ram_size INTEGER,
    os VARCHAR(50),
    type VARCHAR(20) NOT NULL CHECK (type IN ('Smartphone', 'PC', 'MainFrame', 'Cloud')),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT chk_server_specs CHECK (cpu_frequency > 0 AND ram_size > 0)
);

CREATE TABLE microcontroller_unit (
    id SERIAL PRIMARY KEY,
    sensor_node_id INTEGER NOT NULL REFERENCES sensor_node(id) ON DELETE CASCADE,
    name VARCHAR(100),
    type VARCHAR(20) NOT NULL CHECK (type IN ('ESP32', 'STM32', 'ARDUINO', 'ARM', 'AVR')),
    firmware VARCHAR(100),
    cpu_frequency INTEGER,
    ram_size INTEGER,
    flash_size INTEGER,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT chk_mcu_specs CHECK (cpu_frequency > 0 AND ram_size > 0 AND flash_size > 0)
);

CREATE TABLE sensor_module (
    id SERIAL PRIMARY KEY,
    sensor_node_id INTEGER NOT NULL REFERENCES sensor_node(id) ON DELETE CASCADE,
    name VARCHAR(100),
    sensor_type VARCHAR(20) NOT NULL CHECK (sensor_type IN ('TEMPERATURE', 'HUMIDITY', 'PRESSURE', 'CO2', 'MOTION', 'LIGHT')),
    unit VARCHAR(20) NOT NULL,
    min_value DECIMAL(10,2) NOT NULL,
    max_value DECIMAL(10,2) NOT NULL,
    microcontroller_id INTEGER,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_sensor_module_microcontroller
        FOREIGN KEY (microcontroller_id) REFERENCES microcontroller_unit(id) ON DELETE SET NULL,
    CONSTRAINT chk_sensor_range CHECK (min_value < max_value)
);

CREATE TABLE actuator_module (
    id SERIAL PRIMARY KEY,
    sensor_node_id INTEGER NOT NULL REFERENCES sensor_node(id) ON DELETE CASCADE,
    name VARCHAR(100),
    actuator_type VARCHAR(20) NOT NULL CHECK (actuator_type IN ('THERMOSTAT', 'RELAY', 'ALARM', 'SERVO', 'VALVE', 'LED')),
    command VARCHAR(100) NOT NULL,
    microcontroller_id INTEGER,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_actuator_module_microcontroller
        FOREIGN KEY (microcontroller_id) REFERENCES microcontroller_unit(id) ON DELETE SET NULL
);

CREATE TABLE communication_module (
    id SERIAL PRIMARY KEY,
    sensor_node_id INTEGER NOT NULL REFERENCES sensor_node(id) ON DELETE CASCADE,
    name VARCHAR(100),
    type VARCHAR(20) NOT NULL CHECK (type IN ('BLUETOOTH', 'WIFI', 'GPRS', 'FIVEG', 'SATELLITE')),
    protocol VARCHAR(50),
    baud_rate INTEGER,
    buffer INTEGER,
    mac_address VARCHAR(17),
    microcontroller_id INTEGER,
    server_id INTEGER,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_comm_microcontroller
        FOREIGN KEY (microcontroller_id) REFERENCES microcontroller_unit(id) ON DELETE SET NULL,
    CONSTRAINT fk_comm_server
        FOREIGN KEY (server_id) REFERENCES server(id) ON DELETE SET NULL,
    CONSTRAINT chk_baud_rate CHECK (baud_rate > 0),
    CONSTRAINT chk_buffer CHECK (buffer > 0)
);

CREATE TABLE power_module (
    id SERIAL PRIMARY KEY,
    sensor_node_id INTEGER NOT NULL REFERENCES sensor_node(id) ON DELETE CASCADE,
    name VARCHAR(100),
    type VARCHAR(20) NOT NULL CHECK (type IN ('BATTERYLITHIUM', 'WIREDAC', 'WIRELESS', 'UPS')),
    voltage_range VARCHAR(50),
    current_draw DECIMAL(10,2),
    microcontroller_id INTEGER,
    server_id INTEGER,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_power_microcontroller
        FOREIGN KEY (microcontroller_id) REFERENCES microcontroller_unit(id) ON DELETE SET NULL,
    CONSTRAINT fk_power_server
        FOREIGN KEY (server_id) REFERENCES server(id) ON DELETE SET NULL,
    CONSTRAINT chk_current_draw CHECK (current_draw > 0)
);

CREATE TABLE server_communication (
    server_id INTEGER NOT NULL REFERENCES server(id) ON DELETE CASCADE,
    communication_id INTEGER NOT NULL REFERENCES communication_module(id) ON DELETE CASCADE,
    PRIMARY KEY (server_id, communication_id)
);

CREATE TABLE server_power (
    server_id INTEGER NOT NULL REFERENCES server(id) ON DELETE CASCADE,
    power_id INTEGER NOT NULL REFERENCES power_module(id) ON DELETE CASCADE,
    PRIMARY KEY (server_id, power_id)
);



INSERT INTO sensor_node (name, sampling_rate, location)
VALUES ('GreenSmartHome 1', 10, 'Location 1 ');


INSERT INTO microcontroller_unit (
    sensor_node_id, name, type, firmware, cpu_frequency, ram_size, flash_size
) VALUES
    ((SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1'),
     'ESP32 ',
     'ESP32',
     'Version 1',
     1024.0,
     64.0,
     128.0)
,    ((SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1'),
     'STM32',
     'STM32',
     'Version 1',
     1024.0,
     128.0,
     64.0)
;


INSERT INTO sensor_module (
    sensor_node_id, name, sensor_type, unit, min_value, max_value
) VALUES
    ((SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1'),
     'Sensor Temperature',
     'TEMPERATURE',
     'Celsius',
     10.0,
     25.0)
;


INSERT INTO actuator_module (
    sensor_node_id, name, actuator_type, command
) VALUES
    ((SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1'),
     'Actuator Thermostat',
     'THERMOSTAT',
     'Start')
,    ((SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1'),
     'VALVE 1',
     'VALVE',
     'START')
;


INSERT INTO communication_module (
    sensor_node_id, name, type, protocol, baud_rate, buffer, mac_address
) VALUES
    ((SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1'),
     'Module GPRS',
     'GPRS',
     'TCP',
     120.0,
     64.0,
     'AD:12:25:15:CD')
,    ((SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1'),
     'GPRS',
     'GPRS',
     'UDP',
     128.0,
     64.0,
     'AD:32:DF:BA:34')
;


INSERT INTO power_module (
    sensor_node_id, name, type, voltage_range, current_draw
) VALUES
    ((SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1'),
     'Battery 3.7 v',
     'BATTERYLITHIUM',
     '3.7',
     1.0)
,    ((SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1'),
     'Battery',
     'BATTERYLITHIUM',
     '3.7',
     1.0)
;


INSERT INTO server (
    sensor_node_id, name, cpu_frequency, ram_size, os, type
) VALUES
    ((SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1'),
     'AWS VM 1',
     1024.0,
     128.0,   
     '',
     'Cloud')
;


UPDATE sensor_module
SET microcontroller_id = (
    SELECT id FROM microcontroller_unit
    WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
      AND name = 'ESP32 '
)
WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
  AND name = 'Sensor Temperature';

UPDATE actuator_module
SET microcontroller_id = (
    SELECT id FROM microcontroller_unit
    WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
      AND name = 'ESP32 '
)
WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
  AND name = 'Actuator Thermostat';
UPDATE actuator_module
SET microcontroller_id = (
    SELECT id FROM microcontroller_unit
    WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
      AND name = 'STM32'
)
WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
  AND name = 'VALVE 1';

UPDATE communication_module
SET microcontroller_id = (
    SELECT id FROM microcontroller_unit
    WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
      AND name = 'ESP32 '
)
WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
  AND name = 'Module GPRS';
UPDATE communication_module
SET microcontroller_id = (
    SELECT id FROM microcontroller_unit
    WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
      AND name = 'STM32'
)
WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
  AND name = 'GPRS';

UPDATE power_module
SET microcontroller_id = (
    SELECT id FROM microcontroller_unit
    WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
      AND name = 'ESP32 '
)
WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
  AND name = 'Battery 3.7 v';
UPDATE power_module
SET microcontroller_id = (
    SELECT id FROM microcontroller_unit
    WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
      AND name = 'STM32'
)
WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
  AND name = 'Battery';


UPDATE communication_module
SET server_id = (
    SELECT id FROM server
    WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
      AND name = 'AWS VM 1'
)
WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
  AND name = 'Module GPRS';
UPDATE communication_module
SET server_id = (
    SELECT id FROM server
    WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
      AND name = 'AWS VM 1'
)
WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
  AND name = 'GPRS';


    -- Link Server 'AWS VM 1' → Communication 'Module GPRS'
    INSERT INTO server_communication (server_id, communication_id)
    VALUES (
        (SELECT id FROM server 
         WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
           AND name = 'AWS VM 1'),
        (SELECT id FROM communication_module 
         WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
           AND name = 'Module GPRS')
    )
    ON CONFLICT (server_id, communication_id) DO NOTHING;
    -- Link Server 'AWS VM 1' → Communication 'GPRS'
    INSERT INTO server_communication (server_id, communication_id)
    VALUES (
        (SELECT id FROM server 
         WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
           AND name = 'AWS VM 1'),
        (SELECT id FROM communication_module 
         WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = 'GreenSmartHome 1')
           AND name = 'GPRS')
    )
    ON CONFLICT (server_id, communication_id) DO NOTHING;


CREATE OR REPLACE VIEW sensor_node_full AS
SELECT
    sn.id AS node_id,
    sn.name AS node_name,
    sn.location,
    sn.sampling_rate,
    sm.name AS sensor_name,
    sm.sensor_type,
    sm.unit,
    sm.min_value,
    sm.max_value,
    am.name AS actuator_name,
    am.actuator_type,
    am.command,
    mcu.name AS mcu_name,
    mcu.type AS mcu_type,
    cm.name AS comm_name,
    cm.type AS comm_type,
    cm.protocol,
    pm.name AS power_name,
    pm.type AS power_type,
    pm.voltage_range,
    s.name AS server_name,
    s.type AS server_type
FROM sensor_node sn
LEFT JOIN sensor_module sm ON sm.sensor_node_id = sn.id
LEFT JOIN actuator_module am ON am.sensor_node_id = sn.id
LEFT JOIN microcontroller_unit mcu ON mcu.sensor_node_id = sn.id
LEFT JOIN communication_module cm ON cm.sensor_node_id = sn.id
LEFT JOIN power_module pm ON pm.sensor_node_id = sn.id
LEFT JOIN server s ON s.sensor_node_id = sn.id;

CREATE OR REPLACE VIEW node_summary AS
SELECT
    sn.name AS node_name,
    sn.location,
    sn.sampling_rate,
    COUNT(DISTINCT sm.id) AS sensor_count,
    COUNT(DISTINCT am.id) AS actuator_count,
    COUNT(DISTINCT cm.id) AS comm_count,
    COUNT(DISTINCT pm.id) AS power_count,
    CASE WHEN mcu.id IS NOT NULL THEN 'Yes' ELSE 'No' END AS has_microcontroller,
    CASE WHEN s.id IS NOT NULL THEN 'Yes' ELSE 'No' END AS has_server
FROM sensor_node sn
LEFT JOIN sensor_module sm ON sm.sensor_node_id = sn.id
LEFT JOIN actuator_module am ON am.sensor_node_id = sn.id
LEFT JOIN communication_module cm ON cm.sensor_node_id = sn.id
LEFT JOIN power_module pm ON pm.sensor_node_id = sn.id
LEFT JOIN microcontroller_unit mcu ON mcu.sensor_node_id = sn.id
LEFT JOIN server s ON s.sensor_node_id = sn.id
GROUP BY sn.id, sn.name, sn.location, sn.sampling_rate, mcu.id, s.id;

CREATE OR REPLACE VIEW node_module_counts AS
SELECT
    sn.name AS node_name,
    (SELECT COUNT(*) FROM sensor_module WHERE sensor_node_id = sn.id) AS sensor_modules,
    (SELECT COUNT(*) FROM actuator_module WHERE sensor_node_id = sn.id) AS actuator_modules,
    (SELECT COUNT(*) FROM communication_module WHERE sensor_node_id = sn.id) AS communication_modules,
    (SELECT COUNT(*) FROM power_module WHERE sensor_node_id = sn.id) AS power_modules,
    (SELECT COUNT(*) FROM microcontroller_unit WHERE sensor_node_id = sn.id) AS microcontrollers,
    (SELECT COUNT(*) FROM server WHERE sensor_node_id = sn.id) AS servers
FROM sensor_node sn;

CREATE OR REPLACE FUNCTION get_node_power_consumption(node_name VARCHAR)
RETURNS DECIMAL(10,2) AS $$
DECLARE
    total_power DECIMAL(10,2);
BEGIN
    SELECT COALESCE(SUM(pm.current_draw), 0)
    INTO total_power
    FROM sensor_node sn
    JOIN power_module pm ON pm.sensor_node_id = sn.id
    WHERE sn.name = node_name;
    RETURN total_power;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_active_modules(node_name VARCHAR)
RETURNS INTEGER AS $$
DECLARE
    total_modules INTEGER;
BEGIN
    SELECT COUNT(*) INTO total_modules
    FROM (
        SELECT id FROM sensor_module WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = node_name)
        UNION ALL
        SELECT id FROM actuator_module WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = node_name)
        UNION ALL
        SELECT id FROM communication_module WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = node_name)
        UNION ALL
        SELECT id FROM power_module WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = node_name)
        UNION ALL
        SELECT id FROM microcontroller_unit WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = node_name)
        UNION ALL
        SELECT id FROM server WHERE sensor_node_id = (SELECT id FROM sensor_node WHERE name = node_name)
    ) AS all_modules;
    RETURN total_modules;
END;
$$ LANGUAGE plpgsql;


SELECT 'Sensor Node: GreenSmartHome 1' AS "Summary";
SELECT 'Generation complete!' AS "Status";
SELECT * FROM node_module_counts WHERE node_name = 'GreenSmartHome 1';

