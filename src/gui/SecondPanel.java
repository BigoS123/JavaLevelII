package gui;

import javax.swing.JButton;
import javax.swing.JPanel;

import app.Application;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondPanel extends JPanel {

	public SecondPanel() {
		super();
		this.setBounds(0, 0, 434, 262);
		JButton btnSeccondbutton = new JButton("secondButton");
		btnSeccondbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Application.mainFrame.replacePanel(new FirstPanel());
			}
		});
		add(btnSeccondbutton);
		
	}

}
