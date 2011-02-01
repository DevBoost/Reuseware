package org.reuseware.coconut.resource.sokan;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.resource.ReuseResources;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.index.util.ResourceUtil;

/**
 * A special resource that loads a composition interface
 * (Fragment) model that is cached in the Sokan index.
 * The resource is associated with the 'reuseware:'
 * protocol, which allows 'reuseware:/*' URIs to be used
 * to refer to the composition interface of a model rather
 * than the model itself.
 */
public class FragmentResource extends XMIResourceImpl {
	
	/**
	 * The constructor.
	 * 
	 * @param uri the URI (with protocol 'reuseware:')
	 */
	public FragmentResource(URI uri) {
		super(uri);
	}

	@Override
	public void load(Map<?, ?> options) throws IOException {
		if (!isLoaded) {
			IndexRow row = IndexUtil.INSTANCE.getIndex(ResourceUtil.idFrom(getURI().segments()));
			if (row == null) {
				return;
			}
			String fragmentXMI = row.getMetaData().getSingle(
					IndexConstants.COLUMN_FRAGMENT);
			if (fragmentXMI == null) {
				return;
			}
			
			ByteArrayInputStream inputStream = new ByteArrayInputStream(fragmentXMI.getBytes());
			setLoaded(true);
			doLoad(inputStream, options);
			inputStream.close();
			
			if (!getContents().isEmpty()) {
				for (URI fragmentDiagramURI : ReuseResources.INSTANCE.getDiagramURIs(getURI().segmentsList())) {
					Resource fragmentDiagramResource = null;
					try {
						fragmentDiagramResource = resourceSet.getResource(fragmentDiagramURI, true);
					} catch (Exception e) {
						//ok
					}
					if (fragmentDiagramResource != null) {
						Fragment fragment = (Fragment) getContents().get(0);
						fragment.getDiagrams().addAll(fragmentDiagramResource.getContents());
					}
				}
			}
		}
	}
	
	@Override
	public void save(Map<?, ?> options) throws IOException {
		// not supported
	}
}
