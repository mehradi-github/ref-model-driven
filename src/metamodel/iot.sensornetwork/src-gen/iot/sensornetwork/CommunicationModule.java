/**
 */
package iot.sensornetwork;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iot.sensornetwork.CommunicationModule#getCommunicationToMicrocontroller <em>Communication To Microcontroller</em>}</li>
 *   <li>{@link iot.sensornetwork.CommunicationModule#getType <em>Type</em>}</li>
 *   <li>{@link iot.sensornetwork.CommunicationModule#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link iot.sensornetwork.CommunicationModule#getBaudRate <em>Baud Rate</em>}</li>
 *   <li>{@link iot.sensornetwork.CommunicationModule#getBuffer <em>Buffer</em>}</li>
 *   <li>{@link iot.sensornetwork.CommunicationModule#getMacAddress <em>Mac Address</em>}</li>
 *   <li>{@link iot.sensornetwork.CommunicationModule#getName <em>Name</em>}</li>
 *   <li>{@link iot.sensornetwork.CommunicationModule#getCommunicationToServer <em>Communication To Server</em>}</li>
 * </ul>
 *
 * @see iot.sensornetwork.SensornetworkPackage#getCommunicationModule()
 * @model
 * @generated
 */
public interface CommunicationModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Communication To Microcontroller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToCommunication <em>Microcontroller To Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication To Microcontroller</em>' reference.
	 * @see #setCommunicationToMicrocontroller(MicrocontrollerUnit)
	 * @see iot.sensornetwork.SensornetworkPackage#getCommunicationModule_CommunicationToMicrocontroller()
	 * @see iot.sensornetwork.MicrocontrollerUnit#getMicrocontrollerToCommunication
	 * @model opposite="MicrocontrollerToCommunication" required="true"
	 * @generated
	 */
	MicrocontrollerUnit getCommunicationToMicrocontroller();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.CommunicationModule#getCommunicationToMicrocontroller <em>Communication To Microcontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication To Microcontroller</em>' reference.
	 * @see #getCommunicationToMicrocontroller()
	 * @generated
	 */
	void setCommunicationToMicrocontroller(MicrocontrollerUnit value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link iot.sensornetwork.CommunicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see iot.sensornetwork.CommunicationType
	 * @see #setType(CommunicationType)
	 * @see iot.sensornetwork.SensornetworkPackage#getCommunicationModule_Type()
	 * @model
	 * @generated
	 */
	CommunicationType getType();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.CommunicationModule#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see iot.sensornetwork.CommunicationType
	 * @see #getType()
	 * @generated
	 */
	void setType(CommunicationType value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see iot.sensornetwork.SensornetworkPackage#getCommunicationModule_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.CommunicationModule#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Baud Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baud Rate</em>' attribute.
	 * @see #setBaudRate(float)
	 * @see iot.sensornetwork.SensornetworkPackage#getCommunicationModule_BaudRate()
	 * @model
	 * @generated
	 */
	float getBaudRate();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.CommunicationModule#getBaudRate <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baud Rate</em>' attribute.
	 * @see #getBaudRate()
	 * @generated
	 */
	void setBaudRate(float value);

	/**
	 * Returns the value of the '<em><b>Buffer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer</em>' attribute.
	 * @see #setBuffer(float)
	 * @see iot.sensornetwork.SensornetworkPackage#getCommunicationModule_Buffer()
	 * @model
	 * @generated
	 */
	float getBuffer();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.CommunicationModule#getBuffer <em>Buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer</em>' attribute.
	 * @see #getBuffer()
	 * @generated
	 */
	void setBuffer(float value);

	/**
	 * Returns the value of the '<em><b>Mac Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac Address</em>' attribute.
	 * @see #setMacAddress(String)
	 * @see iot.sensornetwork.SensornetworkPackage#getCommunicationModule_MacAddress()
	 * @model
	 * @generated
	 */
	String getMacAddress();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.CommunicationModule#getMacAddress <em>Mac Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac Address</em>' attribute.
	 * @see #getMacAddress()
	 * @generated
	 */
	void setMacAddress(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iot.sensornetwork.SensornetworkPackage#getCommunicationModule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iot.sensornetwork.CommunicationModule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Communication To Server</b></em>' reference list.
	 * The list contents are of type {@link iot.sensornetwork.Server}.
	 * It is bidirectional and its opposite is '{@link iot.sensornetwork.Server#getServerToCommunication <em>Server To Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication To Server</em>' reference list.
	 * @see iot.sensornetwork.SensornetworkPackage#getCommunicationModule_CommunicationToServer()
	 * @see iot.sensornetwork.Server#getServerToCommunication
	 * @model opposite="ServerToCommunication"
	 * @generated
	 */
	EList<Server> getCommunicationToServer();

} // CommunicationModule
