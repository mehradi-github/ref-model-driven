/**
 */
package iot.sensornetwork;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iot.sensornetwork.SensornetworkPackage
 * @generated
 */
public interface SensornetworkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SensornetworkFactory eINSTANCE = iot.sensornetwork.impl.SensornetworkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sensor Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Node</em>'.
	 * @generated
	 */
	SensorNode createSensorNode();

	/**
	 * Returns a new object of class '<em>Sensor Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor Module</em>'.
	 * @generated
	 */
	SensorModule createSensorModule();

	/**
	 * Returns a new object of class '<em>Actuator Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator Module</em>'.
	 * @generated
	 */
	ActuatorModule createActuatorModule();

	/**
	 * Returns a new object of class '<em>Microcontroller Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microcontroller Unit</em>'.
	 * @generated
	 */
	MicrocontrollerUnit createMicrocontrollerUnit();

	/**
	 * Returns a new object of class '<em>Power Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Module</em>'.
	 * @generated
	 */
	PowerModule createPowerModule();

	/**
	 * Returns a new object of class '<em>Communication Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Module</em>'.
	 * @generated
	 */
	CommunicationModule createCommunicationModule();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SensornetworkPackage getSensornetworkPackage();

} //SensornetworkFactory
