componentmodel org.reuseware.lib.systems.security.cm.java
implements org.reuseware.lib.systems.security.security
epackages <http://www.emftext.org/java> 
rootclass java::containers::CompilationUnit {

	fragment role SecurityInformation {
		port type ElementSlot {
			java::members::ClassMethod.statements is prototype if $name = 'SECURITY_BEFORE_SEND'$ {
				point = $'before'$
			}
			java::members::ClassMethod.statements is prototype if $name = 'SECURITY_AFTER_RECEIVE'$ {
				point = $'after'$
			}
			java::members::Field is slot if $name = 'VALUE_SLOT'$ {}
		}
		port type Contrib {}
	}

	fragment role SecureElement {
		port type Self {
			java::statements::LocalVariableStatement is hook if $variable.name = 'ID_SLOT'$ {
				mode = $'append'$
				point = $'before'$
			}
			java::statements::ExpressionStatement is hook if 
					$expression.oclAsType(java::references::IdentifierReference).target.name = 'consumer'$ {
				mode = $'prepend'$
				point = $'after'$
			}
			java::variables::LocalVariable is anchor if $name = 'ID_SLOT'$ {}	
		}
	}

	fragment role Container {
		port type Rec {}
	}
} 