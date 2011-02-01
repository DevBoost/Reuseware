package org.reuseware.air.comogen.output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.reuseware.air.comogen.util.MethodStruct;

public abstract class OutputGeneratorBase implements IOutputGenerator {
		
	public void setContent(String value, IFile file) throws IOException, CoreException{
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		PrintWriter writer = new PrintWriter(outStream);
		writer.print(value);
		writer.flush();
		writer.close();
		outStream.flush();
		outStream.close();
		InputStream in = new ByteArrayInputStream(outStream.toByteArray());
		setContent(in,file);
	}
	
	public static void setContent(InputStream value, IFile target) throws CoreException {
		if (target.exists()) {
			target.setContents(value, false, false, new NullProgressMonitor());
		} else {
			LinkedList<IResource> stack = new LinkedList<IResource>();
			if (!target.getParent().exists()) {
				stack.addFirst(target.getParent());
				while (!stack.isEmpty()) {
					if (!stack.peek().getParent().exists())
						stack.addFirst(stack.peek().getParent());
					else
						((IFolder) stack.removeFirst()).create(false, false,
								new NullProgressMonitor());
				}
			}
			target.create(value, false, new NullProgressMonitor());
		}
	}

	
	public List<String> extractSignatureStrings(List<MethodStruct> composerSignatures){
		List<String> composerNames = new LinkedList<String>(); 
		for (MethodStruct struct: composerSignatures) {
			composerNames.add(struct.getOrigName()); 
		}
		return composerNames;		
	}
	
	public IClasspathEntry getFirstSourceEntry(IJavaProject project) throws CoreException{
		IClasspathEntry[] cpe = project.getRawClasspath();
		IClasspathEntry sourcePath = null;
		for(int i=0;i<cpe.length;i++){
			IClasspathEntry current = cpe[i];
			if(current.getEntryKind()==IClasspathEntry.CPE_SOURCE){
				sourcePath = cpe[i];
				break;
			}
		}
		return sourcePath;
	}
	
	public IPackageFragment createBasePackage(IJavaProject project, String packageName) throws CoreException{
		IClasspathEntry cpe = this.getFirstSourceEntry(project);
		
		IPackageFragmentRoot rootPackage = project.findPackageFragmentRoot(cpe.getPath());
		IPackageFragment createdPackage = rootPackage.createPackageFragment(packageName,false,new NullProgressMonitor());
		
		return createdPackage;
	}


}
