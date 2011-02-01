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
import es.tid.cim.SNMPCommunityStrings;

/**
 * This is the item provider adapter for a {@link es.tid.cim.SNMPCommunityStrings} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SNMPCommunityStringsItemProvider
	extends ServiceAccessPointItemProvider
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
	public SNMPCommunityStringsItemProvider(AdapterFactory adapterFactory) {
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

			addCommunityStringPropertyDescriptor(object);
			addTypeOfAccessPropertyDescriptor(object);
			addLogicalEntitiesAccessedPropertyDescriptor(object);
			addLogicalEntitiesDescriptionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Community String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommunityStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SNMPCommunityStrings_communityString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SNMPCommunityStrings_communityString_feature", "_UI_SNMPCommunityStrings_type"),
				 CimPackage.eINSTANCE.getSNMPCommunityStrings_CommunityString(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Of Access feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeOfAccessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SNMPCommunityStrings_typeOfAccess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SNMPCommunityStrings_typeOfAccess_feature", "_UI_SNMPCommunityStrings_type"),
				 CimPackage.eINSTANCE.getSNMPCommunityStrings_TypeOfAccess(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Logical Entities Accessed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogicalEntitiesAccessedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SNMPCommunityStrings_logicalEntitiesAccessed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SNMPCommunityStrings_logicalEntitiesAccessed_feature", "_UI_SNMPCommunityStrings_type"),
				 CimPackage.eINSTANCE.getSNMPCommunityStrings_LogicalEntitiesAccessed(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Logical Entities Descriptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogicalEntitiesDescriptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SNMPCommunityStrings_logicalEntitiesDescriptions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SNMPCommunityStrings_logicalEntitiesDescriptions_feature", "_UI_SNMPCommunityStrings_type"),
				 CimPackage.eINSTANCE.getSNMPCommunityStrings_LogicalEntitiesDescriptions(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SNMPCommunityStrings.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SNMPCommunityStrings"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SNMPCommunityStrings)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SNMPCommunityStrings_type") :
			getString("_UI_SNMPCommunityStrings_type") + " " + label;
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

		switch (notification.getFeatureID(SNMPCommunityStrings.class)) {
			case CimPackage.SNMP_COMMUNITY_STRINGS__COMMUNITY_STRING:
			case CimPackage.SNMP_COMMUNITY_STRINGS__TYPE_OF_ACCESS:
			case CimPackage.SNMP_COMMUNITY_STRINGS__LOGICAL_ENTITIES_ACCESSED:
			case CimPackage.SNMP_COMMUNITY_STRINGS__LOGICAL_ENTITIES_DESCRIPTIONS:
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
