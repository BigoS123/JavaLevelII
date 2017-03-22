package gui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class randomScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					randomScreen window = new randomScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public randomScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		gui(frame);
		frame.pack();
		frame.setVisible(true);
	}

	public void gui(JFrame frame) {
		try {
			frame.setLocation(0, 100);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ImageIcon img = new ImageIcon(getClass().getResource("/resources/dusk-drive_dynamic_feature.png"));
			frame.getContentPane().add(new JLabel(img));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
