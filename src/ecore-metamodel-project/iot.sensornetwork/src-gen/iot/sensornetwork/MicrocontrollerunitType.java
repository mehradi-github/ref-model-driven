/**
 */
package iot.sensornetwork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Microcontrollerunit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iot.sensornetwork.SensornetworkPackage#getMicrocontrollerunitType()
 * @model
 * @generated
 */
public enum MicrocontrollerunitType implements Enumerator {
	/**
	 * The '<em><b>ESP32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESP32_VALUE
	 * @generated
	 * @ordered
	 */
	ESP32(0, "ESP32", "ESP32"),

	/**
	 * The '<em><b>STM32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STM32_VALUE
	 * @generated
	 * @ordered
	 */
	STM32(1, "STM32", "STM32"),

	/**
	 * The '<em><b>ARDUINO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARDUINO_VALUE
	 * @generated
	 * @ordered
	 */
	ARDUINO(2, "ARDUINO", "ARDUINO"),

	/**
	 * The '<em><b>ARM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARM_VALUE
	 * @generated
	 * @ordered
	 */
	ARM(3, "ARM", "ARM"),

	/**
	 * The '<em><b>AVR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVR_VALUE
	 * @generated
	 * @ordered
	 */
	AVR(4, "AVR", "AVR");

	/**
	 * The '<em><b>ESP32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESP32
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESP32_VALUE = 0;

	/**
	 * The '<em><b>STM32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STM32
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STM32_VALUE = 1;

	/**
	 * The '<em><b>ARDUINO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARDUINO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARDUINO_VALUE = 2;

	/**
	 * The '<em><b>ARM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARM_VALUE = 3;

	/**
	 * The '<em><b>AVR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVR_VALUE = 4;

	/**
	 * An array of all the '<em><b>Microcontrollerunit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MicrocontrollerunitType[] VALUES_ARRAY = new MicrocontrollerunitType[] { ESP32, STM32, ARDUINO,
			ARM, AVR, };

	/**
	 * A public read-only list of all the '<em><b>Microcontrollerunit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MicrocontrollerunitType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Microcontrollerunit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MicrocontrollerunitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MicrocontrollerunitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Microcontrollerunit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MicrocontrollerunitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MicrocontrollerunitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Microcontrollerunit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MicrocontrollerunitType get(int value) {
		switch (value) {
		case ESP32_VALUE:
			return ESP32;
		case STM32_VALUE:
			return STM32;
		case ARDUINO_VALUE:
			return ARDUINO;
		case ARM_VALUE:
			return ARM;
		case AVR_VALUE:
			return AVR;
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
	private MicrocontrollerunitType(int value, String name, String literal) {
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

} //MicrocontrollerunitType
