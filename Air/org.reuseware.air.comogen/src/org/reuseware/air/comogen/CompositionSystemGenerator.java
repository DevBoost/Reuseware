package org.reuseware.air.comogen;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.reuseware.air.comogen.output.ComponentModelGenerator;
import org.reuseware.air.comogen.output.CompositionAlgebraGenerator;
import org.reuseware.air.comogen.output.InfrastructureGenerator;
import org.reuseware.air.comogen.output.IOutputGenerator;

import org.eclipse.emf.search.genmodel.helper.builder.GenModelTextualModelSearchQueryBuilderHelper;
import org.eclipse.emf.search.ui.scope.ModelSearchWorkspaceScopeFactory;
import org.eclipse.emf.search.core.engine.IModelSearchQuery;
import org.eclipse.emf.search.core.results.IModelResultEntry;
import org.eclipse.emf.search.core.scope.IModelSearchScope;

public class CompositionSystemGenerator {

	public static void processLanguageExtension(IExtensionContext extensionContext){
		LanguageExtensionGenerator gen = new LanguageExtensionGenerator();
		gen.process(extensionContext);
	}
	
	public static void generateEcoreFile(IExtensionContext context) throws IOException{
	    ResourceSet rs = context.getResourceSet();
	    Resource resource = rs.createResource(context.getExtensionTargetURL());
	    resource.getContents().add(context.getExtensionLanguagePackage());
	    resource.save(Collections.EMPTY_MAP);
	}
	
	public static void processProjectInfrastructure(IJavaProject project, ICompositionSystemContext systemContext, IExtensionContext extensionContext) throws IOException, CoreException{
		IOutputGenerator gen = new InfrastructureGenerator();
		gen.generate(project, systemContext);
	}
	
	public static void processCompositionAlgebra(IJavaProject project, ICompositionSystemContext systemContext) throws IOException, CoreException{
		IOutputGenerator gen = new CompositionAlgebraGenerator();
		gen.generate(project, systemContext);
	}

	public static void processComponentModel(IJavaProject project, ICompositionSystemContext systemContext) throws IOException, CoreException {
		IOutputGenerator gen = new ComponentModelGenerator();
		gen.generate(project,systemContext);
	}
	
	public static void processAll(ICompositionSystemContext systemContext, IExtensionContext extensionContext) throws CoreException, IOException{
		processLanguageExtension(extensionContext);
		generateEcoreFile(extensionContext);
		GenModel genModel = CompositionSystemGenerator.getGenModel(extensionContext);
	//	generateModelCode(genModel,new BasicMonitor());
		IJavaProject project = createComponentModelProject(systemContext.getBaseLanguageBasePackageName());
		processProjectInfrastructure(project,systemContext,extensionContext);
		processComponentModel(project,systemContext);
		processCompositionAlgebra(project,systemContext);
	}
	
		
	/**
	  * Generates the code
	  * 
	  * @param languageName Name of the language.
	  * @param ePackage The core-model package.
	  * @param monitor
	  */
	public static void generateModelCode(GenModel genModel, Monitor monitor) {
	    if (genModel == null)
			return;

		genModel.setCanGenerate(true);
		genModel.reconcile();
		Generator generator = new Generator();
		generator.setInput(genModel);
		generator.generate(genModel,
		GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, monitor);
	 }
	    
	private static GenModel getGenModel(IExtensionContext context) throws IOException{
		GenModel genModel = findGenModel(context.getExtensionLanguagePackage());
		if(genModel==null)
			genModel = createGenModel(context);
		return genModel;
	}
	    
	public static GenModel findGenModel(EPackage ePackage){
		GenModelTextualModelSearchQueryBuilderHelper helper = new GenModelTextualModelSearchQueryBuilderHelper();
		IModelSearchScope scope = 
			ModelSearchWorkspaceScopeFactory.getInstance().
			createModelSearchWorkspaceScope(
					"org.eclipse.emf.search.genModelSearchEngine"
			);

		IModelSearchQuery query = helper.buildGlobalCaseSensitiveModelSearchQuery(ePackage.getNsURI(),scope,ePackage.getNsURI());
		query.run(new NullProgressMonitor());
		for(IModelResultEntry result:query.getModelSearchResult().getResultsFlatenned()){
			if(result.getSource() instanceof GenModel){
				return (GenModel)result;
			}
		}
		return null;
	}

	public static GenModel createGenModel(IExtensionContext context) throws IOException {
		EPackage ePackage = context.getExtensionLanguagePackage();
		String languageName = ePackage.getName();

		// the generator Model
		String pluginBasePath = "/" + ePackage.getNsPrefix() +"." + languageName ;
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.setModelDirectory(pluginBasePath +"/src");
		genModel.setModelName(languageName);
		genModel.setImporterID("org.eclipse.emf.importer.java");
		genModel.setModelPluginID(ePackage.getNsPrefix()+"." + languageName.toLowerCase());
		genModel.setBundleManifest(true);

		genModel.setSuppressGenModelAnnotations(true); 

		// the GenModel Package
		GenPackage genPackage = genModel.createGenPackage();
		genModel.getGenPackages().add(genPackage);
		genPackage.setDisposableProviderFactory(true);
		genPackage.setPrefix(languageName.substring(0,1).toUpperCase() + languageName.substring(1));
		genPackage.setBasePackage(ePackage.getNsPrefix()); 
		genPackage.setEcorePackage(ePackage);
		genPackage.initialize(ePackage);

		// for generating annotations ?
		genPackage.setLoadInitialization(false);  
		genPackage.getNestedGenPackages();
		
		ResourceSet rs = context.getResourceSet();		
	    Resource genResource = rs.createResource(context.getExtensionGenModelTargetURL());
	    genResource.getContents().add(genModel);
	    genResource.save(Collections.emptyMap());
		
		return genModel;        
	}
	
	/**
	 * Create a Java project for the component model 
	 * @throws CoreException 
	 */
	public static IJavaProject createComponentModelProject(String baseLanguagePackage) throws CoreException {
		String projectName = baseLanguagePackage + "." + "cm"; 

		IProject project = 
			ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);

		if (!project.exists()) {
			project.create(new NullProgressMonitor());
		}

		project.open(new NullProgressMonitor());
		IProjectDescription description = project.getDescription();
		description.setNatureIds(new String[] { JavaCore.NATURE_ID,
		"org.eclipse.pde.PluginNature" });
		ICommand command1 = description.newCommand();
		command1.setBuilderName("org.eclipse.jdt.core.javabuilder");
		ICommand command2 = description.newCommand();
		command2.setBuilderName("org.eclipse.pde.ManifestBuilder");
		ICommand command3 = description.newCommand();
		command3.setBuilderName("org.eclipse.pde.SchemaBuilder");
		description
		.setBuildSpec(new ICommand[] { command1, command2, command3 });
		project.setDescription(description, null);
		
		IFolder srcFolder = project.getFolder("/src");
		IFolder outFolder = project.getFolder("/bin");
		if(!srcFolder.exists())
			srcFolder.create(false,false,new NullProgressMonitor());
		if(!outFolder.exists())
			outFolder.create(false,false,new NullProgressMonitor());
		
		IJavaProject jp = JavaCore.create(project);
			
		jp.setRawClasspath(new IClasspathEntry [] {
				JavaCore.newSourceEntry(srcFolder.getFullPath()), 
				JavaRuntime.getJREVariableEntry(), 
				JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins"))},
				outFolder.getFullPath(), new NullProgressMonitor());

		return jp; 
	}

}
