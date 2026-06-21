/**
 */
package iot.sensornetwork;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot.sensornetwork.Server#getName <em>Name</em>}</li>
 *   <li>{@link iot.sensornetwork.Server#getCpuFrequency <em>Cpu Frequency</em>}</li>
 *   <li>{@link iot.sensornetwork.Server#getRamSize <em>Ram Size</em>}</li>
 *   <li>{@link iot.sensornetwork.Server#getOS <em>OS</em>}</li>
 *   <li>{@link iot.sensornetwork.Server#getType <em>Type</em>}</li>
 *   <li>{@link iot.sensornetwork.Server#getServerToCommunication <em>Server To Communication</em>}</li>
 *   <li>{@link iot.sensornetwork.Server#getServerToPower <em>Server To Power</em>}</li>
 * </ul>
 *
 * @see iot.sensornetwork.SensornetworkPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iot.sensornetwork.SensornetworkPackage#getServer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.Server#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cpu Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Frequency</em>' attribute.
	 * @see #setCpuFrequency(float)
	 * @see iot.sensornetwork.SensornetworkPackage#getServer_CpuFrequency()
	 * @model
	 * @generated
	 */
	float getCpuFrequency();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.Server#getCpuFrequency <em>Cpu Frequency</em>}' attribute.
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
	 * @see iot.sensornetwork.SensornetworkPackage#getServer_RamSize()
	 * @model
	 * @generated
	 */
	float getRamSize();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.Server#getRamSize <em>Ram Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Size</em>' attribute.
	 * @see #getRamSize()
	 * @generated
	 */
	void setRamSize(float value);

	/**
	 * Returns the value of the '<em><b>OS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS</em>' attribute.
	 * @see #setOS(String)
	 * @see iot.sensornetwork.SensornetworkPackage#getServer_OS()
	 * @model
	 * @generated
	 */
	String getOS();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.Server#getOS <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS</em>' attribute.
	 * @see #getOS()
	 * @generated
	 */
	void setOS(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link iot.sensornetwork.ServerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see iot.sensornetwork.ServerType
	 * @see #setType(ServerType)
	 * @see iot.sensornetwork.SensornetworkPackage#getServer_Type()
	 * @model
	 * @generated
	 */
	ServerType getType();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.Server#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see iot.sensornetwork.ServerType
	 * @see #getType()
	 * @generated
	 */
	void setType(ServerType value);

	/**
	 * Returns the value of the '<em><b>Server To Communication</b></em>' reference list.
	 * The list contents are of type {@link iot.sensornetwork.CommunicationModule}.
	 * It is bidirectional and its opposite is '{@link iot.sensornetwork.CommunicationModule#getCommunicationToServer <em>Communication To Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server To Communication</em>' reference list.
	 * @see iot.sensornetwork.SensornetworkPackage#getServer_ServerToCommunication()
	 * @see iot.sensornetwork.CommunicationModule#getCommunicationToServer
	 * @model opposite="CommunicationToServer"
	 * @generated
	 */
	EList<CommunicationModule> getServerToCommunication();

	/**
	 * Returns the value of the '<em><b>Server To Power</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server To Power</em>' reference.
	 * @see #setServerToPower(PowerModule)
	 * @see iot.sensornetwork.SensornetworkPackage#getServer_ServerToPower()
	 * @model
	 * @generated
	 */
	PowerModule getServerToPower();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.Server#getServerToPower <em>Server To Power</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server To Power</em>' reference.
	 * @see #getServerToPower()
	 * @generated
	 */
	void setServerToPower(PowerModule value);

} // Server
