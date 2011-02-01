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
import es.tid.cim.RoutingPolicy;

/**
 * This is the item provider adapter for a {@link es.tid.cim.RoutingPolicy} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoutingPolicyItemProvider
	extends LogicalElementItemProvider
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
	public RoutingPolicyItemProvider(AdapterFactory adapterFactory) {
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

			addCreationClassNamePropertyDescriptor(object);
			addActionPropertyDescriptor(object);
			addAttributeActionPropertyDescriptor(object);
			addBGPActionPropertyDescriptor(object);
			addBGPValuePropertyDescriptor(object);
			addRemarkActionPropertyDescriptor(object);
			addRemarkValuePropertyDescriptor(object);
			addConditioningActionPropertyDescriptor(object);
			addOtherConditioningActionPropertyDescriptor(object);
			addConditioningValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Creation Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingPolicy_creationClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingPolicy_creationClassName_feature", "_UI_RoutingPolicy_type"),
				 CimPackage.eINSTANCE.getRoutingPolicy_CreationClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingPolicy_action_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingPolicy_action_feature", "_UI_RoutingPolicy_type"),
				 CimPackage.eINSTANCE.getRoutingPolicy_Action(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attribute Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributeActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingPolicy_attributeAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingPolicy_attributeAction_feature", "_UI_RoutingPolicy_type"),
				 CimPackage.eINSTANCE.getRoutingPolicy_AttributeAction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the BGP Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBGPActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingPolicy_BGPAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingPolicy_BGPAction_feature", "_UI_RoutingPolicy_type"),
				 CimPackage.eINSTANCE.getRoutingPolicy_BGPAction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the BGP Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBGPValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingPolicy_BGPValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingPolicy_BGPValue_feature", "_UI_RoutingPolicy_type"),
				 CimPackage.eINSTANCE.getRoutingPolicy_BGPValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remark Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemarkActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingPolicy_remarkAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingPolicy_remarkAction_feature", "_UI_RoutingPolicy_type"),
				 CimPackage.eINSTANCE.getRoutingPolicy_RemarkAction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remark Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemarkValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingPolicy_remarkValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingPolicy_remarkValue_feature", "_UI_RoutingPolicy_type"),
				 CimPackage.eINSTANCE.getRoutingPolicy_RemarkValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conditioning Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditioningActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingPolicy_conditioningAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingPolicy_conditioningAction_feature", "_UI_RoutingPolicy_type"),
				 CimPackage.eINSTANCE.getRoutingPolicy_ConditioningAction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Conditioning Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherConditioningActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingPolicy_otherConditioningAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingPolicy_otherConditioningAction_feature", "_UI_RoutingPolicy_type"),
				 CimPackage.eINSTANCE.getRoutingPolicy_OtherConditioningAction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conditioning Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditioningValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoutingPolicy_conditioningValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoutingPolicy_conditioningValue_feature", "_UI_RoutingPolicy_type"),
				 CimPackage.eINSTANCE.getRoutingPolicy_ConditioningValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns RoutingPolicy.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RoutingPolicy"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RoutingPolicy)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RoutingPolicy_type") :
			getString("_UI_RoutingPolicy_type") + " " + label;
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

		switch (notification.getFeatureID(RoutingPolicy.class)) {
			case CimPackage.ROUTING_POLICY__CREATION_CLASS_NAME:
			case CimPackage.ROUTING_POLICY__ACTION:
			case CimPackage.ROUTING_POLICY__ATTRIBUTE_ACTION:
			case CimPackage.ROUTING_POLICY__BGP_ACTION:
			case CimPackage.ROUTING_POLICY__BGP_VALUE:
			case CimPackage.ROUTING_POLICY__REMARK_ACTION:
			case CimPackage.ROUTING_POLICY__REMARK_VALUE:
			case CimPackage.ROUTING_POLICY__CONDITIONING_ACTION:
			case CimPackage.ROUTING_POLICY__OTHER_CONDITIONING_ACTION:
			case CimPackage.ROUTING_POLICY__CONDITIONING_VALUE:
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
