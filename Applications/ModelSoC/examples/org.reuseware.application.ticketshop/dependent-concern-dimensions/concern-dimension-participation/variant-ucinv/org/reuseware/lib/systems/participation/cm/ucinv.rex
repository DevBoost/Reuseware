componentmodel org.reuseware.lib.systems.participation.cm.ucinv 
implements org.reuseware.lib.systems.participation.participation
epackages <http://www.emftext.org/language/UseCaseInvariant> 
rootclass UseCaseModel { 

	fragment role Participant {
		port type Name {
			Actor.name is value hook {
				point = $'name'$
			}
		}
		port type Contrib {
			Actor is prototype {}
		}
	}

	fragment role Collaboration {
		port type Rec {
			UseCaseModel.invariants is hook {}
		}
	}
} 