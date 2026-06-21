/**
 */
package iot.sensornetwork.impl;

import iot.sensornetwork.MicrocontrollerUnit;
import iot.sensornetwork.SensorModule;
import iot.sensornetwork.SensorType;
import iot.sensornetwork.SensornetworkPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iot.sensornetwork.impl.SensorModuleImpl#getSensorToMicrocontroller <em>Sensor To Microcontroller</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.SensorModuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.SensorModuleImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.SensorModuleImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.SensorModuleImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.SensorModuleImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorModuleImpl extends MinimalEObjectImpl.Container implements SensorModule {
	/**
	 * The cached value of the '{@link #getSensorToMicrocontroller() <em>Sensor To Microcontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorToMicrocontroller()
	 * @generated
	 * @ordered
	 */
	protected MicrocontrollerUnit sensorToMicrocontroller;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SensorType TYPE_EDEFAULT = SensorType.TEMPERATURE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SensorType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected double minValue = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected double maxValue = MAX_VALUE_EDEFAULT;

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
	protected SensorModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensornetworkPackage.Literals.SENSOR_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicrocontrollerUnit getSensorToMicrocontroller() {
		if (sensorToMicrocontroller != null && sensorToMicrocontroller.eIsProxy()) {
			InternalEObject oldSensorToMicrocontroller = (InternalEObject) sensorToMicrocontroller;
			sensorToMicrocontroller = (MicrocontrollerUnit) eResolveProxy(oldSensorToMicrocontroller);
			if (sensorToMicrocontroller != oldSensorToMicrocontroller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SensornetworkPackage.SENSOR_MODULE__SENSOR_TO_MICROCONTROLLER, oldSensorToMicrocontroller,
							sensorToMicrocontroller));
			}
		}
		return sensorToMicrocontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerUnit basicGetSensorToMicrocontroller() {
		return sensorToMicrocontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensorToMicrocontroller(MicrocontrollerUnit newSensorToMicrocontroller,
			NotificationChain msgs) {
		MicrocontrollerUnit oldSensorToMicrocontroller = sensorToMicrocontroller;
		sensorToMicrocontroller = newSensorToMicrocontroller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.SENSOR_MODULE__SENSOR_TO_MICROCONTROLLER, oldSensorToMicrocontroller,
					newSensorToMicrocontroller);
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
	public void setSensorToMicrocontroller(MicrocontrollerUnit newSensorToMicrocontroller) {
		if (newSensorToMicrocontroller != sensorToMicrocontroller) {
			NotificationChain msgs = null;
			if (sensorToMicrocontroller != null)
				msgs = ((InternalEObject) sensorToMicrocontroller).eInverseRemove(this,
						SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_SENSOR, MicrocontrollerUnit.class,
						msgs);
			if (newSensorToMicrocontroller != null)
				msgs = ((InternalEObject) newSensorToMicrocontroller).eInverseAdd(this,
						SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_SENSOR, MicrocontrollerUnit.class,
						msgs);
			msgs = basicSetSensorToMicrocontroller(newSensorToMicrocontroller, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.SENSOR_MODULE__SENSOR_TO_MICROCONTROLLER, newSensorToMicrocontroller,
					newSensorToMicrocontroller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(SensorType newType) {
		SensorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.SENSOR_MODULE__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.SENSOR_MODULE__UNIT, oldUnit,
					unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinValue(double newMinValue) {
		double oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.SENSOR_MODULE__MIN_VALUE,
					oldMinValue, minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxValue(double newMaxValue) {
		double oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.SENSOR_MODULE__MAX_VALUE,
					oldMaxValue, maxValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.SENSOR_MODULE__NAME, oldName,
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
		case SensornetworkPackage.SENSOR_MODULE__SENSOR_TO_MICROCONTROLLER:
			if (sensorToMicrocontroller != null)
				msgs = ((InternalEObject) sensorToMicrocontroller).eInverseRemove(this,
						SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_SENSOR, MicrocontrollerUnit.class,
						msgs);
			return basicSetSensorToMicrocontroller((MicrocontrollerUnit) otherEnd, msgs);
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
		case SensornetworkPackage.SENSOR_MODULE__SENSOR_TO_MICROCONTROLLER:
			return basicSetSensorToMicrocontroller(null, msgs);
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
		case SensornetworkPackage.SENSOR_MODULE__SENSOR_TO_MICROCONTROLLER:
			if (resolve)
				return getSensorToMicrocontroller();
			return basicGetSensorToMicrocontroller();
		case SensornetworkPackage.SENSOR_MODULE__TYPE:
			return getType();
		case SensornetworkPackage.SENSOR_MODULE__UNIT:
			return getUnit();
		case SensornetworkPackage.SENSOR_MODULE__MIN_VALUE:
			return getMinValue();
		case SensornetworkPackage.SENSOR_MODULE__MAX_VALUE:
			return getMaxValue();
		case SensornetworkPackage.SENSOR_MODULE__NAME:
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
		case SensornetworkPackage.SENSOR_MODULE__SENSOR_TO_MICROCONTROLLER:
			setSensorToMicrocontroller((MicrocontrollerUnit) newValue);
			return;
		case SensornetworkPackage.SENSOR_MODULE__TYPE:
			setType((SensorType) newValue);
			return;
		case SensornetworkPackage.SENSOR_MODULE__UNIT:
			setUnit((String) newValue);
			return;
		case SensornetworkPackage.SENSOR_MODULE__MIN_VALUE:
			setMinValue((Double) newValue);
			return;
		case SensornetworkPackage.SENSOR_MODULE__MAX_VALUE:
			setMaxValue((Double) newValue);
			return;
		case SensornetworkPackage.SENSOR_MODULE__NAME:
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
		case SensornetworkPackage.SENSOR_MODULE__SENSOR_TO_MICROCONTROLLER:
			setSensorToMicrocontroller((MicrocontrollerUnit) null);
			return;
		case SensornetworkPackage.SENSOR_MODULE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case SensornetworkPackage.SENSOR_MODULE__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case SensornetworkPackage.SENSOR_MODULE__MIN_VALUE:
			setMinValue(MIN_VALUE_EDEFAULT);
			return;
		case SensornetworkPackage.SENSOR_MODULE__MAX_VALUE:
			setMaxValue(MAX_VALUE_EDEFAULT);
			return;
		case SensornetworkPackage.SENSOR_MODULE__NAME:
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
		case SensornetworkPackage.SENSOR_MODULE__SENSOR_TO_MICROCONTROLLER:
			return sensorToMicrocontroller != null;
		case SensornetworkPackage.SENSOR_MODULE__TYPE:
			return type != TYPE_EDEFAULT;
		case SensornetworkPackage.SENSOR_MODULE__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case SensornetworkPackage.SENSOR_MODULE__MIN_VALUE:
			return minValue != MIN_VALUE_EDEFAULT;
		case SensornetworkPackage.SENSOR_MODULE__MAX_VALUE:
			return maxValue != MAX_VALUE_EDEFAULT;
		case SensornetworkPackage.SENSOR_MODULE__NAME:
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
		result.append(", unit: ");
		result.append(unit);
		result.append(", minValue: ");
		result.append(minValue);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SensorModuleImpl
