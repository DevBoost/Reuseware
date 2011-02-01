package org.reuseware.air.algebra.fragment;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@Deprecated
public class FragmentSystem {

	// use this grammar if no other is given
	private String defaultGrammar = "no default grammar given";

	// fragment folder
	private String fragmentsFolder = null;

	// private IResource workspaceFragmentsFolder = null;

	private FragmentSystem() {

	}

	private static class SingletonHolder {
		private final static FragmentSystem __INSTANCE = new FragmentSystem();
	}

	public static FragmentSystem getInstance() {

		return SingletonHolder.__INSTANCE;
	}

	/**
	 * Sets the default grammar
	 * 
	 * @param grammar
	 */
	public void setGrammar(String grammar) {
		this.defaultGrammar = grammar;
	}

	/**
	 * Gets the default grammar
	 * 
	 * @return
	 */
	public String getGrammar() {
		return defaultGrammar;
	}

	/**
	 * Loads a fragment using the default grammar
	 * 
	 * @param fragment
	 * @param type
	 * @param file
	 * @return
	 */
	public List<EObject> load(String type, String file) {

		try {
			// System.out.println("T: " + type + ", G: " + getGrammar() +
			// ", F: " + file);
			return load(type, getGrammar(), file);

		} catch (FileNotFoundException e) {

			System.err.println("File not found: " + e.getMessage());
		}

		return null;
	}

	/**
	 * 
	 * Loads a fragment
	 * 
	 * @param fragment
	 *            Location of fragment, or the fragment content directly
	 * @param type
	 *            The type of fragment
	 * @param grammar
	 * @param fragmentsFolder
	 * @param fragment
	 * @return
	 * @throws CoreException
	 */
	public List<EObject> load(String type, String grammar, String fragment)
			throws FileNotFoundException {

		FragmentRetriever fr = FragmentRetriever.getInstance();

		List<EObject> result = null;

		if (fragment.startsWith("file:"))
			result = fr.loadFragmentFromLocation(grammar, type,
					fragmentsFolder, fragment);
		else
			result = fr.loadFragmentFromString(grammar, type, fragment);

		// TODO: check that we are loading the correct type!
		if (result.size() > 0
				&& (result.get(0).eClass().toString().compareToIgnoreCase(type) != 0)) {

			// System.out.println("TYPE: " + type);
			// System.out.println("CLASS: " +
			// result.get(0).eClass().toString());

			return result;
		}

		if (fragment.startsWith("file:"))
			System.err.println("Fragments in file '" + fragment
					+ "' is not of type '" + type + "'.");
		else
			System.err.println("Fragment '" + fragment + "' is not of type '"
					+ type + "'.");

		return null;
	}

	/**
	 * 
	 * @param folder
	 */
	public void setFragmentsFolder(String folder) {

		// use a workspace folder
		// if (folder.startsWith("workspace:")) {
		//			
		// String path = folder.substring("workspace:".length());
		//			
		// IWorkspace ws = ResourcesPlugin.getWorkspace();
		// IProject ps = ws.getRoot().getProject(path);
		//			
		// fragmentsFolder = null;
		// workspaceFragmentsFolder = ps;
		//			
		// } else {

		fragmentsFolder = folder;
		// workspaceFragmentsFolder = null;
		// }

		return;
	}

	public String getFragmentsFolder() {
		return fragmentsFolder;
	}

	/**
	 * Prints a fragment
	 * 
	 * @param fragment
	 * @param file
	 */
	public void print(List<EObject> fragments, String file) {

		if (fragments != null) {

			ResourceSet resourceSet = new ResourceSetImpl();
			Resource target = resourceSet.getResource(URI
					.createPlatformResourceURI(file, true), true);
			target.getContents().addAll(fragments);
			try {
				target.save(Collections.emptyMap());
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

}
