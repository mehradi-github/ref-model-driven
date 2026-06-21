/**
 */
package iot.sensornetwork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Communication Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iot.sensornetwork.SensornetworkPackage#getCommunicationType()
 * @model
 * @generated
 */
public enum CommunicationType implements Enumerator {
	/**
	 * The '<em><b>BLUETOOTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUETOOTH_VALUE
	 * @generated
	 * @ordered
	 */
	BLUETOOTH(0, "BLUETOOTH", "BLUETOOTH"),

	/**
	 * The '<em><b>WIFI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI_VALUE
	 * @generated
	 * @ordered
	 */
	WIFI(1, "WIFI", "WIFI"),

	/**
	 * The '<em><b>GPRS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPRS_VALUE
	 * @generated
	 * @ordered
	 */
	GPRS(2, "GPRS", "GPRS"),

	/**
	 * The '<em><b>FIVEG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVEG_VALUE
	 * @generated
	 * @ordered
	 */
	FIVEG(3, "FIVEG", "FiVEG"),

	/**
	 * The '<em><b>SATELLITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SATELLITE_VALUE
	 * @generated
	 * @ordered
	 */
	SATELLITE(4, "SATELLITE", "SATELLITE");

	/**
	 * The '<em><b>BLUETOOTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUETOOTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLUETOOTH_VALUE = 0;

	/**
	 * The '<em><b>WIFI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIFI_VALUE = 1;

	/**
	 * The '<em><b>GPRS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPRS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GPRS_VALUE = 2;

	/**
	 * The '<em><b>FIVEG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVEG
	 * @model literal="FiVEG"
	 * @generated
	 * @ordered
	 */
	public static final int FIVEG_VALUE = 3;

	/**
	 * The '<em><b>SATELLITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SATELLITE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SATELLITE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Communication Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CommunicationType[] VALUES_ARRAY = new CommunicationType[] { BLUETOOTH, WIFI, GPRS, FIVEG,
			SATELLITE, };

	/**
	 * A public read-only list of all the '<em><b>Communication Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CommunicationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Communication Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CommunicationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CommunicationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Communication Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CommunicationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CommunicationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Communication Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CommunicationType get(int value) {
		switch (value) {
		case BLUETOOTH_VALUE:
			return BLUETOOTH;
		case WIFI_VALUE:
			return WIFI;
		case GPRS_VALUE:
			return GPRS;
		case FIVEG_VALUE:
			return FIVEG;
		case SATELLITE_VALUE:
			return SATELLITE;
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
	private CommunicationType(int value, String name, String literal) {
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

} //CommunicationType
