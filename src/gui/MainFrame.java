package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class MainFrame extends JFrame {



	/**
	 * Create the frame.
	 */
	public MainFrame() {
		super();
		HomePanel homePanel = new HomePanel();
		setLayout(new BorderLayout());
		add(homePanel, BorderLayout.CENTER);
		setVisible(true);
		pack();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void replacePanel(JPanel newPanel){
		
	}	
	
}
