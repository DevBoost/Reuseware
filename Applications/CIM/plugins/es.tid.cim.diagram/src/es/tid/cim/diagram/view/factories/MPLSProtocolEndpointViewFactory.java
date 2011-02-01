package es.tid.cim.diagram.view.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.AbstractShapeViewFactory;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.parts.CIM_ModelEditPart;
import es.tid.cim.diagram.edit.parts.MPLSProtocolEndpointEditPart;
import es.tid.cim.diagram.edit.parts.MPLSProtocolEndpointElementNameEditPart;
import es.tid.cim.diagram.edit.parts.WrappingLabel8EditPart;
import es.tid.cim.diagram.part.CIMLevelZeroVisualIDRegistry;

/**
 * @generated
 */
public class MPLSProtocolEndpointViewFactory extends AbstractShapeViewFactory {

	/**
	 * @generated
	 */
	protected List createStyles(View view) {
		List styles = new ArrayList();
		styles.add(NotationFactory.eINSTANCE.createShapeStyle());
		return styles;
	}

	/**
	 * @generated
	 */
	protected void decorateView(View containerView, View view,
			IAdaptable semanticAdapter, String semanticHint, int index,
			boolean persisted) {
		if (semanticHint == null) {
			semanticHint = CIMLevelZeroVisualIDRegistry
					.getType(MPLSProtocolEndpointEditPart.VISUAL_ID);
			view.setType(semanticHint);
		}
		super.decorateView(containerView, view, semanticAdapter, semanticHint,
				index, persisted);
		if (!CIM_ModelEditPart.MODEL_ID.equals(CIMLevelZeroVisualIDRegistry
				.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation.getDetails().put(
					"modelID", CIM_ModelEditPart.MODEL_ID); //$NON-NLS-1$
			view.getEAnnotations().add(shortcutAnnotation);
		}
		IAdaptable eObjectAdapter = null;
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			eObjectAdapter = new EObjectAdapter(eObject);
		}
		getViewService()
				.createNode(
						eObjectAdapter,
						view,
						CIMLevelZeroVisualIDRegistry
								.getType(MPLSProtocolEndpointElementNameEditPart.VISUAL_ID),
						ViewUtil.APPEND, true, getPreferencesHint());
		getViewService().createNode(
				eObjectAdapter,
				view,
				CIMLevelZeroVisualIDRegistry
						.getType(WrappingLabel8EditPart.VISUAL_ID),
				ViewUtil.APPEND, true, getPreferencesHint());
	}
}
