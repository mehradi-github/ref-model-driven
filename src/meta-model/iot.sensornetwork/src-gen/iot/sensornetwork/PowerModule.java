/**
 */
package iot.sensornetwork;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot.sensornetwork.PowerModule#getPowerToMicrocontroller <em>Power To Microcontroller</em>}</li>
 *   <li>{@link iot.sensornetwork.PowerModule#getType <em>Type</em>}</li>
 *   <li>{@link iot.sensornetwork.PowerModule#getVoltageRange <em>Voltage Range</em>}</li>
 *   <li>{@link iot.sensornetwork.PowerModule#getCurrentDraw <em>Current Draw</em>}</li>
 *   <li>{@link iot.sensornetwork.PowerModule#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see iot.sensornetwork.SensornetworkPackage#getPowerModule()
 * @model
 * @generated
 */
public interface PowerModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Power To Microcontroller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToPower <em>Microcontroller To Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power To Microcontroller</em>' reference.
	 * @see #setPowerToMicrocontroller(MicrocontrollerUnit)
	 * @see iot.sensornetwork.SensornetworkPackage#getPowerModule_PowerToMicrocontroller()
	 * @see iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToPower
	 * @model opposite="MicrocontrollerToPower" required="true"
	 * @generated
	 */
	MicrocontrollerUnit getPowerToMicrocontroller();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.PowerModule#getPowerToMicrocontroller <em>Power To Microcontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power To Microcontroller</em>' reference.
	 * @see #getPowerToMicrocontroller()
	 * @generated
	 */
	void setPowerToMicrocontroller(MicrocontrollerUnit value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link iot.sensornetwork.PowerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see iot.sensornetwork.PowerType
	 * @see #setType(PowerType)
	 * @see iot.sensornetwork.SensornetworkPackage#getPowerModule_Type()
	 * @model
	 * @generated
	 */
	PowerType getType();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.PowerModule#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see iot.sensornetwork.PowerType
	 * @see #getType()
	 * @generated
	 */
	void setType(PowerType value);

	/**
	 * Returns the value of the '<em><b>Voltage Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Range</em>' attribute.
	 * @see #setVoltageRange(float)
	 * @see iot.sensornetwork.SensornetworkPackage#getPowerModule_VoltageRange()
	 * @model
	 * @generated
	 */
	float getVoltageRange();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.PowerModule#getVoltageRange <em>Voltage Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Range</em>' attribute.
	 * @see #getVoltageRange()
	 * @generated
	 */
	void setVoltageRange(float value);

	/**
	 * Returns the value of the '<em><b>Current Draw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Draw</em>' attribute.
	 * @see #setCurrentDraw(float)
	 * @see iot.sensornetwork.SensornetworkPackage#getPowerModule_CurrentDraw()
	 * @model
	 * @generated
	 */
	float getCurrentDraw();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.PowerModule#getCurrentDraw <em>Current Draw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Draw</em>' attribute.
	 * @see #getCurrentDraw()
	 * @generated
	 */
	void setCurrentDraw(float value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iot.sensornetwork.SensornetworkPackage#getPowerModule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.PowerModule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PowerModule
