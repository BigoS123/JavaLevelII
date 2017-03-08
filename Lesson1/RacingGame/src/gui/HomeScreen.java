package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeScreen {

	//TODO 1 stworzyc klasy z obiektami wykorzystywanymi w grze z polami
	//TODO 2 stworzyc gettery i settery
	//TODO 3 stworzyc w oddzielnych klasach szablony ekranow
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
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
	public HomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 538, 323);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRacingGame = new JLabel("RACING GAME");
		lblRacingGame.setFont(new Font("Tahoma", Font.PLAIN, 49));
		lblRacingGame.setForeground(Color.CYAN);
		lblRacingGame.setBounds(47, 11, 346, 52);
		frame.getContentPane().add(lblRacingGame);
		
		JLabel label_1 = new JLabel("RACING GAME");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 49));
		label_1.setBounds(57, 6, 438, 63);
		frame.getContentPane().add(label_1);
		
		JButton btnNewGame = new JButton("Race");
		btnNewGame.setBounds(350, 92, 147, 23);
		frame.getContentPane().add(btnNewGame);
		
		JButton btnNewButton = new JButton("Upgrade car");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(350, 126, 147, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Korepetycje\\git\\JavaLevelII\\Lesson1\\RacingGame\\img\\dusk-drive_dynamic_feature.png"));
		label.setBounds(0, 0, 516, 282);
		frame.getContentPane().add(label);
	}
}
