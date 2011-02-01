componentmodel org.reuseware.application.cim.rex.CIMReuse
implements     org.reuseware.lib.systems.default
epackages <http://www.tid.es/cim>
rootclass CIM_Model
{
	fragment role Default { 
		port type Config {	
			ManagedElement is anchor if $elementName.startsWith('+')$ {
				port = $elementName.substring(2,elementName.length())$
			}
		}
		port type Config {
			ManagedElement is slot if $elementName.startsWith('?')$ {		
				mode = $'bind'$
				port = $elementName$
				remove = $'true'$
			}
		}
		port type Config {
			ManagedElement is slot if $elementName.startsWith('*')$ {
				mode = $'extend'$
				port = $elementName$
			}
		}
		port type Config {
			ManagedElement is slot if $elementName.startsWith('-')$ {
				port = $elementName$
				remove = $'true'$
			}
			ManagedElement.elementName is value hook if $elementName.startsWith('*')$ {
				port  = $'*ExtensionPoints'$
				point = $elementName$
			}		
		}
	}
}

