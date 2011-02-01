componentmodel org.reuseware.lib.systems.associate.cm.uml
implements org.reuseware.lib.systems.associate.associate
epackages <http://www.eclipse.org/uml2/3.0.0/UML> 
rootclass Model {

	fragment role Core { 
		port type Rec { 
			Package.packagedElement is hook if $self.eContainer().oclIsTypeOf(Model)$ {}
		}
	}

	fragment role Associated {
		port type Self {
			Class is anchor {}
		}
	}

	fragment role Association {
		port type Contrib {
			Association is prototype {}
		}
		port type Source {
			Class is slot if $name = 'SLOT_SOURCE'$ {}
		}
		port type Target {
			Class is slot if $name = 'SLOT_TARGET'$ {}
		}
		port type Name {
			Association.name is value hook {
				point = $'name'$
			}		
		}
	}
} 