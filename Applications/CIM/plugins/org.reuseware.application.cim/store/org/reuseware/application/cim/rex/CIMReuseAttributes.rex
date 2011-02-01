componentmodel org.reuseware.application.cim.rex.CIMReuseAttributes
implements     org.reuseware.application.cim.fracol.CIMReuseAttributes
epackages <http://www.tid.es/cim>
rootclass CIM_Model
{
	
	fragment role AttributeHolder {
		homo port type attribute {		
			ManagedElement.elementName is value hook if $elementName.startsWith('+')$ {
				homo port =  $'%'.concat(elementName.substring(2,elementName.length()))$
				port  = $'elementName'$
				point = $'value'$
			}

			BGPPeerGroup.creationClassName is value hook if $creationClassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $creationClassName$
				port  = $'creationClassName'$
				point = $'value'$
			}
			BGPPeerGroup.name is value hook if $name.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $name$
				port  = $'name'$
				point = $'value'$
			}
			BGPService.lastErrorCode is value hook if $lastErrorCode.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $lastErrorCode$
				port  = $'lastErrorCode'$
				point = $'value'$
			}
			BGPService.lastMessageErrorSubCode is value hook if $lastMessageErrorSubCode.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $lastMessageErrorSubCode$
				port  = $'lastMessageErrorSubCode'$
				point = $'value'$
			}
			BGPService.lastOpenErrorSubCode is value hook if $lastOpenErrorSubCode.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $lastOpenErrorSubCode$
				port  = $'lastOpenErrorSubCode'$
				point = $'value'$
			}
			BGPService.lastUpdatedErrorSubCode is value hook if $lastUpdatedErrorSubCode.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $lastUpdatedErrorSubCode$
				port  = $'lastUpdatedErrorSubCode'$
				point = $'value'$
			}
			AutonomousSystem.routingUpdateSource is value hook if $routingUpdateSource.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $routingUpdateSource$
				port  = $'routingUpdateSource'$
				point = $'value'$
			}
			AutonomousSystem.aggregationType is value hook if $aggregationType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $aggregationType$
				port  = $'aggregationType'$
				point = $'value'$
			}
			ComputerSystem.otherIdentifyingInfo is value hook if $otherIdentifyingInfo.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherIdentifyingInfo$
				port  = $'otherIdentifyingInfo'$
				point = $'value'$
			}
			ComputerSystem.identifyingDescriptions is value hook if $identifyingDescriptions.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $identifyingDescriptions$
				port  = $'identifyingDescriptions'$
				point = $'value'$
			}
			ComputerSystem.resetCapability is value hook if $resetCapability.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $resetCapability$
				port  = $'resetCapability'$
				point = $'value'$
			}
			LogicalFile.filename is value hook if $filename.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $filename$
				port  = $'filename'$
				point = $'value'$
			}
			Check.checkID is value hook if $checkID.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $checkID$
				port  = $'checkID'$
				point = $'value'$
			}
			Check.name is value hook if $name.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $name$
				port  = $'name'$
				point = $'value'$
			}
			Check.softwareElementID is value hook if $softwareElementID.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $softwareElementID$
				port  = $'softwareElementID'$
				point = $'value'$
			}
			Check.version is value hook if $version.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $version$
				port  = $'version'$
				point = $'value'$
			}
			FileSpecification.fileName is value hook if $fileName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $fileName$
				port  = $'fileName'$
				point = $'value'$
			}
			FileSpecification.MD5Checksum is value hook if $MD5Checksum.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $MD5Checksum$
				port  = $'MD5Checksum'$
				point = $'value'$
			}
			OperatingSystem.creationClassName is value hook if $creationClassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $creationClassName$
				port  = $'creationClassName'$
				point = $'value'$
			}
			OperatingSystem.CSCreationClassName is value hook if $CSCreationClassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $CSCreationClassName$
				port  = $'CSCreationClassName'$
				point = $'value'$
			}
			OperatingSystem.CSName is value hook if $CSName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $CSName$
				port  = $'CSName'$
				point = $'value'$
			}
			OperatingSystem.otherTypeDescription is value hook if $otherTypeDescription.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherTypeDescription$
				port  = $'otherTypeDescription'$
				point = $'value'$
			}
			OperatingSystem.version is value hook if $version.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $version$
				port  = $'version'$
				point = $'value'$
			}
			SoftwareElement.buildNumber is value hook if $buildNumber.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $buildNumber$
				port  = $'buildNumber'$
				point = $'value'$
			}
			SoftwareElement.codeSet is value hook if $codeSet.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $codeSet$
				port  = $'codeSet'$
				point = $'value'$
			}
			SoftwareElement.identificationCode is value hook if $identificationCode.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $identificationCode$
				port  = $'identificationCode'$
				point = $'value'$
			}
			SoftwareElement.languageEdition is value hook if $languageEdition.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $languageEdition$
				port  = $'languageEdition'$
				point = $'value'$
			}
			SoftwareElement.manufacturer is value hook if $manufacturer.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $manufacturer$
				port  = $'manufacturer'$
				point = $'value'$
			}
			SoftwareElement.otherTargetOS is value hook if $otherTargetOS.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherTargetOS$
				port  = $'otherTargetOS'$
				point = $'value'$
			}
			SoftwareElement.serialNumber is value hook if $serialNumber.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $serialNumber$
				port  = $'serialNumber'$
				point = $'value'$
			}
			SoftwareElement.softwareElementID is value hook if $softwareElementID.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $softwareElementID$
				port  = $'softwareElementID'$
				point = $'value'$
			}
			SoftwareElement.version is value hook if $version.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $version$
				port  = $'version'$
				point = $'value'$
			}
			ConnectivityMemberhipSettingData.connectivityMembershipType is value hook if $connectivityMembershipType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $connectivityMembershipType$
				port  = $'connectivityMembershipType'$
				point = $'value'$
			}
			ConnectivityMemberhipSettingData.otherConnectivityMembershipType is value hook if $otherConnectivityMembershipType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherConnectivityMembershipType$
				port  = $'otherConnectivityMembershipType'$
				point = $'value'$
			}
			ConnectivityMemberhipSettingData.connectivityMembershipID is value hook if $connectivityMembershipID.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $connectivityMembershipID$
				port  = $'connectivityMembershipID'$
				point = $'value'$
			}
			ConnectivityCollection.connectivityStatus is value hook if $connectivityStatus.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $connectivityStatus$
				port  = $'connectivityStatus'$
				point = $'value'$
			}
			NamedAddressCollection.collectionAlias is value hook if $collectionAlias.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $collectionAlias$
				port  = $'collectionAlias'$
				point = $'value'$
			}
			RangeOfIPAddresses.startAddress is value hook if $startAddress.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $startAddress$
				port  = $'startAddress'$
				point = $'value'$
			}
			RangeOfIPAddresses.endAddress is value hook if $endAddress.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $endAddress$
				port  = $'endAddress'$
				point = $'value'$
			}
			RangeOfIPAddresses.addressType is value hook if $addressType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $addressType$
				port  = $'addressType'$
				point = $'value'$
			}
			LANConnectivitySegment.LANID is value hook if $LANID.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $LANID$
				port  = $'LANID'$
				point = $'value'$
			}
			LANConnectivitySegment.connectivityType is value hook if $connectivityType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $connectivityType$
				port  = $'connectivityType'$
				point = $'value'$
			}
			LANConnectivitySegment.otherTypeDescription is value hook if $otherTypeDescription.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherTypeDescription$
				port  = $'otherTypeDescription'$
				point = $'value'$
			}
			IPConnectivitySubnet.subnetNumber is value hook if $subnetNumber.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $subnetNumber$
				port  = $'subnetNumber'$
				point = $'value'$
			}
			IPConnectivitySubnet.subnetMask is value hook if $subnetMask.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $subnetMask$
				port  = $'subnetMask'$
				point = $'value'$
			}
			IPXConnectivityNetwork.networkNumber is value hook if $networkNumber.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $networkNumber$
				port  = $'networkNumber'$
				point = $'value'$
			}
			IPAddressRange.startAddress is value hook if $startAddress.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $startAddress$
				port  = $'startAddress'$
				point = $'value'$
			}
			IPAddressRange.endAddress is value hook if $endAddress.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $endAddress$
				port  = $'endAddress'$
				point = $'value'$
			}
			IPAddressRange.typeOfAddress is value hook if $typeOfAddress.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $typeOfAddress$
				port  = $'typeOfAddress'$
				point = $'value'$
			}
			IPAddressRange.allocationRange is value hook if $allocationRange.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $allocationRange$
				port  = $'allocationRange'$
				point = $'value'$
			}
			LogicalNetwork.creationClassName is value hook if $creationClassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $creationClassName$
				port  = $'creationClassName'$
				point = $'value'$
			}
			LogicalNetwork.name is value hook if $name.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $name$
				port  = $'name'$
				point = $'value'$
			}
			LogicalNetwork.networkType is value hook if $networkType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $networkType$
				port  = $'networkType'$
				point = $'value'$
			}
			LogicalNetwork.otherTypeDescription is value hook if $otherTypeDescription.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherTypeDescription$
				port  = $'otherTypeDescription'$
				point = $'value'$
			}
			IPXNetwork.networkNumber is value hook if $networkNumber.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $networkNumber$
				port  = $'networkNumber'$
				point = $'value'$
			}
			LANSegment.LANID is value hook if $LANID.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $LANID$
				port  = $'LANID'$
				point = $'value'$
			}
			LANSegment.LANType is value hook if $LANType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $LANType$
				port  = $'LANType'$
				point = $'value'$
			}
			LANSegment.otherLANType is value hook if $otherLANType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherLANType$
				port  = $'otherLANType'$
				point = $'value'$
			}
			IPSubnet.subnetNumber is value hook if $subnetNumber.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $subnetNumber$
				port  = $'subnetNumber'$
				point = $'value'$
			}
			IPSubnet.subnetMask is value hook if $subnetMask.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $subnetMask$
				port  = $'subnetMask'$
				point = $'value'$
			}
			IPSubnet.addressType is value hook if $addressType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $addressType$
				port  = $'addressType'$
				point = $'value'$
			}
			Capabilities.instanceID is value hook if $instanceID.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $instanceID$
				port  = $'instanceID'$
				point = $'value'$
			}
			CollectionOfMSEs.collectionId is value hook if $collectionId.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $collectionId$
				port  = $'collectionId'$
				point = $'value'$
			}
			EnabledLogicalElement.otherEnabledState is value hook if $otherEnabledState.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherEnabledState$
				port  = $'otherEnabledState'$
				point = $'value'$
			}
			EnabledLogicalElement.overwritePolicy is value hook if $overwritePolicy.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $overwritePolicy$
				port  = $'overwritePolicy'$
				point = $'value'$
			}
			LogicalDevice.creationClassName is value hook if $creationClassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $creationClassName$
				port  = $'creationClassName'$
				point = $'value'$
			}
			LogicalDevice.deviceId is value hook if $deviceId.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $deviceId$
				port  = $'deviceId'$
				point = $'value'$
			}
			LogicalDevice.systemCreationClassName is value hook if $systemCreationClassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $systemCreationClassName$
				port  = $'systemCreationClassName'$
				point = $'value'$
			}
			LogicalDevice.systemName is value hook if $systemName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $systemName$
				port  = $'systemName'$
				point = $'value'$
			}
			ManagedElement.caption is value hook if $caption.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $caption$
				port  = $'caption'$
				point = $'value'$
			}
			ManagedElement.description is value hook if $description.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $description$
				port  = $'description'$
				point = $'value'$
			}
			ManagedElement.elementName is value hook if $elementName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $elementName$
				port  = $'elementName'$
				point = $'value'$
			}
			ManagedSystemElement.installDate is value hook if $installDate.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $installDate$
				port  = $'installDate'$
				point = $'value'$
			}
			ManagedSystemElement.name is value hook if $name.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $name$
				port  = $'name'$
				point = $'value'$
			}
			PhysicalElement.tag is value hook if $tag.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $tag$
				port  = $'tag'$
				point = $'value'$
			}
			PhysicalElement.creationclassName is value hook if $creationclassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $creationclassName$
				port  = $'creationclassName'$
				point = $'value'$
			}
			PhysicalElement.manufacturer is value hook if $manufacturer.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $manufacturer$
				port  = $'manufacturer'$
				point = $'value'$
			}
			PhysicalElement.model is value hook if $model.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $model$
				port  = $'model'$
				point = $'value'$
			}
			PhysicalElement.SKU is value hook if $SKU.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $SKU$
				port  = $'SKU'$
				point = $'value'$
			}
			PhysicalElement.serialNumber is value hook if $serialNumber.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $serialNumber$
				port  = $'serialNumber'$
				point = $'value'$
			}
			PhysicalElement.version is value hook if $version.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $version$
				port  = $'version'$
				point = $'value'$
			}
			PhysicalElement.partNo is value hook if $partNo.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $partNo$
				port  = $'partNo'$
				point = $'value'$
			}
			PhysicalElement.otherIdentiyingInfo is value hook if $otherIdentiyingInfo.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherIdentiyingInfo$
				port  = $'otherIdentiyingInfo'$
				point = $'value'$
			}
			PhysicalElement.manufactureDate is value hook if $manufactureDate.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $manufactureDate$
				port  = $'manufactureDate'$
				point = $'value'$
			}
			PhysicalElement.vendorEquipmentType is value hook if $vendorEquipmentType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $vendorEquipmentType$
				port  = $'vendorEquipmentType'$
				point = $'value'$
			}
			PhysicalElement.userTracking is value hook if $userTracking.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $userTracking$
				port  = $'userTracking'$
				point = $'value'$
			}
			PowerManagementCapabilities.powerCapabilities is value hook if $powerCapabilities.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $powerCapabilities$
				port  = $'powerCapabilities'$
				point = $'value'$
			}
			Product.family is value hook if $family.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $family$
				port  = $'family'$
				point = $'value'$
			}
			Product.identifyingNumber is value hook if $identifyingNumber.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $identifyingNumber$
				port  = $'identifyingNumber'$
				point = $'value'$
			}
			Product.name is value hook if $name.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $name$
				port  = $'name'$
				point = $'value'$
			}
			Product.SKUNumber is value hook if $SKUNumber.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $SKUNumber$
				port  = $'SKUNumber'$
				point = $'value'$
			}
			Product.vendor is value hook if $vendor.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $vendor$
				port  = $'vendor'$
				point = $'value'$
			}
			Product.version is value hook if $version.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $version$
				port  = $'version'$
				point = $'value'$
			}
			ProtocolEndpoint.nameFormat is value hook if $nameFormat.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $nameFormat$
				port  = $'nameFormat'$
				point = $'value'$
			}
			ProtocolEndpoint.otherTypeDescription is value hook if $otherTypeDescription.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherTypeDescription$
				port  = $'otherTypeDescription'$
				point = $'value'$
			}
			RemotePort.portInfo is value hook if $portInfo.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $portInfo$
				port  = $'portInfo'$
				point = $'value'$
			}
			RemotePort.portProtocol is value hook if $portProtocol.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $portProtocol$
				port  = $'portProtocol'$
				point = $'value'$
			}
			RemotePort.otherProtocolDescription is value hook if $otherProtocolDescription.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherProtocolDescription$
				port  = $'otherProtocolDescription'$
				point = $'value'$
			}
			RemoteServiceAccessPoint.accessInfo is value hook if $accessInfo.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $accessInfo$
				port  = $'accessInfo'$
				point = $'value'$
			}
			RemoteServiceAccessPoint.otherAccessContext is value hook if $otherAccessContext.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherAccessContext$
				port  = $'otherAccessContext'$
				point = $'value'$
			}
			RemoteServiceAccessPoint.otherInfoFormatDescription is value hook if $otherInfoFormatDescription.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherInfoFormatDescription$
				port  = $'otherInfoFormatDescription'$
				point = $'value'$
			}
			Service.creationClassName is value hook if $creationClassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $creationClassName$
				port  = $'creationClassName'$
				point = $'value'$
			}
			Service.primaryOwnerName is value hook if $primaryOwnerName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $primaryOwnerName$
				port  = $'primaryOwnerName'$
				point = $'value'$
			}
			Service.primaryOwnerContact is value hook if $primaryOwnerContact.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $primaryOwnerContact$
				port  = $'primaryOwnerContact'$
				point = $'value'$
			}
			Service.systemCreationClassName is value hook if $systemCreationClassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $systemCreationClassName$
				port  = $'systemCreationClassName'$
				point = $'value'$
			}
			Service.systemName is value hook if $systemName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $systemName$
				port  = $'systemName'$
				point = $'value'$
			}
			ServiceAccessURI.labeledURI is value hook if $labeledURI.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $labeledURI$
				port  = $'labeledURI'$
				point = $'value'$
			}
			ServiceAccessPoint.creationClassName is value hook if $creationClassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $creationClassName$
				port  = $'creationClassName'$
				point = $'value'$
			}
			ServiceAccessPoint.systemCreationClassName is value hook if $systemCreationClassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $systemCreationClassName$
				port  = $'systemCreationClassName'$
				point = $'value'$
			}
			ServiceAccessPoint.systemName is value hook if $systemName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $systemName$
				port  = $'systemName'$
				point = $'value'$
			}
			SettingData.configurationName is value hook if $configurationName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $configurationName$
				port  = $'configurationName'$
				point = $'value'$
			}
			SettingData.instanceID is value hook if $instanceID.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $instanceID$
				port  = $'instanceID'$
				point = $'value'$
			}
			SoftwareIdentity.instanceID is value hook if $instanceID.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $instanceID$
				port  = $'instanceID'$
				point = $'value'$
			}
			SoftwareIdentity.manufacturer is value hook if $manufacturer.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $manufacturer$
				port  = $'manufacturer'$
				point = $'value'$
			}
			SoftwareIdentity.otherExtendedResourceTypeDescription is value hook if $otherExtendedResourceTypeDescription.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherExtendedResourceTypeDescription$
				port  = $'otherExtendedResourceTypeDescription'$
				point = $'value'$
			}
			SoftwareIdentity.serialNumber is value hook if $serialNumber.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $serialNumber$
				port  = $'serialNumber'$
				point = $'value'$
			}
			SoftwareIdentity.versionString is value hook if $versionString.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $versionString$
				port  = $'versionString'$
				point = $'value'$
			}
			System.creationClassName is value hook if $creationClassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $creationClassName$
				port  = $'creationClassName'$
				point = $'value'$
			}
			System.primaryOwnerName is value hook if $primaryOwnerName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $primaryOwnerName$
				port  = $'primaryOwnerName'$
				point = $'value'$
			}
			System.primaryOwnerContact is value hook if $primaryOwnerContact.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $primaryOwnerContact$
				port  = $'primaryOwnerContact'$
				point = $'value'$
			}
			SystemSpecificCollection.instanceID is value hook if $instanceID.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $instanceID$
				port  = $'instanceID'$
				point = $'value'$
			}
			FilterList.creationClassName is value hook if $creationClassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $creationClassName$
				port  = $'creationClassName'$
				point = $'value'$
			}
			FilterList.systemCreationClassName is value hook if $systemCreationClassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $systemCreationClassName$
				port  = $'systemCreationClassName'$
				point = $'value'$
			}
			FilterList.systemName is value hook if $systemName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $systemName$
				port  = $'systemName'$
				point = $'value'$
			}
			FilterEntry.matchConditionValue is value hook if $matchConditionValue.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $matchConditionValue$
				port  = $'matchConditionValue'$
				point = $'value'$
			}
			FilterEntry.otherMatchConditionType is value hook if $otherMatchConditionType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherMatchConditionType$
				port  = $'otherMatchConditionType'$
				point = $'value'$
			}
			FilterEntry.otherTrafficType is value hook if $otherTrafficType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherTrafficType$
				port  = $'otherTrafficType'$
				point = $'value'$
			}
			FilterEntry.trafficClass is value hook if $trafficClass.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $trafficClass$
				port  = $'trafficClass'$
				point = $'value'$
			}
			EthernetPort.capabilities is value hook if $capabilities.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $capabilities$
				port  = $'capabilities'$
				point = $'value'$
			}
			EthernetPort.capabilityDescriptions is value hook if $capabilityDescriptions.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $capabilityDescriptions$
				port  = $'capabilityDescriptions'$
				point = $'value'$
			}
			EthernetPort.enabledCapabilities is value hook if $enabledCapabilities.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $enabledCapabilities$
				port  = $'enabledCapabilities'$
				point = $'value'$
			}
			EthernetPort.otherEnabledCapabilities is value hook if $otherEnabledCapabilities.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherEnabledCapabilities$
				port  = $'otherEnabledCapabilities'$
				point = $'value'$
			}
			LogicalModule.otherLogicalModuleTypeDescription is value hook if $otherLogicalModuleTypeDescription.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherLogicalModuleTypeDescription$
				port  = $'otherLogicalModuleTypeDescription'$
				point = $'value'$
			}
			LogicalPort.otherPortType is value hook if $otherPortType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherPortType$
				port  = $'otherPortType'$
				point = $'value'$
			}
			NetworkPort.otherLinktechnology is value hook if $otherLinktechnology.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherLinktechnology$
				port  = $'otherLinktechnology'$
				point = $'value'$
			}
			NetworkPort.permanentAddress is value hook if $permanentAddress.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $permanentAddress$
				port  = $'permanentAddress'$
				point = $'value'$
			}
			CallBasedModem.numberDialed is value hook if $numberDialed.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $numberDialed$
				port  = $'numberDialed'$
				point = $'value'$
			}
			CallBasedModem.otherModulationDescription is value hook if $otherModulationDescription.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherModulationDescription$
				port  = $'otherModulationDescription'$
				point = $'value'$
			}
			ConnectionBasedModem.vendorId is value hook if $vendorId.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $vendorId$
				port  = $'vendorId'$
				point = $'value'$
			}
			PhysicalCapcacity.name is value hook if $name.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $name$
				port  = $'name'$
				point = $'value'$
			}
			LANEndpoint.LANID is value hook if $LANID.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $LANID$
				port  = $'LANID'$
				point = $'value'$
			}
			LANEndpoint.LANType is value hook if $LANType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $LANType$
				port  = $'LANType'$
				point = $'value'$
			}
			LANEndpoint.otherLANType is value hook if $otherLANType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherLANType$
				port  = $'otherLANType'$
				point = $'value'$
			}
			LANEndpoint.MACAddress is value hook if $MACAddress.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $MACAddress$
				port  = $'MACAddress'$
				point = $'value'$
			}
			LANEndpoint.aliasAddress is value hook if $aliasAddress.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $aliasAddress$
				port  = $'aliasAddress'$
				point = $'value'$
			}
			LANEndpoint.groupAddresses is value hook if $groupAddresses.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $groupAddresses$
				port  = $'groupAddresses'$
				point = $'value'$
			}
			OSPFProtocolEndpointBase.authType is value hook if $authType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $authType$
				port  = $'authType'$
				point = $'value'$
			}
			OSPFProtocolEndpointBase.otherAuthType is value hook if $otherAuthType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherAuthType$
				port  = $'otherAuthType'$
				point = $'value'$
			}
			OSPFProtocolEndpointBase.authKey is value hook if $authKey.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $authKey$
				port  = $'authKey'$
				point = $'value'$
			}
			BGPProtocolEndpoint.localIdentifier is value hook if $localIdentifier.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $localIdentifier$
				port  = $'localIdentifier'$
				point = $'value'$
			}
			BGPProtocolEndpoint.perrIdentifier is value hook if $perrIdentifier.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $perrIdentifier$
				port  = $'perrIdentifier'$
				point = $'value'$
			}
			BGPProtocolEndpoint.adminStatus is value hook if $adminStatus.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $adminStatus$
				port  = $'adminStatus'$
				point = $'value'$
			}
			BGPProtocolEndpoint.negotiatedVersion is value hook if $negotiatedVersion.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $negotiatedVersion$
				port  = $'negotiatedVersion'$
				point = $'value'$
			}
			BGPProtocolEndpoint.localAddress is value hook if $localAddress.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $localAddress$
				port  = $'localAddress'$
				point = $'value'$
			}
			BGPProtocolEndpoint.remoteAddress is value hook if $remoteAddress.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $remoteAddress$
				port  = $'remoteAddress'$
				point = $'value'$
			}
			IPProtocolEndpoint.IPv4Address is value hook if $IPv4Address.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $IPv4Address$
				port  = $'IPv4Address'$
				point = $'value'$
			}
			IPProtocolEndpoint.subnetMask is value hook if $subnetMask.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $subnetMask$
				port  = $'subnetMask'$
				point = $'value'$
			}
			IPProtocolEndpoint.IPv6Address is value hook if $IPv6Address.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $IPv6Address$
				port  = $'IPv6Address'$
				point = $'value'$
			}
			IPXProtocolEndpoint.address is value hook if $address.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $address$
				port  = $'address'$
				point = $'value'$
			}
			CLPSettingData.currentDefaultTarget is value hook if $currentDefaultTarget.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $currentDefaultTarget$
				port  = $'currentDefaultTarget'$
				point = $'value'$
			}
			CLPSettingData.outputLanguage is value hook if $outputLanguage.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $outputLanguage$
				port  = $'outputLanguage'$
				point = $'value'$
			}
			TelnetSettingData.otherEnabledTerminalMode is value hook if $otherEnabledTerminalMode.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherEnabledTerminalMode$
				port  = $'otherEnabledTerminalMode'$
				point = $'value'$
			}
			TelnetSettingData.otherTerminalMode is value hook if $otherTerminalMode.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherTerminalMode$
				port  = $'otherTerminalMode'$
				point = $'value'$
			}
			TelnetSettingData.otherEnabledCharacterDisplayMode is value hook if $otherEnabledCharacterDisplayMode.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherEnabledCharacterDisplayMode$
				port  = $'otherEnabledCharacterDisplayMode'$
				point = $'value'$
			}
			TelnetSettingData.otherCharacterDisplayMode is value hook if $otherCharacterDisplayMode.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherCharacterDisplayMode$
				port  = $'otherCharacterDisplayMode'$
				point = $'value'$
			}
			TelnetSettingData.escapeCharacter is value hook if $escapeCharacter.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $escapeCharacter$
				port  = $'escapeCharacter'$
				point = $'value'$
			}
			SSHSettingData.enabledSSHVersions is value hook if $enabledSSHVersions.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $enabledSSHVersions$
				port  = $'enabledSSHVersions'$
				point = $'value'$
			}
			SSHSettingData.otherEnabledSSHVersion is value hook if $otherEnabledSSHVersion.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherEnabledSSHVersion$
				port  = $'otherEnabledSSHVersion'$
				point = $'value'$
			}
			SSHSettingData.SSHVersion is value hook if $SSHVersion.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $SSHVersion$
				port  = $'SSHVersion'$
				point = $'value'$
			}
			SSHSettingData.enabledEncryptionAlgorithms is value hook if $enabledEncryptionAlgorithms.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $enabledEncryptionAlgorithms$
				port  = $'enabledEncryptionAlgorithms'$
				point = $'value'$
			}
			SSHSettingData.otherEnabledEncryptionAlgorithm is value hook if $otherEnabledEncryptionAlgorithm.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherEnabledEncryptionAlgorithm$
				port  = $'otherEnabledEncryptionAlgorithm'$
				point = $'value'$
			}
			TelnetProtocolEndpoint.escapeCharacter is value hook if $escapeCharacter.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $escapeCharacter$
				port  = $'escapeCharacter'$
				point = $'value'$
			}
			TelnetProtocolEndpoint.otherCharacterDisplayMode is value hook if $otherCharacterDisplayMode.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherCharacterDisplayMode$
				port  = $'otherCharacterDisplayMode'$
				point = $'value'$
			}
			TelnetProtocolEndpoint.otherEnabledCharacterDisplayMode is value hook if $otherEnabledCharacterDisplayMode.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherEnabledCharacterDisplayMode$
				port  = $'otherEnabledCharacterDisplayMode'$
				point = $'value'$
			}
			TelnetProtocolEndpoint.otherEnabledTerminalMode is value hook if $otherEnabledTerminalMode.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherEnabledTerminalMode$
				port  = $'otherEnabledTerminalMode'$
				point = $'value'$
			}
			TelnetProtocolEndpoint.otherTerminalMode is value hook if $otherTerminalMode.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherTerminalMode$
				port  = $'otherTerminalMode'$
				point = $'value'$
			}
			DNSProtocolEndpoint.domainName is value hook if $domainName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $domainName$
				port  = $'domainName'$
				point = $'value'$
			}
			DNSProtocolEndpoint.hostname is value hook if $hostname.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $hostname$
				port  = $'hostname'$
				point = $'value'$
			}
			WirelessLANEndpoint.SSID is value hook if $SSID.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $SSID$
				port  = $'SSID'$
				point = $'value'$
			}
			WiFiEndpointSettings.otherAuthenticationMethod is value hook if $otherAuthenticationMethod.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherAuthenticationMethod$
				port  = $'otherAuthenticationMethod'$
				point = $'value'$
			}
			WiFiEndpointSettings.otherEncryptionMethod is value hook if $otherEncryptionMethod.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherEncryptionMethod$
				port  = $'otherEncryptionMethod'$
				point = $'value'$
			}
			WiFiEndpointSettings.PSKPassPhrase is value hook if $PSKPassPhrase.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $PSKPassPhrase$
				port  = $'PSKPassPhrase'$
				point = $'value'$
			}
			WiFiEndpointSettings.SSID is value hook if $SSID.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $SSID$
				port  = $'SSID'$
				point = $'value'$
			}
			ProtocolService.otherProtocol is value hook if $otherProtocol.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherProtocol$
				port  = $'otherProtocol'$
				point = $'value'$
			}
			FlowService.flowID is value hook if $flowID.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $flowID$
				port  = $'flowID'$
				point = $'value'$
			}
			NextHopRoute.instanceID is value hook if $instanceID.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $instanceID$
				port  = $'instanceID'$
				point = $'value'$
			}
			NextHopRoute.destinationAddress is value hook if $destinationAddress.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $destinationAddress$
				port  = $'destinationAddress'$
				point = $'value'$
			}
			NextHopRoute.typeOfRoute is value hook if $typeOfRoute.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $typeOfRoute$
				port  = $'typeOfRoute'$
				point = $'value'$
			}
			NextHopIPRoute.routeDerivation is value hook if $routeDerivation.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $routeDerivation$
				port  = $'routeDerivation'$
				point = $'value'$
			}
			NextHopIPRoute.otherDerivation is value hook if $otherDerivation.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherDerivation$
				port  = $'otherDerivation'$
				point = $'value'$
			}
			NextHopIPRoute.destinationMask is value hook if $destinationMask.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $destinationMask$
				port  = $'destinationMask'$
				point = $'value'$
			}
			NextHopIPRoute.addressType is value hook if $addressType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $addressType$
				port  = $'addressType'$
				point = $'value'$
			}
			AdministrativeDistance.creationClassName is value hook if $creationClassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $creationClassName$
				port  = $'creationClassName'$
				point = $'value'$
			}
			NextHopRouting.destinationAddress is value hook if $destinationAddress.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $destinationAddress$
				port  = $'destinationAddress'$
				point = $'value'$
			}
			NextHopRouting.destinationMask is value hook if $destinationMask.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $destinationMask$
				port  = $'destinationMask'$
				point = $'value'$
			}
			NextHopRouting.nextHop is value hook if $nextHop.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $nextHop$
				port  = $'nextHop'$
				point = $'value'$
			}
			IPRoute.creationClassName is value hook if $creationClassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $creationClassName$
				port  = $'creationClassName'$
				point = $'value'$
			}
			IPRoute.IPDestinationAddress is value hook if $IPDestinationAddress.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $IPDestinationAddress$
				port  = $'IPDestinationAddress'$
				point = $'value'$
			}
			IPRoute.IPDestinationMask is value hook if $IPDestinationMask.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $IPDestinationMask$
				port  = $'IPDestinationMask'$
				point = $'value'$
			}
			IPRoute.addressType is value hook if $addressType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $addressType$
				port  = $'addressType'$
				point = $'value'$
			}
			RoutingPolicy.creationClassName is value hook if $creationClassName.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $creationClassName$
				port  = $'creationClassName'$
				point = $'value'$
			}
			RoutingPolicy.action is value hook if $action.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $action$
				port  = $'action'$
				point = $'value'$
			}
			RoutingPolicy.attributeAction is value hook if $attributeAction.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $attributeAction$
				port  = $'attributeAction'$
				point = $'value'$
			}
			RoutingPolicy.BGPAction is value hook if $BGPAction.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $BGPAction$
				port  = $'BGPAction'$
				point = $'value'$
			}
			RoutingPolicy.BGPValue is value hook if $BGPValue.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $BGPValue$
				port  = $'BGPValue'$
				point = $'value'$
			}
			RoutingPolicy.remarkAction is value hook if $remarkAction.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $remarkAction$
				port  = $'remarkAction'$
				point = $'value'$
			}
			RoutingPolicy.remarkValue is value hook if $remarkValue.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $remarkValue$
				port  = $'remarkValue'$
				point = $'value'$
			}
			RoutingPolicy.conditioningAction is value hook if $conditioningAction.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $conditioningAction$
				port  = $'conditioningAction'$
				point = $'value'$
			}
			RoutingPolicy.otherConditioningAction is value hook if $otherConditioningAction.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherConditioningAction$
				port  = $'otherConditioningAction'$
				point = $'value'$
			}
			RoutingPolicy.conditioningValue is value hook if $conditioningValue.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $conditioningValue$
				port  = $'conditioningValue'$
				point = $'value'$
			}
			RouteCalculationService.routerID is value hook if $routerID.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $routerID$
				port  = $'routerID'$
				point = $'value'$
			}
			RouteCalculationService.algorithmType is value hook if $algorithmType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $algorithmType$
				port  = $'algorithmType'$
				point = $'value'$
			}
			NetworkService.keywords is value hook if $keywords.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $keywords$
				port  = $'keywords'$
				point = $'value'$
			}
			NetworkService.serviceURL is value hook if $serviceURL.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $serviceURL$
				port  = $'serviceURL'$
				point = $'value'$
			}
			NetworkService.startupConditions is value hook if $startupConditions.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $startupConditions$
				port  = $'startupConditions'$
				point = $'value'$
			}
			NetworkService.startupParameters is value hook if $startupParameters.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $startupParameters$
				port  = $'startupParameters'$
				point = $'value'$
			}
			ForwardingService.protocolType is value hook if $protocolType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $protocolType$
				port  = $'protocolType'$
				point = $'value'$
			}
			ForwardingService.otherProtocolType is value hook if $otherProtocolType.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $otherProtocolType$
				port  = $'otherProtocolType'$
				point = $'value'$
			}
			NATStaticSettings.insideAddress is value hook if $insideAddress.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $insideAddress$
				port  = $'insideAddress'$
				point = $'value'$
			}
			NATStaticSettings.outsideAddress is value hook if $outsideAddress.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $outsideAddress$
				port  = $'outsideAddress'$
				point = $'value'$
			}
			SNMPCommunityStrings.communityString is value hook if $communityString.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $communityString$
				port  = $'communityString'$
				point = $'value'$
			}
			SNMPCommunityStrings.typeOfAccess is value hook if $typeOfAccess.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $typeOfAccess$
				port  = $'typeOfAccess'$
				point = $'value'$
			}
			SNMPCommunityStrings.logicalEntitiesAccessed is value hook if $logicalEntitiesAccessed.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $logicalEntitiesAccessed$
				port  = $'logicalEntitiesAccessed'$
				point = $'value'$
			}
			SNMPCommunityStrings.logicalEntitiesDescriptions is value hook if $logicalEntitiesDescriptions.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $logicalEntitiesDescriptions$
				port  = $'logicalEntitiesDescriptions'$
				point = $'value'$
			}
			SNMPTrapTarget.notificationMessage is value hook if $notificationMessage.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $notificationMessage$
				port  = $'notificationMessage'$
				point = $'value'$
			}
			SNMPTrapTarget.SNMPVersion is value hook if $SNMPVersion.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $SNMPVersion$
				port  = $'SNMPVersion'$
				point = $'value'$
			}
			SNMPTrapTarget.communityString is value hook if $communityString.startsWith('%') and not elementName.startsWith('*') and not elementName.startsWith('?')$ {
				homo port = $communityString$
				port  = $'communityString'$
				point = $'value'$
			}
		}
	}



}

