componentmodel composition_system.import.java_component_model
implements composition_system.import
epackages <http://www.emftext.org/java>       // URI of the Java Metamodel
rootclass java::containers::CompilationUnit { // Root element of every Java file

	fragment role ImportingModel {
		port type ImportStatement {
			java::statements::JumpLabel is hook {
		    	port = $name$
		    	remove = $true$
		  	}
		  	java::classifiers::Class.members is hook {
		  		mode = $'prepend'$
		  		port = $'ImportStatement'$
		  	}
		  	java::classifiers::Class.name is value hook {
		  		port = $'ImportStatement'$
		  		point = $'name'$
		  	}
		}
	}
	
	fragment role ModelComponent {
		port type Contents {
			java::statements::Block.statements is prototype if $eContainer().oclIsTypeOf(java::statements::JumpLabel)$ { 
				port = $eContainer().oclAsType(java::statements::JumpLabel).name$
			}
			java::members::Field is prototype {
		  		port = $'Contents'$
		  	}
		}
	}
}