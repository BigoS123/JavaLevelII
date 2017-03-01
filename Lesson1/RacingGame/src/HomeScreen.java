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

public class HomeScreen {

	//TODO 1 stworzyc klasy z obiektami wykorzystywanymi w grze z polami
	//TODO 2 stworzyc gettery i settery
	//TODO 3 stworzyc w oddzielnych klasach szablony ekranow
	
	private JFrame frame;
	private JTextField textFieldLogin;
	private JTable table;

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
		frame.setBounds(100, 100, 788, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCalculate = new JButton("Oblicz");
		btnCalculate.setBounds(550, 91, 89, 23);
		frame.getContentPane().add(btnCalculate);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(479, 195, 86, 20);
		frame.getContentPane().add(textFieldLogin);
		textFieldLogin.setColumns(10);
		
		JLabel lblLogin = new JLabel("New label");
		lblLogin.setBounds(395, 198, 46, 14);
		frame.getContentPane().add(lblLogin);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(333, 116, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		table = new JTable();
		table.setBounds(59, 111, 97, -75);
		frame.getContentPane().add(table);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(27, 178, 146, 14);
		frame.getContentPane().add(progressBar);
		
		JSlider slider = new JSlider();
		slider.setBounds(101, 257, 200, 26);
		frame.getContentPane().add(slider);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(519, 257, 17, 48);
		frame.getContentPane().add(scrollBar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(262, 324, 1, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(194, 75, 89, 61);
		frame.getContentPane().add(separator_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(101, 92, 29, 20);
		frame.getContentPane().add(spinner);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(320, 29, 121, 23);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(498, 29, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(59, 11, 97, 23);
		frame.getContentPane().add(comboBox);
	}
}
