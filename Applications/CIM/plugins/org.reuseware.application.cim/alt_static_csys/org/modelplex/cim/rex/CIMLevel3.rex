componentmodel org.modelplex.cim.rex.CIMLevel3 
implements     org.modelplex.cim.fracol.CIMLevel3
apply          org.modelplex.cim.**
epackages <http://www.tid.es/cim>
rootclass CIM_Model
{

	fragment role ProviderRouter if $ufi.segment(-1) = 'providerRouter.cim'$ {
		port routerIP {
			IPProtocolEndpoint is anchor if $elementName.contains('RouterIP')$ {}
		}
		port wanIP {
			IPProtocolEndpoint is anchor if $elementName.contains('WANIP')$ {}
		}
	}
	
	fragment role IPNetwork if $ufi.segment(-1) = 'ipNetwork.cim'$ {
		homo port name {
			IPConnectivitySubnet.elementName is value hook {
				port = $'elementName'$
				point = $'name'$
			}
			IPConnectivitySubnet.instanceID is value hook {
				port = $'instanceId'$
				point = $'name'$
			}
		}
		port ipAddress {
			IPConnectivitySubnet.subnetNumber is value hook {
				point = $'ipAddress'$
			}
		}
		port submask {
			IPConnectivitySubnet.subnetMask is value hook {
				point = $'submask'$
			}
		}		
		port members {
			IPConnectivitySubnet.members is slot {}
		}

	}

}