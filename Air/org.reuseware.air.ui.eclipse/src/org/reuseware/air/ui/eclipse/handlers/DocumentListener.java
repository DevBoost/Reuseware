package org.reuseware.air.ui.eclipse.handlers;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;

public class DocumentListener implements IDocumentListener {

	private String fsVariableName = null;
	private String fsGrammar = null;
	private String fsFragmentsLocation = null;
	
	// key: variable name, value: variable type 
	private Hashtable<String,String> variables =
		new Hashtable<String,String>();
	
	public void documentAboutToBeChanged(DocumentEvent event) {
		// TODO Auto-generated method stub

	}
	
	public void documentChanged(DocumentEvent event) {

		System.out.println("Document changed");

		IDocument document = event.getDocument();
		
		// creation of DOM/AST from a ICompilationUnit
		ASTParser parser = ASTParser.newParser(AST.JLS3);
		// set the source as the contents of the document 
		parser.setSource(document.get().toCharArray()); 
		CompilationUnit astRoot = (CompilationUnit) parser.createAST(null); 

		// visitor 
		astRoot.accept(new ASTVisitor() {
			
			public boolean visit(VariableDeclarationFragment inv) {
				
				if (inv.getParent() instanceof VariableDeclarationStatement) {
					
					VariableDeclarationStatement var = 
						(VariableDeclarationStatement) inv.getParent();
					
					String type = var.getType().toString();
					
					if (type.equals("FragmentSystem")) { 
						
						fsVariableName = inv.getName().toString(); 
						
					} else {
						
						// store all other variable declarations 
						variables.put(inv.getName().toString(), type);  
					}
					
				}
				
				return false;
			}

			public boolean visit(MethodInvocation inv) { 
				if (inv.getExpression() instanceof SimpleName) {

					SimpleName name = (SimpleName) inv.getExpression(); 

					// check if we have set properties on the fragment system 
					// if so, save the information 
					if (name.toString().equals(fsVariableName)) {

						if (inv.getName().toString().equals("setGrammar")) {

							Expression expr = (Expression)inv.arguments().get(0);
							if (expr != null)
								fsGrammar = expr.toString();
						}
						else if (inv.getName().toString().equals("setFragmentsFolder")) {

							Expression expr = (Expression)inv.arguments().get(0);
							if (expr != null)
								fsFragmentsLocation = expr.toString();
						}
					}
				}

				// only type check bind statements if required properties 
				// of the fragment system are set 
				if (fsGrammar != null && fsFragmentsLocation != null) {

					if (inv.getName().toString().equals("bind")) {

						System.out.print("BIND called, with: "); 

						List<Expression> args = inv.arguments();
						for (Expression arg : args) {
							System.out.print(arg.toString() + ", ");
						}
						System.out.println();
						
						System.out.println("GRA: " + fsGrammar);
						System.out.println("LOC: " + fsFragmentsLocation); 
						
						// check the bind statement 
						System.out.println("CALL");
						typeCheckBindStatement(fsGrammar, fsFragmentsLocation, 
								inv.getExpression().toString(),
								args.get(0).toString(), args.get(1).toString());
						System.out.println("BACK"); 
					}
				}

				return false; 
			}
		});
		
		System.out.println("STA: " + variables.size());
		Enumeration<String> en = variables.keys();
		while (en.hasMoreElements()) {
			String s = en.nextElement();
			System.out.println("VAR: (" + s + "," + variables.get(s) + ")");
		}
			
	}
	
	/**
	 * 
	 * @param fsGrammar
	 * @param fsFragmentsLocation
	 * @param fragmentName
	 * @param slotName
	 * @param valueFragmentName
	 */
	private void typeCheckBindStatement(String fsGrammar, String fsFragmentsLocation,
					String fragmentName, String slotName, String valueFragmentName) 
	
	{

		/**
		 * Needed (to parse):  
		 * 	1) Grammar					(from FragmentSystem)
		 *  2) Fragments location		(from FragmentSystem)
		 *  3) Fragments type			(from Hashtable + name convention) 
		 * Needed (to type check): 
		 *  4) Slot name 				(from bind statement)
		 *  5) Value fragment type 		(from Hashtable + name convention)
		 * 
		 */
		
		System.out.println("==");
		System.out.println("GRA: " + fsGrammar);
		System.out.println("LOC: " + fsFragmentsLocation);
		System.out.println("TYP(F): " + variables.get(fragmentName).substring(1));
		System.out.println("SLOT: " + slotName.substring(1, slotName.length() - 1)); 
		System.out.println("TYP(V): " + variables.get(valueFragmentName).substring(1)); 
		System.out.println("==");
		
		
	}

}
