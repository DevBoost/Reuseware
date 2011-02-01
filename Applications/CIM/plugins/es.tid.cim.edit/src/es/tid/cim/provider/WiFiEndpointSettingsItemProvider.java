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
import es.tid.cim.WiFiEndpointSettings;

/**
 * This is the item provider adapter for a {@link es.tid.cim.WiFiEndpointSettings} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WiFiEndpointSettingsItemProvider
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
	public WiFiEndpointSettingsItemProvider(AdapterFactory adapterFactory) {
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

			addAuthenticationMethodPropertyDescriptor(object);
			addBSSTypePropertyDescriptor(object);
			addEncryptionMethodPropertyDescriptor(object);
			addKeyIndexPropertyDescriptor(object);
			addOtherAuthenticationMethodPropertyDescriptor(object);
			addOtherEncryptionMethodPropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addPSKPassPhrasePropertyDescriptor(object);
			addSSIDPropertyDescriptor(object);
			addKeysPropertyDescriptor(object);
			addPSKValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Authentication Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthenticationMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WiFiEndpointSettings_authenticationMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WiFiEndpointSettings_authenticationMethod_feature", "_UI_WiFiEndpointSettings_type"),
				 CimPackage.eINSTANCE.getWiFiEndpointSettings_AuthenticationMethod(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the BSS Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBSSTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WiFiEndpointSettings_BSSType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WiFiEndpointSettings_BSSType_feature", "_UI_WiFiEndpointSettings_type"),
				 CimPackage.eINSTANCE.getWiFiEndpointSettings_BSSType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Encryption Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncryptionMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WiFiEndpointSettings_encryptionMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WiFiEndpointSettings_encryptionMethod_feature", "_UI_WiFiEndpointSettings_type"),
				 CimPackage.eINSTANCE.getWiFiEndpointSettings_EncryptionMethod(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WiFiEndpointSettings_keyIndex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WiFiEndpointSettings_keyIndex_feature", "_UI_WiFiEndpointSettings_type"),
				 CimPackage.eINSTANCE.getWiFiEndpointSettings_KeyIndex(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Authentication Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherAuthenticationMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WiFiEndpointSettings_otherAuthenticationMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WiFiEndpointSettings_otherAuthenticationMethod_feature", "_UI_WiFiEndpointSettings_type"),
				 CimPackage.eINSTANCE.getWiFiEndpointSettings_OtherAuthenticationMethod(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Encryption Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherEncryptionMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WiFiEndpointSettings_otherEncryptionMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WiFiEndpointSettings_otherEncryptionMethod_feature", "_UI_WiFiEndpointSettings_type"),
				 CimPackage.eINSTANCE.getWiFiEndpointSettings_OtherEncryptionMethod(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WiFiEndpointSettings_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WiFiEndpointSettings_priority_feature", "_UI_WiFiEndpointSettings_type"),
				 CimPackage.eINSTANCE.getWiFiEndpointSettings_Priority(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PSK Pass Phrase feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPSKPassPhrasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WiFiEndpointSettings_PSKPassPhrase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WiFiEndpointSettings_PSKPassPhrase_feature", "_UI_WiFiEndpointSettings_type"),
				 CimPackage.eINSTANCE.getWiFiEndpointSettings_PSKPassPhrase(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SSID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSSIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WiFiEndpointSettings_SSID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WiFiEndpointSettings_SSID_feature", "_UI_WiFiEndpointSettings_type"),
				 CimPackage.eINSTANCE.getWiFiEndpointSettings_SSID(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Keys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WiFiEndpointSettings_keys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WiFiEndpointSettings_keys_feature", "_UI_WiFiEndpointSettings_type"),
				 CimPackage.eINSTANCE.getWiFiEndpointSettings_Keys(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PSK Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPSKValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WiFiEndpointSettings_PSKValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WiFiEndpointSettings_PSKValue_feature", "_UI_WiFiEndpointSettings_type"),
				 CimPackage.eINSTANCE.getWiFiEndpointSettings_PSKValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns WiFiEndpointSettings.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WiFiEndpointSettings"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WiFiEndpointSettings)object).getElementName();
		return label == null || label.length() == 0 ?
			getString("_UI_WiFiEndpointSettings_type") :
			getString("_UI_WiFiEndpointSettings_type") + " " + label;
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

		switch (notification.getFeatureID(WiFiEndpointSettings.class)) {
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__AUTHENTICATION_METHOD:
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__BSS_TYPE:
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__ENCRYPTION_METHOD:
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__KEY_INDEX:
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__OTHER_AUTHENTICATION_METHOD:
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__OTHER_ENCRYPTION_METHOD:
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__PRIORITY:
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__PSK_PASS_PHRASE:
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__SSID:
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__KEYS:
			case CimPackage.WI_FI_ENDPOINT_SETTINGS__PSK_VALUE:
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
