componentmodel org.reuseware.lib.systems.flow.cm.valueflow
implements org.reuseware.lib.systems.flow.flow
epackages <http://www.emftext.org/language/valueflow>
rootclass Model 
{ 
	//1 = Give
	fragment role Participant1 {
		port type Self {
			GiveState is anchor {}
		}
		port type Next {
			GiveState.nextState is slot {}
		}
	}

	//2 = Take
	fragment role Participant2 {
		port type Self {
			TakeState is anchor {}
		}
		port type Next {
			TakeState.nextState is slot {}
		}
	}

} 