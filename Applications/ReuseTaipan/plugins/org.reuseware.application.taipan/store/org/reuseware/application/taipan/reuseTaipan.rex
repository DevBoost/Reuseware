componentmodel org.reuseware.application.taipan.reuseTaipan
implements org.reuseware.application.taipan.reuseTaipan
epackages <http://www.reuseware.org/application/taipan> 
rootclass Aquatory
{

	fragment role TravelSpace {
		port type VehicleContainer {
			Aquatory.ships is hook {}
			Aquatory.ports is hook {}
			Aquatory.routes is hook {}
		}
		port type Routes {
			Route is anchor {
	   			port = $self.description$
			}
		}
		port type Places {		
			Port is anchor {
	   			port = $self.location.concat('Port')$
			}
		}
	}
	
	fragment role Flotilla {
		port type Vehicles {
			Aquatory.ships is prototype {}
			Aquatory.ports is prototype {}
			Aquatory.routes is prototype {}
		}
		port type RouteSlots {
			RouteSlot is slot {
	   			port = $self.portName$
			}
		}
		port type PlaceSlots {
			PortSlot is slot {
	   			port = $self.portName$
			}
		}
	}
	
	fragment role ItemHolder {
		port type ItemSpaces { 
			LargeItemHook is hook {
				mode = $'bind'$
				port = $self.portName$
			}
	   	}
	}
	
	fragment role ItemContainer {
		port type Items {
			LargeItem is prototype {
	   			port = $self.article$
			}
		}
	}
}
