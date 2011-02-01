componentmodel org.reuseware.lib.systems.security.cm.secprop
implements org.reuseware.lib.systems.security.security
epackages <http://www.emftext.org/language/SecProp>
rootclass SecPropModel {

	fragment role SecurityInformation {
		port type Contrib {
			Data is prototype {}
		}
		port type ElementSlot {
			Data.channel is slot {}
		}
	}

	fragment role SecureElement {
		port type Self {
			Channel is anchor {}
		}
	}

	fragment role Container {
		port type Rec {
			SecPropModel.data is hook {}
		}
	}	
}