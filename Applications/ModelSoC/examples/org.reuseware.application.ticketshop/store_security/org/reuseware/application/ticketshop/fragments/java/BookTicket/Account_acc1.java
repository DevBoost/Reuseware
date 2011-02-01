import javax.swing.JOptionPane;

class PLACEHOLDER {
	
	Object VALUE_SLOT;
	
	public void SECURITY_BEFORE_SEND() {
		//String pin  = 
		javax.swing.JOptionPane.showInputDialog(null, "Please enter your PIN code.",
				"Security Question",
				JOptionPane.QUESTION_MESSAGE);

		VALUE_SLOT = /* DO ENCRYPTION */ VALUE_SLOT;	
	}
	
	public void SECURITY_AFTER_RECEIVE() {
		VALUE_SLOT = /* DO DECRIPT */ VALUE_SLOT;	
	}
}