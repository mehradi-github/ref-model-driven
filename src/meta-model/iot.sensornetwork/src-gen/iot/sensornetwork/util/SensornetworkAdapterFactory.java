/**
 */
package iot.sensornetwork.util;

import iot.sensornetwork.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iot.sensornetwork.SensornetworkPackage
 * @generated
 */
public class SensornetworkAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SensornetworkPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensornetworkAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SensornetworkPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensornetworkSwitch<Adapter> modelSwitch = new SensornetworkSwitch<Adapter>() {
		@Override
		public Adapter caseSensorNode(SensorNode object) {
			return createSensorNodeAdapter();
		}

		@Override
		public Adapter caseSensorModule(SensorModule object) {
			return createSensorModuleAdapter();
		}

		@Override
		public Adapter caseActuatorModule(ActuatorModule object) {
			return createActuatorModuleAdapter();
		}

		@Override
		public Adapter caseMicrocontrollerUnit(MicrocontrollerUnit object) {
			return createMicrocontrollerUnitAdapter();
		}

		@Override
		public Adapter casePowerModule(PowerModule object) {
			return createPowerModuleAdapter();
		}

		@Override
		public Adapter caseCommunicationModule(CommunicationModule object) {
			return createCommunicationModuleAdapter();
		}

		@Override
		public Adapter caseServer(Server object) {
			return createServerAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot.sensornetwork.SensorNode <em>Sensor Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot.sensornetwork.SensorNode
	 * @generated
	 */
	public Adapter createSensorNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot.sensornetwork.SensorModule <em>Sensor Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot.sensornetwork.SensorModule
	 * @generated
	 */
	public Adapter createSensorModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot.sensornetwork.ActuatorModule <em>Actuator Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot.sensornetwork.ActuatorModule
	 * @generated
	 */
	public Adapter createActuatorModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot.sensornetwork.MicrocontrollerUnit <em>Microcontroller Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot.sensornetwork.MicrocontrollerUnit
	 * @generated
	 */
	public Adapter createMicrocontrollerUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot.sensornetwork.PowerModule <em>Power Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot.sensornetwork.PowerModule
	 * @generated
	 */
	public Adapter createPowerModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot.sensornetwork.CommunicationModule <em>Communication Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot.sensornetwork.CommunicationModule
	 * @generated
	 */
	public Adapter createCommunicationModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iot.sensornetwork.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iot.sensornetwork.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SensornetworkAdapterFactory
