/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.comogen.fragment.dslbuilder.ui.eclipse.actions;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.commons.parse.problem.ParseProblem;
import org.eclipse.epsilon.egl.EglModule;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

// TODO Figure out correct usage of progress monitors
public class GenerateDSLComposerAction implements IObjectActionDelegate {

	private ISelection selection;

	/**
	 * Constructor for Action1.
	 */
	public GenerateDSLComposerAction() {
		super();
	}

	/**
	 * Calls {@link #process(IFile)} for all selected <i>ecore</i> files .
	 */
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			for (Iterator<?> i = ((IStructuredSelection) selection).iterator(); i
					.hasNext();) {
				Object o = i.next();
				if (o instanceof IFile) {
					IFile file = (IFile) o;
					if (file.getFileExtension().startsWith("ecore"))
						process(file);
				}
			}
		}
	}

	private void process(final IFile file) {
		try {

			IRunnableWithProgress runnable = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
					try {
						SubMonitor progress = SubMonitor.convert(monitor, 100);

						ResourceSet rs = new ResourceSetImpl();
						Resource ecoreResource = rs.getResource(org.eclipse.emf.common.util.URI
								.createPlatformResourceURI(file.getFullPath()
										.toString(), true), true);
						final EPackage epMetamodel = (EPackage) ecoreResource
								.getContents().get(0);
						String sPackageName = file.getProject().getName() + ".composer";
						String projectName = sPackageName;

						// create project
						IProject project = createProject(projectName, progress);
						
						// Generate the actual transformation...
						generateTransformation (epMetamodel, project, progress.newChild (20));

						// Setup plug-in configuration files
						configurePlugin (project, epMetamodel, projectName, progress);
						
						// Refresh project
						project.refreshLocal(IProject.DEPTH_INFINITE, progress
								.newChild(10));
					} 
					catch (IOException ioe) {
						ioe.printStackTrace();
					}
					catch (CoreException e) {
						throw new InvocationTargetException(e);
					}
				}

			};

			PlatformUI.getWorkbench().getProgressService().busyCursorWhile(
					runnable);
		} catch (InvocationTargetException e) {
			e.getTargetException().printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected void configurePlugin(IProject project, EPackage epMetamodel, String projectName, SubMonitor progress) throws IOException, CoreException {
		IFolder metaFolder = project.getFolder("/META-INF");
		IFile manifestMFFile = project
				.getFile("/META-INF/MANIFEST.MF");
		IFile pluginXMLFile = project
				.getFile("/plugin.xml");
		IFolder javaPackage = project.getFolder("src-gen");
		for(String packagePart : projectName.split("\\.")) {
			javaPackage = javaPackage.getFolder(packagePart);
			if (!javaPackage.exists()) {
				javaPackage.create(true, true, progress);
			}
		}
		IFile epsilonCallFile = javaPackage.getFile("/EpsilonBasedUpdateOperation.java");		
		
		if (!metaFolder.exists())
			metaFolder.create(true, true, progress.newChild(5));

		// Create MANIFEST.MF
		if (!manifestMFFile.exists()) {
			manifestMFFile.create(new ByteArrayInputStream(generateManifestMF(epMetamodel, projectName).getBytes()), true, progress.newChild(5));
		}

		// Create plugin.xml
		if (!pluginXMLFile.exists()) {
			pluginXMLFile.create(new ByteArrayInputStream(generatePluginXml(epMetamodel, projectName).getBytes()), true, progress.newChild(5));
		}
		
		// Create EpsilonBasedUpdateOperation.java
		if(!javaPackage.exists()) {
			javaPackage.create(true, true, null);
		}
		if (!epsilonCallFile.exists()) {
			epsilonCallFile.create(new ByteArrayInputStream(generateEpsilonCall(epMetamodel, projectName).getBytes()), true, progress.newChild(5));
		}
		
		//Create call
		
		// Copy over prepared build.properties file
		IFile targetBuildFile = project.getFile("/build.properties");
		InputStream isSourceBuildFile = FileLocator.openStream (Platform.getBundle("org.reuseware.comogen.ui.eclipse.dslbuilder"), 
				new Path("/files/build.properties"), false);
		if (!targetBuildFile.exists()) {
			targetBuildFile.create(isSourceBuildFile, true, progress.newChild(5));
		}
	}

	protected IProject createProject(String projectName, SubMonitor progress) throws CoreException {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);

		if (!project.exists()) {
			project.create(progress.newChild(10));
		}
		
		project.open(progress.newChild(10));
		
		IProjectDescription description = project.getDescription();
		description.setNatureIds (new String[] {JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature" });

		ICommand command1 = description.newCommand();
		command1.setBuilderName("org.eclipse.jdt.core.javabuilder");
		
		ICommand command2 = description.newCommand();
		command2.setBuilderName("org.eclipse.pde.ManifestBuilder");
		
		ICommand command3 = description.newCommand();
		command3.setBuilderName("org.eclipse.pde.SchemaBuilder");
		
		description.setBuildSpec(new ICommand[] { command1, command2, command3 });

		project.setDescription(description, null);
		
		IFolder srcFolder = project.getFolder("/src-gen");
		if (!srcFolder.exists()) {
			srcFolder.create(true, true, progress.newChild(5));
		}
		IFolder outFolder = project.getFolder("/bin");
		if (!outFolder.exists()) {
			outFolder.create(true, true, progress.newChild(5));
		}

		IJavaProject jp = JavaCore.create(project);

		jp.setRawClasspath(
						new IClasspathEntry[] {
								JavaCore.newSourceEntry(srcFolder.getFullPath()),
								JavaRuntime.getDefaultJREContainerEntry(),
								JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")) },
						outFolder.getFullPath(), progress.newChild(5));
		
		return project;
	}

	/**
	 * Generates the transformation to use to translate instances of an abstract DSL into Reuseware composition programs.
	 * 
	 * @param epMetamodel the metamodel for the abstract DSL
	 * @param project the target project currently being generated
	 * @param progress a progress monitor to reflect progress being made
	 * @throws CoreException thrown when file creation doesn't work
	 */
	protected void generateTransformation (EPackage epMetamodel, IProject project, SubMonitor progress) throws CoreException {
		// Code copied and adapted from Epsilon examples
		EglModule module = new EglModule();
		
		try {
			module.parse(getFile("transformations/ECore2Etl4Reuseware.egl"));
		
			if (module.getParseProblems().size() > 0) {
				System.err.println("Parse errors occured...");
				for (ParseProblem problem : module.getParseProblems()) {
					System.err.println(problem.toString());
				}
				throw new RuntimeException ("Parse Problems.");
			}
			
			//Code below copied and adjusted from Builder.java
			InMemoryEmfModel source = new InMemoryEmfModel ("ECore", epMetamodel.eResource(), EcorePackage.eINSTANCE);
			module.getContext().getModelRepository().addModel(source);

			module.execute();

			// Write generation result to file
			String sGenerated = module.getContext().getOutputBuffer().toString();
			
			IFolder transformationsFolder = project.getFolder("/transformations");
			IFile builderETLFile = project
					.getFile("/transformations/builder.etl");
			if (!transformationsFolder.exists())
				transformationsFolder.create(true, true, progress.newChild(5));

			if (builderETLFile.exists()) {
				builderETLFile.delete(true, null);
			}
			
			builderETLFile.create(new ByteArrayInputStream(sGenerated.getBytes()),
						true, progress.newChild(5));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		finally {
		  module.getContext().getModelRepository().dispose();
		}
	}

	protected URI getFile(String fileName) throws URISyntaxException {
		URI uri = FileLocator.find(Platform.getBundle("org.reuseware.comogen.ui.eclipse.dslbuilder"), 
				new Path(fileName), null).toURI();
		return uri;
	}

	private static String generateEpsilonCall(EPackage epMetamodel, String packageName) {
		StringBuffer s = new StringBuffer();


		s.append("package " + packageName + ";\n");
		s.append("\n");
		s.append("import org.eclipse.core.resources.ResourcesPlugin;\n");
		s.append("import org.eclipse.emf.common.util.URI;\n");
		s.append("import org.eclipse.emf.ecore.EObject;\n");
		s.append("import org.eclipse.emf.ecore.util.EcoreUtil;\n");
		s.append("import org.eclipse.epsilon.commons.util.StringProperties;\n");
		s.append("import org.eclipse.epsilon.emc.emf.EmfModel;\n");
		s.append("import org.eclipse.epsilon.eol.execute.context.Variable;\n");
		s.append("import org.eclipse.epsilon.etl.EtlModule;\n");
		s.append("import org.reuseware.coconut.compositionprogram.CompositionprogramFactory;\n");
		s.append("import org.reuseware.coconut.compositionprogram.CompositionprogramPackage;\n");
		s.append("import org.reuseware.coconut.compositionprogram.DerivedCompositionProgram;\n");
		s.append("import org.reuseware.coconut.compositionprogram.util.IDerivedCompositionProgramUpdateOperation;\n");
		s.append("import org.reuseware.coconut.fragment.Fragment;\n");
		s.append("import org.reuseware.coconut.repository.ID;\n");
		s.append("import org.reuseware.coconut.repository.resource.ReuseResources;\n");
		s.append("import org.reuseware.coconut.repository.util.IDUtil;\n");
		s.append("\n");
		s.append("public class EpsilonBasedUpdateOperation implements IDerivedCompositionProgramUpdateOperation {\n");
		s.append("\n");
		s.append("	public static final String fileExtension = \"" + epMetamodel.getName() + "\";\n");
		s.append("	public static final String nsURI = \"" + epMetamodel.getNsURI() + "\";\n");
		s.append("	\n");
		s.append("	public boolean canUpdate(Fragment fragment) {\n");
		s.append("		return fragment != null && fragment.getID() != null && fragment.getID().segment(-1).endsWith(\".\" + fileExtension);\n");
		s.append("	}\n");
		s.append("	\n");
		s.append("	public DerivedCompositionProgram update(Fragment fragment) {\n");
		s.append("		if (fragment == null || fragment.getID() == null) {\n");
		s.append("			return null;\n");
		s.append("		}\n");
		s.append("		\n");
		s.append("		DerivedCompositionProgram derivedCompositionProgram = null;\n");
		s.append("		ID cpID = fragment.getID().appendExtension(\"fc\");\n");
		s.append("		\n");
		s.append("		URI physicalFragmentURI = ReuseResources.INSTANCE.getResourceSet(\n");
		s.append("				).getURIConverter().normalize(IDUtil.idToURI(fragment.getID()));\n");
		s.append("		URI physicalCpURI = physicalFragmentURI.appendFileExtension(\"temp_fc\");\n");
		s.append("		\n");
		s.append("		if (!IDUtil.equals(physicalFragmentURI, fragment.getID())) {\n");
		s.append("			EtlModule module = new EtlModule();\n");
		s.append("			try {\n");
		s.append("				module.parse(this.getClass().getClassLoader().getResource(\"transformations/builder.etl\").toURI());\n");
		s.append("				EmfModel source = new EmfModel();\n");
		s.append("				StringProperties properties = new StringProperties();\n");
		s.append("				properties.put(EmfModel.PROPERTY_NAME, \"Source\");\n");
		s.append("				properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, \"false\");\n");
		s.append("				properties.put(EmfModel.PROPERTY_METAMODEL_URI, nsURI);\n");
		s.append("				properties.put(EmfModel.PROPERTY_MODEL_FILE, physicalFragmentURI.toPlatformString(true));\n");
		s.append("				properties.put(EmfModel.PROPERTY_READONLOAD, \"true\");\n");
		s.append("				properties.put(EmfModel.PROPERTY_STOREONDISPOSAL,\"false\");\n");
		s.append("				source.load(properties, ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toPortableString());\n");
		s.append("				module.getContext().getModelRepository().addModel(source);\n");
		s.append("				\n");
		s.append("				EmfModel fc = new EmfModel();\n");
		s.append("				properties = new StringProperties();\n");
		s.append("				properties.put(EmfModel.PROPERTY_NAME, \"Fc\");\n");
		s.append("				properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, \"false\");\n");
		s.append("				properties.put(EmfModel.PROPERTY_METAMODEL_URI, CompositionprogramPackage.eNS_URI);\n");
		s.append("				properties.put(EmfModel.PROPERTY_MODEL_FILE, physicalCpURI.toPlatformString(true));\n");
		s.append("				properties.put(EmfModel.PROPERTY_READONLOAD, \"false\");\n");
		s.append("				properties.put(EmfModel.PROPERTY_STOREONDISPOSAL,\"false\");\n");
		s.append("				fc.load(properties, ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toPortableString());\n");
		s.append("				\n");
		s.append("				module.getContext().getModelRepository().addModel(fc);\n");
		s.append("				\n");
		s.append("				ID targetUFI = fragment.getID(); //Reuseware will change the file extensions\n");
		s.append("				module.getContext().getFrameStack().put(Variable.createReadOnlyVariable(\"targetUFI\", targetUFI.getSegments()));\n");
		s.append("				\n");
		s.append("				module.execute();\n");
		s.append("				\n");
		s.append("				for(EObject result : fc.allContents()) {\n");
		s.append("					if(result instanceof DerivedCompositionProgram) {\n");
		s.append("						derivedCompositionProgram = (DerivedCompositionProgram) EcoreUtil.copy(result);\n");
		s.append("					}\n");
		s.append("				}\n");
		s.append("			}\n");
		s.append("			catch (Exception e) {\n");
		s.append("				e.printStackTrace();\n");
		s.append("			}\n");
		s.append("			finally {\n");
		s.append("				module.getContext().getModelRepository().dispose();\n");
		s.append("			}		}\n");
		s.append("\n");
		s.append("		if (derivedCompositionProgram == null) {\n");
		s.append("			derivedCompositionProgram = \n");
		s.append("				CompositionprogramFactory.eINSTANCE.createDerivedCompositionProgram();\n");
		s.append("		}\n");
		s.append("		derivedCompositionProgram.setID(cpID);\n");
		s.append("		\n");
		s.append("		return derivedCompositionProgram;\n");
		s.append("	}\n");
		s.append("}\n");

		return s.toString();
	}
	
	/**
	 * Generate the MANIFEST.MF file for the plugin
	 * 
	 * @param epMetamodel
	 *            the metamodel.
	 * @param packageName
	 *            Name of the Java package.
	 * @return Generated code.
	 */
	private static String generateManifestMF(EPackage epMetamodel,
			String packageName) {
		StringBuffer s = new StringBuffer();

		s.append("Manifest-Version: 1.0\n");
		s.append("Bundle-ManifestVersion: 2\n");
		s.append("Bundle-Name: Reuseware DSL Builder Plugin: "
				+ epMetamodel.getName() + "\n");
		s.append("Bundle-SymbolicName: " + packageName + ";singleton:=true\n");
		s.append("Bundle-Version: 1.0.0\n");
		s.append("Bundle-Vendor: Software Engineering Group - TU Dresden Germany\n");
		s.append("Bundle-RequiredExecutionEnvironment: J2SE-1.5\n");
		
		s.append("Require-Bundle: org.eclipse.core.runtime,\n");
		s.append(" org.eclipse.core.resources,\n");
		s.append(" org.eclipse.epsilon.etl.engine,\n");
		s.append(" org.eclipse.epsilon.emc.emf,\n");
		s.append(" org.eclipse.epsilon.eol.engine,\n");
		s.append(" org.eclipse.epsilon.erl.engine,\n");
		s.append(" org.reuseware.coconut.compositionprogram\n\n");

		return s.toString();
	}

	/**
	 * Generate the XML file describing the plugin.
	 * 
	 * @param epMetamodel
	 *            the metamodel.
	 * @param packageName
	 *            Name of the Java package.
	 * @return Generated code.
	 */
	private static String generatePluginXml(EPackage epMetamodel, String packageName) {
		StringBuffer s = new StringBuffer();

		s.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		s.append("<?eclipse version=\"3.2\"?>\n");
		s.append("<plugin>\n");

		// Register the generated transformation
		s.append("<extension point=\"org.reuseware.coconut.compositionprogram.derivedCompositionProgramUpdateOperation\">\n");
		s.append("<derivedCompositionProgramUpdateOperation\n");
		s.append("\tclass=\"" + packageName + ".EpsilonBasedUpdateOperation\">\n");
		s.append("\t</derivedCompositionProgramUpdateOperation>\n</extension>\n");

		s.append("\n<extension point=\"org.reuseware.coconut.resource.fragmentStores\">\n");
		s.append("<fragmentfiles\n");
		s.append("\textension=\"" + epMetamodel.getName() + "\"\n");
		s.append("\tdiagramExtension=\"" + epMetamodel.getName() + "_diagram\">\n");
		s.append("</fragmentfiles>\n</extension>\n");		
		s.append("</plugin>\n");

		return s.toString();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// this.part = targetPart;
	}

}
