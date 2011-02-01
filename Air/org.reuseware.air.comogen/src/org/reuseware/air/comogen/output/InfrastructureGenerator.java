package org.reuseware.air.comogen.output;

import java.io.IOException;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.core.runtime.CoreException;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.reuseware.air.comogen.ICompositionSystemContext;

/**
 * Responsible for generating all the meta files for the component model plugin.  
 * Essentially, the MANIFEST.MF and plugin.xml files.  
 */
public class InfrastructureGenerator extends TemplateGenerator implements IOutputGenerator{
	
	public static String ACTIVATOR_STRING_TEMPLATE = "activator.stg";
	public static String ACTIVATOR_FILE = "%pck/plugin/Activator.java";
	
	public static String MANIFEST_STRING_TEMPLATE = "manifest.stg";
	public static String MANIFEST_FILE = "/META-INF/MANIFEST.MF";
	
	public static String PLUGIN_STRING_TEMPLATE = "plugin.stg";
	public static String PLUGIN_FILE = "/plugin.xml";
	
	
	/**
	 * Generates activator file for the component model plugin 
	 * 
	 * @param project
	 * @param baseDir
	 * @param base
	 * @throws IOException
	 * @throws CoreException 
	 */
	private void generateActivatorFile(IJavaProject project, ICompositionSystemContext context) throws IOException, CoreException
	{
		StringTemplateGroup templates = initialiseTemplateGroup(ACTIVATOR_STRING_TEMPLATE);
		
		IClasspathEntry cpe = this.getFirstSourceEntry(project);
		
		IPackageFragmentRoot rootPackage = project.findPackageFragmentRoot(cpe.getPath());
		IPackageFragment activatorPackage = rootPackage.createPackageFragment(context.getActivatorPackage(),false,new NullProgressMonitor());
	
		StringTemplate template = templates.getInstanceOf("activator");
		setTemplateAttributes(template);
		
		activatorPackage.createCompilationUnit("Activator.java",template.toString(),false,new NullProgressMonitor());
		return; 
	}

	/**
	 * Generates MANIFEST.MF file for component model.
	 * 
	 * @param project
	 * @param base
	 * @param reuse
	 * @throws CoreException 
	 */
	private void generateManifestFile(IProject project, ICompositionSystemContext context) throws IOException, CoreException 
	{
	
		StringTemplateGroup templates = this.initialiseTemplateGroup("manifest.stg");

		StringTemplate template = templates.getInstanceOf("manifest");
		setTemplateAttributes(template);
		String instanciatedValue = template.toString();
		IFile file = project.getFile(MANIFEST_FILE);
		
		setContent(instanciatedValue,file);
	}


	/**
	 * Generates plugin.xml file for component model package. 
	 * 
	 * @param project
	 * @param baseDir
	 * @param base
	 * @param reuse
	 * @param composers
	 * @throws IOException
	 * @throws CoreException 
	 */
	private void generatePluginFile(IProject project, ICompositionSystemContext context) 
		throws IOException, CoreException 
	{
		StringTemplateGroup templates = this.initialiseTemplateGroup("plugin.stg");
	
		StringTemplate template = templates.getInstanceOf("xmlplugin"); 
		setTemplateAttributes(template);
		
		IFile file = project.getProject().getFile(PLUGIN_FILE);
		String instanciationString = template.toString();
		setContent(instanciationString,file);
	}
	
	public void initialiseTemplateParameters(ICompositionSystemContext context){
		super.initialiseTemplateParameters(context);
		putTemplateAttribute("reuselanguagens",context.getReuseLanguagePackage().getNsURI());
		putTemplateAttribute("composers", extractSignatureStrings(context.getComposerSignature()));
	}
	
	protected void doGenerate(IJavaProject project, ICompositionSystemContext systemContext) throws IOException, CoreException {
		generateActivatorFile(project,systemContext); 
		generateManifestFile(project.getProject(),systemContext);  
		generatePluginFile(project.getProject(), systemContext); 
	}
	
}
