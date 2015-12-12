package gui;

import java.applet.*;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;

public class FirstGUI extends Applet {
	Label radiusLB = new Label("Enter the radius");
	TextField radiusTF = new TextField();
	Button areaBN = new Button("Area");
	Button circBN = new Button("Circumference");
	Label resultLB = new Label("Result");

	public void init() {
		setLayout(null);

		add(radiusLB);
		add(radiusTF);
		add(areaBN);
		add(resultLB);
		add(circBN);

		radiusLB.setBounds(10, 10, 150, 20);
		radiusTF.setBounds(10, 30, 150, 20);
		resultLB.setBounds(10, 60, 150, 20);
		areaBN.setBounds(10, 100, 150, 20);
		circBN.setBounds(10, 130, 150, 20);

		arealistener al = new arealistener();
		circlistener cl = new circlistener();

		circBN.addActionListener(new circlistener());
		areaBN.addActionListener(new arealistener());
	}

	public class arealistener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			float radius = Float.parseFloat(radiusTF.getText());
			float area = (float) Math.PI * radius * radius;
			resultLB.setText("Area=" + area);

		}

	}

	public class circlistener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			float radius = Float.parseFloat(radiusTF.getText());

			float circ = 2 * (float) Math.PI * radius;
			resultLB.setText("Circumference=" + circ);

		}

	}

}
