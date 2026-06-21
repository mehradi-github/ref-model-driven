/**
 */
package iot.sensornetwork.impl;

import iot.sensornetwork.ActuatorModule;
import iot.sensornetwork.ActuatorType;
import iot.sensornetwork.CommunicationModule;
import iot.sensornetwork.CommunicationType;
import iot.sensornetwork.MicrocontrollerUnit;
import iot.sensornetwork.MicrocontrollerunitType;
import iot.sensornetwork.PowerModule;
import iot.sensornetwork.PowerType;
import iot.sensornetwork.SensorModule;
import iot.sensornetwork.SensorNode;
import iot.sensornetwork.SensorType;
import iot.sensornetwork.SensornetworkFactory;
import iot.sensornetwork.SensornetworkPackage;
import iot.sensornetwork.Server;
import iot.sensornetwork.ServerType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensornetworkPackageImpl extends EPackageImpl implements SensornetworkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microcontrollerUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actuatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum microcontrollerunitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum powerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serverTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see iot.sensornetwork.SensornetworkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SensornetworkPackageImpl() {
		super(eNS_URI, SensornetworkFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SensornetworkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SensornetworkPackage init() {
		if (isInited)
			return (SensornetworkPackage) EPackage.Registry.INSTANCE.getEPackage(SensornetworkPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSensornetworkPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SensornetworkPackageImpl theSensornetworkPackage = registeredSensornetworkPackage instanceof SensornetworkPackageImpl
				? (SensornetworkPackageImpl) registeredSensornetworkPackage
				: new SensornetworkPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSensornetworkPackage.createPackageContents();

		// Initialize created meta-data
		theSensornetworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSensornetworkPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SensornetworkPackage.eNS_URI, theSensornetworkPackage);
		return theSensornetworkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensorNode() {
		return sensorNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSensorNode_HasSensorModule() {
		return (EReference) sensorNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSensorNode_HasActuatorModule() {
		return (EReference) sensorNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSensorNode_HasCommunicationModule() {
		return (EReference) sensorNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSensorNode_HasPowerModule() {
		return (EReference) sensorNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorNode_Name() {
		return (EAttribute) sensorNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorNode_SamplingRate() {
		return (EAttribute) sensorNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorNode_Location() {
		return (EAttribute) sensorNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSensorNode_HasMicrocontrollerUnit() {
		return (EReference) sensorNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSensorNode_HasServer() {
		return (EReference) sensorNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensorModule() {
		return sensorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSensorModule_SensorToMicrocontroller() {
		return (EReference) sensorModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorModule_Type() {
		return (EAttribute) sensorModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorModule_Unit() {
		return (EAttribute) sensorModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorModule_MinValue() {
		return (EAttribute) sensorModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorModule_MaxValue() {
		return (EAttribute) sensorModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensorModule_Name() {
		return (EAttribute) sensorModuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActuatorModule() {
		return actuatorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActuatorModule_ActuatorToMicrocontroller() {
		return (EReference) actuatorModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActuatorModule_Type() {
		return (EAttribute) actuatorModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActuatorModule_Command() {
		return (EAttribute) actuatorModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActuatorModule_Name() {
		return (EAttribute) actuatorModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMicrocontrollerUnit() {
		return microcontrollerUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMicrocontrollerUnit_MicrocontrollerToSensor() {
		return (EReference) microcontrollerUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMicrocontrollerUnit_MicrocontrollerToActuator() {
		return (EReference) microcontrollerUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMicrocontrollerUnit_MicrocontrollerToCommunication() {
		return (EReference) microcontrollerUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMicrocontrollerUnit_MicrocontrollerToPower() {
		return (EReference) microcontrollerUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMicrocontrollerUnit_Type() {
		return (EAttribute) microcontrollerUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMicrocontrollerUnit_Firmware() {
		return (EAttribute) microcontrollerUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMicrocontrollerUnit_CpuFrequency() {
		return (EAttribute) microcontrollerUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMicrocontrollerUnit_RamSize() {
		return (EAttribute) microcontrollerUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMicrocontrollerUnit_FlashSize() {
		return (EAttribute) microcontrollerUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMicrocontrollerUnit_Name() {
		return (EAttribute) microcontrollerUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPowerModule() {
		return powerModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPowerModule_PowerToMicrocontroller() {
		return (EReference) powerModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPowerModule_Type() {
		return (EAttribute) powerModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPowerModule_VoltageRange() {
		return (EAttribute) powerModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPowerModule_CurrentDraw() {
		return (EAttribute) powerModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPowerModule_Name() {
		return (EAttribute) powerModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationModule() {
		return communicationModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationModule_CommunicationToMicrocontroller() {
		return (EReference) communicationModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationModule_Type() {
		return (EAttribute) communicationModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationModule_Protocol() {
		return (EAttribute) communicationModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationModule_BaudRate() {
		return (EAttribute) communicationModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationModule_Buffer() {
		return (EAttribute) communicationModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationModule_MacAddress() {
		return (EAttribute) communicationModuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationModule_Name() {
		return (EAttribute) communicationModuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationModule_CommunicationToServer() {
		return (EReference) communicationModuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServer_Name() {
		return (EAttribute) serverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServer_CpuFrequency() {
		return (EAttribute) serverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServer_RamSize() {
		return (EAttribute) serverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServer_OS() {
		return (EAttribute) serverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServer_Type() {
		return (EAttribute) serverEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_ServerToCommunication() {
		return (EReference) serverEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_ServerToPower() {
		return (EReference) serverEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSensorType() {
		return sensorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActuatorType() {
		return actuatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMicrocontrollerunitType() {
		return microcontrollerunitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCommunicationType() {
		return communicationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPowerType() {
		return powerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServerType() {
		return serverTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensornetworkFactory getSensornetworkFactory() {
		return (SensornetworkFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		sensorNodeEClass = createEClass(SENSOR_NODE);
		createEReference(sensorNodeEClass, SENSOR_NODE__HAS_SENSOR_MODULE);
		createEReference(sensorNodeEClass, SENSOR_NODE__HAS_ACTUATOR_MODULE);
		createEReference(sensorNodeEClass, SENSOR_NODE__HAS_COMMUNICATION_MODULE);
		createEReference(sensorNodeEClass, SENSOR_NODE__HAS_POWER_MODULE);
		createEAttribute(sensorNodeEClass, SENSOR_NODE__NAME);
		createEAttribute(sensorNodeEClass, SENSOR_NODE__SAMPLING_RATE);
		createEAttribute(sensorNodeEClass, SENSOR_NODE__LOCATION);
		createEReference(sensorNodeEClass, SENSOR_NODE__HAS_MICROCONTROLLER_UNIT);
		createEReference(sensorNodeEClass, SENSOR_NODE__HAS_SERVER);

		sensorModuleEClass = createEClass(SENSOR_MODULE);
		createEReference(sensorModuleEClass, SENSOR_MODULE__SENSOR_TO_MICROCONTROLLER);
		createEAttribute(sensorModuleEClass, SENSOR_MODULE__TYPE);
		createEAttribute(sensorModuleEClass, SENSOR_MODULE__UNIT);
		createEAttribute(sensorModuleEClass, SENSOR_MODULE__MIN_VALUE);
		createEAttribute(sensorModuleEClass, SENSOR_MODULE__MAX_VALUE);
		createEAttribute(sensorModuleEClass, SENSOR_MODULE__NAME);

		actuatorModuleEClass = createEClass(ACTUATOR_MODULE);
		createEReference(actuatorModuleEClass, ACTUATOR_MODULE__ACTUATOR_TO_MICROCONTROLLER);
		createEAttribute(actuatorModuleEClass, ACTUATOR_MODULE__TYPE);
		createEAttribute(actuatorModuleEClass, ACTUATOR_MODULE__COMMAND);
		createEAttribute(actuatorModuleEClass, ACTUATOR_MODULE__NAME);

		microcontrollerUnitEClass = createEClass(MICROCONTROLLER_UNIT);
		createEReference(microcontrollerUnitEClass, MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_SENSOR);
		createEReference(microcontrollerUnitEClass, MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_ACTUATOR);
		createEReference(microcontrollerUnitEClass, MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_COMMUNICATION);
		createEReference(microcontrollerUnitEClass, MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_POWER);
		createEAttribute(microcontrollerUnitEClass, MICROCONTROLLER_UNIT__TYPE);
		createEAttribute(microcontrollerUnitEClass, MICROCONTROLLER_UNIT__FIRMWARE);
		createEAttribute(microcontrollerUnitEClass, MICROCONTROLLER_UNIT__CPU_FREQUENCY);
		createEAttribute(microcontrollerUnitEClass, MICROCONTROLLER_UNIT__RAM_SIZE);
		createEAttribute(microcontrollerUnitEClass, MICROCONTROLLER_UNIT__FLASH_SIZE);
		createEAttribute(microcontrollerUnitEClass, MICROCONTROLLER_UNIT__NAME);

		powerModuleEClass = createEClass(POWER_MODULE);
		createEReference(powerModuleEClass, POWER_MODULE__POWER_TO_MICROCONTROLLER);
		createEAttribute(powerModuleEClass, POWER_MODULE__TYPE);
		createEAttribute(powerModuleEClass, POWER_MODULE__VOLTAGE_RANGE);
		createEAttribute(powerModuleEClass, POWER_MODULE__CURRENT_DRAW);
		createEAttribute(powerModuleEClass, POWER_MODULE__NAME);

		communicationModuleEClass = createEClass(COMMUNICATION_MODULE);
		createEReference(communicationModuleEClass, COMMUNICATION_MODULE__COMMUNICATION_TO_MICROCONTROLLER);
		createEAttribute(communicationModuleEClass, COMMUNICATION_MODULE__TYPE);
		createEAttribute(communicationModuleEClass, COMMUNICATION_MODULE__PROTOCOL);
		createEAttribute(communicationModuleEClass, COMMUNICATION_MODULE__BAUD_RATE);
		createEAttribute(communicationModuleEClass, COMMUNICATION_MODULE__BUFFER);
		createEAttribute(communicationModuleEClass, COMMUNICATION_MODULE__MAC_ADDRESS);
		createEAttribute(communicationModuleEClass, COMMUNICATION_MODULE__NAME);
		createEReference(communicationModuleEClass, COMMUNICATION_MODULE__COMMUNICATION_TO_SERVER);

		serverEClass = createEClass(SERVER);
		createEAttribute(serverEClass, SERVER__NAME);
		createEAttribute(serverEClass, SERVER__CPU_FREQUENCY);
		createEAttribute(serverEClass, SERVER__RAM_SIZE);
		createEAttribute(serverEClass, SERVER__OS);
		createEAttribute(serverEClass, SERVER__TYPE);
		createEReference(serverEClass, SERVER__SERVER_TO_COMMUNICATION);
		createEReference(serverEClass, SERVER__SERVER_TO_POWER);

		// Create enums
		sensorTypeEEnum = createEEnum(SENSOR_TYPE);
		actuatorTypeEEnum = createEEnum(ACTUATOR_TYPE);
		microcontrollerunitTypeEEnum = createEEnum(MICROCONTROLLERUNIT_TYPE);
		communicationTypeEEnum = createEEnum(COMMUNICATION_TYPE);
		powerTypeEEnum = createEEnum(POWER_TYPE);
		serverTypeEEnum = createEEnum(SERVER_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(sensorNodeEClass, SensorNode.class, "SensorNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensorNode_HasSensorModule(), this.getSensorModule(), null, "HasSensorModule", null, 1, -1,
				SensorNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorNode_HasActuatorModule(), this.getActuatorModule(), null, "HasActuatorModule", null, 1,
				-1, SensorNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorNode_HasCommunicationModule(), this.getCommunicationModule(), null,
				"HasCommunicationModule", null, 1, -1, SensorNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorNode_HasPowerModule(), this.getPowerModule(), null, "HasPowerModule", null, 1, -1,
				SensorNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, SensorNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorNode_SamplingRate(), ecorePackage.getEInt(), "samplingRate", null, 0, 1,
				SensorNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorNode_Location(), ecorePackage.getEString(), "location", null, 0, 1, SensorNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorNode_HasMicrocontrollerUnit(), this.getMicrocontrollerUnit(), null,
				"HasMicrocontrollerUnit", null, 1, -1, SensorNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensorNode_HasServer(), this.getServer(), null, "HasServer", null, 0, -1, SensorNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorModuleEClass, SensorModule.class, "SensorModule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensorModule_SensorToMicrocontroller(), this.getMicrocontrollerUnit(),
				this.getMicrocontrollerUnit_MicrocontrollerToSensor(), "SensorToMicrocontroller", null, 1, 1,
				SensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorModule_Type(), this.getSensorType(), "type", null, 0, 1, SensorModule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorModule_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, SensorModule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorModule_MinValue(), ecorePackage.getEDouble(), "minValue", null, 0, 1,
				SensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorModule_MaxValue(), ecorePackage.getEDouble(), "maxValue", null, 0, 1,
				SensorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensorModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, SensorModule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorModuleEClass, ActuatorModule.class, "ActuatorModule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActuatorModule_ActuatorToMicrocontroller(), this.getMicrocontrollerUnit(),
				this.getMicrocontrollerUnit_MicrocontrollerToActuator(), "ActuatorToMicrocontroller", null, 1, 1,
				ActuatorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActuatorModule_Type(), this.getActuatorType(), "type", null, 0, 1, ActuatorModule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActuatorModule_Command(), ecorePackage.getEString(), "command", null, 0, 1,
				ActuatorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getActuatorModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActuatorModule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(microcontrollerUnitEClass, MicrocontrollerUnit.class, "MicrocontrollerUnit", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMicrocontrollerUnit_MicrocontrollerToSensor(), this.getSensorModule(),
				this.getSensorModule_SensorToMicrocontroller(), "MicrocontrollerToSensor", null, 1, 1,
				MicrocontrollerUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicrocontrollerUnit_MicrocontrollerToActuator(), this.getActuatorModule(),
				this.getActuatorModule_ActuatorToMicrocontroller(), "MicrocontrollerToActuator", null, 1, 1,
				MicrocontrollerUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicrocontrollerUnit_MicrocontrollerToCommunication(), this.getCommunicationModule(),
				this.getCommunicationModule_CommunicationToMicrocontroller(), "MicrocontrollerToCommunication", null, 1,
				1, MicrocontrollerUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicrocontrollerUnit_MicrocontrollerToPower(), this.getPowerModule(),
				this.getPowerModule_PowerToMicrocontroller(), "MicrocontrollerToPower", null, 1, 1,
				MicrocontrollerUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicrocontrollerUnit_Type(), this.getMicrocontrollerunitType(), "type", null, 0, 1,
				MicrocontrollerUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicrocontrollerUnit_Firmware(), ecorePackage.getEString(), "firmware", null, 0, 1,
				MicrocontrollerUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicrocontrollerUnit_CpuFrequency(), ecorePackage.getEFloat(), "cpuFrequency", null, 0, 1,
				MicrocontrollerUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicrocontrollerUnit_RamSize(), ecorePackage.getEFloat(), "ramSize", null, 0, 1,
				MicrocontrollerUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicrocontrollerUnit_FlashSize(), ecorePackage.getEFloat(), "flashSize", null, 0, 1,
				MicrocontrollerUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicrocontrollerUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				MicrocontrollerUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerModuleEClass, PowerModule.class, "PowerModule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerModule_PowerToMicrocontroller(), this.getMicrocontrollerUnit(),
				this.getMicrocontrollerUnit_MicrocontrollerToPower(), "PowerToMicrocontroller", null, 1, 1,
				PowerModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPowerModule_Type(), this.getPowerType(), "type", null, 0, 1, PowerModule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPowerModule_VoltageRange(), ecorePackage.getEFloat(), "voltageRange", null, 0, 1,
				PowerModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPowerModule_CurrentDraw(), ecorePackage.getEFloat(), "currentDraw", null, 0, 1,
				PowerModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPowerModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, PowerModule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationModuleEClass, CommunicationModule.class, "CommunicationModule", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationModule_CommunicationToMicrocontroller(), this.getMicrocontrollerUnit(),
				this.getMicrocontrollerUnit_MicrocontrollerToCommunication(), "CommunicationToMicrocontroller", null, 1,
				1, CommunicationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationModule_Type(), this.getCommunicationType(), "type", null, 0, 1,
				CommunicationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationModule_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1,
				CommunicationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationModule_BaudRate(), ecorePackage.getEFloat(), "baudRate", null, 0, 1,
				CommunicationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationModule_Buffer(), ecorePackage.getEFloat(), "buffer", null, 0, 1,
				CommunicationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationModule_MacAddress(), ecorePackage.getEString(), "macAddress", null, 0, 1,
				CommunicationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationModule_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				CommunicationModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationModule_CommunicationToServer(), this.getServer(),
				this.getServer_ServerToCommunication(), "CommunicationToServer", null, 0, -1, CommunicationModule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Server.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_CpuFrequency(), ecorePackage.getEFloat(), "cpuFrequency", null, 0, 1, Server.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_RamSize(), ecorePackage.getEFloat(), "ramSize", null, 0, 1, Server.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_OS(), ecorePackage.getEString(), "OS", null, 0, 1, Server.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Type(), this.getServerType(), "type", null, 0, 1, Server.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_ServerToCommunication(), this.getCommunicationModule(),
				this.getCommunicationModule_CommunicationToServer(), "ServerToCommunication", null, 0, -1, Server.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_ServerToPower(), this.getPowerModule(), null, "ServerToPower", null, 0, 1,
				Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sensorTypeEEnum, SensorType.class, "SensorType");
		addEEnumLiteral(sensorTypeEEnum, SensorType.TEMPERATURE);
		addEEnumLiteral(sensorTypeEEnum, SensorType.HUMIDITY);
		addEEnumLiteral(sensorTypeEEnum, SensorType.PRESSURE);
		addEEnumLiteral(sensorTypeEEnum, SensorType.CO2);
		addEEnumLiteral(sensorTypeEEnum, SensorType.MOTION);
		addEEnumLiteral(sensorTypeEEnum, SensorType.LIGHT);

		initEEnum(actuatorTypeEEnum, ActuatorType.class, "ActuatorType");
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.THERMOSTAT);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.RELAY);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.ALARM);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.SERVO);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.VALVE);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.LED);

		initEEnum(microcontrollerunitTypeEEnum, MicrocontrollerunitType.class, "MicrocontrollerunitType");
		addEEnumLiteral(microcontrollerunitTypeEEnum, MicrocontrollerunitType.ESP32);
		addEEnumLiteral(microcontrollerunitTypeEEnum, MicrocontrollerunitType.STM32);
		addEEnumLiteral(microcontrollerunitTypeEEnum, MicrocontrollerunitType.ARDUINO);
		addEEnumLiteral(microcontrollerunitTypeEEnum, MicrocontrollerunitType.ARM);
		addEEnumLiteral(microcontrollerunitTypeEEnum, MicrocontrollerunitType.AVR);

		initEEnum(communicationTypeEEnum, CommunicationType.class, "CommunicationType");
		addEEnumLiteral(communicationTypeEEnum, CommunicationType.BLUETOOTH);
		addEEnumLiteral(communicationTypeEEnum, CommunicationType.WIFI);
		addEEnumLiteral(communicationTypeEEnum, CommunicationType.GPRS);
		addEEnumLiteral(communicationTypeEEnum, CommunicationType.FIVEG);
		addEEnumLiteral(communicationTypeEEnum, CommunicationType.SATELLITE);

		initEEnum(powerTypeEEnum, PowerType.class, "PowerType");
		addEEnumLiteral(powerTypeEEnum, PowerType.BATTERYLITHIUM);
		addEEnumLiteral(powerTypeEEnum, PowerType.WIREDAC);
		addEEnumLiteral(powerTypeEEnum, PowerType.WIRELESS);
		addEEnumLiteral(powerTypeEEnum, PowerType.UPS);

		initEEnum(serverTypeEEnum, ServerType.class, "ServerType");
		addEEnumLiteral(serverTypeEEnum, ServerType.SMARTPHONE);
		addEEnumLiteral(serverTypeEEnum, ServerType.PC);
		addEEnumLiteral(serverTypeEEnum, ServerType.MAIN_FRAME);
		addEEnumLiteral(serverTypeEEnum, ServerType.CLOUD);

		// Create resource
		createResource(eNS_URI);
	}

} //SensornetworkPackageImpl
