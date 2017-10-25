package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import app.Application;
import controller.HomeController;
import controller.UpgradeController;

public class UpgradePanel extends AppPanel implements PanelView {

	
	private static UpgradePanel instance;
	
private JButton btnUpgradeEngine;
private JButton btnUpgradeBody;
private JButton btnBuySpoiler;
private JButton btnBuyTurbo;
private JToggleButton tglbtnToggleTurbo;
private JButton btnUpgradeBrakes;
private JButton btnUpgradeSuspention;
private JButton btnUpgradeTyres;
private JButton btnBuySkirts;
private JLabel lblSetBalanceBetween;
private JSlider slider;

private BufferedImage image;


	public UpgradePanel() {
		super();

		btnUpgradeEngine = new JButton(Application.appNameResourceBundle.getString("btnUpgradeEngine"));
		btnUpgradeEngine.setBounds(5, 5, 109, 23);
		add(btnUpgradeEngine);

		btnUpgradeBody = new JButton(Application.appNameResourceBundle.getString("btnUpgradeBody"));
		btnUpgradeBody.setBounds(119, 5, 133, 23);
		add(btnUpgradeBody);

		btnBuySpoiler = new JButton(Application.appNameResourceBundle.getString("btnBuySpoiler"));
		btnBuySpoiler.setBounds(257, 5, 85, 23);
		add(btnBuySpoiler);

		btnBuyTurbo = new JButton(Application.appNameResourceBundle.getString("btnBuyTurbo"));
		btnBuyTurbo.setBounds(347, 5, 81, 23);
		add(btnBuyTurbo);

		tglbtnToggleTurbo = new JToggleButton(Application.appNameResourceBundle.getString("tglbtnToggleTurbo"));
		tglbtnToggleTurbo.setEnabled(false);
		tglbtnToggleTurbo.setBackground(Color.WHITE);
		tglbtnToggleTurbo.setBounds(45, 33, 95, 23);
		add(tglbtnToggleTurbo);

		btnUpgradeBrakes = new JButton(Application.appNameResourceBundle.getString("btnUpgradeBrakes"));
		btnUpgradeBrakes.setBounds(145, 33, 109, 23);
		add(btnUpgradeBrakes);

		btnUpgradeSuspention = new JButton(Application.appNameResourceBundle.getString("btnUpgradeSuspention"));
		btnUpgradeSuspention.setBounds(259, 33, 129, 23);
		add(btnUpgradeSuspention);

		btnUpgradeTyres = new JButton(Application.appNameResourceBundle.getString("btnUpgradeTyres"));
		btnUpgradeTyres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpgradeTyres.setBounds(4, 61, 103, 23);
		add(btnUpgradeTyres);

		btnBuySkirts = new JButton(Application.appNameResourceBundle.getString("btnBuySkirts"));
		btnBuySkirts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBuySkirts.setBounds(112, 61, 79, 23);
		add(btnBuySkirts);

		lblSetBalanceBetween = new JLabel(Application.appNameResourceBundle.getString("lblSetBalanceBetween"));
		lblSetBalanceBetween.setBackground(Color.ORANGE);
		lblSetBalanceBetween.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblSetBalanceBetween.setBounds(196, 66, 235, 13);
		add(lblSetBalanceBetween);

		slider = new JSlider();
		slider.setBounds(228, 90, 200, 26);
		add(slider);
		lblSetBalanceBetween.setLabelFor(slider);
		
		try {
			
			image = ImageIO.read(getClass().getResource("/img/UpgradePanel.png"));
		} catch (IOException e) {
			 e.printStackTrace();
		}

	}
		
		
	
	public static UpgradePanel getInstance(){
		if(instance == null){
			instance = new UpgradePanel();
		}
		return instance;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this);
	}
	
	public JButton getBtnUpgradeEngine() {
		return btnUpgradeEngine;
	}

	public void setBtnUpgradeEngine(JButton btnUpgradeEngine) {
		this.btnUpgradeEngine = btnUpgradeEngine;
	}

	public JButton getBtnUpgradeBody() {
		return btnUpgradeBody;
	}

	public void setBtnUpgradeBody(JButton btnUpgradeBody) {
		this.btnUpgradeBody = btnUpgradeBody;
	}

	public JButton getBtnBuySpoiler() {
		return btnBuySpoiler;
	}

	public void setBtnBuySpoiler(JButton btnBuySpoiler) {
		this.btnBuySpoiler = btnBuySpoiler;
	}

	public JButton getBtnBuyTurbo() {
		return btnBuyTurbo;
	}

	public void setBtnBuyTurbo(JButton btnBuyTurbo) {
		this.btnBuyTurbo = btnBuyTurbo;
	}

	public JToggleButton getTglbtnToggleTurbo() {
		return tglbtnToggleTurbo;
	}

	public void setTglbtnToggleTurbo(JToggleButton tglbtnToggleTurbo) {
		this.tglbtnToggleTurbo = tglbtnToggleTurbo;
	}

	public JButton getBtnUpgradeBrakes() {
		return btnUpgradeBrakes;
	}

	public void setBtnUpgradeBrakes(JButton btnUpgradeBrakes) {
		this.btnUpgradeBrakes = btnUpgradeBrakes;
	}

	public JButton getBtnUpgradeSuspention() {
		return btnUpgradeSuspention;
	}

	public void setBtnUpgradeSuspention(JButton btnUpgradeSuspention) {
		this.btnUpgradeSuspention = btnUpgradeSuspention;
	}

	public JButton getBtnUpgradeTyres() {
		return btnUpgradeTyres;
	}

	public void setBtnUpgradeTyres(JButton btnUpgradeTyres) {
		this.btnUpgradeTyres = btnUpgradeTyres;
	}

	public JButton getBtnBuySkirts() {
		return btnBuySkirts;
	}

	public void setBtnBuySkirts(JButton btnBuySkirts) {
		this.btnBuySkirts = btnBuySkirts;
	}

	public JLabel getLblSetBalanceBetween() {
		return lblSetBalanceBetween;
	}

	public void setLblSetBalanceBetween(JLabel lblSetBalanceBetween) {
		this.lblSetBalanceBetween = lblSetBalanceBetween;
	}

	public JSlider getSlider() {
		return slider;
	}

	public void setSlider(JSlider slider) {
		this.slider = slider;
	}

	@Override
	public void initPanelView() {
		UpgradeController.getInstance().initController();
		
	}


}
