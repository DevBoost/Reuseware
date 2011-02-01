componentmodel abstractcim.default implements org.reuseware.lib.systems.default
apply abstractcim.**
epackages <http://www.tid.es/cim>
rootclass CIM_Model {

	fragment role Default {
	
		port Contrib {
			CIM_Model.elements is prototype {
				port expr = $'contents'$
			}
		}
		
		port Rec {
			CIM_Model.elements is hook {
				port expr = $'extension'$
			}
		}
		
		port Config {
			//Common
			LogicalPort.portImplementsEndPoint is slot {
				port expr = $'endPoint'$
			}
			ServiceAccessPoint.bindsTo is slot {
				port expr = $'bindsTo'$
			}
					
			//Router
			ComputerSystem.systemDevices is slot {
				port expr = $'devices'$
			}
			ComputerSystem.hostedServices is slot {
				port expr = $'services'$
			}
			ComputerSystem.hostedForwardingServices is slot {
				port expr = $'forwardingServices'$
			}
			ComputerSystem.hostedFilterList is slot {
				port expr = $'filterLists'$
			}
			
			//NAT Service
			NATService.NATServiceRunningOnEndpoint is slot {
				port expr = $'endPoint'$
			}
		}		
		
		port Config {	
			//common
			IPProtocolEndpoint is anchor {
				port expr = $'ip'$
			}
			LogicalDevice is anchor if $oclIsTypeOf(LogicalModule) or oclIsTypeOf(WiFiPort) or oclIsKindOf(Modem)$ {
				port expr = $'device'$
			}
			
			//NAT Service
			NATService is anchor {
				port expr = $'forwardingService'$
			}
			FilterList is anchor {
				port expr = $'filterList'$
			}
			
			//DHCP Service
			ProtocolService is anchor {
				port expr = $'service'$
			}
		}
	}
	
	port Config {			
			//common settings
			ManagedElement.elementName is value hook if $oclIsTypeOf(LogicalModule) 
			                                      or oclIsTypeOf(ComputerSystem) 
			                                      or oclIsTypeOf(ProtocolService)
			                                      or oclIsTypeOf(NATService)
			                                      or oclIsTypeOf(WiFiEndPoint)
			                                      or oclIsKindOf(Modem)$  {
				
				port expr = $'name'$
				point expr = $'name'$
			}
			IPProtocolEndpoint.IPv4Address is value hook {
				port expr = $'ipAddress'$
				point expr = $'ipAddress'$
			}
			IPProtocolEndpoint.subnetMask is value hook {
				port expr = $'subnetMask'$
				point expr = $'subnetMask'$
			}
			
			//DHCP Service
			RangeOfIPAddresses.startAddress is value hook {
				port expr = $'startAddress'$
				point expr = $'startAddress'$
			}
			RangeOfIPAddresses.endAddress is value hook {
				port expr = $'endAddress'$
				point expr = $'endAddress'$
			}
	}
}