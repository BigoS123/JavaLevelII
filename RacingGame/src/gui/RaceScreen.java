package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class RaceScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RaceScreen window = new RaceScreen();
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
	public RaceScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 648, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRaceProgress = new JLabel("Race Progress");
		lblRaceProgress.setBounds(10, 345, 414, 14);
		frame.getContentPane().add(lblRaceProgress);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(10, 330, 612, 29);
		frame.getContentPane().add(progressBar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Korepetycje\\git\\JavaLevelII\\Lesson1\\RacingGame\\img\\1280px-2012_WTCC_Race_of_Japan_(Race_1)_opening_lap.png"));
		label.setBounds(0, 0, 640, 377);
		frame.getContentPane().add(label);
	}
}
