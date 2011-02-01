componentmodel org.modelplex.cim.rex.CIMLevel2 
implements     org.modelplex.cim.fracol.CIMLevel2
apply          org.modelplex.cim.**
epackages <http://www.tid.es/cim>
rootclass CIM_Model
{

	fragment role EthernetIPInterface if $ufi.segment(-1) = 'ethernetIPInterface.cim'$ {
		port hub { 
			LogicalModule is anchor {}	
		} 
		port ip {
			IPProtocolEndpoint is anchor {}
		}
	}
	
	fragment role System if $ufi.segment(-1) = 'system.cim'$ {
		homo port name {
			ComputerSystem.name is value hook {
				port = $'name'$
				point = $'name'$
			}
			ComputerSystem.elementName is value hook {
				port = $'elementName'$
				point = $'name'$
			}
		}
		port systemDevices {
			ComputerSystem.systemDevices is slot {}
		}
	}
	
	fragment role ADSLStaticIPInterface if $ufi.segment(-1) = 'adslStaticIPInterface.cim'$  {
		port modem {
			ADSLModem is anchor {}
		}
		port ip {
			IPProtocolEndpoint is anchor {}
		}
	}

}