componentmodel org.reuseware.lib.systems.app.cm.java
implements org.reuseware.lib.systems.app.app
epackages <http://www.emftext.org/java> 
rootclass java::containers::CompilationUnit
{ 
	fragment role Main {
		port type Rec {
			java::statements::JumpLabel is hook if $name = 'APP_CODE'$ {
				remove = $true$
			}
			java::variables::LocalVariable is anchor if $typeReference.getTarget().oclAsType(java::classifiers::Class).name = 'APP_NAMEWindow'$ {}
		}
		homo port type Name {
			java::commons::NamedElement.name is value hook if $name.contains('APP_NAME')${
				point = $'name'$
				begin idx = $name.indexOf('APP_NAME')$
				end   idx = $name.indexOf('APP_NAME') + 'APP_NAME'.length() - 1$
			}
			java::references::StringReference._value is value hook if $value.contains('APP_NAME')${
				point = $'name'$
				begin idx = $value.indexOf('APP_NAME')$
				end   idx = $value.indexOf('APP_NAME') + 'APP_NAME'.length() - 1$
			}
		}
	}

	fragment role Execution {
		port type Contrib {
			java::members::ClassMethod.statements is prototype {}
			java::members::Field is slot if $name.startsWith('PROCESS_CONTAINER')$ {}
		}
		port type Executable {
			java::classifiers::Class is slot if $name = 'PROCESS'$ {}
		}
	}

	fragment role Executable {
		port type Self {
			java::classifiers::Class is anchor if $eContainer().oclIsTypeOf(java::containers::CompilationUnit)$ {}
		}
	}

} 