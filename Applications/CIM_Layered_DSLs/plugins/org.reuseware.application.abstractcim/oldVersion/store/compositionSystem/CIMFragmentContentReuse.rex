reuseextension FragmentContentReuse
for <http://www.tid.es/cim>
{
	binding EmptyCore if $elements->isEmpty()$ {
		binding extension  {
			CIM_Model.elements is hook {}
		}	
	}	
	binding Element if $not elements->isEmpty()$ { 
		binding contents {
			CIM_Model.elements is prototype {}
		}
	}
}

