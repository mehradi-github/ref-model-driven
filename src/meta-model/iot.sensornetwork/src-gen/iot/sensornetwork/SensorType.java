/**
 */
package iot.sensornetwork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sensor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iot.sensornetwork.SensornetworkPackage#getSensorType()
 * @model
 * @generated
 */
public enum SensorType implements Enumerator {
	/**
	 * The '<em><b>TEMPERATURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURE(0, "TEMPERATURE", "TEMPERATURE"),

	/**
	 * The '<em><b>HUMIDITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMIDITY_VALUE
	 * @generated
	 * @ordered
	 */
	HUMIDITY(1, "HUMIDITY", "HUMIDITY"),

	/**
	 * The '<em><b>PRESSURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESSURE_VALUE
	 * @generated
	 * @ordered
	 */
	PRESSURE(2, "PRESSURE", "PRESSURE"),

	/**
	 * The '<em><b>CO2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO2_VALUE
	 * @generated
	 * @ordered
	 */
	CO2(3, "CO2", "CO2"),

	/**
	 * The '<em><b>MOTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTION_VALUE
	 * @generated
	 * @ordered
	 */
	MOTION(4, "MOTION", "MOTION"),

	/**
	 * The '<em><b>LIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT(5, "LIGHT", "LIGHT");

	/**
	 * The '<em><b>TEMPERATURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURE_VALUE = 0;

	/**
	 * The '<em><b>HUMIDITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMIDITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HUMIDITY_VALUE = 1;

	/**
	 * The '<em><b>PRESSURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESSURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRESSURE_VALUE = 2;

	/**
	 * The '<em><b>CO2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CO2_VALUE = 3;

	/**
	 * The '<em><b>MOTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOTION_VALUE = 4;

	/**
	 * The '<em><b>LIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SensorType[] VALUES_ARRAY = new SensorType[] { TEMPERATURE, HUMIDITY, PRESSURE, CO2, MOTION,
			LIGHT, };

	/**
	 * A public read-only list of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SensorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType get(int value) {
		switch (value) {
		case TEMPERATURE_VALUE:
			return TEMPERATURE;
		case HUMIDITY_VALUE:
			return HUMIDITY;
		case PRESSURE_VALUE:
			return PRESSURE;
		case CO2_VALUE:
			return CO2;
		case MOTION_VALUE:
			return MOTION;
		case LIGHT_VALUE:
			return LIGHT;
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
	private SensorType(int value, String name, String literal) {
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

} //SensorType
