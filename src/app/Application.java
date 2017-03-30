package app;

import java.awt.EventQueue;

import gui.MainFrame;

public class Application {

	public static MainFrame mainFrame;
	
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame = new MainFrame();
					mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		

	}


}
