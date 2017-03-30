package gui;

import javax.swing.JPanel;

import app.Application;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPanel extends JPanel {

	public FirstPanel() {
		super();
		this.setBounds(0, 0, 434, 262);
		JButton btnFirstbutton = new JButton("firstButton");
		btnFirstbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Application.mainFrame.replacePanel(new SecondPanel());
				
			}
		});
		add(btnFirstbutton);
		
	}

}
