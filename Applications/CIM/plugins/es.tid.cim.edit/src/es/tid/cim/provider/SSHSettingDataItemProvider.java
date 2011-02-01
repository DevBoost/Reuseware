/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.provider;



import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import es.tid.cim.CimPackage;
import es.tid.cim.SSHSettingData;

/**
 * This is the item provider adapter for a {@link es.tid.cim.SSHSettingData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SSHSettingDataItemProvider
	extends SettingDataItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSHSettingDataItemProvider(AdapterFactory adapterFactory) {
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

			addEnabledSSHVersionsPropertyDescriptor(object);
			addOtherEnabledSSHVersionPropertyDescriptor(object);
			addSSHVersionPropertyDescriptor(object);
			addEnabledEncryptionAlgorithmsPropertyDescriptor(object);
			addOtherEnabledEncryptionAlgorithmPropertyDescriptor(object);
			addIdleTimeoutPropertyDescriptor(object);
			addKeepAlivePropertyDescriptor(object);
			addForwardX11PropertyDescriptor(object);
			addCompressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Enabled SSH Versions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabledSSHVersionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SSHSettingData_enabledSSHVersions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SSHSettingData_enabledSSHVersions_feature", "_UI_SSHSettingData_type"),
				 CimPackage.eINSTANCE.getSSHSettingData_EnabledSSHVersions(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Enabled SSH Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherEnabledSSHVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SSHSettingData_otherEnabledSSHVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SSHSettingData_otherEnabledSSHVersion_feature", "_UI_SSHSettingData_type"),
				 CimPackage.eINSTANCE.getSSHSettingData_OtherEnabledSSHVersion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SSH Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSSHVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SSHSettingData_SSHVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SSHSettingData_SSHVersion_feature", "_UI_SSHSettingData_type"),
				 CimPackage.eINSTANCE.getSSHSettingData_SSHVersion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enabled Encryption Algorithms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabledEncryptionAlgorithmsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SSHSettingData_enabledEncryptionAlgorithms_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SSHSettingData_enabledEncryptionAlgorithms_feature", "_UI_SSHSettingData_type"),
				 CimPackage.eINSTANCE.getSSHSettingData_EnabledEncryptionAlgorithms(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Enabled Encryption Algorithm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherEnabledEncryptionAlgorithmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SSHSettingData_otherEnabledEncryptionAlgorithm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SSHSettingData_otherEnabledEncryptionAlgorithm_feature", "_UI_SSHSettingData_type"),
				 CimPackage.eINSTANCE.getSSHSettingData_OtherEnabledEncryptionAlgorithm(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Idle Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdleTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SSHSettingData_idleTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SSHSettingData_idleTimeout_feature", "_UI_SSHSettingData_type"),
				 CimPackage.eINSTANCE.getSSHSettingData_IdleTimeout(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Keep Alive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeepAlivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SSHSettingData_keepAlive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SSHSettingData_keepAlive_feature", "_UI_SSHSettingData_type"),
				 CimPackage.eINSTANCE.getSSHSettingData_KeepAlive(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Forward X11 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForwardX11PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SSHSettingData_forwardX11_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SSHSettingData_forwardX11_feature", "_UI_SSHSettingData_type"),
				 CimPackage.eINSTANCE.getSSHSettingData_ForwardX11(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SSHSettingData_compression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SSHSettingData_compression_feature", "_UI_SSHSettingData_type"),
				 CimPackage.eINSTANCE.getSSHSettingData_Compression(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SSHSettingData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SSHSettingData"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SSHSettingData)object).getElementName();
		return label == null || label.length() == 0 ?
			getString("_UI_SSHSettingData_type") :
			getString("_UI_SSHSettingData_type") + " " + label;
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

		switch (notification.getFeatureID(SSHSettingData.class)) {
			case CimPackage.SSH_SETTING_DATA__ENABLED_SSH_VERSIONS:
			case CimPackage.SSH_SETTING_DATA__OTHER_ENABLED_SSH_VERSION:
			case CimPackage.SSH_SETTING_DATA__SSH_VERSION:
			case CimPackage.SSH_SETTING_DATA__ENABLED_ENCRYPTION_ALGORITHMS:
			case CimPackage.SSH_SETTING_DATA__OTHER_ENABLED_ENCRYPTION_ALGORITHM:
			case CimPackage.SSH_SETTING_DATA__IDLE_TIMEOUT:
			case CimPackage.SSH_SETTING_DATA__KEEP_ALIVE:
			case CimPackage.SSH_SETTING_DATA__FORWARD_X11:
			case CimPackage.SSH_SETTING_DATA__COMPRESSION:
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

}
