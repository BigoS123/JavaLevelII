package app;

import java.awt.EventQueue;

import database.DBConnection;
import gui.MainFrame;
import model.User;

//TODO Zrobiæ przejœcia pomiêdzy poszczegolnymi ekranami w analogiczny sposob do LoginPanel i HomePanel
public class Application {

	public static User loggedUser;

	public static void main(String[] args) {

//		DBConnection.getInstance().init();
//		DBConnection.getInstance().registerShutdownHook();
		 startUpApplication();

	}

	private void setUpApplication() {

	}

	private static void startUpApplication() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame.getInstance();
					MainFrame.getInstance().init();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
