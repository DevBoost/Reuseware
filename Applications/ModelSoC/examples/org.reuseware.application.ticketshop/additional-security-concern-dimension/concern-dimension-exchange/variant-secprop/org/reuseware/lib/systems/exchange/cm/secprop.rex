componentmodel org.reuseware.lib.systems.exchange.cm.secprop
implements org.reuseware.lib.systems.exchange.exchange
epackages <http://www.emftext.org/language/SecProp>
rootclass SecPropModel {

	fragment role Container {
		port type Rec {
			SecPropModel.elements is hook {}
			SecPropModel.channels is hook {}
			SecPropModel.data is hook {}
		}
	}

	fragment role Provider {
		port type Self {
			Element is anchor {}
		}
	}

	fragment role Consumer {
		port type Self {
			Element is anchor {}
		}
	}

	fragment role Value {
		port type Contrib{
			Channel is prototype {}	
			Data is prototype {}	
		}
		port type Provider {
			Channel.source is slot {}
			Data.name is value hook {
				point = $'value'$
			}
			Channel.name is value hook {
				point = $'name'$
			}
		}
		port type Consumer {
			Channel._target is slot {}
		}
	}

} 