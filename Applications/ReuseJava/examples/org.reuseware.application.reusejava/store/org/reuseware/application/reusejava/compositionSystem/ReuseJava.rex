componentmodel org.reuseware.application.reusejava.compositionSystem.ReuseJava
implements org.reuseware.application.reusejava.compositionSystem.ReuseJava
epackages <http://www.emftext.org/java>
rootclass java::containers::CompilationUnit {

	fragment role MethodEntry {
		port type Name {
			java::classifiers::Class.name is value hook {
				point = $'name'$
			}
		}
		port type EntryHook {
		  	java::members::ClassMethod.statements is hook {
    			mode   = $'prepend'$
    			port   = $name.concat('_Entry')$
				remove = $false$ 
    		}
		}
	}
	
	fragment role Statement {
		port type StatementCode {
			java::statements::Statement is prototype if $(self.eContainer().eContainer().oclIsTypeOf(classifiers::Class))$ {
				port  = $self.eContainer().eContainer().oclAsType(classifiers::Class).name$
			}
		}
	}
	
}