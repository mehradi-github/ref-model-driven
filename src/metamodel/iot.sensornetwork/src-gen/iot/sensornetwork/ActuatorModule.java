/**
 */
package iot.sensornetwork;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot.sensornetwork.ActuatorModule#getActuatorToMicrocontroller <em>Actuator To Microcontroller</em>}</li>
 *   <li>{@link iot.sensornetwork.ActuatorModule#getType <em>Type</em>}</li>
 *   <li>{@link iot.sensornetwork.ActuatorModule#getCommand <em>Command</em>}</li>
 *   <li>{@link iot.sensornetwork.ActuatorModule#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see iot.sensornetwork.SensornetworkPackage#getActuatorModule()
 * @model
 * @generated
 */
public interface ActuatorModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Actuator To Microcontroller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToActuator <em>Microcontroller To Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator To Microcontroller</em>' reference.
	 * @see #setActuatorToMicrocontroller(MicrocontrollerUnit)
	 * @see iot.sensornetwork.SensornetworkPackage#getActuatorModule_ActuatorToMicrocontroller()
	 * @see iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToActuator
	 * @model opposite="MicrocontrollerToActuator" required="true"
	 * @generated
	 */
	MicrocontrollerUnit getActuatorToMicrocontroller();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.ActuatorModule#getActuatorToMicrocontroller <em>Actuator To Microcontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator To Microcontroller</em>' reference.
	 * @see #getActuatorToMicrocontroller()
	 * @generated
	 */
	void setActuatorToMicrocontroller(MicrocontrollerUnit value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link iot.sensornetwork.ActuatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see iot.sensornetwork.ActuatorType
	 * @see #setType(ActuatorType)
	 * @see iot.sensornetwork.SensornetworkPackage#getActuatorModule_Type()
	 * @model
	 * @generated
	 */
	ActuatorType getType();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.ActuatorModule#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see iot.sensornetwork.ActuatorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActuatorType value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see iot.sensornetwork.SensornetworkPackage#getActuatorModule_Command()
	 * @model
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.ActuatorModule#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iot.sensornetwork.SensornetworkPackage#getActuatorModule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.ActuatorModule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ActuatorModule
