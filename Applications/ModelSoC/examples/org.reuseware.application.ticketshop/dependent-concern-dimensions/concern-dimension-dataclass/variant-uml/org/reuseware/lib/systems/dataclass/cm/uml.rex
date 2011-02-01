componentmodel org.reuseware.lib.systems.dataclass.cm.uml
implements org.reuseware.lib.systems.dataclass.dataclass
epackages <http://www.eclipse.org/uml2/3.0.0/UML> 
rootclass Model {

	fragment role Core { 
		port type Rec { 
			Package.packagedElement is hook if $self.eContainer().oclIsTypeOf(Model)$ {}
		}
	}
	fragment role Class { 
		port type Contrib {
			Class is prototype {}
		}
		port type Self {
			Class is anchor {}
		}
		port type Name {
			Class.name is value hook {
				point = $'name'$
			}		
		}
	}
} 