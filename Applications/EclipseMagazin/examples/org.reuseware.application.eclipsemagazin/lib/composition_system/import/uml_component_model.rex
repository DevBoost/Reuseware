componentmodel composition_system.import.uml_component_model
implements composition_system.import
// Das importierende Model und die importierten Modelle sind UML Model.
epackages <http://www.eclipse.org/uml2/3.0.0/UML> // URI des UML Metamodels
rootclass uml::Model {                            // Wurzelement jedes UML Modells

	fragment role ImportingModel {
		port type ImportStatement {
			// Die 'Hooks' d.h. die Punkte wo neue Elemente importiert werden sind States
			// deren Namen die dem Muster <<HOOK_NAME>> folgen.
			uml::State is hook if $name.startsWith('import ')$ {
		    	port  = $name$ 
		  	}
		}
	}
	
	fragment role ModelComponent {
		port type Contents { 
			// Alle States die nicht als Hook markiert sind, sind wiederverwendbar.
			uml::State is prototype if $not region->isEmpty()$ {
				port = $'Contents'$
			}
		}
	}
}