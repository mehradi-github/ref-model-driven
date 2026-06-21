/**
 */
package iot.sensornetwork.provider;

import iot.sensornetwork.CommunicationModule;
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
 * This is the item provider adapter for a {@link iot.sensornetwork.CommunicationModule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationModuleItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationModuleItemProvider(AdapterFactory adapterFactory) {
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

			addCommunicationToMicrocontrollerPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addProtocolPropertyDescriptor(object);
			addBaudRatePropertyDescriptor(object);
			addBufferPropertyDescriptor(object);
			addMacAddressPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addCommunicationToServerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Communication To Microcontroller feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommunicationToMicrocontrollerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationModule_CommunicationToMicrocontroller_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommunicationModule_CommunicationToMicrocontroller_feature",
						"_UI_CommunicationModule_type"),
				SensornetworkPackage.Literals.COMMUNICATION_MODULE__COMMUNICATION_TO_MICROCONTROLLER, true, false, true,
				null, null, null));
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
				getString("_UI_CommunicationModule_type_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CommunicationModule_type_feature",
						"_UI_CommunicationModule_type"),
				SensornetworkPackage.Literals.COMMUNICATION_MODULE__TYPE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationModule_protocol_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CommunicationModule_protocol_feature",
						"_UI_CommunicationModule_type"),
				SensornetworkPackage.Literals.COMMUNICATION_MODULE__PROTOCOL, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Baud Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaudRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationModule_baudRate_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CommunicationModule_baudRate_feature",
						"_UI_CommunicationModule_type"),
				SensornetworkPackage.Literals.COMMUNICATION_MODULE__BAUD_RATE, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Buffer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBufferPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationModule_buffer_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CommunicationModule_buffer_feature",
						"_UI_CommunicationModule_type"),
				SensornetworkPackage.Literals.COMMUNICATION_MODULE__BUFFER, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Mac Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMacAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CommunicationModule_macAddress_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CommunicationModule_macAddress_feature",
								"_UI_CommunicationModule_type"),
						SensornetworkPackage.Literals.COMMUNICATION_MODULE__MAC_ADDRESS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
				getString("_UI_CommunicationModule_name_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CommunicationModule_name_feature",
						"_UI_CommunicationModule_type"),
				SensornetworkPackage.Literals.COMMUNICATION_MODULE__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Communication To Server feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommunicationToServerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationModule_CommunicationToServer_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CommunicationModule_CommunicationToServer_feature",
						"_UI_CommunicationModule_type"),
				SensornetworkPackage.Literals.COMMUNICATION_MODULE__COMMUNICATION_TO_SERVER, true, false, true, null,
				null, null));
	}

	/**
	 * This returns CommunicationModule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CommunicationModule"));
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
		String label = ((CommunicationModule) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_CommunicationModule_type")
				: getString("_UI_CommunicationModule_type") + " " + label;
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

		switch (notification.getFeatureID(CommunicationModule.class)) {
		case SensornetworkPackage.COMMUNICATION_MODULE__TYPE:
		case SensornetworkPackage.COMMUNICATION_MODULE__PROTOCOL:
		case SensornetworkPackage.COMMUNICATION_MODULE__BAUD_RATE:
		case SensornetworkPackage.COMMUNICATION_MODULE__BUFFER:
		case SensornetworkPackage.COMMUNICATION_MODULE__MAC_ADDRESS:
		case SensornetworkPackage.COMMUNICATION_MODULE__NAME:
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
