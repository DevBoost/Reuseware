componentmodel org.modelplex.cim.rex.CIMLevel1 
implements     org.modelplex.cim.fracol.CIMLevel1
apply          org.modelplex.cim.**
epackages <http://www.tid.es/cim>
rootclass CIM_Model
{

	fragment role BuiltInEthernetHub if $ufi.segment(-2) = 'builtInEthernetHub'$ {
		homo port ports {
			EthernetPort.portImplementsEndPoint is slot {
				port = $deviceId.concat('EndPoint')$
			}
		}
		homo port portNames {
			EthernetPort.elementName is value hook {
				homo port = $deviceId.concat('Name')$
				port  = $'elementName'$
				point = $'name'$ 
			}
			EthernetPort.name is value hook {
				homo port = $deviceId.concat('Name')$
				port = $'name'$ 
				point = $'name'$
			}
			EthernetPort.deviceId is value hook {
				homo port = $deviceId.concat('Name')$
				port = $'name'$ 
				point = $'name'$
			}
		}
		port hub { 
			LogicalModule is anchor {}	
		} 
	}
	
	fragment role DHCPClient if $ufi.segment(-1) = 'dhcpClient.cim'$ {
		homo port name {
			DHCPProtocolEndpoint.elementName is value hook {
				port  = $'PEPelementName'$
				point = $'name'$
			}
			DHCPProtocolEndpoint.name is value hook {
				port = $'PEPname'$ 
				point = $'name'$
			}
			RemoteServiceAccessPoint.elementName is value hook {
				port  = $'RSAPelementName'$
				point = $'name'$
			}
			RemoteServiceAccessPoint.name is value hook {
				port = $'RSAPname'$ 
				point = $'name'$
			}		
		}
		port protocolEndpoint {
			DHCPProtocolEndpoint is anchor {}
		}
		port serviceAccessPoint {
			RemoteServiceAccessPoint is anchor {}
		}
	} 
	
	fragment role EthernetPort if $ufi.segment(-1) = 'ethernetPort.cim'$ {
		homo port name {
			EthernetPort.elementName is value hook {
				port = $'elementName'$
				point = $'name'$

			}
			EthernetPort.name is value hook {
				port = $'name'$
				point = $'name'$

			}
			EthernetPort.name is value hook {
				port = $'deviceId'$
				point = $'name'$

			}
		}
		port ethernetPort {
			EthernetPort is anchor {}
		} 
		port protocolEndpoint {
			EthernetPort.portImplementsEndPoint is slot {}
		}
	}
	
	fragment role IP if $ufi.segment(-1) = 'ip.cim'$ {
		port name {
			IPProtocolEndpoint.elementName is value hook {
				point = $'name'$
			}
		}
		port ipAddress {
			IPProtocolEndpoint.IPv4Address is value hook if $addressOrigin = EnumAddressOrigin::Static$ {
				point = $'ipAddress'$
			}
		}
		port submask {
			IPProtocolEndpoint.subnetMask is value hook if $addressOrigin = EnumAddressOrigin::Static${
				point = $'submask'$
			}
		}
		port ip {
			IPProtocolEndpoint is anchor {}
		}
	}
	
	fragment role IPConnectedToGateway if $ufi.segment(-1) = 'ipConnectedToGateway.cim'$ {
		homo port name {
			IPProtocolEndpoint.elementName is value hook {
				port = $'PEPelementName'$
				point = $'name'$
			}
			IPProtocolEndpoint.name is value hook {
				port = $'PEPname'$
				point = $'name'$
			}
			IPProtocolEndpoint.elementName is value hook {
				port = $'PEPelementName'$
				point = $'name'$
			}
			IPProtocolEndpoint.name is value hook {
				port = $'PEPname'$
				point = $'name'$
			}
		}
		port ipAddress {
			IPProtocolEndpoint.IPv4Address is value hook {
				point = $'ipAddress'$
			}
		}
		port submask {
			IPProtocolEndpoint.subnetMask is value hook {
				point = $'submask'$
			}
		}
		port gateway {
			IPProtocolEndpoint.subnetMask is value hook {
				point = $'gateway'$
			}
		}
		port assignment {
			IPProtocolEndpoint.subnetMask is value hook {
				point = $'assignemnt'$
			}
		}
		port ip {
			IPProtocolEndpoint is anchor {}
		}
	}
	
	




}