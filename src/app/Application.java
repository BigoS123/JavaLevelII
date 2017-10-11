package app;

import java.awt.EventQueue;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.MainFrame;
import model.User;
import util.UTF8Control;

//TODO Zrobi� przej�cia pomi�dzy poszczegolnymi ekranami w analogiczny sposob do LoginPanel i HomePanel
public class Application {

	public static User loggedUser;
	public static ResourceBundle appNameResourceBundle;

	public static void main(String[] args) {

		 setUpApplication();
		 startUpApplication();

	}

	private static void startDataBase(){
//		DBConnection.getInstance().init();
//		DBConnection.getInstance().registerShutdownHook();
	}
	
	
	private static void setUpApplication() {
		setApplicationLanguage("pl", "PL");
	}

	private static void setApplicationLanguage(String country, String language ) {
        Locale locale = new Locale(country, language);    
        appNameResourceBundle = ResourceBundle.getBundle("languages.messages", locale, new UTF8Control());
    }
	
	private static void startUpApplication() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame.getInstance().init();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
