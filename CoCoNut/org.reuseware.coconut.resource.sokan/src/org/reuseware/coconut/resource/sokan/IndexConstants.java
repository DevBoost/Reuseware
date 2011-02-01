package org.reuseware.coconut.resource.sokan;

import org.reuseware.coconut.resource.sokan.generators.ComposedFragmentsGenerator;
import org.reuseware.coconut.resource.sokan.generators.DerivedCompositionProgramGenerator;
import org.reuseware.coconut.resource.sokan.generators.FragmentCompositionInterfaceGenerator;
import org.reuseware.coconut.resource.sokan.indexer.CompositionProgramSourceIndexer;
import org.reuseware.coconut.resource.sokan.indexer.DiagramIndexer;
import org.reuseware.coconut.resource.sokan.indexer.ReuseResourceDependencyIndexer;
import org.reuseware.coconut.resource.sokan.indexer.RootEClassIndexer;

/**
 * Constants used by the indexers that manage reuse resources
 * in the Sokan index.
 */
public interface IndexConstants {
	
	/**
	 * ID of the RootEClassIndexer.
	 */
	String INDEXER_ROOT_ECLASS = 
		RootEClassIndexer.class.getCanonicalName();
	/**
	 * ID of the DiagramIndexer.
	 */
	String INDEXER_DIAGRAM = 
		DiagramIndexer.class.getCanonicalName();
	
	/**
	 * ID of the ReuseResourceDependencyIndexer.
	 */
	String INDEXER_REUSE_RESOURCES_DEPENDENCY = 
		ReuseResourceDependencyIndexer.class.getCanonicalName();
	
	/**
	 * ID of the CompositionProgramSourceIndexer.
	 */
	String INDEXER_COMPOSITION_PROGRAM_SOURCE = 
		CompositionProgramSourceIndexer.class.getCanonicalName();
	
	/**
	 * ID of the FragmentCompositionInterfaceGenerator.
	 */
	String GENERATOR_FRAGMENT_COMPOSITION_INTERFACE = 
		FragmentCompositionInterfaceGenerator.class.getCanonicalName();
	/**
	 * ID of the ComposedFragmentsGenerator.
	 */
	String GENERATOR_COMPOSED_FRAGMENTS = 
		ComposedFragmentsGenerator.class.getCanonicalName();
	/**
	 * ID of the DerivedCompositionProgramGenerator.
	 */
	String GENERATOR_DERIVED_COMPOSITION_PROGRAM = 
		DerivedCompositionProgramGenerator.class.getCanonicalName();

	/**
	 * Field/Column ID: <i>org.reuseware.coconut.resource.sokan.rootEClass</i>.
	 */
	String COLUMN_ROOT_ECLASS = 
		"org.reuseware.coconut.resource.sokan.rootEClass";
	/**
	 * Field/Column ID: <i>org.reuseware.coconut.resource.sokan.cmImplementedFragmentCollaboration</i>.
	 */
	String COLUMN_CM_IMPLEMENTED_FRAGMENT_COLLABORATION = 
		"org.reuseware.coconut.resource.sokan.cmImplementedFragmentCollaboration";
	/**
	 * Field/Column ID: <i>org.reuseware.coconut.resource.sokan.clImplementedFragmentCollaboration</i>.
	 */
	String COLUMN_CL_IMPLEMENTED_FRAGMENT_COLLABORATION = 
		"org.reuseware.coconut.resource.sokan.clImplementedFragmentCollaboration";
	/**
	 * Field/Column ID: <i>org.reuseware.coconut.resource.sokan.cmExtendedRootEClass</i>.
	 */
	String COLUMN_CM_EXTENDED_ROOT_ECLASS = 
		"org.reuseware.coconut.resource.sokan.cmExtendedRootEClass";
	/**
	 * Field/Column ID: <i>org.reuseware.coconut.resource.sokan.clExtendedRootEClass</i>.
	 */
	String COLUMN_CL_EXTENDED_ROOT_ECLASS = 
		"org.reuseware.coconut.resource.sokan.clExtendedRootEClass";
	/**
	 * Field/Column ID: <i>org.reuseware.coconut.resource.sokan.cmActivatedReuseExtension</i>.
	 */
	String COLUMN_CM_ACTIVATED_REUSE_EXTENSION = 
		"org.reuseware.coconut.resource.sokan.cmActivatedReuseExtension";
	/**
	 * Field/Column ID: <i>org.reuseware.coconut.resource.sokan.clActivatedReuseExtension</i>.
	 */
	String COLUMN_CL_ACTIVATED_REUSE_EXTENSION = 
		"org.reuseware.coconut.resource.sokan.clActivatedReuseExtension";
	/**
	 * Field/Column ID: <i>org.reuseware.coconut.resource.sokan.fragment</i>.
	 */
	String COLUMN_FRAGMENT = 
		"org.reuseware.coconut.resource.sokan.fragment";
	/**
	 * Field/Column ID: <i>org.reuseware.coconut.resource.sokan.instantiatedFragment</i>.
	 */
	String COLUMN_INSTANTIATED_FRAGMENT = 
		"org.reuseware.coconut.resource.sokan.instantiatedFragment";
	/**
	 * Field/Column ID: <i>org.reuseware.coconut.resource.sokan.composedFragment</i>.
	 */
	String COLUMN_COMPOSED_FRAGMENT = 
		"org.reuseware.coconut.resource.sokan.composedFragment";
	/**
	 * Field/Column ID: <i>org.reuseware.coconut.resource.sokan.derivedCompositionProgram</i>.
	 */
	String COLUMN_DERIVED_COMPOSITION_PROGRAM = 
		"org.reuseware.coconut.resource.sokan.derivedCompositionProgram";
	/**
	 * Field/Column ID: <i>org.reuseware.coconut.resource.sokan.diagramFor</i>.
	 */
	String COLUMN_DIAGRAM_FOR = 
		"org.reuseware.coconut.resource.sokan.diagramFor";

}
