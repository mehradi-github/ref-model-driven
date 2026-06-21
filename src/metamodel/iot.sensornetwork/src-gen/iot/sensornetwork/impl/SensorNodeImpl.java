/**
 */
package iot.sensornetwork.impl;

import iot.sensornetwork.ActuatorModule;
import iot.sensornetwork.CommunicationModule;
import iot.sensornetwork.MicrocontrollerUnit;
import iot.sensornetwork.PowerModule;
import iot.sensornetwork.SensorModule;
import iot.sensornetwork.SensorNode;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iot.sensornetwork.impl.SensorNodeImpl#getHasSensorModule <em>Has Sensor Module</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.SensorNodeImpl#getHasActuatorModule <em>Has Actuator Module</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.SensorNodeImpl#getHasCommunicationModule <em>Has Communication Module</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.SensorNodeImpl#getHasPowerModule <em>Has Power Module</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.SensorNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.SensorNodeImpl#getSamplingRate <em>Sampling Rate</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.SensorNodeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.SensorNodeImpl#getHasMicrocontrollerUnit <em>Has Microcontroller Unit</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.SensorNodeImpl#getHasServer <em>Has Server</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorNodeImpl extends MinimalEObjectImpl.Container implements SensorNode {
	/**
	 * The cached value of the '{@link #getHasSensorModule() <em>Has Sensor Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSensorModule()
	 * @generated
	 * @ordered
	 */
	protected EList<SensorModule> hasSensorModule;

	/**
	 * The cached value of the '{@link #getHasActuatorModule() <em>Has Actuator Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasActuatorModule()
	 * @generated
	 * @ordered
	 */
	protected EList<ActuatorModule> hasActuatorModule;

	/**
	 * The cached value of the '{@link #getHasCommunicationModule() <em>Has Communication Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCommunicationModule()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationModule> hasCommunicationModule;

	/**
	 * The cached value of the '{@link #getHasPowerModule() <em>Has Power Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPowerModule()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerModule> hasPowerModule;

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
	 * The default value of the '{@link #getSamplingRate() <em>Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingRate()
	 * @generated
	 * @ordered
	 */
	protected static final int SAMPLING_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSamplingRate() <em>Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingRate()
	 * @generated
	 * @ordered
	 */
	protected int samplingRate = SAMPLING_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasMicrocontrollerUnit() <em>Has Microcontroller Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMicrocontrollerUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<MicrocontrollerUnit> hasMicrocontrollerUnit;

	/**
	 * The cached value of the '{@link #getHasServer() <em>Has Server</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasServer()
	 * @generated
	 * @ordered
	 */
	protected EList<Server> hasServer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensornetworkPackage.Literals.SENSOR_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SensorModule> getHasSensorModule() {
		if (hasSensorModule == null) {
			hasSensorModule = new EObjectContainmentEList<SensorModule>(SensorModule.class, this,
					SensornetworkPackage.SENSOR_NODE__HAS_SENSOR_MODULE);
		}
		return hasSensorModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActuatorModule> getHasActuatorModule() {
		if (hasActuatorModule == null) {
			hasActuatorModule = new EObjectContainmentEList<ActuatorModule>(ActuatorModule.class, this,
					SensornetworkPackage.SENSOR_NODE__HAS_ACTUATOR_MODULE);
		}
		return hasActuatorModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationModule> getHasCommunicationModule() {
		if (hasCommunicationModule == null) {
			hasCommunicationModule = new EObjectContainmentEList<CommunicationModule>(CommunicationModule.class, this,
					SensornetworkPackage.SENSOR_NODE__HAS_COMMUNICATION_MODULE);
		}
		return hasCommunicationModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PowerModule> getHasPowerModule() {
		if (hasPowerModule == null) {
			hasPowerModule = new EObjectContainmentEList<PowerModule>(PowerModule.class, this,
					SensornetworkPackage.SENSOR_NODE__HAS_POWER_MODULE);
		}
		return hasPowerModule;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.SENSOR_NODE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSamplingRate() {
		return samplingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSamplingRate(int newSamplingRate) {
		int oldSamplingRate = samplingRate;
		samplingRate = newSamplingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.SENSOR_NODE__SAMPLING_RATE,
					oldSamplingRate, samplingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.SENSOR_NODE__LOCATION,
					oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MicrocontrollerUnit> getHasMicrocontrollerUnit() {
		if (hasMicrocontrollerUnit == null) {
			hasMicrocontrollerUnit = new EObjectContainmentEList<MicrocontrollerUnit>(MicrocontrollerUnit.class, this,
					SensornetworkPackage.SENSOR_NODE__HAS_MICROCONTROLLER_UNIT);
		}
		return hasMicrocontrollerUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Server> getHasServer() {
		if (hasServer == null) {
			hasServer = new EObjectContainmentEList<Server>(Server.class, this,
					SensornetworkPackage.SENSOR_NODE__HAS_SERVER);
		}
		return hasServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SensornetworkPackage.SENSOR_NODE__HAS_SENSOR_MODULE:
			return ((InternalEList<?>) getHasSensorModule()).basicRemove(otherEnd, msgs);
		case SensornetworkPackage.SENSOR_NODE__HAS_ACTUATOR_MODULE:
			return ((InternalEList<?>) getHasActuatorModule()).basicRemove(otherEnd, msgs);
		case SensornetworkPackage.SENSOR_NODE__HAS_COMMUNICATION_MODULE:
			return ((InternalEList<?>) getHasCommunicationModule()).basicRemove(otherEnd, msgs);
		case SensornetworkPackage.SENSOR_NODE__HAS_POWER_MODULE:
			return ((InternalEList<?>) getHasPowerModule()).basicRemove(otherEnd, msgs);
		case SensornetworkPackage.SENSOR_NODE__HAS_MICROCONTROLLER_UNIT:
			return ((InternalEList<?>) getHasMicrocontrollerUnit()).basicRemove(otherEnd, msgs);
		case SensornetworkPackage.SENSOR_NODE__HAS_SERVER:
			return ((InternalEList<?>) getHasServer()).basicRemove(otherEnd, msgs);
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
		case SensornetworkPackage.SENSOR_NODE__HAS_SENSOR_MODULE:
			return getHasSensorModule();
		case SensornetworkPackage.SENSOR_NODE__HAS_ACTUATOR_MODULE:
			return getHasActuatorModule();
		case SensornetworkPackage.SENSOR_NODE__HAS_COMMUNICATION_MODULE:
			return getHasCommunicationModule();
		case SensornetworkPackage.SENSOR_NODE__HAS_POWER_MODULE:
			return getHasPowerModule();
		case SensornetworkPackage.SENSOR_NODE__NAME:
			return getName();
		case SensornetworkPackage.SENSOR_NODE__SAMPLING_RATE:
			return getSamplingRate();
		case SensornetworkPackage.SENSOR_NODE__LOCATION:
			return getLocation();
		case SensornetworkPackage.SENSOR_NODE__HAS_MICROCONTROLLER_UNIT:
			return getHasMicrocontrollerUnit();
		case SensornetworkPackage.SENSOR_NODE__HAS_SERVER:
			return getHasServer();
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
		case SensornetworkPackage.SENSOR_NODE__HAS_SENSOR_MODULE:
			getHasSensorModule().clear();
			getHasSensorModule().addAll((Collection<? extends SensorModule>) newValue);
			return;
		case SensornetworkPackage.SENSOR_NODE__HAS_ACTUATOR_MODULE:
			getHasActuatorModule().clear();
			getHasActuatorModule().addAll((Collection<? extends ActuatorModule>) newValue);
			return;
		case SensornetworkPackage.SENSOR_NODE__HAS_COMMUNICATION_MODULE:
			getHasCommunicationModule().clear();
			getHasCommunicationModule().addAll((Collection<? extends CommunicationModule>) newValue);
			return;
		case SensornetworkPackage.SENSOR_NODE__HAS_POWER_MODULE:
			getHasPowerModule().clear();
			getHasPowerModule().addAll((Collection<? extends PowerModule>) newValue);
			return;
		case SensornetworkPackage.SENSOR_NODE__NAME:
			setName((String) newValue);
			return;
		case SensornetworkPackage.SENSOR_NODE__SAMPLING_RATE:
			setSamplingRate((Integer) newValue);
			return;
		case SensornetworkPackage.SENSOR_NODE__LOCATION:
			setLocation((String) newValue);
			return;
		case SensornetworkPackage.SENSOR_NODE__HAS_MICROCONTROLLER_UNIT:
			getHasMicrocontrollerUnit().clear();
			getHasMicrocontrollerUnit().addAll((Collection<? extends MicrocontrollerUnit>) newValue);
			return;
		case SensornetworkPackage.SENSOR_NODE__HAS_SERVER:
			getHasServer().clear();
			getHasServer().addAll((Collection<? extends Server>) newValue);
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
		case SensornetworkPackage.SENSOR_NODE__HAS_SENSOR_MODULE:
			getHasSensorModule().clear();
			return;
		case SensornetworkPackage.SENSOR_NODE__HAS_ACTUATOR_MODULE:
			getHasActuatorModule().clear();
			return;
		case SensornetworkPackage.SENSOR_NODE__HAS_COMMUNICATION_MODULE:
			getHasCommunicationModule().clear();
			return;
		case SensornetworkPackage.SENSOR_NODE__HAS_POWER_MODULE:
			getHasPowerModule().clear();
			return;
		case SensornetworkPackage.SENSOR_NODE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SensornetworkPackage.SENSOR_NODE__SAMPLING_RATE:
			setSamplingRate(SAMPLING_RATE_EDEFAULT);
			return;
		case SensornetworkPackage.SENSOR_NODE__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case SensornetworkPackage.SENSOR_NODE__HAS_MICROCONTROLLER_UNIT:
			getHasMicrocontrollerUnit().clear();
			return;
		case SensornetworkPackage.SENSOR_NODE__HAS_SERVER:
			getHasServer().clear();
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
		case SensornetworkPackage.SENSOR_NODE__HAS_SENSOR_MODULE:
			return hasSensorModule != null && !hasSensorModule.isEmpty();
		case SensornetworkPackage.SENSOR_NODE__HAS_ACTUATOR_MODULE:
			return hasActuatorModule != null && !hasActuatorModule.isEmpty();
		case SensornetworkPackage.SENSOR_NODE__HAS_COMMUNICATION_MODULE:
			return hasCommunicationModule != null && !hasCommunicationModule.isEmpty();
		case SensornetworkPackage.SENSOR_NODE__HAS_POWER_MODULE:
			return hasPowerModule != null && !hasPowerModule.isEmpty();
		case SensornetworkPackage.SENSOR_NODE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SensornetworkPackage.SENSOR_NODE__SAMPLING_RATE:
			return samplingRate != SAMPLING_RATE_EDEFAULT;
		case SensornetworkPackage.SENSOR_NODE__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		case SensornetworkPackage.SENSOR_NODE__HAS_MICROCONTROLLER_UNIT:
			return hasMicrocontrollerUnit != null && !hasMicrocontrollerUnit.isEmpty();
		case SensornetworkPackage.SENSOR_NODE__HAS_SERVER:
			return hasServer != null && !hasServer.isEmpty();
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
		result.append(", samplingRate: ");
		result.append(samplingRate);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //SensorNodeImpl
