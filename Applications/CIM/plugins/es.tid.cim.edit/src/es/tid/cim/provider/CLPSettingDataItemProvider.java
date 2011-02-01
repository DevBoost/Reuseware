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

import es.tid.cim.CLPSettingData;
import es.tid.cim.CimPackage;

/**
 * This is the item provider adapter for a {@link es.tid.cim.CLPSettingData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CLPSettingDataItemProvider
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
	public CLPSettingDataItemProvider(AdapterFactory adapterFactory) {
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

			addCurrentDefaultTargetPropertyDescriptor(object);
			addKeepTimePropertyDescriptor(object);
			addWaitBehaviourPropertyDescriptor(object);
			addOutputFormatPropertyDescriptor(object);
			addOutputVerbosityPropertyDescriptor(object);
			addOutputLanguagePropertyDescriptor(object);
			addOutputPositionPropertyDescriptor(object);
			addOutputOrderPropertyDescriptor(object);
			addOutputCountPropertyDescriptor(object);
			addDisplayOptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Current Default Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentDefaultTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CLPSettingData_currentDefaultTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CLPSettingData_currentDefaultTarget_feature", "_UI_CLPSettingData_type"),
				 CimPackage.eINSTANCE.getCLPSettingData_CurrentDefaultTarget(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Keep Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeepTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CLPSettingData_keepTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CLPSettingData_keepTime_feature", "_UI_CLPSettingData_type"),
				 CimPackage.eINSTANCE.getCLPSettingData_KeepTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wait Behaviour feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWaitBehaviourPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CLPSettingData_waitBehaviour_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CLPSettingData_waitBehaviour_feature", "_UI_CLPSettingData_type"),
				 CimPackage.eINSTANCE.getCLPSettingData_WaitBehaviour(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CLPSettingData_outputFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CLPSettingData_outputFormat_feature", "_UI_CLPSettingData_type"),
				 CimPackage.eINSTANCE.getCLPSettingData_OutputFormat(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Verbosity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputVerbosityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CLPSettingData_outputVerbosity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CLPSettingData_outputVerbosity_feature", "_UI_CLPSettingData_type"),
				 CimPackage.eINSTANCE.getCLPSettingData_OutputVerbosity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CLPSettingData_outputLanguage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CLPSettingData_outputLanguage_feature", "_UI_CLPSettingData_type"),
				 CimPackage.eINSTANCE.getCLPSettingData_OutputLanguage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CLPSettingData_outputPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CLPSettingData_outputPosition_feature", "_UI_CLPSettingData_type"),
				 CimPackage.eINSTANCE.getCLPSettingData_OutputPosition(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CLPSettingData_outputOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CLPSettingData_outputOrder_feature", "_UI_CLPSettingData_type"),
				 CimPackage.eINSTANCE.getCLPSettingData_OutputOrder(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CLPSettingData_outputCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CLPSettingData_outputCount_feature", "_UI_CLPSettingData_type"),
				 CimPackage.eINSTANCE.getCLPSettingData_OutputCount(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Display Option feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayOptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CLPSettingData_displayOption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CLPSettingData_displayOption_feature", "_UI_CLPSettingData_type"),
				 CimPackage.eINSTANCE.getCLPSettingData_DisplayOption(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CLPSettingData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CLPSettingData"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CLPSettingData)object).getElementName();
		return label == null || label.length() == 0 ?
			getString("_UI_CLPSettingData_type") :
			getString("_UI_CLPSettingData_type") + " " + label;
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

		switch (notification.getFeatureID(CLPSettingData.class)) {
			case CimPackage.CLP_SETTING_DATA__CURRENT_DEFAULT_TARGET:
			case CimPackage.CLP_SETTING_DATA__KEEP_TIME:
			case CimPackage.CLP_SETTING_DATA__WAIT_BEHAVIOUR:
			case CimPackage.CLP_SETTING_DATA__OUTPUT_FORMAT:
			case CimPackage.CLP_SETTING_DATA__OUTPUT_VERBOSITY:
			case CimPackage.CLP_SETTING_DATA__OUTPUT_LANGUAGE:
			case CimPackage.CLP_SETTING_DATA__OUTPUT_POSITION:
			case CimPackage.CLP_SETTING_DATA__OUTPUT_ORDER:
			case CimPackage.CLP_SETTING_DATA__OUTPUT_COUNT:
			case CimPackage.CLP_SETTING_DATA__DISPLAY_OPTION:
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
