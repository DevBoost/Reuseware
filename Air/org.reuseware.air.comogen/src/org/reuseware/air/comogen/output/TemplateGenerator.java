package org.reuseware.air.comogen.output;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.antlr.stringtemplate.AttributeRenderer;
import org.antlr.stringtemplate.StringTemplate;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.osgi.framework.Bundle;
import org.reuseware.air.comogen.ICompositionSystemContext;
import org.reuseware.air.comogen.plugin.Activator;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

/**
 * Template generators use string templates to generate file system output.
 * 
 * @author skarol
 *
 */

public abstract class TemplateGenerator extends OutputGeneratorBase implements IOutputGenerator{
	
	public static final String baseLanguagePrefix = "b_";
	public static final String reuseLanguagePrefix = "r_"; 
	
	public static final String templateDirectory = "/templates/";
	private Map<String,Object> templateAttributes = null;
	
	/**
	 * Text formatter
	 * 
	 * @author b0kaj
	 *
	 */
	public class BasicFormatRenderer implements AttributeRenderer {
		public String toString(Object o) {
			return o.toString();
		}
		public String toString(Object o, String formatName) {
			if (formatName.equals("toUpper")) {
				return o.toString().toUpperCase();
			} else if (formatName.equals("toLower")) {
				return o.toString().toLowerCase();
			} else if (formatName.equals("capitalize")) {
				return cap(o.toString()); 
			} else if (formatName.equals("firstlowercase")) {
				return cup(o.toString()); 
			} 
			else {
				throw new IllegalArgumentException("Unsupported format name");
			}
		}
	}
	
	
	public TemplateGenerator(){
		templateAttributes = new HashMap<String,Object>();
	}
	
	public void generate(IJavaProject project, ICompositionSystemContext systemContext) throws IOException, CoreException {
		initialiseTemplateParameters(systemContext);
		doGenerate(project,systemContext);
	}
	
	protected abstract void doGenerate(IJavaProject project, ICompositionSystemContext systemContext)throws IOException, CoreException;
	
	/**
	 * Capitalize a string (upper-case first letter)
	 * 
	 * @param str
	 * @return
	 */
	public String cap(String str) {
		return str.toString().substring(0, 1).toUpperCase() +
		str.toString().substring(1); 
	}

	/**
	 * Make sure that the first letter in a string is lower case  
	 * 
	 * @param str
	 * @return
	 */
	public String cup(String str) {
		return str.substring(0,1).toLowerCase() + str.substring(1); 
	}
	
	public StringTemplateGroup initialiseTemplateGroup(String templateName)throws IOException{
		Bundle bundle = Activator.getDefault().getBundle(); 
		IPath path = new Path(templateDirectory+templateName);
		InputStream inStream = FileLocator.openStream(bundle,path,false);
		
		// load the StringTemplate template 
		StringTemplateGroup templates = 
			new StringTemplateGroup(new BufferedReader(new InputStreamReader(inStream)),  
					AngleBracketTemplateLexer.class); 
	
		// allow some more formatting on strings 
		templates.registerRenderer(String.class, new BasicFormatRenderer());
		return templates;
	}
	
	public void initialiseTemplateParameters(ICompositionSystemContext context){
		putTemplateAttribute("baselanguage", context.getBaseLanguageName());
		putTemplateAttribute("reuselanguage",context.getReuseLanguageName());
		putTemplateAttribute("baselanguagepackage",context.getBaseLanguageBasePackageName());
		putTemplateAttribute("reuselanguagepackage",context.getReuseLanguageBasePackageName());
		putTemplateAttribute("algebrapackage",context.getAlgebraPackage());
		putTemplateAttribute("composerpackage",context.getComposerPackage());
		putTemplateAttribute("fragmentpackage",context.getFragmentInterfacePackage());
		putTemplateAttribute("fragmentimplpackage",context.getFragmentInterfaceImplementationPackage());
		putTemplateAttribute("pluginpackage",context.getActivatorPackage());
		putTemplateAttribute("utilitypackage",context.getUtilityPackage());
	}
	
	protected final void putTemplateAttribute(String key,Object value){
		if(key==null||value==null)
			throw new IllegalArgumentException();
		templateAttributes.put(key, value);
	}
	
	@SuppressWarnings("unchecked")
	public final void setTemplateAttributes(StringTemplate template){
		Map neededAttributes = template.getFormalArguments();
		for(Object name:neededAttributes.keySet()){
			template.setAttribute((String)name,templateAttributes.get(name));
		}	
	}
}
