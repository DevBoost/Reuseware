compositionlanguagesyntax org.reuseware.application.cim.rex.CIMReuseCoreSyntax
implements org.reuseware.application.cim.fracol.CIMReuseCore {

	fragment role Core {
		fragment   = $'CORE'$ 
		ufi        = $'org/reuseware/application/cim/lib/EmptyCore.cim'$
		target ufi = $ufi.trimExtension().appendExtension('cim')$
		target location = $'out'$
		visible    = $false$
	}
	
	fragment role Element {
		icon   = $ufi.trimExtension().appendExtension('gif')$
		width  = $100$
		height = $50$
		
		port type contents {
			visible = $false$
		}
	}
	

}

	  
		 
	
  
	  
		 
		 
		 
	
	
	  
		 
	
