package gui;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Cont extends Applet implements ActionListener {
	
	Button b1 = new Button("Area");
	Button b2 = new Button("cel");
	Button b3 = new Button("Hello");
	Button b4 = new Button("ok");

	public void init() {

		setLayout(null);
		b1.setBounds(10, 10, 150, 20);
		b2.setBounds(10, 40, 150, 20);
		b3.setBounds(10, 70, 150, 20);
		b4.setBounds(10, 100, 150, 20);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("cel")){
			
		}
			

	}

}
