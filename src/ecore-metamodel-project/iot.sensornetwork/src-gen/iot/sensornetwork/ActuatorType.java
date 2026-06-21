/**
 */
package iot.sensornetwork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Actuator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iot.sensornetwork.SensornetworkPackage#getActuatorType()
 * @model
 * @generated
 */
public enum ActuatorType implements Enumerator {
	/**
	 * The '<em><b>THERMOSTAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMOSTAT_VALUE
	 * @generated
	 * @ordered
	 */
	THERMOSTAT(0, "THERMOSTAT", "THERMOSTAT"),

	/**
	 * The '<em><b>RELAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELAY_VALUE
	 * @generated
	 * @ordered
	 */
	RELAY(2, "RELAY", "RELAY"),

	/**
	 * The '<em><b>ALARM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALARM_VALUE
	 * @generated
	 * @ordered
	 */
	ALARM(3, "ALARM", "ALARM"),

	/**
	 * The '<em><b>SERVO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVO_VALUE
	 * @generated
	 * @ordered
	 */
	SERVO(4, "SERVO", "SERVO"),

	/**
	 * The '<em><b>VALVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALVE_VALUE
	 * @generated
	 * @ordered
	 */
	VALVE(5, "VALVE", "VALVE"),

	/**
	 * The '<em><b>LED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LED_VALUE
	 * @generated
	 * @ordered
	 */
	LED(6, "LED", "LED");

	/**
	 * The '<em><b>THERMOSTAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMOSTAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THERMOSTAT_VALUE = 0;

	/**
	 * The '<em><b>RELAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RELAY_VALUE = 2;

	/**
	 * The '<em><b>ALARM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALARM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALARM_VALUE = 3;

	/**
	 * The '<em><b>SERVO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERVO_VALUE = 4;

	/**
	 * The '<em><b>VALVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VALVE_VALUE = 5;

	/**
	 * The '<em><b>LED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LED_VALUE = 6;

	/**
	 * An array of all the '<em><b>Actuator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActuatorType[] VALUES_ARRAY = new ActuatorType[] { THERMOSTAT, RELAY, ALARM, SERVO, VALVE,
			LED, };

	/**
	 * A public read-only list of all the '<em><b>Actuator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActuatorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Actuator Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActuatorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActuatorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actuator Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActuatorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActuatorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actuator Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActuatorType get(int value) {
		switch (value) {
		case THERMOSTAT_VALUE:
			return THERMOSTAT;
		case RELAY_VALUE:
			return RELAY;
		case ALARM_VALUE:
			return ALARM;
		case SERVO_VALUE:
			return SERVO;
		case VALVE_VALUE:
			return VALVE;
		case LED_VALUE:
			return LED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActuatorType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ActuatorType
