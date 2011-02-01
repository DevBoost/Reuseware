package org.reuseware.coconut.resource;

/**
 * Collects all interfaces that need to be implemented by a full
 * resource management system for Reuseware. It offers a default
 * implementation that delegates to the concrete registered 
 * implementation.
 */
public interface ReuseResources extends 
		ReuseResourceAccess,
		ReuseResourceDependencyCalculator, 
		FragmentCompositionInterfaceCreator {
	
	/**
	 * Extension point ID:
	 * <i>org.reuseware.coconut.resource.reuseResources</i>.
	 */
	String REUSE_RESOURCES_EP_ID = 
		"org.reuseware.coconut.resource.reuseResources";
	
	/**
	 * The reuse resources instance.
	 */
	ReuseResources INSTANCE = 
		new ReuseResourcesImpl();
	
	/**
	 * Initializes the resource management system with the given implementations.
	 * 
	 * @param reuseResourceAccess                 the access implementation
	 * @param resourceDependencyCalculator        the dependency calculator implementations
	 * @param fragmentCompositionInterfaceCreator the composition interface creator implementation
	 */
	void init(
			ReuseResourceAccess reuseResourceAccess,
			ReuseResourceDependencyCalculator resourceDependencyCalculator,
			FragmentCompositionInterfaceCreator fragmentCompositionInterfaceCreator);
	
	/**
	 * Shuts down the resource management system.
	 */
	void shutDown();
}