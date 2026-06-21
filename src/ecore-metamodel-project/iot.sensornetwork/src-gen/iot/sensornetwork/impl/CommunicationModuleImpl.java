/**
 */
package iot.sensornetwork.impl;

import iot.sensornetwork.CommunicationModule;
import iot.sensornetwork.CommunicationType;
import iot.sensornetwork.MicrocontrollerUnit;
import iot.sensornetwork.SensornetworkPackage;
import iot.sensornetwork.Server;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iot.sensornetwork.impl.CommunicationModuleImpl#getCommunicationToMicrocontroller <em>Communication To Microcontroller</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.CommunicationModuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.CommunicationModuleImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.CommunicationModuleImpl#getBaudRate <em>Baud Rate</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.CommunicationModuleImpl#getBuffer <em>Buffer</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.CommunicationModuleImpl#getMacAddress <em>Mac Address</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.CommunicationModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.CommunicationModuleImpl#getCommunicationToServer <em>Communication To Server</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationModuleImpl extends MinimalEObjectImpl.Container implements CommunicationModule {
	/**
	 * The cached value of the '{@link #getCommunicationToMicrocontroller() <em>Communication To Microcontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationToMicrocontroller()
	 * @generated
	 * @ordered
	 */
	protected MicrocontrollerUnit communicationToMicrocontroller;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CommunicationType TYPE_EDEFAULT = CommunicationType.BLUETOOTH;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CommunicationType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaudRate() <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaudRate()
	 * @generated
	 * @ordered
	 */
	protected static final float BAUD_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBaudRate() <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaudRate()
	 * @generated
	 * @ordered
	 */
	protected float baudRate = BAUD_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuffer() <em>Buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffer()
	 * @generated
	 * @ordered
	 */
	protected static final float BUFFER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBuffer() <em>Buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffer()
	 * @generated
	 * @ordered
	 */
	protected float buffer = BUFFER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMacAddress() <em>Mac Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String MAC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMacAddress() <em>Mac Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacAddress()
	 * @generated
	 * @ordered
	 */
	protected String macAddress = MAC_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommunicationToServer() <em>Communication To Server</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationToServer()
	 * @generated
	 * @ordered
	 */
	protected EList<Server> communicationToServer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensornetworkPackage.Literals.COMMUNICATION_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicrocontrollerUnit getCommunicationToMicrocontroller() {
		if (communicationToMicrocontroller != null && communicationToMicrocontroller.eIsProxy()) {
			InternalEObject oldCommunicationToMicrocontroller = (InternalEObject) communicationToMicrocontroller;
			communicationToMicrocontroller = (MicrocontrollerUnit) eResolveProxy(oldCommunicationToMicrocontroller);
			if (communicationToMicrocontroller != oldCommunicationToMicrocontroller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_MICROCONTROLLER,
							oldCommunicationToMicrocontroller, communicationToMicrocontroller));
			}
		}
		return communicationToMicrocontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerUnit basicGetCommunicationToMicrocontroller() {
		return communicationToMicrocontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationToMicrocontroller(
			MicrocontrollerUnit newCommunicationToMicrocontroller, NotificationChain msgs) {
		MicrocontrollerUnit oldCommunicationToMicrocontroller = communicationToMicrocontroller;
		communicationToMicrocontroller = newCommunicationToMicrocontroller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_MICROCONTROLLER,
					oldCommunicationToMicrocontroller, newCommunicationToMicrocontroller);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationToMicrocontroller(MicrocontrollerUnit newCommunicationToMicrocontroller) {
		if (newCommunicationToMicrocontroller != communicationToMicrocontroller) {
			NotificationChain msgs = null;
			if (communicationToMicrocontroller != null)
				msgs = ((InternalEObject) communicationToMicrocontroller).eInverseRemove(this,
						SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_COMMUNICATION,
						MicrocontrollerUnit.class, msgs);
			if (newCommunicationToMicrocontroller != null)
				msgs = ((InternalEObject) newCommunicationToMicrocontroller).eInverseAdd(this,
						SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_COMMUNICATION,
						MicrocontrollerUnit.class, msgs);
			msgs = basicSetCommunicationToMicrocontroller(newCommunicationToMicrocontroller, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_MICROCONTROLLER,
					newCommunicationToMicrocontroller, newCommunicationToMicrocontroller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(CommunicationType newType) {
		CommunicationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.COMMUNICATION_MODULE__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.COMMUNICATION_MODULE__PROTOCOL,
					oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getBaudRate() {
		return baudRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaudRate(float newBaudRate) {
		float oldBaudRate = baudRate;
		baudRate = newBaudRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.COMMUNICATION_MODULE__BAUD_RATE,
					oldBaudRate, baudRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getBuffer() {
		return buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuffer(float newBuffer) {
		float oldBuffer = buffer;
		buffer = newBuffer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.COMMUNICATION_MODULE__BUFFER,
					oldBuffer, buffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMacAddress(String newMacAddress) {
		String oldMacAddress = macAddress;
		macAddress = newMacAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.COMMUNICATION_MODULE__MAC_ADDRESS, oldMacAddress, macAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.COMMUNICATION_MODULE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Server> getCommunicationToServer() {
		if (communicationToServer == null) {
			communicationToServer = new EObjectWithInverseResolvingEList.ManyInverse<Server>(Server.class, this,
					SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_SERVER,
					SensornetworkPackage.SERVER__SERVER_TO_COMMUNICATION);
		}
		return communicationToServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_MICROCONTROLLER:
			if (communicationToMicrocontroller != null)
				msgs = ((InternalEObject) communicationToMicrocontroller).eInverseRemove(this,
						SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_COMMUNICATION,
						MicrocontrollerUnit.class, msgs);
			return basicSetCommunicationToMicrocontroller((MicrocontrollerUnit) otherEnd, msgs);
		case SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_SERVER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCommunicationToServer()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_MICROCONTROLLER:
			return basicSetCommunicationToMicrocontroller(null, msgs);
		case SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_SERVER:
			return ((InternalEList<?>) getCommunicationToServer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_MICROCONTROLLER:
			if (resolve)
				return getCommunicationToMicrocontroller();
			return basicGetCommunicationToMicrocontroller();
		case SensornetworkPackage.COMMUNICATION_MODULE__TYPE:
			return getType();
		case SensornetworkPackage.COMMUNICATION_MODULE__PROTOCOL:
			return getProtocol();
		case SensornetworkPackage.COMMUNICATION_MODULE__BAUD_RATE:
			return getBaudRate();
		case SensornetworkPackage.COMMUNICATION_MODULE__BUFFER:
			return getBuffer();
		case SensornetworkPackage.COMMUNICATION_MODULE__MAC_ADDRESS:
			return getMacAddress();
		case SensornetworkPackage.COMMUNICATION_MODULE__NAME:
			return getName();
		case SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_SERVER:
			return getCommunicationToServer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_MICROCONTROLLER:
			setCommunicationToMicrocontroller((MicrocontrollerUnit) newValue);
			return;
		case SensornetworkPackage.COMMUNICATION_MODULE__TYPE:
			setType((CommunicationType) newValue);
			return;
		case SensornetworkPackage.COMMUNICATION_MODULE__PROTOCOL:
			setProtocol((String) newValue);
			return;
		case SensornetworkPackage.COMMUNICATION_MODULE__BAUD_RATE:
			setBaudRate((Float) newValue);
			return;
		case SensornetworkPackage.COMMUNICATION_MODULE__BUFFER:
			setBuffer((Float) newValue);
			return;
		case SensornetworkPackage.COMMUNICATION_MODULE__MAC_ADDRESS:
			setMacAddress((String) newValue);
			return;
		case SensornetworkPackage.COMMUNICATION_MODULE__NAME:
			setName((String) newValue);
			return;
		case SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_SERVER:
			getCommunicationToServer().clear();
			getCommunicationToServer().addAll((Collection<? extends Server>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_MICROCONTROLLER:
			setCommunicationToMicrocontroller((MicrocontrollerUnit) null);
			return;
		case SensornetworkPackage.COMMUNICATION_MODULE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case SensornetworkPackage.COMMUNICATION_MODULE__PROTOCOL:
			setProtocol(PROTOCOL_EDEFAULT);
			return;
		case SensornetworkPackage.COMMUNICATION_MODULE__BAUD_RATE:
			setBaudRate(BAUD_RATE_EDEFAULT);
			return;
		case SensornetworkPackage.COMMUNICATION_MODULE__BUFFER:
			setBuffer(BUFFER_EDEFAULT);
			return;
		case SensornetworkPackage.COMMUNICATION_MODULE__MAC_ADDRESS:
			setMacAddress(MAC_ADDRESS_EDEFAULT);
			return;
		case SensornetworkPackage.COMMUNICATION_MODULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_SERVER:
			getCommunicationToServer().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_MICROCONTROLLER:
			return communicationToMicrocontroller != null;
		case SensornetworkPackage.COMMUNICATION_MODULE__TYPE:
			return type != TYPE_EDEFAULT;
		case SensornetworkPackage.COMMUNICATION_MODULE__PROTOCOL:
			return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
		case SensornetworkPackage.COMMUNICATION_MODULE__BAUD_RATE:
			return baudRate != BAUD_RATE_EDEFAULT;
		case SensornetworkPackage.COMMUNICATION_MODULE__BUFFER:
			return buffer != BUFFER_EDEFAULT;
		case SensornetworkPackage.COMMUNICATION_MODULE__MAC_ADDRESS:
			return MAC_ADDRESS_EDEFAULT == null ? macAddress != null : !MAC_ADDRESS_EDEFAULT.equals(macAddress);
		case SensornetworkPackage.COMMUNICATION_MODULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_SERVER:
			return communicationToServer != null && !communicationToServer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(", baudRate: ");
		result.append(baudRate);
		result.append(", buffer: ");
		result.append(buffer);
		result.append(", macAddress: ");
		result.append(macAddress);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CommunicationModuleImpl
