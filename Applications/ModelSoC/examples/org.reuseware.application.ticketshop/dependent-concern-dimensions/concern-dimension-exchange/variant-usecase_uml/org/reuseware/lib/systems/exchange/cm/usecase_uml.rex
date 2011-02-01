componentmodel org.reuseware.lib.systems.exchange.cm.usecase_uml
implements org.reuseware.lib.systems.exchange.exchange
epackages <http://www.eclipse.org/uml2/3.0.0/UML>
rootclass Model {

	fragment role Container {
		port type Rec {
			Package.ownedComment is hook if $self.oclIsTypeOf(Package)$ {}
		}
	}

	fragment role Value {
		port type Contrib{
			Comment is prototype {}
		}
		port type Provider {
			Comment.annotatedElement is slot if $_body.contains('(before)')${}
			Comment._body is value hook if $_body.contains('(before)')$ {
				point = $'value'$
				begin idx = $_body.indexOf('VALUE')$
				end idx = $_body.indexOf('VALUE') + 'VALUE'.length() + 1$
			}
			Comment._body is value hook if $_body.contains('(before)')$ {
				point = $'ID'$
				begin idx = $_body.indexOf('ID')$
				end idx = $_body.indexOf('ID') + 'ID'.length() + 1$
			}
			Comment._body is value hook if $_body.contains('(before)')$ {
				point = $'inSet'$
				begin idx = $_body.indexOf('INSET')$
				end idx = $_body.indexOf('INSET') + 'INSET'.length() + 1$
			}
		}
		port type Consumer {
			Comment.annotatedElement is slot if $_body.contains('(after)')${}
			Comment._body is value hook if $_body.contains('(after)')$ {
				point = $'value'$
				begin idx = $_body.indexOf('VALUE')$
				end idx = $_body.indexOf('VALUE') + 'VALUE'.length() + 1$
			}
			Comment._body is value hook if $_body.contains('(after)')$ {
				point = $'ID'$
				begin idx = $_body.indexOf('ID')$
				end idx = $_body.indexOf('ID') + 'ID'.length() + 1$
			}
			Comment._body is value hook if $_body.contains('(after)')$ {
				point = $'inSet'$
				begin idx = $_body.indexOf('INSET')$
				end idx = $_body.indexOf('INSET') + 'INSET'.length() + 1$
			}
		}
	}

	fragment role Provider {
		port type Self {
			Actor is anchor {}
		}
	}

	fragment role Consumer {
		port type Self {
			Actor is anchor {}
		}
	}
} 