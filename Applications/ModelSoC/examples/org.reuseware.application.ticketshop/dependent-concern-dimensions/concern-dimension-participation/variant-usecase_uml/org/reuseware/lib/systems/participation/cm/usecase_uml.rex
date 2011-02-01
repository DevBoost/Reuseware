componentmodel org.reuseware.lib.systems.participation.cm.usecase_uml
implements org.reuseware.lib.systems.participation.participation
epackages <http://www.eclipse.org/uml2/3.0.0/UML>
rootclass Model {

	fragment role Participant {
		homo port type Name {
			Actor.name is value hook {
				port =$'ActoreName'$
				point = $'name'$
			}
			Association.name is value hook {
				port =$'AssociationName'$
				point = $'name'$
				begin idx = $'0'$
				end idx = $'0'$
			}
		}
		port type Contrib {
			Actor is prototype {}
			Association is prototype {}
			UseCase is slot {}
		}
	}

	fragment role Collaboration {
		port type Rec {
			Package.packagedElement is hook if $packagedElement->exists(e|e.oclIsKindOf(UseCase))$ {}
			Package.ownedComment is hook if $packagedElement->exists(e|e.oclIsKindOf(UseCase))$ {}
			UseCase is anchor {}
		}
	}
} 