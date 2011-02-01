componentmodel org.reuseware.lib.systems.participation.cm.valueflow
implements org.reuseware.lib.systems.participation.participation
epackages <http://www.emftext.org/language/valueflow>
rootclass Model { 

	fragment role Participant {
		port type Name {
			Agent.name is value hook if $name = 'NAME_HOOK'$ {
				point = $'name'$
			}
		}
		port type Contrib {
			Agent is prototype if $name = 'NAME_HOOK'$ {}
		}
	}

	fragment role Collaboration {
		port type Rec {
			Model.agents is hook {}
		}
	}
} 