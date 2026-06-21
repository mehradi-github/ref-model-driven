/**
 */
package iot.sensornetwork.impl;

import iot.sensornetwork.ActuatorModule;
import iot.sensornetwork.CommunicationModule;
import iot.sensornetwork.MicrocontrollerUnit;
import iot.sensornetwork.MicrocontrollerunitType;
import iot.sensornetwork.PowerModule;
import iot.sensornetwork.SensorModule;
import iot.sensornetwork.SensornetworkPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microcontroller Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iot.sensornetwork.impl.MicrocontrollerUnitImpl#getMicrocontrollerToSensor <em>Microcontroller To Sensor</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.MicrocontrollerUnitImpl#getMicrocontrollerToActuator <em>Microcontroller To Actuator</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.MicrocontrollerUnitImpl#getMicrocontrollerToCommunication <em>Microcontroller To Communication</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.MicrocontrollerUnitImpl#getMicrocontrollerToPower <em>Microcontroller To Power</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.MicrocontrollerUnitImpl#getType <em>Type</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.MicrocontrollerUnitImpl#getFirmware <em>Firmware</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.MicrocontrollerUnitImpl#getCpuFrequency <em>Cpu Frequency</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.MicrocontrollerUnitImpl#getRamSize <em>Ram Size</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.MicrocontrollerUnitImpl#getFlashSize <em>Flash Size</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.MicrocontrollerUnitImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicrocontrollerUnitImpl extends MinimalEObjectImpl.Container implements MicrocontrollerUnit {
	/**
	 * The cached value of the '{@link #getMicrocontrollerToSensor() <em>Microcontroller To Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrocontrollerToSensor()
	 * @generated
	 * @ordered
	 */
	protected SensorModule microcontrollerToSensor;

	/**
	 * The cached value of the '{@link #getMicrocontrollerToActuator() <em>Microcontroller To Actuator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrocontrollerToActuator()
	 * @generated
	 * @ordered
	 */
	protected ActuatorModule microcontrollerToActuator;

	/**
	 * The cached value of the '{@link #getMicrocontrollerToCommunication() <em>Microcontroller To Communication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrocontrollerToCommunication()
	 * @generated
	 * @ordered
	 */
	protected CommunicationModule microcontrollerToCommunication;

	/**
	 * The cached value of the '{@link #getMicrocontrollerToPower() <em>Microcontroller To Power</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrocontrollerToPower()
	 * @generated
	 * @ordered
	 */
	protected PowerModule microcontrollerToPower;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MicrocontrollerunitType TYPE_EDEFAULT = MicrocontrollerunitType.ESP32;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MicrocontrollerunitType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirmware() <em>Firmware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmware()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRMWARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirmware() <em>Firmware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmware()
	 * @generated
	 * @ordered
	 */
	protected String firmware = FIRMWARE_EDEFAULT;

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
	 * The default value of the '{@link #getFlashSize() <em>Flash Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlashSize()
	 * @generated
	 * @ordered
	 */
	protected static final float FLASH_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFlashSize() <em>Flash Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlashSize()
	 * @generated
	 * @ordered
	 */
	protected float flashSize = FLASH_SIZE_EDEFAULT;

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
	protected MicrocontrollerUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensornetworkPackage.Literals.MICROCONTROLLER_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SensorModule getMicrocontrollerToSensor() {
		if (microcontrollerToSensor != null && microcontrollerToSensor.eIsProxy()) {
			InternalEObject oldMicrocontrollerToSensor = (InternalEObject) microcontrollerToSensor;
			microcontrollerToSensor = (SensorModule) eResolveProxy(oldMicrocontrollerToSensor);
			if (microcontrollerToSensor != oldMicrocontrollerToSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_SENSOR,
							oldMicrocontrollerToSensor, microcontrollerToSensor));
			}
		}
		return microcontrollerToSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorModule basicGetMicrocontrollerToSensor() {
		return microcontrollerToSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMicrocontrollerToSensor(SensorModule newMicrocontrollerToSensor,
			NotificationChain msgs) {
		SensorModule oldMicrocontrollerToSensor = microcontrollerToSensor;
		microcontrollerToSensor = newMicrocontrollerToSensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_SENSOR, oldMicrocontrollerToSensor,
					newMicrocontrollerToSensor);
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
	public void setMicrocontrollerToSensor(SensorModule newMicrocontrollerToSensor) {
		if (newMicrocontrollerToSensor != microcontrollerToSensor) {
			NotificationChain msgs = null;
			if (microcontrollerToSensor != null)
				msgs = ((InternalEObject) microcontrollerToSensor).eInverseRemove(this,
						SensornetworkPackage.SENSOR_MODULE__SENSOR_TO_MICROCONTROLLER, SensorModule.class, msgs);
			if (newMicrocontrollerToSensor != null)
				msgs = ((InternalEObject) newMicrocontrollerToSensor).eInverseAdd(this,
						SensornetworkPackage.SENSOR_MODULE__SENSOR_TO_MICROCONTROLLER, SensorModule.class, msgs);
			msgs = basicSetMicrocontrollerToSensor(newMicrocontrollerToSensor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_SENSOR, newMicrocontrollerToSensor,
					newMicrocontrollerToSensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuatorModule getMicrocontrollerToActuator() {
		if (microcontrollerToActuator != null && microcontrollerToActuator.eIsProxy()) {
			InternalEObject oldMicrocontrollerToActuator = (InternalEObject) microcontrollerToActuator;
			microcontrollerToActuator = (ActuatorModule) eResolveProxy(oldMicrocontrollerToActuator);
			if (microcontrollerToActuator != oldMicrocontrollerToActuator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_ACTUATOR,
							oldMicrocontrollerToActuator, microcontrollerToActuator));
			}
		}
		return microcontrollerToActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorModule basicGetMicrocontrollerToActuator() {
		return microcontrollerToActuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMicrocontrollerToActuator(ActuatorModule newMicrocontrollerToActuator,
			NotificationChain msgs) {
		ActuatorModule oldMicrocontrollerToActuator = microcontrollerToActuator;
		microcontrollerToActuator = newMicrocontrollerToActuator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_ACTUATOR,
					oldMicrocontrollerToActuator, newMicrocontrollerToActuator);
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
	public void setMicrocontrollerToActuator(ActuatorModule newMicrocontrollerToActuator) {
		if (newMicrocontrollerToActuator != microcontrollerToActuator) {
			NotificationChain msgs = null;
			if (microcontrollerToActuator != null)
				msgs = ((InternalEObject) microcontrollerToActuator).eInverseRemove(this,
						SensornetworkPackage.ACTUATOR_MODULE__ACTUATOR_TO_MICROCONTROLLER, ActuatorModule.class, msgs);
			if (newMicrocontrollerToActuator != null)
				msgs = ((InternalEObject) newMicrocontrollerToActuator).eInverseAdd(this,
						SensornetworkPackage.ACTUATOR_MODULE__ACTUATOR_TO_MICROCONTROLLER, ActuatorModule.class, msgs);
			msgs = basicSetMicrocontrollerToActuator(newMicrocontrollerToActuator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_ACTUATOR,
					newMicrocontrollerToActuator, newMicrocontrollerToActuator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationModule getMicrocontrollerToCommunication() {
		if (microcontrollerToCommunication != null && microcontrollerToCommunication.eIsProxy()) {
			InternalEObject oldMicrocontrollerToCommunication = (InternalEObject) microcontrollerToCommunication;
			microcontrollerToCommunication = (CommunicationModule) eResolveProxy(oldMicrocontrollerToCommunication);
			if (microcontrollerToCommunication != oldMicrocontrollerToCommunication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_COMMUNICATION,
							oldMicrocontrollerToCommunication, microcontrollerToCommunication));
			}
		}
		return microcontrollerToCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationModule basicGetMicrocontrollerToCommunication() {
		return microcontrollerToCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMicrocontrollerToCommunication(
			CommunicationModule newMicrocontrollerToCommunication, NotificationChain msgs) {
		CommunicationModule oldMicrocontrollerToCommunication = microcontrollerToCommunication;
		microcontrollerToCommunication = newMicrocontrollerToCommunication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_COMMUNICATION,
					oldMicrocontrollerToCommunication, newMicrocontrollerToCommunication);
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
	public void setMicrocontrollerToCommunication(CommunicationModule newMicrocontrollerToCommunication) {
		if (newMicrocontrollerToCommunication != microcontrollerToCommunication) {
			NotificationChain msgs = null;
			if (microcontrollerToCommunication != null)
				msgs = ((InternalEObject) microcontrollerToCommunication).eInverseRemove(this,
						SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_MICROCONTROLLER,
						CommunicationModule.class, msgs);
			if (newMicrocontrollerToCommunication != null)
				msgs = ((InternalEObject) newMicrocontrollerToCommunication).eInverseAdd(this,
						SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_MICROCONTROLLER,
						CommunicationModule.class, msgs);
			msgs = basicSetMicrocontrollerToCommunication(newMicrocontrollerToCommunication, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_COMMUNICATION,
					newMicrocontrollerToCommunication, newMicrocontrollerToCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerModule getMicrocontrollerToPower() {
		if (microcontrollerToPower != null && microcontrollerToPower.eIsProxy()) {
			InternalEObject oldMicrocontrollerToPower = (InternalEObject) microcontrollerToPower;
			microcontrollerToPower = (PowerModule) eResolveProxy(oldMicrocontrollerToPower);
			if (microcontrollerToPower != oldMicrocontrollerToPower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_POWER,
							oldMicrocontrollerToPower, microcontrollerToPower));
			}
		}
		return microcontrollerToPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerModule basicGetMicrocontrollerToPower() {
		return microcontrollerToPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMicrocontrollerToPower(PowerModule newMicrocontrollerToPower,
			NotificationChain msgs) {
		PowerModule oldMicrocontrollerToPower = microcontrollerToPower;
		microcontrollerToPower = newMicrocontrollerToPower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_POWER, oldMicrocontrollerToPower,
					newMicrocontrollerToPower);
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
	public void setMicrocontrollerToPower(PowerModule newMicrocontrollerToPower) {
		if (newMicrocontrollerToPower != microcontrollerToPower) {
			NotificationChain msgs = null;
			if (microcontrollerToPower != null)
				msgs = ((InternalEObject) microcontrollerToPower).eInverseRemove(this,
						SensornetworkPackage.POWER_MODULE__POWER_TO_MICROCONTROLLER, PowerModule.class, msgs);
			if (newMicrocontrollerToPower != null)
				msgs = ((InternalEObject) newMicrocontrollerToPower).eInverseAdd(this,
						SensornetworkPackage.POWER_MODULE__POWER_TO_MICROCONTROLLER, PowerModule.class, msgs);
			msgs = basicSetMicrocontrollerToPower(newMicrocontrollerToPower, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_POWER, newMicrocontrollerToPower,
					newMicrocontrollerToPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicrocontrollerunitType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(MicrocontrollerunitType newType) {
		MicrocontrollerunitType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.MICROCONTROLLER_UNIT__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirmware() {
		return firmware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirmware(String newFirmware) {
		String oldFirmware = firmware;
		firmware = newFirmware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.MICROCONTROLLER_UNIT__FIRMWARE,
					oldFirmware, firmware));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.MICROCONTROLLER_UNIT__CPU_FREQUENCY, oldCpuFrequency, cpuFrequency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.MICROCONTROLLER_UNIT__RAM_SIZE,
					oldRamSize, ramSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getFlashSize() {
		return flashSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlashSize(float newFlashSize) {
		float oldFlashSize = flashSize;
		flashSize = newFlashSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.MICROCONTROLLER_UNIT__FLASH_SIZE,
					oldFlashSize, flashSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.MICROCONTROLLER_UNIT__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_SENSOR:
			if (microcontrollerToSensor != null)
				msgs = ((InternalEObject) microcontrollerToSensor).eInverseRemove(this,
						SensornetworkPackage.SENSOR_MODULE__SENSOR_TO_MICROCONTROLLER, SensorModule.class, msgs);
			return basicSetMicrocontrollerToSensor((SensorModule) otherEnd, msgs);
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_ACTUATOR:
			if (microcontrollerToActuator != null)
				msgs = ((InternalEObject) microcontrollerToActuator).eInverseRemove(this,
						SensornetworkPackage.ACTUATOR_MODULE__ACTUATOR_TO_MICROCONTROLLER, ActuatorModule.class, msgs);
			return basicSetMicrocontrollerToActuator((ActuatorModule) otherEnd, msgs);
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_COMMUNICATION:
			if (microcontrollerToCommunication != null)
				msgs = ((InternalEObject) microcontrollerToCommunication).eInverseRemove(this,
						SensornetworkPackage.COMMUNICATION_MODULE__COMMUNICATION_TO_MICROCONTROLLER,
						CommunicationModule.class, msgs);
			return basicSetMicrocontrollerToCommunication((CommunicationModule) otherEnd, msgs);
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_POWER:
			if (microcontrollerToPower != null)
				msgs = ((InternalEObject) microcontrollerToPower).eInverseRemove(this,
						SensornetworkPackage.POWER_MODULE__POWER_TO_MICROCONTROLLER, PowerModule.class, msgs);
			return basicSetMicrocontrollerToPower((PowerModule) otherEnd, msgs);
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
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_SENSOR:
			return basicSetMicrocontrollerToSensor(null, msgs);
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_ACTUATOR:
			return basicSetMicrocontrollerToActuator(null, msgs);
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_COMMUNICATION:
			return basicSetMicrocontrollerToCommunication(null, msgs);
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_POWER:
			return basicSetMicrocontrollerToPower(null, msgs);
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
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_SENSOR:
			if (resolve)
				return getMicrocontrollerToSensor();
			return basicGetMicrocontrollerToSensor();
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_ACTUATOR:
			if (resolve)
				return getMicrocontrollerToActuator();
			return basicGetMicrocontrollerToActuator();
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_COMMUNICATION:
			if (resolve)
				return getMicrocontrollerToCommunication();
			return basicGetMicrocontrollerToCommunication();
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_POWER:
			if (resolve)
				return getMicrocontrollerToPower();
			return basicGetMicrocontrollerToPower();
		case SensornetworkPackage.MICROCONTROLLER_UNIT__TYPE:
			return getType();
		case SensornetworkPackage.MICROCONTROLLER_UNIT__FIRMWARE:
			return getFirmware();
		case SensornetworkPackage.MICROCONTROLLER_UNIT__CPU_FREQUENCY:
			return getCpuFrequency();
		case SensornetworkPackage.MICROCONTROLLER_UNIT__RAM_SIZE:
			return getRamSize();
		case SensornetworkPackage.MICROCONTROLLER_UNIT__FLASH_SIZE:
			return getFlashSize();
		case SensornetworkPackage.MICROCONTROLLER_UNIT__NAME:
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
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_SENSOR:
			setMicrocontrollerToSensor((SensorModule) newValue);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_ACTUATOR:
			setMicrocontrollerToActuator((ActuatorModule) newValue);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_COMMUNICATION:
			setMicrocontrollerToCommunication((CommunicationModule) newValue);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_POWER:
			setMicrocontrollerToPower((PowerModule) newValue);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__TYPE:
			setType((MicrocontrollerunitType) newValue);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__FIRMWARE:
			setFirmware((String) newValue);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__CPU_FREQUENCY:
			setCpuFrequency((Float) newValue);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__RAM_SIZE:
			setRamSize((Float) newValue);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__FLASH_SIZE:
			setFlashSize((Float) newValue);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__NAME:
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
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_SENSOR:
			setMicrocontrollerToSensor((SensorModule) null);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_ACTUATOR:
			setMicrocontrollerToActuator((ActuatorModule) null);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_COMMUNICATION:
			setMicrocontrollerToCommunication((CommunicationModule) null);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_POWER:
			setMicrocontrollerToPower((PowerModule) null);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__FIRMWARE:
			setFirmware(FIRMWARE_EDEFAULT);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__CPU_FREQUENCY:
			setCpuFrequency(CPU_FREQUENCY_EDEFAULT);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__RAM_SIZE:
			setRamSize(RAM_SIZE_EDEFAULT);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__FLASH_SIZE:
			setFlashSize(FLASH_SIZE_EDEFAULT);
			return;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__NAME:
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
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_SENSOR:
			return microcontrollerToSensor != null;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_ACTUATOR:
			return microcontrollerToActuator != null;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_COMMUNICATION:
			return microcontrollerToCommunication != null;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_POWER:
			return microcontrollerToPower != null;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__TYPE:
			return type != TYPE_EDEFAULT;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__FIRMWARE:
			return FIRMWARE_EDEFAULT == null ? firmware != null : !FIRMWARE_EDEFAULT.equals(firmware);
		case SensornetworkPackage.MICROCONTROLLER_UNIT__CPU_FREQUENCY:
			return cpuFrequency != CPU_FREQUENCY_EDEFAULT;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__RAM_SIZE:
			return ramSize != RAM_SIZE_EDEFAULT;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__FLASH_SIZE:
			return flashSize != FLASH_SIZE_EDEFAULT;
		case SensornetworkPackage.MICROCONTROLLER_UNIT__NAME:
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
		result.append(", firmware: ");
		result.append(firmware);
		result.append(", cpuFrequency: ");
		result.append(cpuFrequency);
		result.append(", ramSize: ");
		result.append(ramSize);
		result.append(", flashSize: ");
		result.append(flashSize);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MicrocontrollerUnitImpl
