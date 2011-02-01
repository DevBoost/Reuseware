package org.reuseware.application.ticketshop.integrated.java;

public class APP_NAME {

	public static void main(java.lang.String[] args) {
		APP_NAMEWindow window = new APP_NAMEWindow();
		
		APP_CODE : ;
		
		init(window);
	}
	
	private static void init(APP_NAMEWindow window) {
		window.setTitle("Ticketshop! What would you like to do?");
		window.setLayout(new java.awt.GridLayout());
		for (final org.reuseware.lib.systems.usecase.lib.IUseCase process : window.processList) {
			final javax.swing.JButton startButton = new javax.swing.JButton(
					process.getClass().getSimpleName());
			startButton.addActionListener(new java.awt.event.ActionListener() {
				
				public void actionPerformed(java.awt.event.ActionEvent e) {
					process.start();
				}
			});
			startButton.setVisible(true);
			
			window.getContentPane().add(startButton);
		}
		
		window.pack();
		window.setVisible(true);
	}

	public static class APP_NAMEWindow extends
			javax.swing.JDialog implements
			org.reuseware.lib.systems.app.lib.IProcessContainer {

		private static final long serialVersionUID = 1L;
		
		private java.util.List<org.reuseware.lib.systems.usecase.lib.IUseCase> processList = new java.util.ArrayList<org.reuseware.lib.systems.usecase.lib.IUseCase>();

		public void addProcess(org.reuseware.lib.systems.usecase.lib.IUseCase p) {
			processList.add(p);
		}
	}
}
