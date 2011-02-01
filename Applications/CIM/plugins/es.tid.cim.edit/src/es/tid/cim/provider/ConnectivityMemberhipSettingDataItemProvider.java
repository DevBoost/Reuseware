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
import es.tid.cim.ConnectivityMemberhipSettingData;

/**
 * This is the item provider adapter for a {@link es.tid.cim.ConnectivityMemberhipSettingData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectivityMemberhipSettingDataItemProvider
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
	public ConnectivityMemberhipSettingDataItemProvider(AdapterFactory adapterFactory) {
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

			addConnectivityMembershipTypePropertyDescriptor(object);
			addOtherConnectivityMembershipTypePropertyDescriptor(object);
			addConnectivityMembershipIDPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Connectivity Membership Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectivityMembershipTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectivityMemberhipSettingData_connectivityMembershipType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectivityMemberhipSettingData_connectivityMembershipType_feature", "_UI_ConnectivityMemberhipSettingData_type"),
				 CimPackage.eINSTANCE.getConnectivityMemberhipSettingData_ConnectivityMembershipType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Connectivity Membership Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherConnectivityMembershipTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectivityMemberhipSettingData_otherConnectivityMembershipType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectivityMemberhipSettingData_otherConnectivityMembershipType_feature", "_UI_ConnectivityMemberhipSettingData_type"),
				 CimPackage.eINSTANCE.getConnectivityMemberhipSettingData_OtherConnectivityMembershipType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connectivity Membership ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectivityMembershipIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectivityMemberhipSettingData_connectivityMembershipID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectivityMemberhipSettingData_connectivityMembershipID_feature", "_UI_ConnectivityMemberhipSettingData_type"),
				 CimPackage.eINSTANCE.getConnectivityMemberhipSettingData_ConnectivityMembershipID(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ConnectivityMemberhipSettingData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConnectivityMemberhipSettingData"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConnectivityMemberhipSettingData)object).getElementName();
		return label == null || label.length() == 0 ?
			getString("_UI_ConnectivityMemberhipSettingData_type") :
			getString("_UI_ConnectivityMemberhipSettingData_type") + " " + label;
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

		switch (notification.getFeatureID(ConnectivityMemberhipSettingData.class)) {
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__CONNECTIVITY_MEMBERSHIP_TYPE:
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__OTHER_CONNECTIVITY_MEMBERSHIP_TYPE:
			case CimPackage.CONNECTIVITY_MEMBERHIP_SETTING_DATA__CONNECTIVITY_MEMBERSHIP_ID:
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
