/**
 */
package iot.sensornetwork;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot.sensornetwork.SensorModule#getSensorToMicrocontroller <em>Sensor To Microcontroller</em>}</li>
 *   <li>{@link iot.sensornetwork.SensorModule#getType <em>Type</em>}</li>
 *   <li>{@link iot.sensornetwork.SensorModule#getUnit <em>Unit</em>}</li>
 *   <li>{@link iot.sensornetwork.SensorModule#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link iot.sensornetwork.SensorModule#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link iot.sensornetwork.SensorModule#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see iot.sensornetwork.SensornetworkPackage#getSensorModule()
 * @model
 * @generated
 */
public interface SensorModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor To Microcontroller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToSensor <em>Microcontroller To Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor To Microcontroller</em>' reference.
	 * @see #setSensorToMicrocontroller(MicrocontrollerUnit)
	 * @see iot.sensornetwork.SensornetworkPackage#getSensorModule_SensorToMicrocontroller()
	 * @see iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToSensor
	 * @model opposite="MicrocontrollerToSensor" required="true"
	 * @generated
	 */
	MicrocontrollerUnit getSensorToMicrocontroller();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.SensorModule#getSensorToMicrocontroller <em>Sensor To Microcontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor To Microcontroller</em>' reference.
	 * @see #getSensorToMicrocontroller()
	 * @generated
	 */
	void setSensorToMicrocontroller(MicrocontrollerUnit value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link iot.sensornetwork.SensorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see iot.sensornetwork.SensorType
	 * @see #setType(SensorType)
	 * @see iot.sensornetwork.SensornetworkPackage#getSensorModule_Type()
	 * @model
	 * @generated
	 */
	SensorType getType();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.SensorModule#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see iot.sensornetwork.SensorType
	 * @see #getType()
	 * @generated
	 */
	void setType(SensorType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see iot.sensornetwork.SensornetworkPackage#getSensorModule_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.SensorModule#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(double)
	 * @see iot.sensornetwork.SensornetworkPackage#getSensorModule_MinValue()
	 * @model
	 * @generated
	 */
	double getMinValue();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.SensorModule#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(double value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(double)
	 * @see iot.sensornetwork.SensornetworkPackage#getSensorModule_MaxValue()
	 * @model
	 * @generated
	 */
	double getMaxValue();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.SensorModule#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(double value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iot.sensornetwork.SensornetworkPackage#getSensorModule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.SensorModule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SensorModule
