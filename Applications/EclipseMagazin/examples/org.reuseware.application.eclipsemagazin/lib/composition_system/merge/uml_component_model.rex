componentmodel composition_system.merge.uml_component_model
implements composition_system.merge
epackages <http://www.eclipse.org/uml2/3.0.0/UML> // URI des UML Metamodels
rootclass uml::Model {                            // Wurzelement jedes UML Modells

	fragment role CoreModel {
		port type CoreClass {
  			uml::Class.ownedOperation is hook {
     			port = $name.concat('_hook')$
  			}
  			uml::Class.ownedAttribute is hook {
     			port = $name.concat('_hook')$
  			}
    		uml::Class is anchor {
     			port = $name.concat('_hook')$
  			}
		}
	}
	
	fragment role ExtensionModel {
		port type ExtensionClass { 
  			uml::Class.ownedOperation is prototype {
     			port = $name$
  			}
  			uml::Class.ownedAttribute is prototype {
     			port = $name$
  			}
    		uml::Class is slot {
    			mode = $'bind'$
     			port = $name$
  			}
		}
	}
}