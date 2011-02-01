componentmodel CBSE.library.compositionSystem.UMLCompositionSystem
implements     org.reuseware.lib.systems.default
epackages      <http://www.eclipse.org/uml2/3.0.0/UML> 
rootclass      Model {

	// for reusing composite states
	fragment role Default {
		port type Rec {
		  	State is hook if $name.startsWith('Hook_')$ {
		    	port  = $name$ 
		  	}
		  	State is value prototype if $name.startsWith('Hook_')$ {
     			port  = $name$
     			value = $name.substring(6, name.size())$
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
}