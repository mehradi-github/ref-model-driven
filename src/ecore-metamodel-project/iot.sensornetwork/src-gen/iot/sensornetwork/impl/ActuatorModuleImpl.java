/**
 */
package iot.sensornetwork.impl;

import iot.sensornetwork.ActuatorModule;
import iot.sensornetwork.ActuatorType;
import iot.sensornetwork.MicrocontrollerUnit;
import iot.sensornetwork.SensornetworkPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iot.sensornetwork.impl.ActuatorModuleImpl#getActuatorToMicrocontroller <em>Actuator To Microcontroller</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.ActuatorModuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.ActuatorModuleImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link iot.sensornetwork.impl.ActuatorModuleImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorModuleImpl extends MinimalEObjectImpl.Container implements ActuatorModule {
	/**
	 * The cached value of the '{@link #getActuatorToMicrocontroller() <em>Actuator To Microcontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorToMicrocontroller()
	 * @generated
	 * @ordered
	 */
	protected MicrocontrollerUnit actuatorToMicrocontroller;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ActuatorType TYPE_EDEFAULT = ActuatorType.THERMOSTAT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ActuatorType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected String command = COMMAND_EDEFAULT;

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
	protected ActuatorModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensornetworkPackage.Literals.ACTUATOR_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicrocontrollerUnit getActuatorToMicrocontroller() {
		if (actuatorToMicrocontroller != null && actuatorToMicrocontroller.eIsProxy()) {
			InternalEObject oldActuatorToMicrocontroller = (InternalEObject) actuatorToMicrocontroller;
			actuatorToMicrocontroller = (MicrocontrollerUnit) eResolveProxy(oldActuatorToMicrocontroller);
			if (actuatorToMicrocontroller != oldActuatorToMicrocontroller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SensornetworkPackage.ACTUATOR_MODULE__ACTUATOR_TO_MICROCONTROLLER,
							oldActuatorToMicrocontroller, actuatorToMicrocontroller));
			}
		}
		return actuatorToMicrocontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerUnit basicGetActuatorToMicrocontroller() {
		return actuatorToMicrocontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuatorToMicrocontroller(MicrocontrollerUnit newActuatorToMicrocontroller,
			NotificationChain msgs) {
		MicrocontrollerUnit oldActuatorToMicrocontroller = actuatorToMicrocontroller;
		actuatorToMicrocontroller = newActuatorToMicrocontroller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.ACTUATOR_MODULE__ACTUATOR_TO_MICROCONTROLLER, oldActuatorToMicrocontroller,
					newActuatorToMicrocontroller);
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
	public void setActuatorToMicrocontroller(MicrocontrollerUnit newActuatorToMicrocontroller) {
		if (newActuatorToMicrocontroller != actuatorToMicrocontroller) {
			NotificationChain msgs = null;
			if (actuatorToMicrocontroller != null)
				msgs = ((InternalEObject) actuatorToMicrocontroller).eInverseRemove(this,
						SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_ACTUATOR,
						MicrocontrollerUnit.class, msgs);
			if (newActuatorToMicrocontroller != null)
				msgs = ((InternalEObject) newActuatorToMicrocontroller).eInverseAdd(this,
						SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_ACTUATOR,
						MicrocontrollerUnit.class, msgs);
			msgs = basicSetActuatorToMicrocontroller(newActuatorToMicrocontroller, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SensornetworkPackage.ACTUATOR_MODULE__ACTUATOR_TO_MICROCONTROLLER, newActuatorToMicrocontroller,
					newActuatorToMicrocontroller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActuatorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ActuatorType newType) {
		ActuatorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.ACTUATOR_MODULE__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.ACTUATOR_MODULE__COMMAND,
					oldCommand, command));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SensornetworkPackage.ACTUATOR_MODULE__NAME, oldName,
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
		case SensornetworkPackage.ACTUATOR_MODULE__ACTUATOR_TO_MICROCONTROLLER:
			if (actuatorToMicrocontroller != null)
				msgs = ((InternalEObject) actuatorToMicrocontroller).eInverseRemove(this,
						SensornetworkPackage.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_ACTUATOR,
						MicrocontrollerUnit.class, msgs);
			return basicSetActuatorToMicrocontroller((MicrocontrollerUnit) otherEnd, msgs);
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
		case SensornetworkPackage.ACTUATOR_MODULE__ACTUATOR_TO_MICROCONTROLLER:
			return basicSetActuatorToMicrocontroller(null, msgs);
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
		case SensornetworkPackage.ACTUATOR_MODULE__ACTUATOR_TO_MICROCONTROLLER:
			if (resolve)
				return getActuatorToMicrocontroller();
			return basicGetActuatorToMicrocontroller();
		case SensornetworkPackage.ACTUATOR_MODULE__TYPE:
			return getType();
		case SensornetworkPackage.ACTUATOR_MODULE__COMMAND:
			return getCommand();
		case SensornetworkPackage.ACTUATOR_MODULE__NAME:
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
		case SensornetworkPackage.ACTUATOR_MODULE__ACTUATOR_TO_MICROCONTROLLER:
			setActuatorToMicrocontroller((MicrocontrollerUnit) newValue);
			return;
		case SensornetworkPackage.ACTUATOR_MODULE__TYPE:
			setType((ActuatorType) newValue);
			return;
		case SensornetworkPackage.ACTUATOR_MODULE__COMMAND:
			setCommand((String) newValue);
			return;
		case SensornetworkPackage.ACTUATOR_MODULE__NAME:
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
		case SensornetworkPackage.ACTUATOR_MODULE__ACTUATOR_TO_MICROCONTROLLER:
			setActuatorToMicrocontroller((MicrocontrollerUnit) null);
			return;
		case SensornetworkPackage.ACTUATOR_MODULE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case SensornetworkPackage.ACTUATOR_MODULE__COMMAND:
			setCommand(COMMAND_EDEFAULT);
			return;
		case SensornetworkPackage.ACTUATOR_MODULE__NAME:
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
		case SensornetworkPackage.ACTUATOR_MODULE__ACTUATOR_TO_MICROCONTROLLER:
			return actuatorToMicrocontroller != null;
		case SensornetworkPackage.ACTUATOR_MODULE__TYPE:
			return type != TYPE_EDEFAULT;
		case SensornetworkPackage.ACTUATOR_MODULE__COMMAND:
			return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
		case SensornetworkPackage.ACTUATOR_MODULE__NAME:
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
		result.append(", command: ");
		result.append(command);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ActuatorModuleImpl
