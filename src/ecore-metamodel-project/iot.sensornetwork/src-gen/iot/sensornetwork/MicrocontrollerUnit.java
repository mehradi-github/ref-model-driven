/**
 */
package iot.sensornetwork;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microcontroller Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToSensor <em>Microcontroller To Sensor</em>}</li>
 *   <li>{@link iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToActuator <em>Microcontroller To Actuator</em>}</li>
 *   <li>{@link iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToCommunication <em>Microcontroller To Communication</em>}</li>
 *   <li>{@link iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToPower <em>Microcontroller To Power</em>}</li>
 *   <li>{@link iot.sensornetwork.MicrocontrollerUnit#getType <em>Type</em>}</li>
 *   <li>{@link iot.sensornetwork.MicrocontrollerUnit#getFirmware <em>Firmware</em>}</li>
 *   <li>{@link iot.sensornetwork.MicrocontrollerUnit#getCpuFrequency <em>Cpu Frequency</em>}</li>
 *   <li>{@link iot.sensornetwork.MicrocontrollerUnit#getRamSize <em>Ram Size</em>}</li>
 *   <li>{@link iot.sensornetwork.MicrocontrollerUnit#getFlashSize <em>Flash Size</em>}</li>
 *   <li>{@link iot.sensornetwork.MicrocontrollerUnit#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see iot.sensornetwork.SensornetworkPackage#getMicrocontrollerUnit()
 * @model
 * @generated
 */
public interface MicrocontrollerUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Microcontroller To Sensor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iot.sensornetwork.SensorModule#getSensorToMicrocontroller <em>Sensor To Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microcontroller To Sensor</em>' reference.
	 * @see #setMicrocontrollerToSensor(SensorModule)
	 * @see iot.sensornetwork.SensornetworkPackage#getMicrocontrollerUnit_MicrocontrollerToSensor()
	 * @see iot.sensornetwork.SensorModule#getSensorToMicrocontroller
	 * @model opposite="SensorToMicrocontroller" required="true"
	 * @generated
	 */
	SensorModule getMicrocontrollerToSensor();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToSensor <em>Microcontroller To Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microcontroller To Sensor</em>' reference.
	 * @see #getMicrocontrollerToSensor()
	 * @generated
	 */
	void setMicrocontrollerToSensor(SensorModule value);

	/**
	 * Returns the value of the '<em><b>Microcontroller To Actuator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iot.sensornetwork.ActuatorModule#getActuatorToMicrocontroller <em>Actuator To Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microcontroller To Actuator</em>' reference.
	 * @see #setMicrocontrollerToActuator(ActuatorModule)
	 * @see iot.sensornetwork.SensornetworkPackage#getMicrocontrollerUnit_MicrocontrollerToActuator()
	 * @see iot.sensornetwork.ActuatorModule#getActuatorToMicrocontroller
	 * @model opposite="ActuatorToMicrocontroller" required="true"
	 * @generated
	 */
	ActuatorModule getMicrocontrollerToActuator();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToActuator <em>Microcontroller To Actuator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microcontroller To Actuator</em>' reference.
	 * @see #getMicrocontrollerToActuator()
	 * @generated
	 */
	void setMicrocontrollerToActuator(ActuatorModule value);

	/**
	 * Returns the value of the '<em><b>Microcontroller To Communication</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iot.sensornetwork.CommunicationModule#getCommunicationToMicrocontroller <em>Communication To Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microcontroller To Communication</em>' reference.
	 * @see #setMicrocontrollerToCommunication(CommunicationModule)
	 * @see iot.sensornetwork.SensornetworkPackage#getMicrocontrollerUnit_MicrocontrollerToCommunication()
	 * @see iot.sensornetwork.CommunicationModule#getCommunicationToMicrocontroller
	 * @model opposite="CommunicationToMicrocontroller" required="true"
	 * @generated
	 */
	CommunicationModule getMicrocontrollerToCommunication();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToCommunication <em>Microcontroller To Communication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microcontroller To Communication</em>' reference.
	 * @see #getMicrocontrollerToCommunication()
	 * @generated
	 */
	void setMicrocontrollerToCommunication(CommunicationModule value);

	/**
	 * Returns the value of the '<em><b>Microcontroller To Power</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iot.sensornetwork.PowerModule#getPowerToMicrocontroller <em>Power To Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microcontroller To Power</em>' reference.
	 * @see #setMicrocontrollerToPower(PowerModule)
	 * @see iot.sensornetwork.SensornetworkPackage#getMicrocontrollerUnit_MicrocontrollerToPower()
	 * @see iot.sensornetwork.PowerModule#getPowerToMicrocontroller
	 * @model opposite="PowerToMicrocontroller" required="true"
	 * @generated
	 */
	PowerModule getMicrocontrollerToPower();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToPower <em>Microcontroller To Power</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microcontroller To Power</em>' reference.
	 * @see #getMicrocontrollerToPower()
	 * @generated
	 */
	void setMicrocontrollerToPower(PowerModule value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link iot.sensornetwork.MicrocontrollerunitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see iot.sensornetwork.MicrocontrollerunitType
	 * @see #setType(MicrocontrollerunitType)
	 * @see iot.sensornetwork.SensornetworkPackage#getMicrocontrollerUnit_Type()
	 * @model
	 * @generated
	 */
	MicrocontrollerunitType getType();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.MicrocontrollerUnit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see iot.sensornetwork.MicrocontrollerunitType
	 * @see #getType()
	 * @generated
	 */
	void setType(MicrocontrollerunitType value);

	/**
	 * Returns the value of the '<em><b>Firmware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firmware</em>' attribute.
	 * @see #setFirmware(String)
	 * @see iot.sensornetwork.SensornetworkPackage#getMicrocontrollerUnit_Firmware()
	 * @model
	 * @generated
	 */
	String getFirmware();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.MicrocontrollerUnit#getFirmware <em>Firmware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmware</em>' attribute.
	 * @see #getFirmware()
	 * @generated
	 */
	void setFirmware(String value);

	/**
	 * Returns the value of the '<em><b>Cpu Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Frequency</em>' attribute.
	 * @see #setCpuFrequency(float)
	 * @see iot.sensornetwork.SensornetworkPackage#getMicrocontrollerUnit_CpuFrequency()
	 * @model
	 * @generated
	 */
	float getCpuFrequency();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.MicrocontrollerUnit#getCpuFrequency <em>Cpu Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Frequency</em>' attribute.
	 * @see #getCpuFrequency()
	 * @generated
	 */
	void setCpuFrequency(float value);

	/**
	 * Returns the value of the '<em><b>Ram Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram Size</em>' attribute.
	 * @see #setRamSize(float)
	 * @see iot.sensornetwork.SensornetworkPackage#getMicrocontrollerUnit_RamSize()
	 * @model
	 * @generated
	 */
	float getRamSize();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.MicrocontrollerUnit#getRamSize <em>Ram Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Size</em>' attribute.
	 * @see #getRamSize()
	 * @generated
	 */
	void setRamSize(float value);

	/**
	 * Returns the value of the '<em><b>Flash Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flash Size</em>' attribute.
	 * @see #setFlashSize(float)
	 * @see iot.sensornetwork.SensornetworkPackage#getMicrocontrollerUnit_FlashSize()
	 * @model
	 * @generated
	 */
	float getFlashSize();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.MicrocontrollerUnit#getFlashSize <em>Flash Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flash Size</em>' attribute.
	 * @see #getFlashSize()
	 * @generated
	 */
	void setFlashSize(float value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iot.sensornetwork.SensornetworkPackage#getMicrocontrollerUnit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.MicrocontrollerUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MicrocontrollerUnit
