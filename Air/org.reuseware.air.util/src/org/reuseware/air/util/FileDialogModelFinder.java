package org.reuseware.air.util;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;


public class FileDialogModelFinder implements IModelFinder {
    
    private FileDialog dialog;
    private ResourceSet modelResourceSet;
    
    public FileDialogModelFinder(ResourceSet modelResourcSet, Shell parentShell) {
        
        this.modelResourceSet = modelResourcSet;
        
        this.dialog = new FileDialog(parentShell, SWT.OPEN);
        
        dialog.setFilterExtensions(new String[]{"ecore"});
    }
    
    public EPackage findModel(String uri) {
        EPackage ePackage = null;
        
        ePackage = EPackage.Registry.INSTANCE.getEPackage(uri);
        
        if (ePackage == null) {
            dialog.setFileName(uri.substring(uri.lastIndexOf("/") + 1));
            dialog.setText("Locate '" + uri.substring(uri.lastIndexOf("/") + 1) + "'");
            String modelFile = dialog.open();
            
            if (modelFile != null) {
                URI xmiFile = URI.createFileURI(modelFile);
                Resource r = modelResourceSet.createResource(xmiFile);
                try {
                    r.load(null);
                    if (!r.getContents().isEmpty()) {
                        ePackage = (EPackage) r.getContents().get(0);
                    }
                    EPackage.Registry.INSTANCE.put(uri, ePackage);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return ePackage;
    }

}
