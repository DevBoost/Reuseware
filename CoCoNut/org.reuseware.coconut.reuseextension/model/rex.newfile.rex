componentmodel org.reuseware.lib.examples.umlweaving
implements org.reuseware.lib.systems.default
epackages <http://www.eclipse.org/uml2/3.0.0/UML> 
rootclass Model {

	// Core
	fragment role Default if $not name.startsWith('advice')$ {
		port type Rec {
			uml::Class.ownedOperation is hook {
				port = $self.name$
			}
  			uml::Class.ownedAttribute is hook {
				port = $self.name$
			}
			uml::Package.packagedElement is hook if $self.oclIsTypeOf(uml::Package)$ {
 				foreach $packagedElement->select(c | c.oclIsTypeOf(uml::Class))$
 					port = $self.name$ 
 			}
  			uml::Class is anchor {
				port = $self.name$
  			}
		}
	}
	
	// Aspect
	fragment role Default if $name.startsWith('advice')$ { 
		port type Contrib {
  			uml::Operation is prototype if $owner.oclIsTypeOf(uml::Class)$ {
				port = $self.owner.oclAsType(uml::Class).name$ 
			}
  			uml::Property is prototype if $owner.oclIsTypeOf(uml::Class)$ {
				port = $self.owner.oclAsType(uml::Class).name$ 
			}
			uml::Association is prototype {
				port = $self.ownedEnd->at(1).type.name$
			}
  			uml::Class is slot {
				port = $self.name$
  			}
		}
	}
}