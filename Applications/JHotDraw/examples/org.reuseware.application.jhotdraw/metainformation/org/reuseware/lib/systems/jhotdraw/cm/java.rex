componentmodel org.reuseware.lib.systems.jhotdraw.cm.java
implements org.reuseware.lib.systems.default
epackages <http://www.emftext.org/java> 
rootclass java::containers::CompilationUnit
{
	//for figures to reuse
	fragment role Default {
		port Config {
			java::classifiers::Class is anchor if $eContainer().oclIsTypeOf(java::containers::CompilationUnit) and 
					name <> name.toUpperCase() $ { //the main class in the CU
				port expr = $name$
			}
		}
	}
	
	fragment role Default {
		//naming
		port Config {
			java::commons::NamedElement.name is value hook if $name.contains('NAME_HOOK')${
				port expr = $'name'$
				point expr = $'name'$
				begin idx expr = $name.indexOf('NAME_HOOK')$
				end   idx expr = $name.indexOf('NAME_HOOK') + 'NAME_HOOK'.length()$
			}			
		}
		//for editor core
		port Rec {
			java::statements::JumpLabel is hook if $name = 'STATEMENT_HOOK'$ {
				port expr = $'main'$
				remove expr = $true$
			}
			java::variables::LocalVariable is anchor if $name = 'drawing'$ {
				port expr = $'main'$
			}
		}
		//for figure instantiation
		port Contrib {
			java::statements::StatementListContainer.statements is prototype if $oclIsKindOf(java::commons::NamedElement) and 
					eContainer().oclAsType(java::commons::NamedElement).name = 'PLACEHOLDER'$	{
				port expr = $'main'$
			}
			java::parameters::OrdinaryParameter is slot if $name.startsWith('SLOT_')$ {
				port expr = $'main'$
			}
		}
		port Config {
			java::literals::DecimalIntegerLiteral.decimalValue is value hook if $decimalValue = 777$ {
				port expr = $'postion'$
				point expr = $'x'$
			}
			java::literals::DecimalIntegerLiteral.decimalValue is value hook if $decimalValue = 888$ {
				port expr = $'postion'$
				point expr = $'y'$
			}
			java::types::ClassifierReference._target is slot if $target.name.startsWith('SLOT_')$ {
				port expr = $target.name.substring(6, target.name.length())$
			}
		}
	}

} 