/**
 */
package iot.sensornetwork;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iot.sensornetwork.SensornetworkFactory
 * @model kind="package"
 * @generated
 */
public interface SensornetworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sensornetwork";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sensornetwork";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sensornetwork";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SensornetworkPackage eINSTANCE = iot.sensornetwork.impl.SensornetworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link iot.sensornetwork.impl.SensorNodeImpl <em>Sensor Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.sensornetwork.impl.SensorNodeImpl
	 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getSensorNode()
	 * @generated
	 */
	int SENSOR_NODE = 0;

	/**
	 * The feature id for the '<em><b>Has Sensor Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE__HAS_SENSOR_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Has Actuator Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE__HAS_ACTUATOR_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Has Communication Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE__HAS_COMMUNICATION_MODULE = 2;

	/**
	 * The feature id for the '<em><b>Has Power Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE__HAS_POWER_MODULE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE__SAMPLING_RATE = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE__LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Has Microcontroller Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE__HAS_MICROCONTROLLER_UNIT = 7;

	/**
	 * The feature id for the '<em><b>Has Server</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE__HAS_SERVER = 8;

	/**
	 * The number of structural features of the '<em>Sensor Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Sensor Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iot.sensornetwork.impl.SensorModuleImpl <em>Sensor Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.sensornetwork.impl.SensorModuleImpl
	 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getSensorModule()
	 * @generated
	 */
	int SENSOR_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Sensor To Microcontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__SENSOR_TO_MICROCONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__UNIT = 2;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__MIN_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__MAX_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE__NAME = 5;

	/**
	 * The number of structural features of the '<em>Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Sensor Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iot.sensornetwork.impl.ActuatorModuleImpl <em>Actuator Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.sensornetwork.impl.ActuatorModuleImpl
	 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getActuatorModule()
	 * @generated
	 */
	int ACTUATOR_MODULE = 2;

	/**
	 * The feature id for the '<em><b>Actuator To Microcontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_MODULE__ACTUATOR_TO_MICROCONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_MODULE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_MODULE__COMMAND = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_MODULE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Actuator Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_MODULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Actuator Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iot.sensornetwork.impl.MicrocontrollerUnitImpl <em>Microcontroller Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.sensornetwork.impl.MicrocontrollerUnitImpl
	 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getMicrocontrollerUnit()
	 * @generated
	 */
	int MICROCONTROLLER_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Microcontroller To Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Microcontroller To Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_ACTUATOR = 1;

	/**
	 * The feature id for the '<em><b>Microcontroller To Communication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_COMMUNICATION = 2;

	/**
	 * The feature id for the '<em><b>Microcontroller To Power</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_POWER = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_UNIT__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Firmware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_UNIT__FIRMWARE = 5;

	/**
	 * The feature id for the '<em><b>Cpu Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_UNIT__CPU_FREQUENCY = 6;

	/**
	 * The feature id for the '<em><b>Ram Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_UNIT__RAM_SIZE = 7;

	/**
	 * The feature id for the '<em><b>Flash Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_UNIT__FLASH_SIZE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_UNIT__NAME = 9;

	/**
	 * The number of structural features of the '<em>Microcontroller Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_UNIT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Microcontroller Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iot.sensornetwork.impl.PowerModuleImpl <em>Power Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.sensornetwork.impl.PowerModuleImpl
	 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getPowerModule()
	 * @generated
	 */
	int POWER_MODULE = 4;

	/**
	 * The feature id for the '<em><b>Power To Microcontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_MODULE__POWER_TO_MICROCONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_MODULE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Voltage Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_MODULE__VOLTAGE_RANGE = 2;

	/**
	 * The feature id for the '<em><b>Current Draw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_MODULE__CURRENT_DRAW = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_MODULE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Power Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_MODULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Power Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iot.sensornetwork.impl.CommunicationModuleImpl <em>Communication Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.sensornetwork.impl.CommunicationModuleImpl
	 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getCommunicationModule()
	 * @generated
	 */
	int COMMUNICATION_MODULE = 5;

	/**
	 * The feature id for the '<em><b>Communication To Microcontroller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MODULE__COMMUNICATION_TO_MICROCONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MODULE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MODULE__PROTOCOL = 2;

	/**
	 * The feature id for the '<em><b>Baud Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MODULE__BAUD_RATE = 3;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MODULE__BUFFER = 4;

	/**
	 * The feature id for the '<em><b>Mac Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MODULE__MAC_ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MODULE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Communication To Server</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MODULE__COMMUNICATION_TO_SERVER = 7;

	/**
	 * The number of structural features of the '<em>Communication Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MODULE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Communication Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iot.sensornetwork.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.sensornetwork.impl.ServerImpl
	 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cpu Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CPU_FREQUENCY = 1;

	/**
	 * The feature id for the '<em><b>Ram Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__RAM_SIZE = 2;

	/**
	 * The feature id for the '<em><b>OS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__OS = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Server To Communication</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_TO_COMMUNICATION = 5;

	/**
	 * The feature id for the '<em><b>Server To Power</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_TO_POWER = 6;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iot.sensornetwork.SensorType <em>Sensor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.sensornetwork.SensorType
	 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 7;

	/**
	 * The meta object id for the '{@link iot.sensornetwork.ActuatorType <em>Actuator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.sensornetwork.ActuatorType
	 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getActuatorType()
	 * @generated
	 */
	int ACTUATOR_TYPE = 8;

	/**
	 * The meta object id for the '{@link iot.sensornetwork.MicrocontrollerunitType <em>Microcontrollerunit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.sensornetwork.MicrocontrollerunitType
	 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getMicrocontrollerunitType()
	 * @generated
	 */
	int MICROCONTROLLERUNIT_TYPE = 9;

	/**
	 * The meta object id for the '{@link iot.sensornetwork.CommunicationType <em>Communication Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.sensornetwork.CommunicationType
	 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getCommunicationType()
	 * @generated
	 */
	int COMMUNICATION_TYPE = 10;

	/**
	 * The meta object id for the '{@link iot.sensornetwork.PowerType <em>Power Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.sensornetwork.PowerType
	 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getPowerType()
	 * @generated
	 */
	int POWER_TYPE = 11;

	/**
	 * The meta object id for the '{@link iot.sensornetwork.ServerType <em>Server Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iot.sensornetwork.ServerType
	 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getServerType()
	 * @generated
	 */
	int SERVER_TYPE = 12;

	/**
	 * Returns the meta object for class '{@link iot.sensornetwork.SensorNode <em>Sensor Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Node</em>'.
	 * @see iot.sensornetwork.SensorNode
	 * @generated
	 */
	EClass getSensorNode();

	/**
	 * Returns the meta object for the containment reference list '{@link iot.sensornetwork.SensorNode#getHasSensorModule <em>Has Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Sensor Module</em>'.
	 * @see iot.sensornetwork.SensorNode#getHasSensorModule()
	 * @see #getSensorNode()
	 * @generated
	 */
	EReference getSensorNode_HasSensorModule();

	/**
	 * Returns the meta object for the containment reference list '{@link iot.sensornetwork.SensorNode#getHasActuatorModule <em>Has Actuator Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Actuator Module</em>'.
	 * @see iot.sensornetwork.SensorNode#getHasActuatorModule()
	 * @see #getSensorNode()
	 * @generated
	 */
	EReference getSensorNode_HasActuatorModule();

	/**
	 * Returns the meta object for the containment reference list '{@link iot.sensornetwork.SensorNode#getHasCommunicationModule <em>Has Communication Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Communication Module</em>'.
	 * @see iot.sensornetwork.SensorNode#getHasCommunicationModule()
	 * @see #getSensorNode()
	 * @generated
	 */
	EReference getSensorNode_HasCommunicationModule();

	/**
	 * Returns the meta object for the containment reference list '{@link iot.sensornetwork.SensorNode#getHasPowerModule <em>Has Power Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Power Module</em>'.
	 * @see iot.sensornetwork.SensorNode#getHasPowerModule()
	 * @see #getSensorNode()
	 * @generated
	 */
	EReference getSensorNode_HasPowerModule();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.SensorNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iot.sensornetwork.SensorNode#getName()
	 * @see #getSensorNode()
	 * @generated
	 */
	EAttribute getSensorNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.SensorNode#getSamplingRate <em>Sampling Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sampling Rate</em>'.
	 * @see iot.sensornetwork.SensorNode#getSamplingRate()
	 * @see #getSensorNode()
	 * @generated
	 */
	EAttribute getSensorNode_SamplingRate();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.SensorNode#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see iot.sensornetwork.SensorNode#getLocation()
	 * @see #getSensorNode()
	 * @generated
	 */
	EAttribute getSensorNode_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link iot.sensornetwork.SensorNode#getHasMicrocontrollerUnit <em>Has Microcontroller Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Microcontroller Unit</em>'.
	 * @see iot.sensornetwork.SensorNode#getHasMicrocontrollerUnit()
	 * @see #getSensorNode()
	 * @generated
	 */
	EReference getSensorNode_HasMicrocontrollerUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link iot.sensornetwork.SensorNode#getHasServer <em>Has Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Server</em>'.
	 * @see iot.sensornetwork.SensorNode#getHasServer()
	 * @see #getSensorNode()
	 * @generated
	 */
	EReference getSensorNode_HasServer();

	/**
	 * Returns the meta object for class '{@link iot.sensornetwork.SensorModule <em>Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Module</em>'.
	 * @see iot.sensornetwork.SensorModule
	 * @generated
	 */
	EClass getSensorModule();

	/**
	 * Returns the meta object for the reference '{@link iot.sensornetwork.SensorModule#getSensorToMicrocontroller <em>Sensor To Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor To Microcontroller</em>'.
	 * @see iot.sensornetwork.SensorModule#getSensorToMicrocontroller()
	 * @see #getSensorModule()
	 * @generated
	 */
	EReference getSensorModule_SensorToMicrocontroller();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.SensorModule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see iot.sensornetwork.SensorModule#getType()
	 * @see #getSensorModule()
	 * @generated
	 */
	EAttribute getSensorModule_Type();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.SensorModule#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see iot.sensornetwork.SensorModule#getUnit()
	 * @see #getSensorModule()
	 * @generated
	 */
	EAttribute getSensorModule_Unit();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.SensorModule#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see iot.sensornetwork.SensorModule#getMinValue()
	 * @see #getSensorModule()
	 * @generated
	 */
	EAttribute getSensorModule_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.SensorModule#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see iot.sensornetwork.SensorModule#getMaxValue()
	 * @see #getSensorModule()
	 * @generated
	 */
	EAttribute getSensorModule_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.SensorModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iot.sensornetwork.SensorModule#getName()
	 * @see #getSensorModule()
	 * @generated
	 */
	EAttribute getSensorModule_Name();

	/**
	 * Returns the meta object for class '{@link iot.sensornetwork.ActuatorModule <em>Actuator Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Module</em>'.
	 * @see iot.sensornetwork.ActuatorModule
	 * @generated
	 */
	EClass getActuatorModule();

	/**
	 * Returns the meta object for the reference '{@link iot.sensornetwork.ActuatorModule#getActuatorToMicrocontroller <em>Actuator To Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator To Microcontroller</em>'.
	 * @see iot.sensornetwork.ActuatorModule#getActuatorToMicrocontroller()
	 * @see #getActuatorModule()
	 * @generated
	 */
	EReference getActuatorModule_ActuatorToMicrocontroller();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.ActuatorModule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see iot.sensornetwork.ActuatorModule#getType()
	 * @see #getActuatorModule()
	 * @generated
	 */
	EAttribute getActuatorModule_Type();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.ActuatorModule#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see iot.sensornetwork.ActuatorModule#getCommand()
	 * @see #getActuatorModule()
	 * @generated
	 */
	EAttribute getActuatorModule_Command();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.ActuatorModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iot.sensornetwork.ActuatorModule#getName()
	 * @see #getActuatorModule()
	 * @generated
	 */
	EAttribute getActuatorModule_Name();

	/**
	 * Returns the meta object for class '{@link iot.sensornetwork.MicrocontrollerUnit <em>Microcontroller Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microcontroller Unit</em>'.
	 * @see iot.sensornetwork.MicrocontrollerUnit
	 * @generated
	 */
	EClass getMicrocontrollerUnit();

	/**
	 * Returns the meta object for the reference '{@link iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToSensor <em>Microcontroller To Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Microcontroller To Sensor</em>'.
	 * @see iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToSensor()
	 * @see #getMicrocontrollerUnit()
	 * @generated
	 */
	EReference getMicrocontrollerUnit_MicrocontrollerToSensor();

	/**
	 * Returns the meta object for the reference '{@link iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToActuator <em>Microcontroller To Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Microcontroller To Actuator</em>'.
	 * @see iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToActuator()
	 * @see #getMicrocontrollerUnit()
	 * @generated
	 */
	EReference getMicrocontrollerUnit_MicrocontrollerToActuator();

	/**
	 * Returns the meta object for the reference '{@link iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToCommunication <em>Microcontroller To Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Microcontroller To Communication</em>'.
	 * @see iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToCommunication()
	 * @see #getMicrocontrollerUnit()
	 * @generated
	 */
	EReference getMicrocontrollerUnit_MicrocontrollerToCommunication();

	/**
	 * Returns the meta object for the reference '{@link iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToPower <em>Microcontroller To Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Microcontroller To Power</em>'.
	 * @see iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToPower()
	 * @see #getMicrocontrollerUnit()
	 * @generated
	 */
	EReference getMicrocontrollerUnit_MicrocontrollerToPower();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.MicrocontrollerUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see iot.sensornetwork.MicrocontrollerUnit#getType()
	 * @see #getMicrocontrollerUnit()
	 * @generated
	 */
	EAttribute getMicrocontrollerUnit_Type();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.MicrocontrollerUnit#getFirmware <em>Firmware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firmware</em>'.
	 * @see iot.sensornetwork.MicrocontrollerUnit#getFirmware()
	 * @see #getMicrocontrollerUnit()
	 * @generated
	 */
	EAttribute getMicrocontrollerUnit_Firmware();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.MicrocontrollerUnit#getCpuFrequency <em>Cpu Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Frequency</em>'.
	 * @see iot.sensornetwork.MicrocontrollerUnit#getCpuFrequency()
	 * @see #getMicrocontrollerUnit()
	 * @generated
	 */
	EAttribute getMicrocontrollerUnit_CpuFrequency();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.MicrocontrollerUnit#getRamSize <em>Ram Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Size</em>'.
	 * @see iot.sensornetwork.MicrocontrollerUnit#getRamSize()
	 * @see #getMicrocontrollerUnit()
	 * @generated
	 */
	EAttribute getMicrocontrollerUnit_RamSize();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.MicrocontrollerUnit#getFlashSize <em>Flash Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flash Size</em>'.
	 * @see iot.sensornetwork.MicrocontrollerUnit#getFlashSize()
	 * @see #getMicrocontrollerUnit()
	 * @generated
	 */
	EAttribute getMicrocontrollerUnit_FlashSize();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.MicrocontrollerUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iot.sensornetwork.MicrocontrollerUnit#getName()
	 * @see #getMicrocontrollerUnit()
	 * @generated
	 */
	EAttribute getMicrocontrollerUnit_Name();

	/**
	 * Returns the meta object for class '{@link iot.sensornetwork.PowerModule <em>Power Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Module</em>'.
	 * @see iot.sensornetwork.PowerModule
	 * @generated
	 */
	EClass getPowerModule();

	/**
	 * Returns the meta object for the reference '{@link iot.sensornetwork.PowerModule#getPowerToMicrocontroller <em>Power To Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power To Microcontroller</em>'.
	 * @see iot.sensornetwork.PowerModule#getPowerToMicrocontroller()
	 * @see #getPowerModule()
	 * @generated
	 */
	EReference getPowerModule_PowerToMicrocontroller();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.PowerModule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see iot.sensornetwork.PowerModule#getType()
	 * @see #getPowerModule()
	 * @generated
	 */
	EAttribute getPowerModule_Type();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.PowerModule#getVoltageRange <em>Voltage Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Range</em>'.
	 * @see iot.sensornetwork.PowerModule#getVoltageRange()
	 * @see #getPowerModule()
	 * @generated
	 */
	EAttribute getPowerModule_VoltageRange();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.PowerModule#getCurrentDraw <em>Current Draw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Draw</em>'.
	 * @see iot.sensornetwork.PowerModule#getCurrentDraw()
	 * @see #getPowerModule()
	 * @generated
	 */
	EAttribute getPowerModule_CurrentDraw();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.PowerModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iot.sensornetwork.PowerModule#getName()
	 * @see #getPowerModule()
	 * @generated
	 */
	EAttribute getPowerModule_Name();

	/**
	 * Returns the meta object for class '{@link iot.sensornetwork.CommunicationModule <em>Communication Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Module</em>'.
	 * @see iot.sensornetwork.CommunicationModule
	 * @generated
	 */
	EClass getCommunicationModule();

	/**
	 * Returns the meta object for the reference '{@link iot.sensornetwork.CommunicationModule#getCommunicationToMicrocontroller <em>Communication To Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication To Microcontroller</em>'.
	 * @see iot.sensornetwork.CommunicationModule#getCommunicationToMicrocontroller()
	 * @see #getCommunicationModule()
	 * @generated
	 */
	EReference getCommunicationModule_CommunicationToMicrocontroller();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.CommunicationModule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see iot.sensornetwork.CommunicationModule#getType()
	 * @see #getCommunicationModule()
	 * @generated
	 */
	EAttribute getCommunicationModule_Type();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.CommunicationModule#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see iot.sensornetwork.CommunicationModule#getProtocol()
	 * @see #getCommunicationModule()
	 * @generated
	 */
	EAttribute getCommunicationModule_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.CommunicationModule#getBaudRate <em>Baud Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baud Rate</em>'.
	 * @see iot.sensornetwork.CommunicationModule#getBaudRate()
	 * @see #getCommunicationModule()
	 * @generated
	 */
	EAttribute getCommunicationModule_BaudRate();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.CommunicationModule#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer</em>'.
	 * @see iot.sensornetwork.CommunicationModule#getBuffer()
	 * @see #getCommunicationModule()
	 * @generated
	 */
	EAttribute getCommunicationModule_Buffer();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.CommunicationModule#getMacAddress <em>Mac Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac Address</em>'.
	 * @see iot.sensornetwork.CommunicationModule#getMacAddress()
	 * @see #getCommunicationModule()
	 * @generated
	 */
	EAttribute getCommunicationModule_MacAddress();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.CommunicationModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iot.sensornetwork.CommunicationModule#getName()
	 * @see #getCommunicationModule()
	 * @generated
	 */
	EAttribute getCommunicationModule_Name();

	/**
	 * Returns the meta object for the reference list '{@link iot.sensornetwork.CommunicationModule#getCommunicationToServer <em>Communication To Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communication To Server</em>'.
	 * @see iot.sensornetwork.CommunicationModule#getCommunicationToServer()
	 * @see #getCommunicationModule()
	 * @generated
	 */
	EReference getCommunicationModule_CommunicationToServer();

	/**
	 * Returns the meta object for class '{@link iot.sensornetwork.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see iot.sensornetwork.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.Server#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iot.sensornetwork.Server#getName()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Name();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.Server#getCpuFrequency <em>Cpu Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Frequency</em>'.
	 * @see iot.sensornetwork.Server#getCpuFrequency()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_CpuFrequency();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.Server#getRamSize <em>Ram Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Size</em>'.
	 * @see iot.sensornetwork.Server#getRamSize()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_RamSize();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.Server#getOS <em>OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS</em>'.
	 * @see iot.sensornetwork.Server#getOS()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_OS();

	/**
	 * Returns the meta object for the attribute '{@link iot.sensornetwork.Server#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see iot.sensornetwork.Server#getType()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Type();

	/**
	 * Returns the meta object for the reference list '{@link iot.sensornetwork.Server#getServerToCommunication <em>Server To Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Server To Communication</em>'.
	 * @see iot.sensornetwork.Server#getServerToCommunication()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_ServerToCommunication();

	/**
	 * Returns the meta object for the reference '{@link iot.sensornetwork.Server#getServerToPower <em>Server To Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server To Power</em>'.
	 * @see iot.sensornetwork.Server#getServerToPower()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_ServerToPower();

	/**
	 * Returns the meta object for enum '{@link iot.sensornetwork.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Type</em>'.
	 * @see iot.sensornetwork.SensorType
	 * @generated
	 */
	EEnum getSensorType();

	/**
	 * Returns the meta object for enum '{@link iot.sensornetwork.ActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actuator Type</em>'.
	 * @see iot.sensornetwork.ActuatorType
	 * @generated
	 */
	EEnum getActuatorType();

	/**
	 * Returns the meta object for enum '{@link iot.sensornetwork.MicrocontrollerunitType <em>Microcontrollerunit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Microcontrollerunit Type</em>'.
	 * @see iot.sensornetwork.MicrocontrollerunitType
	 * @generated
	 */
	EEnum getMicrocontrollerunitType();

	/**
	 * Returns the meta object for enum '{@link iot.sensornetwork.CommunicationType <em>Communication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Type</em>'.
	 * @see iot.sensornetwork.CommunicationType
	 * @generated
	 */
	EEnum getCommunicationType();

	/**
	 * Returns the meta object for enum '{@link iot.sensornetwork.PowerType <em>Power Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Power Type</em>'.
	 * @see iot.sensornetwork.PowerType
	 * @generated
	 */
	EEnum getPowerType();

	/**
	 * Returns the meta object for enum '{@link iot.sensornetwork.ServerType <em>Server Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Server Type</em>'.
	 * @see iot.sensornetwork.ServerType
	 * @generated
	 */
	EEnum getServerType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SensornetworkFactory getSensornetworkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link iot.sensornetwork.impl.SensorNodeImpl <em>Sensor Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.sensornetwork.impl.SensorNodeImpl
		 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getSensorNode()
		 * @generated
		 */
		EClass SENSOR_NODE = eINSTANCE.getSensorNode();

		/**
		 * The meta object literal for the '<em><b>Has Sensor Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_NODE__HAS_SENSOR_MODULE = eINSTANCE.getSensorNode_HasSensorModule();

		/**
		 * The meta object literal for the '<em><b>Has Actuator Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_NODE__HAS_ACTUATOR_MODULE = eINSTANCE.getSensorNode_HasActuatorModule();

		/**
		 * The meta object literal for the '<em><b>Has Communication Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_NODE__HAS_COMMUNICATION_MODULE = eINSTANCE.getSensorNode_HasCommunicationModule();

		/**
		 * The meta object literal for the '<em><b>Has Power Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_NODE__HAS_POWER_MODULE = eINSTANCE.getSensorNode_HasPowerModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_NODE__NAME = eINSTANCE.getSensorNode_Name();

		/**
		 * The meta object literal for the '<em><b>Sampling Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_NODE__SAMPLING_RATE = eINSTANCE.getSensorNode_SamplingRate();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_NODE__LOCATION = eINSTANCE.getSensorNode_Location();

		/**
		 * The meta object literal for the '<em><b>Has Microcontroller Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_NODE__HAS_MICROCONTROLLER_UNIT = eINSTANCE.getSensorNode_HasMicrocontrollerUnit();

		/**
		 * The meta object literal for the '<em><b>Has Server</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_NODE__HAS_SERVER = eINSTANCE.getSensorNode_HasServer();

		/**
		 * The meta object literal for the '{@link iot.sensornetwork.impl.SensorModuleImpl <em>Sensor Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.sensornetwork.impl.SensorModuleImpl
		 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getSensorModule()
		 * @generated
		 */
		EClass SENSOR_MODULE = eINSTANCE.getSensorModule();

		/**
		 * The meta object literal for the '<em><b>Sensor To Microcontroller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_MODULE__SENSOR_TO_MICROCONTROLLER = eINSTANCE.getSensorModule_SensorToMicrocontroller();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_MODULE__TYPE = eINSTANCE.getSensorModule_Type();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_MODULE__UNIT = eINSTANCE.getSensorModule_Unit();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_MODULE__MIN_VALUE = eINSTANCE.getSensorModule_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_MODULE__MAX_VALUE = eINSTANCE.getSensorModule_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_MODULE__NAME = eINSTANCE.getSensorModule_Name();

		/**
		 * The meta object literal for the '{@link iot.sensornetwork.impl.ActuatorModuleImpl <em>Actuator Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.sensornetwork.impl.ActuatorModuleImpl
		 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getActuatorModule()
		 * @generated
		 */
		EClass ACTUATOR_MODULE = eINSTANCE.getActuatorModule();

		/**
		 * The meta object literal for the '<em><b>Actuator To Microcontroller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR_MODULE__ACTUATOR_TO_MICROCONTROLLER = eINSTANCE
				.getActuatorModule_ActuatorToMicrocontroller();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR_MODULE__TYPE = eINSTANCE.getActuatorModule_Type();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR_MODULE__COMMAND = eINSTANCE.getActuatorModule_Command();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR_MODULE__NAME = eINSTANCE.getActuatorModule_Name();

		/**
		 * The meta object literal for the '{@link iot.sensornetwork.impl.MicrocontrollerUnitImpl <em>Microcontroller Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.sensornetwork.impl.MicrocontrollerUnitImpl
		 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getMicrocontrollerUnit()
		 * @generated
		 */
		EClass MICROCONTROLLER_UNIT = eINSTANCE.getMicrocontrollerUnit();

		/**
		 * The meta object literal for the '<em><b>Microcontroller To Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_SENSOR = eINSTANCE
				.getMicrocontrollerUnit_MicrocontrollerToSensor();

		/**
		 * The meta object literal for the '<em><b>Microcontroller To Actuator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_ACTUATOR = eINSTANCE
				.getMicrocontrollerUnit_MicrocontrollerToActuator();

		/**
		 * The meta object literal for the '<em><b>Microcontroller To Communication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_COMMUNICATION = eINSTANCE
				.getMicrocontrollerUnit_MicrocontrollerToCommunication();

		/**
		 * The meta object literal for the '<em><b>Microcontroller To Power</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_POWER = eINSTANCE
				.getMicrocontrollerUnit_MicrocontrollerToPower();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROCONTROLLER_UNIT__TYPE = eINSTANCE.getMicrocontrollerUnit_Type();

		/**
		 * The meta object literal for the '<em><b>Firmware</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROCONTROLLER_UNIT__FIRMWARE = eINSTANCE.getMicrocontrollerUnit_Firmware();

		/**
		 * The meta object literal for the '<em><b>Cpu Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROCONTROLLER_UNIT__CPU_FREQUENCY = eINSTANCE.getMicrocontrollerUnit_CpuFrequency();

		/**
		 * The meta object literal for the '<em><b>Ram Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROCONTROLLER_UNIT__RAM_SIZE = eINSTANCE.getMicrocontrollerUnit_RamSize();

		/**
		 * The meta object literal for the '<em><b>Flash Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROCONTROLLER_UNIT__FLASH_SIZE = eINSTANCE.getMicrocontrollerUnit_FlashSize();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROCONTROLLER_UNIT__NAME = eINSTANCE.getMicrocontrollerUnit_Name();

		/**
		 * The meta object literal for the '{@link iot.sensornetwork.impl.PowerModuleImpl <em>Power Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.sensornetwork.impl.PowerModuleImpl
		 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getPowerModule()
		 * @generated
		 */
		EClass POWER_MODULE = eINSTANCE.getPowerModule();

		/**
		 * The meta object literal for the '<em><b>Power To Microcontroller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_MODULE__POWER_TO_MICROCONTROLLER = eINSTANCE.getPowerModule_PowerToMicrocontroller();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_MODULE__TYPE = eINSTANCE.getPowerModule_Type();

		/**
		 * The meta object literal for the '<em><b>Voltage Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_MODULE__VOLTAGE_RANGE = eINSTANCE.getPowerModule_VoltageRange();

		/**
		 * The meta object literal for the '<em><b>Current Draw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_MODULE__CURRENT_DRAW = eINSTANCE.getPowerModule_CurrentDraw();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_MODULE__NAME = eINSTANCE.getPowerModule_Name();

		/**
		 * The meta object literal for the '{@link iot.sensornetwork.impl.CommunicationModuleImpl <em>Communication Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.sensornetwork.impl.CommunicationModuleImpl
		 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getCommunicationModule()
		 * @generated
		 */
		EClass COMMUNICATION_MODULE = eINSTANCE.getCommunicationModule();

		/**
		 * The meta object literal for the '<em><b>Communication To Microcontroller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MODULE__COMMUNICATION_TO_MICROCONTROLLER = eINSTANCE
				.getCommunicationModule_CommunicationToMicrocontroller();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_MODULE__TYPE = eINSTANCE.getCommunicationModule_Type();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_MODULE__PROTOCOL = eINSTANCE.getCommunicationModule_Protocol();

		/**
		 * The meta object literal for the '<em><b>Baud Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_MODULE__BAUD_RATE = eINSTANCE.getCommunicationModule_BaudRate();

		/**
		 * The meta object literal for the '<em><b>Buffer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_MODULE__BUFFER = eINSTANCE.getCommunicationModule_Buffer();

		/**
		 * The meta object literal for the '<em><b>Mac Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_MODULE__MAC_ADDRESS = eINSTANCE.getCommunicationModule_MacAddress();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_MODULE__NAME = eINSTANCE.getCommunicationModule_Name();

		/**
		 * The meta object literal for the '<em><b>Communication To Server</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MODULE__COMMUNICATION_TO_SERVER = eINSTANCE
				.getCommunicationModule_CommunicationToServer();

		/**
		 * The meta object literal for the '{@link iot.sensornetwork.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.sensornetwork.impl.ServerImpl
		 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__NAME = eINSTANCE.getServer_Name();

		/**
		 * The meta object literal for the '<em><b>Cpu Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__CPU_FREQUENCY = eINSTANCE.getServer_CpuFrequency();

		/**
		 * The meta object literal for the '<em><b>Ram Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__RAM_SIZE = eINSTANCE.getServer_RamSize();

		/**
		 * The meta object literal for the '<em><b>OS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__OS = eINSTANCE.getServer_OS();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__TYPE = eINSTANCE.getServer_Type();

		/**
		 * The meta object literal for the '<em><b>Server To Communication</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__SERVER_TO_COMMUNICATION = eINSTANCE.getServer_ServerToCommunication();

		/**
		 * The meta object literal for the '<em><b>Server To Power</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__SERVER_TO_POWER = eINSTANCE.getServer_ServerToPower();

		/**
		 * The meta object literal for the '{@link iot.sensornetwork.SensorType <em>Sensor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.sensornetwork.SensorType
		 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getSensorType()
		 * @generated
		 */
		EEnum SENSOR_TYPE = eINSTANCE.getSensorType();

		/**
		 * The meta object literal for the '{@link iot.sensornetwork.ActuatorType <em>Actuator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.sensornetwork.ActuatorType
		 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getActuatorType()
		 * @generated
		 */
		EEnum ACTUATOR_TYPE = eINSTANCE.getActuatorType();

		/**
		 * The meta object literal for the '{@link iot.sensornetwork.MicrocontrollerunitType <em>Microcontrollerunit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.sensornetwork.MicrocontrollerunitType
		 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getMicrocontrollerunitType()
		 * @generated
		 */
		EEnum MICROCONTROLLERUNIT_TYPE = eINSTANCE.getMicrocontrollerunitType();

		/**
		 * The meta object literal for the '{@link iot.sensornetwork.CommunicationType <em>Communication Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.sensornetwork.CommunicationType
		 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getCommunicationType()
		 * @generated
		 */
		EEnum COMMUNICATION_TYPE = eINSTANCE.getCommunicationType();

		/**
		 * The meta object literal for the '{@link iot.sensornetwork.PowerType <em>Power Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.sensornetwork.PowerType
		 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getPowerType()
		 * @generated
		 */
		EEnum POWER_TYPE = eINSTANCE.getPowerType();

		/**
		 * The meta object literal for the '{@link iot.sensornetwork.ServerType <em>Server Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iot.sensornetwork.ServerType
		 * @see iot.sensornetwork.impl.SensornetworkPackageImpl#getServerType()
		 * @generated
		 */
		EEnum SERVER_TYPE = eINSTANCE.getServerType();

	}

} //SensornetworkPackage
