componentmodel org.reuseware.lib.systems.exchange.cm.valueflow
implements org.reuseware.lib.systems.exchange.exchange
epackages <http://www.emftext.org/language/valueflow>
rootclass Model {

	fragment role Container {
		port type Rec {}
	}

	fragment role Value {
		port type Contrib{}
		port type Provider {
			GiveState is prototype {}
			GiveState._value is value hook {
				point = $'value'$
			}
			GiveState.name is value hook {
				point = $'name'$
			}
			GiveState.ID is value hook {
				point = $'ID'$
			}
		}
		port type Consumer {
			TakeState is prototype  if $name <> 'NEXT'$ {}
			TakeState.name is value hook  if $name <> 'NEXT'$ {
				point = $'name'$
			}
		}
	}

	fragment role Provider {
		port type Self {
			Agent.states is hook if $name = 'NAME_HOOK'$  {}
		}
	}

	fragment role Consumer {
		port type Self {
			Agent.states is hook if $name = 'NAME_HOOK'$  {}
		}
	}
} 