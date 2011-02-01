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
import es.tid.cim.TelnetSettingData;

/**
 * This is the item provider adapter for a {@link es.tid.cim.TelnetSettingData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TelnetSettingDataItemProvider
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
	public TelnetSettingDataItemProvider(AdapterFactory adapterFactory) {
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

			addEnabledTerminalModesPropertyDescriptor(object);
			addOtherEnabledTerminalModePropertyDescriptor(object);
			addTerminalModePropertyDescriptor(object);
			addOtherTerminalModePropertyDescriptor(object);
			addEnabledCharacterDisplayModesPropertyDescriptor(object);
			addOtherEnabledCharacterDisplayModePropertyDescriptor(object);
			addCharacterDisplayModePropertyDescriptor(object);
			addOtherCharacterDisplayModePropertyDescriptor(object);
			addEscapeCharacterPropertyDescriptor(object);
			addIdleTimeoutPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Enabled Terminal Modes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabledTerminalModesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelnetSettingData_enabledTerminalModes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelnetSettingData_enabledTerminalModes_feature", "_UI_TelnetSettingData_type"),
				 CimPackage.eINSTANCE.getTelnetSettingData_EnabledTerminalModes(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Enabled Terminal Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherEnabledTerminalModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelnetSettingData_otherEnabledTerminalMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelnetSettingData_otherEnabledTerminalMode_feature", "_UI_TelnetSettingData_type"),
				 CimPackage.eINSTANCE.getTelnetSettingData_OtherEnabledTerminalMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Terminal Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTerminalModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelnetSettingData_terminalMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelnetSettingData_terminalMode_feature", "_UI_TelnetSettingData_type"),
				 CimPackage.eINSTANCE.getTelnetSettingData_TerminalMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Terminal Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherTerminalModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelnetSettingData_otherTerminalMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelnetSettingData_otherTerminalMode_feature", "_UI_TelnetSettingData_type"),
				 CimPackage.eINSTANCE.getTelnetSettingData_OtherTerminalMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enabled Character Display Modes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabledCharacterDisplayModesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelnetSettingData_enabledCharacterDisplayModes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelnetSettingData_enabledCharacterDisplayModes_feature", "_UI_TelnetSettingData_type"),
				 CimPackage.eINSTANCE.getTelnetSettingData_EnabledCharacterDisplayModes(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Enabled Character Display Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherEnabledCharacterDisplayModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelnetSettingData_otherEnabledCharacterDisplayMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelnetSettingData_otherEnabledCharacterDisplayMode_feature", "_UI_TelnetSettingData_type"),
				 CimPackage.eINSTANCE.getTelnetSettingData_OtherEnabledCharacterDisplayMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Character Display Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCharacterDisplayModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelnetSettingData_characterDisplayMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelnetSettingData_characterDisplayMode_feature", "_UI_TelnetSettingData_type"),
				 CimPackage.eINSTANCE.getTelnetSettingData_CharacterDisplayMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Character Display Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherCharacterDisplayModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelnetSettingData_otherCharacterDisplayMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelnetSettingData_otherCharacterDisplayMode_feature", "_UI_TelnetSettingData_type"),
				 CimPackage.eINSTANCE.getTelnetSettingData_OtherCharacterDisplayMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Escape Character feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEscapeCharacterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TelnetSettingData_escapeCharacter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelnetSettingData_escapeCharacter_feature", "_UI_TelnetSettingData_type"),
				 CimPackage.eINSTANCE.getTelnetSettingData_EscapeCharacter(),
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
				 getString("_UI_TelnetSettingData_idleTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TelnetSettingData_idleTimeout_feature", "_UI_TelnetSettingData_type"),
				 CimPackage.eINSTANCE.getTelnetSettingData_IdleTimeout(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TelnetSettingData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TelnetSettingData"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TelnetSettingData)object).getElementName();
		return label == null || label.length() == 0 ?
			getString("_UI_TelnetSettingData_type") :
			getString("_UI_TelnetSettingData_type") + " " + label;
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

		switch (notification.getFeatureID(TelnetSettingData.class)) {
			case CimPackage.TELNET_SETTING_DATA__ENABLED_TERMINAL_MODES:
			case CimPackage.TELNET_SETTING_DATA__OTHER_ENABLED_TERMINAL_MODE:
			case CimPackage.TELNET_SETTING_DATA__TERMINAL_MODE:
			case CimPackage.TELNET_SETTING_DATA__OTHER_TERMINAL_MODE:
			case CimPackage.TELNET_SETTING_DATA__ENABLED_CHARACTER_DISPLAY_MODES:
			case CimPackage.TELNET_SETTING_DATA__OTHER_ENABLED_CHARACTER_DISPLAY_MODE:
			case CimPackage.TELNET_SETTING_DATA__CHARACTER_DISPLAY_MODE:
			case CimPackage.TELNET_SETTING_DATA__OTHER_CHARACTER_DISPLAY_MODE:
			case CimPackage.TELNET_SETTING_DATA__ESCAPE_CHARACTER:
			case CimPackage.TELNET_SETTING_DATA__IDLE_TIMEOUT:
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
