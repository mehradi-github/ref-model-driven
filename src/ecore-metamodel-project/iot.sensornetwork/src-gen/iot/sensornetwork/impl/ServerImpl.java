/**
 */
package iot.sensornetwork.impl;

import iot.sensornetwork.CommunicationModule;
import iot.sensornetwork.PowerModule;
import iot.sensornetwork.SensornetworkPackage;
import iot.sensornetwork.Server;
import iot.sensornetwork.ServerType;

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
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iot.sensornetwork.impl.ServerImpl#getName <em>Name</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.ServerImpl#getCpuFrequency <em>Cpu Frequency</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.ServerImpl#getRamSize <em>Ram Size</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.ServerImpl#getOS <em>OS</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.ServerImpl#getType <em>Type</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.ServerImpl#getServerToCommunication <em>Server To Communication</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.ServerImpl#getServerToPower <em>Server To Power</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends MinimalEObjectImpl.Container implements Server {
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
	 * The default value of the '{@link #getCpuFrequency() <em>Cpu Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final float CPU_FREQUENCY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCpuFrequency() <em>Cpu Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuFrequency()
	 * @generated
	 * @ordered
	 */
	protected float cpuFrequency = CPU_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamSize() <em>Ram Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamSize()
	 * @generated
	 * @ordered
	 */
	protected static final float RAM_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRamSize() <em>Ram Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamSize()
	 * @generated
	 * @ordered
	 */
	protected float ramSize = RAM_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOS() <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOS() <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS()
	 * @generated
	 * @ordered
	 */
	protected String os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ServerType TYPE_EDEFAULT = ServerType.SMARTPHONE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ServerType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServerToCommunication() <em>Server To Communication</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerToCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationModule> serverToCommunication;

	/**
	 * The cached value of the '{@link #getServerToPower() <em>Server To Power</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerToPower()
	 * @generated
	 * @ordered
	 */
	protected PowerModule serverToPower;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensornetworkPackage.Literals.SERVER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.SERVER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCpuFrequency() {
		return cpuFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpuFrequency(float newCpuFrequency) {
		float oldCpuFrequency = cpuFrequency;
		cpuFrequency = newCpuFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.SERVER__CPU_FREQUENCY,
					oldCpuFrequency, cpuFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getRamSize() {
		return ramSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRamSize(float newRamSize) {
		float oldRamSize = ramSize;
		ramSize = newRamSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.SERVER__RAM_SIZE, oldRamSize,
					ramSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOS() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOS(String newOS) {
		String oldOS = os;
		os = newOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.SERVER__OS, oldOS, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ServerType newType) {
		ServerType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.SERVER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationModule> getServerToCommunication() {
		if (serverToCommunication == null) {
			serverToCommunication = new EObjectWithInverseResolvingEList.ManyInverse<CommunicationModule>(
					CommunicationModule.class, this, SensornetworkPackage.SERVER__SERVER_TO_COMMUNICATION,
					SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_SERVER);
		}
		return serverToCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerModule getServerToPower() {
		if (serverToPower != null && serverToPower.eIsProxy()) {
			InternalEObject oldServerToPower = (InternalEObject) serverToPower;
			serverToPower = (PowerModule) eResolveProxy(oldServerToPower);
			if (serverToPower != oldServerToPower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SensornetworkPackage.SERVER__SERVER_TO_POWER, oldServerToPower, serverToPower));
			}
		}
		return serverToPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerModule basicGetServerToPower() {
		return serverToPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerToPower(PowerModule newServerToPower) {
		PowerModule oldServerToPower = serverToPower;
		serverToPower = newServerToPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.SERVER__SERVER_TO_POWER,
					oldServerToPower, serverToPower));
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
		case SensornetworkPackage.SERVER__SERVER_TO_COMMUNICATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getServerToCommunication()).basicAdd(otherEnd,
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
		case SensornetworkPackage.SERVER__SERVER_TO_COMMUNICATION:
			return ((InternalEList<?>) getServerToCommunication()).basicRemove(otherEnd, msgs);
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
		case SensornetworkPackage.SERVER__NAME:
			return getName();
		case SensornetworkPackage.SERVER__CPU_FREQUENCY:
			return getCpuFrequency();
		case SensornetworkPackage.SERVER__RAM_SIZE:
			return getRamSize();
		case SensornetworkPackage.SERVER__OS:
			return getOS();
		case SensornetworkPackage.SERVER__TYPE:
			return getType();
		case SensornetworkPackage.SERVER__SERVER_TO_COMMUNICATION:
			return getServerToCommunication();
		case SensornetworkPackage.SERVER__SERVER_TO_POWER:
			if (resolve)
				return getServerToPower();
			return basicGetServerToPower();
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
		case SensornetworkPackage.SERVER__NAME:
			setName((String) newValue);
			return;
		case SensornetworkPackage.SERVER__CPU_FREQUENCY:
			setCpuFrequency((Float) newValue);
			return;
		case SensornetworkPackage.SERVER__RAM_SIZE:
			setRamSize((Float) newValue);
			return;
		case SensornetworkPackage.SERVER__OS:
			setOS((String) newValue);
			return;
		case SensornetworkPackage.SERVER__TYPE:
			setType((ServerType) newValue);
			return;
		case SensornetworkPackage.SERVER__SERVER_TO_COMMUNICATION:
			getServerToCommunication().clear();
			getServerToCommunication().addAll((Collection<? extends CommunicationModule>) newValue);
			return;
		case SensornetworkPackage.SERVER__SERVER_TO_POWER:
			setServerToPower((PowerModule) newValue);
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
		case SensornetworkPackage.SERVER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SensornetworkPackage.SERVER__CPU_FREQUENCY:
			setCpuFrequency(CPU_FREQUENCY_EDEFAULT);
			return;
		case SensornetworkPackage.SERVER__RAM_SIZE:
			setRamSize(RAM_SIZE_EDEFAULT);
			return;
		case SensornetworkPackage.SERVER__OS:
			setOS(OS_EDEFAULT);
			return;
		case SensornetworkPackage.SERVER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case SensornetworkPackage.SERVER__SERVER_TO_COMMUNICATION:
			getServerToCommunication().clear();
			return;
		case SensornetworkPackage.SERVER__SERVER_TO_POWER:
			setServerToPower((PowerModule) null);
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
		case SensornetworkPackage.SERVER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SensornetworkPackage.SERVER__CPU_FREQUENCY:
			return cpuFrequency != CPU_FREQUENCY_EDEFAULT;
		case SensornetworkPackage.SERVER__RAM_SIZE:
			return ramSize != RAM_SIZE_EDEFAULT;
		case SensornetworkPackage.SERVER__OS:
			return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
		case SensornetworkPackage.SERVER__TYPE:
			return type != TYPE_EDEFAULT;
		case SensornetworkPackage.SERVER__SERVER_TO_COMMUNICATION:
			return serverToCommunication != null && !serverToCommunication.isEmpty();
		case SensornetworkPackage.SERVER__SERVER_TO_POWER:
			return serverToPower != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", cpuFrequency: ");
		result.append(cpuFrequency);
		result.append(", ramSize: ");
		result.append(ramSize);
		result.append(", OS: ");
		result.append(os);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ServerImpl
