package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CarChoice {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarChoice window = new CarChoice();
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
	public CarChoice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 783, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnBmw = new JRadioButton("BMW");
		rdbtnBmw.setBounds(53, 105, 109, 23);
		frame.getContentPane().add(rdbtnBmw);
		
		JRadioButton rdbtnAudi = new JRadioButton("AUDI");
		rdbtnAudi.setBounds(258, 105, 109, 23);
		frame.getContentPane().add(rdbtnAudi);
		
		JRadioButton rdbtnBugatti = new JRadioButton("BUGATTI");
		rdbtnBugatti.setBounds(474, 105, 109, 23);
		frame.getContentPane().add(rdbtnBugatti);
		
		JLabel lblNewLabel = new JLabel("CHOSE YOUR CAR");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 55));
		lblNewLabel.setBounds(79, 11, 504, 69);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("D:\\Korepetycje\\git\\JavaLevelII\\Lesson1\\RacingGame\\img\\5824.jpg"));
		label_1.setBounds(224, 165, 164, 122);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("D:\\Korepetycje\\git\\JavaLevelII\\Lesson1\\RacingGame\\img\\1412804549363694769.jpg"));
		label_2.setBounds(450, 165, 197, 122);
		frame.getContentPane().add(label_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\USC60BMC111A021001.jpg"));
		label.setBounds(10, 165, 152, 100);
		frame.getContentPane().add(label);
		
		JLabel lblLookOfCar = new JLabel("Look of car doesn't affect statistics");
		lblLookOfCar.setBounds(311, 75, 229, 23);
		frame.getContentPane().add(lblLookOfCar);
		
		JButton btnConfirmChoice = new JButton("Confirm choice");
		btnConfirmChoice.setBounds(585, 338, 125, 34);
		frame.getContentPane().add(btnConfirmChoice);
	}
}
