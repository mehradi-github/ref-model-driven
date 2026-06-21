/**
 */
package iot.sensornetwork;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot.sensornetwork.SensorNode#getHasSensorModule <em>Has Sensor Module</em>}</li>
 *   <li>{@link iot.sensornetwork.SensorNode#getHasActuatorModule <em>Has Actuator Module</em>}</li>
 *   <li>{@link iot.sensornetwork.SensorNode#getHasCommunicationModule <em>Has Communication Module</em>}</li>
 *   <li>{@link iot.sensornetwork.SensorNode#getHasPowerModule <em>Has Power Module</em>}</li>
 *   <li>{@link iot.sensornetwork.SensorNode#getName <em>Name</em>}</li>
 *   <li>{@link iot.sensornetwork.SensorNode#getSamplingRate <em>Sampling Rate</em>}</li>
 *   <li>{@link iot.sensornetwork.SensorNode#getLocation <em>Location</em>}</li>
 *   <li>{@link iot.sensornetwork.SensorNode#getHasMicrocontrollerUnit <em>Has Microcontroller Unit</em>}</li>
 *   <li>{@link iot.sensornetwork.SensorNode#getHasServer <em>Has Server</em>}</li>
 * </ul>
 *
 * @see iot.sensornetwork.SensornetworkPackage#getSensorNode()
 * @model
 * @generated
 */
public interface SensorNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Sensor Module</b></em>' containment reference list.
	 * The list contents are of type {@link iot.sensornetwork.SensorModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Sensor Module</em>' containment reference list.
	 * @see iot.sensornetwork.SensornetworkPackage#getSensorNode_HasSensorModule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SensorModule> getHasSensorModule();

	/**
	 * Returns the value of the '<em><b>Has Actuator Module</b></em>' containment reference list.
	 * The list contents are of type {@link iot.sensornetwork.ActuatorModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Actuator Module</em>' containment reference list.
	 * @see iot.sensornetwork.SensornetworkPackage#getSensorNode_HasActuatorModule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ActuatorModule> getHasActuatorModule();

	/**
	 * Returns the value of the '<em><b>Has Communication Module</b></em>' containment reference list.
	 * The list contents are of type {@link iot.sensornetwork.CommunicationModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Communication Module</em>' containment reference list.
	 * @see iot.sensornetwork.SensornetworkPackage#getSensorNode_HasCommunicationModule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CommunicationModule> getHasCommunicationModule();

	/**
	 * Returns the value of the '<em><b>Has Power Module</b></em>' containment reference list.
	 * The list contents are of type {@link iot.sensornetwork.PowerModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Power Module</em>' containment reference list.
	 * @see iot.sensornetwork.SensornetworkPackage#getSensorNode_HasPowerModule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PowerModule> getHasPowerModule();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iot.sensornetwork.SensornetworkPackage#getSensorNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.SensorNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Rate</em>' attribute.
	 * @see #setSamplingRate(int)
	 * @see iot.sensornetwork.SensornetworkPackage#getSensorNode_SamplingRate()
	 * @model
	 * @generated
	 */
	int getSamplingRate();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.SensorNode#getSamplingRate <em>Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Rate</em>' attribute.
	 * @see #getSamplingRate()
	 * @generated
	 */
	void setSamplingRate(int value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see iot.sensornetwork.SensornetworkPackage#getSensorNode_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.SensorNode#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Has Microcontroller Unit</b></em>' containment reference list.
	 * The list contents are of type {@link iot.sensornetwork.MicrocontrollerUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Microcontroller Unit</em>' containment reference list.
	 * @see iot.sensornetwork.SensornetworkPackage#getSensorNode_HasMicrocontrollerUnit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MicrocontrollerUnit> getHasMicrocontrollerUnit();

	/**
	 * Returns the value of the '<em><b>Has Server</b></em>' containment reference list.
	 * The list contents are of type {@link iot.sensornetwork.Server}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Server</em>' containment reference list.
	 * @see iot.sensornetwork.SensornetworkPackage#getSensorNode_HasServer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Server> getHasServer();

} // SensorNode
