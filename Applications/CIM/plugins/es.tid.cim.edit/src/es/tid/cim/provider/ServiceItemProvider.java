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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import es.tid.cim.CimFactory;
import es.tid.cim.CimPackage;
import es.tid.cim.Service;

/**
 * This is the item provider adapter for a {@link es.tid.cim.Service} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceItemProvider
	extends EnabledLogicalElementItemProvider
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
	public ServiceItemProvider(AdapterFactory adapterFactory) {
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
			addPrimaryOwnerNamePropertyDescriptor(object);
			addPrimaryOwnerContactPropertyDescriptor(object);
			addStartedPropertyDescriptor(object);
			addServiceServiceDependencyPropertyDescriptor(object);
			addSoftwareElementServiceImplementationPropertyDescriptor(object);
			addSoftwareFeatureServiceImplementationPropertyDescriptor(object);
			addSystemCreationClassNamePropertyDescriptor(object);
			addSystemNamePropertyDescriptor(object);
			addServiceAccessBySAPPropertyDescriptor(object);
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
				 getString("_UI_Service_creationClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_creationClassName_feature", "_UI_Service_type"),
				 CimPackage.eINSTANCE.getService_CreationClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary Owner Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryOwnerNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_primaryOwnerName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_primaryOwnerName_feature", "_UI_Service_type"),
				 CimPackage.eINSTANCE.getService_PrimaryOwnerName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary Owner Contact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryOwnerContactPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_primaryOwnerContact_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_primaryOwnerContact_feature", "_UI_Service_type"),
				 CimPackage.eINSTANCE.getService_PrimaryOwnerContact(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Started feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_started_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_started_feature", "_UI_Service_type"),
				 CimPackage.eINSTANCE.getService_Started(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Service Dependency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceServiceDependencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_serviceServiceDependency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_serviceServiceDependency_feature", "_UI_Service_type"),
				 CimPackage.eINSTANCE.getService_ServiceServiceDependency(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Software Element Service Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSoftwareElementServiceImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_softwareElementServiceImplementation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_softwareElementServiceImplementation_feature", "_UI_Service_type"),
				 CimPackage.eINSTANCE.getService_SoftwareElementServiceImplementation(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Software Feature Service Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSoftwareFeatureServiceImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_softwareFeatureServiceImplementation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_softwareFeatureServiceImplementation_feature", "_UI_Service_type"),
				 CimPackage.eINSTANCE.getService_SoftwareFeatureServiceImplementation(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the System Creation Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystemCreationClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_systemCreationClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_systemCreationClassName_feature", "_UI_Service_type"),
				 CimPackage.eINSTANCE.getService_SystemCreationClassName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the System Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystemNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_systemName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_systemName_feature", "_UI_Service_type"),
				 CimPackage.eINSTANCE.getService_SystemName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Access By SAP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceAccessBySAPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Service_serviceAccessBySAP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Service_serviceAccessBySAP_feature", "_UI_Service_type"),
				 CimPackage.eINSTANCE.getService_ServiceAccessBySAP(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(CimPackage.eINSTANCE.getService_ServiceComponents());
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Service)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Service_type") :
			getString("_UI_Service_type") + " " + label;
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

		switch (notification.getFeatureID(Service.class)) {
			case CimPackage.SERVICE__CREATION_CLASS_NAME:
			case CimPackage.SERVICE__PRIMARY_OWNER_NAME:
			case CimPackage.SERVICE__PRIMARY_OWNER_CONTACT:
			case CimPackage.SERVICE__STARTED:
			case CimPackage.SERVICE__SYSTEM_CREATION_CLASS_NAME:
			case CimPackage.SERVICE__SYSTEM_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CimPackage.SERVICE__SERVICE_COMPONENTS:
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

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getService_ServiceComponents(),
				 CimFactory.eINSTANCE.createBGPService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getService_ServiceComponents(),
				 CimFactory.eINSTANCE.createGenericService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getService_ServiceComponents(),
				 CimFactory.eINSTANCE.createProtocolService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getService_ServiceComponents(),
				 CimFactory.eINSTANCE.createConditioningService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getService_ServiceComponents(),
				 CimFactory.eINSTANCE.createQoSService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getService_ServiceComponents(),
				 CimFactory.eINSTANCE.createPrecedenceService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getService_ServiceComponents(),
				 CimFactory.eINSTANCE.createDiffServService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getService_ServiceComponents(),
				 CimFactory.eINSTANCE.createEFService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getService_ServiceComponents(),
				 CimFactory.eINSTANCE.createAFService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getService_ServiceComponents(),
				 CimFactory.eINSTANCE.createHdr8021PService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getService_ServiceComponents(),
				 CimFactory.eINSTANCE.createDropThresholdCalculationService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getService_ServiceComponents(),
				 CimFactory.eINSTANCE.createFlowService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getService_ServiceComponents(),
				 CimFactory.eINSTANCE.createForwardingService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getService_ServiceComponents(),
				 CimFactory.eINSTANCE.createNATService()));

		newChildDescriptors.add
			(createChildParameter
				(CimPackage.eINSTANCE.getService_ServiceComponents(),
				 CimFactory.eINSTANCE.createSNMPService()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CimPackage.eINSTANCE.getManagedElement_Components() ||
			childFeature == CimPackage.eINSTANCE.getService_ServiceComponents();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
