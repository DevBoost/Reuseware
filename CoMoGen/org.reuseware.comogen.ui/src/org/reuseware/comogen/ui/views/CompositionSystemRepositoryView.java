package org.reuseware.comogen.ui.views;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.reuseware.coconut.fracol.FracolPackage;
import org.reuseware.comogen.ui.CoMoGenUIPlugin;
import org.reuseware.comogen.ui.internal.actions.RenameAction;
import org.reuseware.sokan.ui.model.sokanui.provider.PackageItemProvider;
import org.reuseware.sokan.ui.model.sokanui.provider.SokanuiItemProviderAdapterFactory;
import org.reuseware.sokan.ui.views.BasicRepositoryView;

/**
 * A specialized repository view that shows only artifacts for 
 * composition system development which are *.fracol and *.rex files.
 */
public class CompositionSystemRepositoryView extends BasicRepositoryView {
	
	private RenameAction renameAction =
		new RenameAction(this);
	
	/**
	 * Constructs a new composition system repository view.
	 */
	public CompositionSystemRepositoryView() {
		super();
		
		getAdapterFactory().addAdapterFactory(new SokanuiItemProviderAdapterFactory() {
			private ImageDescriptor packageImage = null;

			@Override
			public Adapter createPackageAdapter() {
				if (packageItemProvider == null) {
					packageItemProvider = new PackageItemProvider(this) {
						public Object getImage(Object object) {
							if (packageImage == null) {
								URL url = CoMoGenUIPlugin.getDefault().getBundle().getResource(
										"icons/Package.gif");
								packageImage = ImageDescriptor.createFromURL(url);
							}
							return packageImage;
						};
					};
				}
				return packageItemProvider;
			}
		});
	}
	
	@Override
	protected List<EClass> getVisibleTypes() {
		return Collections.singletonList(FracolPackage.Literals.FRAGMENT_COLLABORATION);
	}
	
	@Override
	protected List<Action> getAdditionalActions() {
		List<Action> actions = new ArrayList<Action>();
		
		actions.add(renameAction);
		
		return actions;
	}
}
