componentmodel org.reuseware.lib.systems.class.cm.uml
implements org.reuseware.lib.systems.class.class
epackages <http://www.eclipse.org/uml2/3.0.0/UML> 
rootclass uml::Model {

	fragment role Core { 
		port type Rec { 
			uml::Package.packagedElement is hook if $self.eContainer().oclIsTypeOf(Model)$ {}
		}
	}
	fragment role Class { 
		port type Contrib {
			uml::Class is prototype {}
		}
		port type Self {
			uml::Class is anchor {}
		}
		port type Name {
			uml::Class.name is value hook {
				point = $'name'$
			}		
		}
	}
}