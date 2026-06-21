/**
 */
package iot.sensornetwork.impl;

import iot.sensornetwork.MicrocontrollerUnit;
import iot.sensornetwork.PowerModule;
import iot.sensornetwork.PowerType;
import iot.sensornetwork.SensornetworkPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iot.sensornetwork.impl.PowerModuleImpl#getPowerToMicrocontroller <em>Power To Microcontroller</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.PowerModuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.PowerModuleImpl#getVoltageRange <em>Voltage Range</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.PowerModuleImpl#getCurrentDraw <em>Current Draw</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.PowerModuleImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerModuleImpl extends MinimalEObjectImpl.Container implements PowerModule {
	/**
	 * The cached value of the '{@link #getPowerToMicrocontroller() <em>Power To Microcontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerToMicrocontroller()
	 * @generated
	 * @ordered
	 */
	protected MicrocontrollerUnit powerToMicrocontroller;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PowerType TYPE_EDEFAULT = PowerType.BATTERYLITHIUM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PowerType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageRange() <em>Voltage Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageRange()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_RANGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltageRange() <em>Voltage Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageRange()
	 * @generated
	 * @ordered
	 */
	protected float voltageRange = VOLTAGE_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentDraw() <em>Current Draw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDraw()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_DRAW_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentDraw() <em>Current Draw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDraw()
	 * @generated
	 * @ordered
	 */
	protected float currentDraw = CURRENT_DRAW_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensornetworkPackage.Literals.POWER_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicrocontrollerUnit getPowerToMicrocontroller() {
		if (powerToMicrocontroller != null && powerToMicrocontroller.eIsProxy()) {
			InternalEObject oldPowerToMicrocontroller = (InternalEObject) powerToMicrocontroller;
			powerToMicrocontroller = (MicrocontrollerUnit) eResolveProxy(oldPowerToMicrocontroller);
			if (powerToMicrocontroller != oldPowerToMicrocontroller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SensornetworkPackage.POWER_MODULE__POWER_TO_MICROCONTROLLER, oldPowerToMicrocontroller,
							powerToMicrocontroller));
			}
		}
		return powerToMicrocontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerUnit basicGetPowerToMicrocontroller() {
		return powerToMicrocontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerToMicrocontroller(MicrocontrollerUnit newPowerToMicrocontroller,
			NotificationChain msgs) {
		MicrocontrollerUnit oldPowerToMicrocontroller = powerToMicrocontroller;
		powerToMicrocontroller = newPowerToMicrocontroller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.POWER_MODULE__POWER_TO_MICROCONTROLLER, oldPowerToMicrocontroller,
					newPowerToMicrocontroller);
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
	public void setPowerToMicrocontroller(MicrocontrollerUnit newPowerToMicrocontroller) {
		if (newPowerToMicrocontroller != powerToMicrocontroller) {
			NotificationChain msgs = null;
			if (powerToMicrocontroller != null)
				msgs = ((InternalEObject) powerToMicrocontroller).eInverseRemove(this,
						SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_POWER, MicrocontrollerUnit.class,
						msgs);
			if (newPowerToMicrocontroller != null)
				msgs = ((InternalEObject) newPowerToMicrocontroller).eInverseAdd(this,
						SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_POWER, MicrocontrollerUnit.class,
						msgs);
			msgs = basicSetPowerToMicrocontroller(newPowerToMicrocontroller, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.POWER_MODULE__POWER_TO_MICROCONTROLLER, newPowerToMicrocontroller,
					newPowerToMicrocontroller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(PowerType newType) {
		PowerType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.POWER_MODULE__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getVoltageRange() {
		return voltageRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoltageRange(float newVoltageRange) {
		float oldVoltageRange = voltageRange;
		voltageRange = newVoltageRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.POWER_MODULE__VOLTAGE_RANGE,
					oldVoltageRange, voltageRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCurrentDraw() {
		return currentDraw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentDraw(float newCurrentDraw) {
		float oldCurrentDraw = currentDraw;
		currentDraw = newCurrentDraw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.POWER_MODULE__CURRENT_DRAW,
					oldCurrentDraw, currentDraw));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.POWER_MODULE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SensornetworkPackage.POWER_MODULE__POWER_TO_MICROCONTROLLER:
			if (powerToMicrocontroller != null)
				msgs = ((InternalEObject) powerToMicrocontroller).eInverseRemove(this,
						SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_POWER, MicrocontrollerUnit.class,
						msgs);
			return basicSetPowerToMicrocontroller((MicrocontrollerUnit) otherEnd, msgs);
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
		case SensornetworkPackage.POWER_MODULE__POWER_TO_MICROCONTROLLER:
			return basicSetPowerToMicrocontroller(null, msgs);
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
		case SensornetworkPackage.POWER_MODULE__POWER_TO_MICROCONTROLLER:
			if (resolve)
				return getPowerToMicrocontroller();
			return basicGetPowerToMicrocontroller();
		case SensornetworkPackage.POWER_MODULE__TYPE:
			return getType();
		case SensornetworkPackage.POWER_MODULE__VOLTAGE_RANGE:
			return getVoltageRange();
		case SensornetworkPackage.POWER_MODULE__CURRENT_DRAW:
			return getCurrentDraw();
		case SensornetworkPackage.POWER_MODULE__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SensornetworkPackage.POWER_MODULE__POWER_TO_MICROCONTROLLER:
			setPowerToMicrocontroller((MicrocontrollerUnit) newValue);
			return;
		case SensornetworkPackage.POWER_MODULE__TYPE:
			setType((PowerType) newValue);
			return;
		case SensornetworkPackage.POWER_MODULE__VOLTAGE_RANGE:
			setVoltageRange((Float) newValue);
			return;
		case SensornetworkPackage.POWER_MODULE__CURRENT_DRAW:
			setCurrentDraw((Float) newValue);
			return;
		case SensornetworkPackage.POWER_MODULE__NAME:
			setName((String) newValue);
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
		case SensornetworkPackage.POWER_MODULE__POWER_TO_MICROCONTROLLER:
			setPowerToMicrocontroller((MicrocontrollerUnit) null);
			return;
		case SensornetworkPackage.POWER_MODULE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case SensornetworkPackage.POWER_MODULE__VOLTAGE_RANGE:
			setVoltageRange(VOLTAGE_RANGE_EDEFAULT);
			return;
		case SensornetworkPackage.POWER_MODULE__CURRENT_DRAW:
			setCurrentDraw(CURRENT_DRAW_EDEFAULT);
			return;
		case SensornetworkPackage.POWER_MODULE__NAME:
			setName(NAME_EDEFAULT);
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
		case SensornetworkPackage.POWER_MODULE__POWER_TO_MICROCONTROLLER:
			return powerToMicrocontroller != null;
		case SensornetworkPackage.POWER_MODULE__TYPE:
			return type != TYPE_EDEFAULT;
		case SensornetworkPackage.POWER_MODULE__VOLTAGE_RANGE:
			return voltageRange != VOLTAGE_RANGE_EDEFAULT;
		case SensornetworkPackage.POWER_MODULE__CURRENT_DRAW:
			return currentDraw != CURRENT_DRAW_EDEFAULT;
		case SensornetworkPackage.POWER_MODULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", voltageRange: ");
		result.append(voltageRange);
		result.append(", currentDraw: ");
		result.append(currentDraw);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PowerModuleImpl
