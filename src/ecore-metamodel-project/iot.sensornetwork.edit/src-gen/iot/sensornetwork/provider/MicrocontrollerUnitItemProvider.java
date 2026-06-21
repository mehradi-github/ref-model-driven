/**
 */
package iot.sensornetwork.provider;

import iot.sensornetwork.MicrocontrollerUnit;
import iot.sensornetwork.SensornetworkPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link iot.sensornetwork.MicrocontrollerUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MicrocontrollerUnitItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerUnitItemProvider(AdapterFactory adapterFactory) {
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

			addMicrocontrollerToSensorPropertyDescriptor(object);
			addMicrocontrollerToActuatorPropertyDescriptor(object);
			addMicrocontrollerToCommunicationPropertyDescriptor(object);
			addMicrocontrollerToPowerPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addFirmwarePropertyDescriptor(object);
			addCpuFrequencyPropertyDescriptor(object);
			addRamSizePropertyDescriptor(object);
			addFlashSizePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Microcontroller To Sensor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMicrocontrollerToSensorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MicrocontrollerUnit_MicrocontrollerToSensor_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MicrocontrollerUnit_MicrocontrollerToSensor_feature", "_UI_MicrocontrollerUnit_type"),
				SensornetworkPackage.Literals.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_SENSOR, true, false, true, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Microcontroller To Actuator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMicrocontrollerToActuatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MicrocontrollerUnit_MicrocontrollerToActuator_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MicrocontrollerUnit_MicrocontrollerToActuator_feature", "_UI_MicrocontrollerUnit_type"),
				SensornetworkPackage.Literals.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_ACTUATOR, true, false, true,
				null, null, null));
	}

	/**
	 * This adds a property descriptor for the Microcontroller To Communication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMicrocontrollerToCommunicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MicrocontrollerUnit_MicrocontrollerToCommunication_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MicrocontrollerUnit_MicrocontrollerToCommunication_feature",
						"_UI_MicrocontrollerUnit_type"),
				SensornetworkPackage.Literals.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_COMMUNICATION, true, false, true,
				null, null, null));
	}

	/**
	 * This adds a property descriptor for the Microcontroller To Power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMicrocontrollerToPowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MicrocontrollerUnit_MicrocontrollerToPower_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MicrocontrollerUnit_MicrocontrollerToPower_feature", "_UI_MicrocontrollerUnit_type"),
				SensornetworkPackage.Literals.MICROCONTROLLER_UNIT__MICROCONTROLLER_TO_POWER, true, false, true, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MicrocontrollerUnit_type_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MicrocontrollerUnit_type_feature",
						"_UI_MicrocontrollerUnit_type"),
				SensornetworkPackage.Literals.MICROCONTROLLER_UNIT__TYPE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Firmware feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirmwarePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MicrocontrollerUnit_firmware_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MicrocontrollerUnit_firmware_feature",
						"_UI_MicrocontrollerUnit_type"),
				SensornetworkPackage.Literals.MICROCONTROLLER_UNIT__FIRMWARE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cpu Frequency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpuFrequencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MicrocontrollerUnit_cpuFrequency_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MicrocontrollerUnit_cpuFrequency_feature",
								"_UI_MicrocontrollerUnit_type"),
						SensornetworkPackage.Literals.MICROCONTROLLER_UNIT__CPU_FREQUENCY, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ram Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRamSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MicrocontrollerUnit_ramSize_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MicrocontrollerUnit_ramSize_feature",
						"_UI_MicrocontrollerUnit_type"),
				SensornetworkPackage.Literals.MICROCONTROLLER_UNIT__RAM_SIZE, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Flash Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlashSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MicrocontrollerUnit_flashSize_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MicrocontrollerUnit_flashSize_feature",
						"_UI_MicrocontrollerUnit_type"),
				SensornetworkPackage.Literals.MICROCONTROLLER_UNIT__FLASH_SIZE, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MicrocontrollerUnit_name_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MicrocontrollerUnit_name_feature",
						"_UI_MicrocontrollerUnit_type"),
				SensornetworkPackage.Literals.MICROCONTROLLER_UNIT__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns MicrocontrollerUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MicrocontrollerUnit"));
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
		String label = ((MicrocontrollerUnit) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_MicrocontrollerUnit_type")
				: getString("_UI_MicrocontrollerUnit_type") + " " + label;
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

		switch (notification.getFeatureID(MicrocontrollerUnit.class)) {
		case SensornetworkPackage.MICROCONTROLLER_UNIT__TYPE:
		case SensornetworkPackage.MICROCONTROLLER_UNIT__FIRMWARE:
		case SensornetworkPackage.MICROCONTROLLER_UNIT__CPU_FREQUENCY:
		case SensornetworkPackage.MICROCONTROLLER_UNIT__RAM_SIZE:
		case SensornetworkPackage.MICROCONTROLLER_UNIT__FLASH_SIZE:
		case SensornetworkPackage.MICROCONTROLLER_UNIT__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
