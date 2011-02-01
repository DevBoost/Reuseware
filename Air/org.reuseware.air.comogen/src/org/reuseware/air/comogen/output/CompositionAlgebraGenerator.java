package org.reuseware.air.comogen.output;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.reuseware.air.comogen.ICompositionSystemContext;

public class CompositionAlgebraGenerator extends TemplateGenerator{

	public static String ALGEBRA_FILE = "algebra.stg";
	
	protected void doGenerate(IJavaProject project, ICompositionSystemContext systemContext) throws IOException, CoreException {
		generateComponentModelAlgebra(project,systemContext);
	}
	
	/**
	 * Generates algebra for component model (actually, composition system) 
	 * 
	 * @param project
	 * @param baseDir
	 * @param base The base language name
	 * @param reuse The reuse language name 
	 * @param baseTypes
	 * @param reuseTypes 
	 * @throws IOException 
	 * @throws CoreException 
	 */
	private void generateComponentModelAlgebra(IJavaProject project, ICompositionSystemContext context) throws IOException, CoreException {

		StringTemplateGroup templates = this.initialiseTemplateGroup(ALGEBRA_FILE);
				
		IClasspathEntry cpe = this.getFirstSourceEntry(project);	
		
		IPackageFragmentRoot rootPackage = project.findPackageFragmentRoot(cpe.getPath());
		IPackageFragment algebraPackage = rootPackage.createPackageFragment(context.getAlgebraPackage(),false,new NullProgressMonitor());

		StringTemplate template;
	
		/**
		 * Fragment
		 */
		template = templates.getInstanceOf("fragment");
		super.setTemplateAttributes(template);
		algebraPackage.createCompilationUnit("I"+cap(context.getBaseLanguageName())+"Fragment.java",template.toString(),false,new NullProgressMonitor());

		/**
		 * Visitor
		 */
		template = templates.getInstanceOf("visitor");
		setTemplateAttributes(template);
		
		algebraPackage.createCompilationUnit(cap(context.getBaseLanguageName()) + "Visitor.java",template.toString(),false,new NullProgressMonitor());

		/**
		 * Algebra 
		 */
		template = templates.getInstanceOf("algebra");
		setTemplateAttributes(template);
		
		algebraPackage.createCompilationUnit(cap(context.getBaseLanguageName())+"Algebra.java",template.toString(),false,new NullProgressMonitor());
	}
	
	public void initialiseTemplateParameters(ICompositionSystemContext context){
		super.initialiseTemplateParameters(context);
		super.putTemplateAttribute("baseTypes",context.getBaseLanguageFragmentTypeNames());
		super.putTemplateAttribute("reuseTypes",context.getReuseLanguageFragmentTypeNames());
		List<String> fragmentTypeNames = new LinkedList<String>();
		fragmentTypeNames.addAll(context.getBaseLanguageFragmentTypeNames());
		fragmentTypeNames.addAll(context.getReuseLanguageFragmentTypeNames());
		super.putTemplateAttribute("types",fragmentTypeNames);
	}

}
