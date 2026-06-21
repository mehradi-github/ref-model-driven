/**
 */
package iot.sensornetwork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Server Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iot.sensornetwork.SensornetworkPackage#getServerType()
 * @model
 * @generated
 */
public enum ServerType implements Enumerator {
	/**
	 * The '<em><b>Smartphone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMARTPHONE_VALUE
	 * @generated
	 * @ordered
	 */
	SMARTPHONE(0, "Smartphone", "Smartphone"),

	/**
	 * The '<em><b>PC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PC_VALUE
	 * @generated
	 * @ordered
	 */
	PC(1, "PC", "PC"),

	/**
	 * The '<em><b>Main Frame</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAIN_FRAME_VALUE
	 * @generated
	 * @ordered
	 */
	MAIN_FRAME(2, "MainFrame", "MainFrame"),

	/**
	 * The '<em><b>Cloud</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUD_VALUE
	 * @generated
	 * @ordered
	 */
	CLOUD(3, "Cloud", "Cloud");

	/**
	 * The '<em><b>Smartphone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMARTPHONE
	 * @model name="Smartphone"
	 * @generated
	 * @ordered
	 */
	public static final int SMARTPHONE_VALUE = 0;

	/**
	 * The '<em><b>PC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PC_VALUE = 1;

	/**
	 * The '<em><b>Main Frame</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAIN_FRAME
	 * @model name="MainFrame"
	 * @generated
	 * @ordered
	 */
	public static final int MAIN_FRAME_VALUE = 2;

	/**
	 * The '<em><b>Cloud</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUD
	 * @model name="Cloud"
	 * @generated
	 * @ordered
	 */
	public static final int CLOUD_VALUE = 3;

	/**
	 * An array of all the '<em><b>Server Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ServerType[] VALUES_ARRAY = new ServerType[] { SMARTPHONE, PC, MAIN_FRAME, CLOUD, };

	/**
	 * A public read-only list of all the '<em><b>Server Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ServerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Server Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Server Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Server Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServerType get(int value) {
		switch (value) {
		case SMARTPHONE_VALUE:
			return SMARTPHONE;
		case PC_VALUE:
			return PC;
		case MAIN_FRAME_VALUE:
			return MAIN_FRAME;
		case CLOUD_VALUE:
			return CLOUD;
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
	private ServerType(int value, String name, String literal) {
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

} //ServerType
