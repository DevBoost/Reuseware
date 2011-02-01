componentmodel SWT2.library.compositionSystem.UMLActivityExt2 
implements org.reuseware.lib.systems.default
epackages <http://www.eclipse.org/uml2/3.0.0/UML>
rootclass Model {

	// for reusing composite states
	fragment role Default {
		port type Rec {
		  	State is hook if $name.startsWith('Hook_')$ {
		    	port  = $name$ 
		  	}
		  	State is value prototype if $name.startsWith('Hook_')$ {
     			port = $name$
     			value = $name.substring('Hook_'.length() + 1, name.size())$
 			}
		}
	}
	
	//only states that are composites (region not empty)
	fragment role Default {
		port type Contrib {
			State is prototype if $not region->isEmpty()$ {  
		    	port = $name$ 
		    }
		
		    State.name is value hook if $not region->isEmpty()$ {
		    	port = $name$
		    }
		}
	}
	
	
	//for complete classes
	fragment role Default {
		port type Rec {
 			Package.packagedElement is hook if $self.oclIsTypeOf(Package)$ {
    			port = $name.concat('_ExtensionPoint')$
  			}
		}
	}	
	fragment role Default {
		port type Contrib {
  			Package.packagedElement is prototype if $self.oclIsTypeOf(Package)$ {
     			port = $name.concat('_NewClasses')$
  			}
		}
	}
	
	//for class extensions
	 fragment role Default {
		port type Rec {
    		Class.ownedOperation is hook if $not name.startsWith('ExtensionFor_') and not self.oclIsTypeOf(StateMachine)$  {
    			port = $name$
    		}
 			Class.ownedAttribute is hook if $not name.startsWith('ExtensionFor_') and not self.oclIsTypeOf(StateMachine)$ {
     			port = $name$
  			}
   			Class is anchor if $not name.startsWith('ExtensionFor_') and not self.oclIsTypeOf(StateMachine)$ {
     			port = $name$
  			}
  		}
	}
	fragment role Default {
		port type Contrib {
  			Class.ownedOperation is prototype if $name.startsWith('ExtensionFor_')$ {
     			port = $name$
  			}
  			Class.ownedAttribute is prototype if $name.startsWith('ExtensionFor_')$  {
     			port = $name$
  			}
    		Class is slot if $name.startsWith('ExtensionFor_')$  {
    			mode = $'bind'$
     			port = $name$
  			}
  		}
  	}
}