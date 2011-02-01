reuseextension AbstractCIM
for <http://www.tid.es/cim>
{

	binding Hub if $ufi:abstractcim/ethernetHub$ {
		binding name {
			LogicalModule.elementName is value hook {
				point expr = $'name'$
			}
		}
		binding ethernetPortHook {
			LogicalModule.modulePort is slot {}
		}
		binding hub { 
			LogicalModule is anchor {}	
		} 
	}
	
	binding EthernetPort if $ufi:abstractcim/ethernetPort$ {
		binding ipHook {
			EthernetPort.portImplementsEndPoint is slot {}
		}
		binding ethernetPort { 
			EthernetPort is anchor {}	
		} 
	}
	
	binding IP if $ufi:Ip.cim$ {
		binding name {
			IPProtocolEndpoint.elementName is value hook {
				point expr = $'name'$
			}
		}
		binding ipV4Address {
			IPProtocolEndpoint.IPv4Address is value hook {
				point expr = $'ipV4Address'$
			}
		}
		binding subnetMask {
			IPProtocolEndpoint.subnetMask is value hook {
				point expr = $'submask'$
			}
		}
		binding ip {
			IPProtocolEndpoint is anchor {}
		}
	}
	
	binding Network if $ufi:abstractcim/ipNetwork$ {
		binding name {
			IPConnectivitySubnet.elementName is value hook {
				port expr = $'elementName'$
			}
		}
		binding number {
			IPConnectivitySubnet.subnetNumber is value hook {
				point expr = $'number'$
			}
		}
		binding subnetMask {
			IPConnectivitySubnet.subnetMask is value hook {
				point expr = $'subnetMask'$
			}
		}		
		binding memberHook {
			IPConnectivitySubnet.members is slot {}
		}

	}




}