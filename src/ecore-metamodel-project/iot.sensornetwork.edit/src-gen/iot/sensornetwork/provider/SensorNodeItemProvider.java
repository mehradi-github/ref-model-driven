/**
 */
package iot.sensornetwork.provider;

import iot.sensornetwork.SensorNode;
import iot.sensornetwork.SensornetworkFactory;
import iot.sensornetwork.SensornetworkPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link iot.sensornetwork.SensorNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorNodeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorNodeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addSamplingRatePropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SensorNode_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SensorNode_name_feature",
								"_UI_SensorNode_type"),
						SensornetworkPackage.Literals.SENSOR_NODE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sampling Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSamplingRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SensorNode_samplingRate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SensorNode_samplingRate_feature",
								"_UI_SensorNode_type"),
						SensornetworkPackage.Literals.SENSOR_NODE__SAMPLING_RATE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SensorNode_location_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SensorNode_location_feature",
								"_UI_SensorNode_type"),
						SensornetworkPackage.Literals.SENSOR_NODE__LOCATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SensornetworkPackage.Literals.SENSOR_NODE__HAS_SENSOR_MODULE);
			childrenFeatures.add(SensornetworkPackage.Literals.SENSOR_NODE__HAS_ACTUATOR_MODULE);
			childrenFeatures.add(SensornetworkPackage.Literals.SENSOR_NODE__HAS_COMMUNICATION_MODULE);
			childrenFeatures.add(SensornetworkPackage.Literals.SENSOR_NODE__HAS_POWER_MODULE);
			childrenFeatures.add(SensornetworkPackage.Literals.SENSOR_NODE__HAS_MICROCONTROLLER_UNIT);
			childrenFeatures.add(SensornetworkPackage.Literals.SENSOR_NODE__HAS_SERVER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SensorNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SensorNode"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SensorNode) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_SensorNode_type")
				: getString("_UI_SensorNode_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SensorNode.class)) {
		case SensornetworkPackage.SENSOR_NODE__NAME:
		case SensornetworkPackage.SENSOR_NODE__SAMPLING_RATE:
		case SensornetworkPackage.SENSOR_NODE__LOCATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case SensornetworkPackage.SENSOR_NODE__HAS_SENSOR_MODULE:
		case SensornetworkPackage.SENSOR_NODE__HAS_ACTUATOR_MODULE:
		case SensornetworkPackage.SENSOR_NODE__HAS_COMMUNICATION_MODULE:
		case SensornetworkPackage.SENSOR_NODE__HAS_POWER_MODULE:
		case SensornetworkPackage.SENSOR_NODE__HAS_MICROCONTROLLER_UNIT:
		case SensornetworkPackage.SENSOR_NODE__HAS_SERVER:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(SensornetworkPackage.Literals.SENSOR_NODE__HAS_SENSOR_MODULE,
				SensornetworkFactory.eINSTANCE.createSensorModule()));

		newChildDescriptors.add(createChildParameter(SensornetworkPackage.Literals.SENSOR_NODE__HAS_ACTUATOR_MODULE,
				SensornetworkFactory.eINSTANCE.createActuatorModule()));

		newChildDescriptors
				.add(createChildParameter(SensornetworkPackage.Literals.SENSOR_NODE__HAS_COMMUNICATION_MODULE,
						SensornetworkFactory.eINSTANCE.createCommunicationModule()));

		newChildDescriptors.add(createChildParameter(SensornetworkPackage.Literals.SENSOR_NODE__HAS_POWER_MODULE,
				SensornetworkFactory.eINSTANCE.createPowerModule()));

		newChildDescriptors
				.add(createChildParameter(SensornetworkPackage.Literals.SENSOR_NODE__HAS_MICROCONTROLLER_UNIT,
						SensornetworkFactory.eINSTANCE.createMicrocontrollerUnit()));

		newChildDescriptors.add(createChildParameter(SensornetworkPackage.Literals.SENSOR_NODE__HAS_SERVER,
				SensornetworkFactory.eINSTANCE.createServer()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SensornetworkEditPlugin.INSTANCE;
	}

}
