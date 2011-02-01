package es.tid.cim.diagram.view.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.ConnectionViewFactory;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.diagram.edit.parts.EnabledLogicalElementRemoteAccessAvailableToElementEditPart;
import es.tid.cim.diagram.edit.parts.WrappingLabel121EditPart;
import es.tid.cim.diagram.part.CIMLevelZeroVisualIDRegistry;

/**
 * @generated
 */
public class EnabledLogicalElementRemoteAccessAvailableToElementViewFactory
		extends ConnectionViewFactory {

	/**
	 * @generated
	 */
	protected List createStyles(View view) {
		List styles = new ArrayList();
		styles.add(NotationFactory.eINSTANCE.createConnectorStyle());
		styles.add(NotationFactory.eINSTANCE.createFontStyle());
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
					.getType(EnabledLogicalElementRemoteAccessAvailableToElementEditPart.VISUAL_ID);
			view.setType(semanticHint);
		}
		super.decorateView(containerView, view, semanticAdapter, semanticHint,
				index, persisted);
		IAdaptable eObjectAdapter = null;
		getViewService().createNode(
				eObjectAdapter,
				view,
				CIMLevelZeroVisualIDRegistry
						.getType(WrappingLabel121EditPart.VISUAL_ID),
				ViewUtil.APPEND, true, getPreferencesHint());
	}
}
