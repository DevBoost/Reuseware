package org.reuseware.air.comogen.output;


import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaModelException;
import org.reuseware.air.comogen.ICompositionSystemContext;


public class ComponentModelGenerator extends TemplateGenerator implements IOutputGenerator {
	
	public static final String INTERFACE_STRING_TEMPLATE = "interface.stg";
	public static final String WRAPPER_STRING_TEMPLATE = "wrapper.stg";
	public static final String COMPOSERS_STRING_TEMPLATE = "composers.stg";
	
	//final private String packageBase = "org.reuseware.air.language"; 
	
	protected void doGenerate(IJavaProject project,ICompositionSystemContext systemContext) 
				throws IOException,CoreException {
		//Generate component model types
		generateComponentModelTypes(project,systemContext);

		//Generate wrapper utility for composition system 
		generateComponentModelWrapper(project,systemContext); 
			
		//Generate default composers 
		generateCompositionSystemComposers(project,systemContext); 
	}
	

	/**
	 * Generates types for component model (interfaces and their implementations) 
	 * 
	 * @param project
	 * @param baseDir
	 * @param base The base language name
	 * @param reuse The reuse language name 
	 * @param types
	 * @throws IOException 
	 * @throws CoreException 
	 */
	private void generateComponentModelTypes(IJavaProject project,ICompositionSystemContext context) throws IOException, CoreException {

		StringTemplateGroup templates = this.initialiseTemplateGroup(INTERFACE_STRING_TEMPLATE);
		IPackageFragment interfacePackage = this.createBasePackage(project,context.getFragmentInterfacePackage());
		IPackageFragment implPackage = this.createBasePackage(project,context.getFragmentInterfaceImplementationPackage());

		List<String> types = new LinkedList<String>();
		types.addAll(context.getBaseLanguageFragmentTypeNames());
		types.addAll(context.getReuseLanguageFragmentTypeNames());
		for (String type : types) {
			// generate the interface
			generateComponentModelTypesInterfaces(templates,interfacePackage,type,context);  

			// generate the interface implementation 
			generateComponentModelTypesImplementations(templates,implPackage,type,context); 
		}
	}

	/**
	 * 
	 * @param templates 
	 * @param dir The directory where the interfaces will be generated  
	 * @param base The base language name
	 * @param type
	 * @throws IOException 
	 * @throws CoreException 
	 */
	private void generateComponentModelTypesInterfaces(StringTemplateGroup templates,
			IPackageFragment interfacePackage, String type, ICompositionSystemContext context) 
				throws IOException, CoreException {

		StringTemplate template = templates.getInstanceOf("interface");
		setTemplateAttributes(template);
		template.setAttribute("type", type);  

		interfacePackage.createCompilationUnit("I" + type + ".java",template.toString(),false,new NullProgressMonitor());
	}


	/**
	 * 
	 * @param templates
	 * @param dir The directory where the interface implementations will be generated  
	 * @param base The base language name
	 * @param type
	 * @throws IOException
	 * @throws CoreException 
	 */
	private void generateComponentModelTypesImplementations(StringTemplateGroup templates, 
			IPackageFragment implPackage, String type, ICompositionSystemContext context) 
	throws IOException, JavaModelException
	{
		StringTemplate template = templates.getInstanceOf("interfaceImpl");
		setTemplateAttributes(template);
		template.setAttribute("type", type);  

		implPackage.createCompilationUnit("I" + type + "Impl.java",template.toString(),false,new NullProgressMonitor());
	}

	/**
	 * Generates types for component model (interfaces and their implementations) 
	 * 
	 * @param project
	 * @param context
	 * @throws IOException 
	 * @throws CoreException 
	 */
	private void generateComponentModelWrapper(IJavaProject project, ICompositionSystemContext context) throws IOException, CoreException{
			
			StringTemplateGroup templates = this.initialiseTemplateGroup(WRAPPER_STRING_TEMPLATE);
			IPackageFragment utilPackage = this.createBasePackage(project,context.getUtilityPackage());

			StringTemplate template = templates.getInstanceOf("wrapper");
			setTemplateAttributes(template);
			
			utilPackage.createCompilationUnit("ComposerWrapper.java",template.toString(),false,new NullProgressMonitor());
	}

	/**
	 * 
	 * @param project
	 * @param context
	 * @throws IOException 
	 * @throws CoreException 
	 */
	private void generateCompositionSystemComposers(IJavaProject project, ICompositionSystemContext context) throws IOException, CoreException {

		StringTemplateGroup templates = this.initialiseTemplateGroup(COMPOSERS_STRING_TEMPLATE);
		IPackageFragment composerPackage = this.createBasePackage(project,context.getComposerPackage());
		
		StringTemplate template = templates.getInstanceOf("composers");
		setTemplateAttributes(template);
		
		composerPackage.createCompilationUnit("Composers.java",template.toString(),false,new NullProgressMonitor());
	}
	
	public void initialiseTemplateParameters(ICompositionSystemContext context){
		super.initialiseTemplateParameters(context);
		super.putTemplateAttribute("baseTypes",context.getBaseLanguageFragmentTypeNames());
		super.putTemplateAttribute("reuseTypes",context.getReuseLanguageFragmentTypeNames());
		super.putTemplateAttribute("signatures",context.getComposerSignature()); 
	}


}
