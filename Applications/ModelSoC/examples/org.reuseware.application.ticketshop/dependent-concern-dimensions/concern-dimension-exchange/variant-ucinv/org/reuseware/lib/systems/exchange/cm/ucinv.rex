componentmodel org.reuseware.lib.systems.exchange.cm.ucinv
implements org.reuseware.lib.systems.exchange.exchange
epackages <http://www.emftext.org/language/UseCaseInvariant> 
rootclass UseCaseModel {

	fragment role Container {
		port type Rec {}
	}

	fragment role Value {
		port type Contrib{}
		port type Provider {
			Value is prototype if $type = 'GIVE_VALUE'$ {
				point = $'before'$
			}
			Value._type is value hook if $type = 'GIVE_VALUE'$ {
				point = $'value'$
			}
			Value.ID is value hook if $type = 'GIVE_VALUE'$ {
				point = $'ID'$
			}
			Value.inSet is value hook if $type = 'GIVE_VALUE'$ {
				point = $'inSet'$
			}
		}
		port type Consumer {
			Value is prototype if $type = 'TAKE_VALUE'$ {
				point = $'after'$
			}
			Value._type is value hook if $type = 'TAKE_VALUE'$ {
				point = $'value'$
			}
			Value.ID is value hook if $type = 'TAKE_VALUE'$ {
				point = $'ID'$
			}
			Value.inSet is value hook if $type = 'TAKE_VALUE'$ {
				point = $'inSet'$
			}
		}
	}

	fragment role Provider {
		port type Self {
			NormalActor.valuesBefore is hook {
				point = $'before'$
			}
			NormalActor.valuesAfter is hook {
				point = $'after'$
			}
		}
	}

	fragment role Consumer {
		port type Self {
			NormalActor.valuesBefore is hook {
				point = $'before'$
			}
			NormalActor.valuesAfter is hook {
				point = $'after'$
			}
		}
	}
} 