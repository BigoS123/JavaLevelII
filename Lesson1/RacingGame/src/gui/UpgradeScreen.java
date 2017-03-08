package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSlider;
import java.awt.Font;

public class UpgradeScreen {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpgradeScreen window = new UpgradeScreen();
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
	public UpgradeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 628, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnUpgradeEngine = new JButton("Upgrade Engine");
		btnUpgradeEngine.setBounds(131, 169, 151, 23);
		frame.getContentPane().add(btnUpgradeEngine);
		
		JButton btnUpgradeBody = new JButton("Reduce Body Weight");
		btnUpgradeBody.setBounds(55, 93, 200, 23);
		frame.getContentPane().add(btnUpgradeBody);
		
		JButton btnBuySpoiler = new JButton("Buy Spoiler");
		btnBuySpoiler.setBounds(482, 0, 120, 23);
		frame.getContentPane().add(btnBuySpoiler);
		
		JButton btnBuyTurbo = new JButton("Buy Turbo");
		btnBuyTurbo.setBounds(167, 229, 105, 23);
		frame.getContentPane().add(btnBuyTurbo);
		
		JToggleButton tglbtnToggleTurbo = new JToggleButton("Toggle Turbo");
		tglbtnToggleTurbo.setEnabled(false);
		tglbtnToggleTurbo.setBackground(Color.WHITE);
		tglbtnToggleTurbo.setBounds(167, 252, 105, 23);
		frame.getContentPane().add(tglbtnToggleTurbo);
		
		JButton btnUpgradeBrakes = new JButton("Upgrade Brakes");
		btnUpgradeBrakes.setBounds(431, 110, 151, 23);
		frame.getContentPane().add(btnUpgradeBrakes);
		
		JButton btnUpgradeSuspention = new JButton("Upgrade Suspention");
		btnUpgradeSuspention.setBounds(302, 229, 200, 23);
		frame.getContentPane().add(btnUpgradeSuspention);
		
		JButton btnUpgradeTyres = new JButton("Upgrade Tyres");
		btnUpgradeTyres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpgradeTyres.setBounds(387, 301, 120, 23);
		frame.getContentPane().add(btnUpgradeTyres);
		
		JButton btnBuySkirts = new JButton("Buy Skirts");
		btnBuySkirts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBuySkirts.setBounds(482, 195, 105, 23);
		frame.getContentPane().add(btnBuySkirts);
		
		textField = new JTextField();
		textField.setBounds(213, 11, 125, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNameYourCar = new JLabel("Name Your Car");
		lblNameYourCar.setBounds(122, 10, 84, 25);
		frame.getContentPane().add(lblNameYourCar);
		
		JLabel lblSetBalanceBetween = new JLabel("Set Balance Between Speed and Acceleration");
		lblSetBalanceBetween.setBackground(Color.ORANGE);
		lblSetBalanceBetween.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblSetBalanceBetween.setBounds(215, 347, 246, 23);
		frame.getContentPane().add(lblSetBalanceBetween);
		
		JLabel lblSpeed = new JLabel("Speed");
		lblSpeed.setBounds(177, 355, 58, 15);
		frame.getContentPane().add(lblSpeed);
		
		JLabel lblAcceleration = new JLabel("Acceleration");
		lblAcceleration.setBounds(10, 358, 66, 12);
		frame.getContentPane().add(lblAcceleration);
		
		JSlider slider = new JSlider();
		slider.setBounds(10, 333, 200, 26);
		frame.getContentPane().add(slider);
		lblSetBalanceBetween.setLabelFor(slider);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Korepetycje\\git\\JavaLevelII\\Lesson1\\RacingGame\\img\\a501199.png"));
		label.setBounds(0, 0, 622, 378);
		frame.getContentPane().add(label);
	}
}
