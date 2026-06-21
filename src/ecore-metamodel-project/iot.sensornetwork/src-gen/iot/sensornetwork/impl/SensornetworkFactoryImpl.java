/**
 */
package iot.sensornetwork.impl;

import iot.sensornetwork.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensornetworkFactoryImpl extends EFactoryImpl implements SensornetworkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensornetworkFactory init() {
		try {
			SensornetworkFactory theSensornetworkFactory = (SensornetworkFactory) EPackage.Registry.INSTANCE
					.getEFactory(SensornetworkPackage.eNS_URI);
			if (theSensornetworkFactory != null) {
				return theSensornetworkFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SensornetworkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensornetworkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SensornetworkPackage.SENSOR_NODE:
			return createSensorNode();
		case SensornetworkPackage.SENSOR_MODULE:
			return createSensorModule();
		case SensornetworkPackage.ACTUATOR_MODULE:
			return createActuatorModule();
		case SensornetworkPackage.MICROCONTROLLER_UNIT:
			return createMicrocontrollerUnit();
		case SensornetworkPackage.POWER_MODULE:
			return createPowerModule();
		case SensornetworkPackage.COMMUNICATION_MODULE:
			return createCommunicationModule();
		case SensornetworkPackage.SERVER:
			return createServer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SensornetworkPackage.SENSOR_TYPE:
			return createSensorTypeFromString(eDataType, initialValue);
		case SensornetworkPackage.ACTUATOR_TYPE:
			return createActuatorTypeFromString(eDataType, initialValue);
		case SensornetworkPackage.MICROCONTROLLERUNIT_TYPE:
			return createMicrocontrollerunitTypeFromString(eDataType, initialValue);
		case SensornetworkPackage.COMMUNICATION_TYPE:
			return createCommunicationTypeFromString(eDataType, initialValue);
		case SensornetworkPackage.POWER_TYPE:
			return createPowerTypeFromString(eDataType, initialValue);
		case SensornetworkPackage.SERVER_TYPE:
			return createServerTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SensornetworkPackage.SENSOR_TYPE:
			return convertSensorTypeToString(eDataType, instanceValue);
		case SensornetworkPackage.ACTUATOR_TYPE:
			return convertActuatorTypeToString(eDataType, instanceValue);
		case SensornetworkPackage.MICROCONTROLLERUNIT_TYPE:
			return convertMicrocontrollerunitTypeToString(eDataType, instanceValue);
		case SensornetworkPackage.COMMUNICATION_TYPE:
			return convertCommunicationTypeToString(eDataType, instanceValue);
		case SensornetworkPackage.POWER_TYPE:
			return convertPowerTypeToString(eDataType, instanceValue);
		case SensornetworkPackage.SERVER_TYPE:
			return convertServerTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorNode createSensorNode() {
		SensorNodeImpl sensorNode = new SensorNodeImpl();
		return sensorNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorModule createSensorModule() {
		SensorModuleImpl sensorModule = new SensorModuleImpl();
		return sensorModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuatorModule createActuatorModule() {
		ActuatorModuleImpl actuatorModule = new ActuatorModuleImpl();
		return actuatorModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicrocontrollerUnit createMicrocontrollerUnit() {
		MicrocontrollerUnitImpl microcontrollerUnit = new MicrocontrollerUnitImpl();
		return microcontrollerUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerModule createPowerModule() {
		PowerModuleImpl powerModule = new PowerModuleImpl();
		return powerModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationModule createCommunicationModule() {
		CommunicationModuleImpl communicationModule = new CommunicationModuleImpl();
		return communicationModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType createSensorTypeFromString(EDataType eDataType, String initialValue) {
		SensorType result = SensorType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSensorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorType createActuatorTypeFromString(EDataType eDataType, String initialValue) {
		ActuatorType result = ActuatorType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActuatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerunitType createMicrocontrollerunitTypeFromString(EDataType eDataType, String initialValue) {
		MicrocontrollerunitType result = MicrocontrollerunitType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMicrocontrollerunitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationType createCommunicationTypeFromString(EDataType eDataType, String initialValue) {
		CommunicationType result = CommunicationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerType createPowerTypeFromString(EDataType eDataType, String initialValue) {
		PowerType result = PowerType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPowerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerType createServerTypeFromString(EDataType eDataType, String initialValue) {
		ServerType result = ServerType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensornetworkPackage getSensornetworkPackage() {
		return (SensornetworkPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SensornetworkPackage getPackage() {
		return SensornetworkPackage.eINSTANCE;
	}

} //SensornetworkFactoryImpl
