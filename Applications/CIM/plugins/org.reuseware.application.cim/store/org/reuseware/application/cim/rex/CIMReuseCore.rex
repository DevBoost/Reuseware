componentmodel org.reuseware.application.cim.rex.CIMReuseCore
implements     org.reuseware.application.cim.fracol.CIMReuseCore
epackages <http://www.tid.es/cim>
rootclass CIM_Model
{
	fragment role Core if $elements->isEmpty()$ {
		port type extension  {
			CIM_Model.elements is hook {}
		}	
	}	
	fragment role Element if $not elements->isEmpty()$ { 
		port type contents {
			CIM_Model.elements is prototype {}
		}
	}
}

