componentmodel composition_system.import.java_component_model
implements composition_system.import
epackages <http://www.emftext.org/java>       // URI of the Java Metamodel
rootclass java::containers::CompilationUnit { // Root element of every Java file

	fragment role ImportingModel {
		port type ImportStatement {
			java::statements::JumpLabel is hook {
		    	port = $name$
		    	point = $'statements'$
		    	remove = $true$
		  	}
		  	java::classifiers::Class.members is hook {
		  		foreach $members->select(e|e.oclIsTypeOf(java::members::ClassMethod))->at(1).oclAsType(java::members::ClassMethod).statements->select(e|e.oclIsTypeOf(java::statements::JumpLabel))$
		  			port = $oclAsType(java::statements::JumpLabel).name$
		  			point = $'members'$
		  	}
		}
	}
	
	fragment role ModelComponent {
		port type Contents {
			java::members::ClassMethod.statements is prototype { 
				port = $name$
				point = $'statements'$
			}
			java::members::Field is prototype {
		  		port = $getContainingConcreteClassifier().members->select(e|e.oclIsTypeOf(java::members::ClassMethod))->at(1).oclAsType(java::members::ClassMethod).name$
		  		point = $'members'$
		  	}
		}
	}
}