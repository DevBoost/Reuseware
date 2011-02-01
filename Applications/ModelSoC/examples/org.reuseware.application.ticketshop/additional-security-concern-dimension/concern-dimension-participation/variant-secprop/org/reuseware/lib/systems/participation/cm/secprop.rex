componentmodel org.reuseware.lib.systems.participation.cm.secprop
implements org.reuseware.lib.systems.participation.participation
epackages <http://www.emftext.org/language/SecProp>
rootclass SecPropModel { 

	fragment role Collaboration {
		port type Rec {
			SecPropModel.elements is hook {}
			SecPropModel.channels is hook {}
		}
	}

	fragment role Participant {
		port type Contrib {
			Element is prototype {}
		}
		port type Name {
			Element.name is value hook {
				point = $'name'$
			}
		}
	}
} 