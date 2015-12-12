package gui;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SwitchPanel extends Applet {

	Button cel2farBN = new Button("Cel2Far");
	Button ft2inBN = new Button("Feet2Inches");
	Button periBN = new Button("Perimeter");
	Button areaBN = new Button("Area");

	Cel2FarGUI cel2farPN = new Cel2FarGUI();
	Feet2inchesGUI ft2inPN = new Feet2inchesGUI();
	PeriSquare periPN = new PeriSquare();
	SquareGUI areaPN = new SquareGUI();
	
	
	Panel currentPN = cel2farPN;

	public void init() {

		setLayout(null);
		setSize(400, 200);

		add(cel2farBN);
		add(ft2inBN);
		add(periBN);
		add(areaBN);

		add(cel2farPN);
		add(ft2inPN);
		add(areaPN);
		add(periPN);
		
		

		cel2farBN.setBounds(220, 10, 100, 20);
		ft2inBN.setBounds(220, 40, 100, 20);
		periBN.setBounds(220, 70, 100, 20);
		areaBN.setBounds(220, 100, 100, 20);

		cel2farPN.setBounds(0, 0, 200, 200);
		ft2inPN.setBounds(-1000, 0, 200, 200);
		periPN.setBounds(-1000, 0, 200, 200);
		areaPN.setBounds(-1000, 0, 200, 200);

		cel2farBN.addActionListener(new Switchlis(cel2farPN));// this is letting the OS know that this is getting the actionlistner.the OS will call the action performed.
		ft2inBN.addActionListener(new Switchlis(ft2inPN));
		periBN.addActionListener(new Switchlis(periPN));
		areaBN.addActionListener(new Switchlis(areaPN));
		
		
		

	}

	public class Switchlis implements ActionListener {

		UnaryGUI newpanel;

		public Switchlis(UnaryGUI newpanel) {

			this.newpanel = newpanel;

		}

		public void actionPerformed(ActionEvent arg0) {
			
			
			newpanel.clear();
			newpanel.setBounds(0, 0, 200, 200);

			currentPN.setBounds(-1000, 0, 200, 200);
		
			currentPN = newpanel;
			

		}

	}

	// this is more work for the computer. and for you. if you had more buttons
	// then this function would be very big.

//	public class Cel2farlis implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent arg0) {
//			cel2farPN.setBounds(0, 0, 200, 200);
//			cel2farPN.clear();
//			ft2inPN.setBounds(330, 0, 200, 200);
//
//		}
//
//	}
//
//	public class Ft2Inlis implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent arg0) {
//			ft2inPN.setBounds(0, 0, 200, 200);
//			ft2inPN.clear();
//			cel2farPN.setBounds(330, 0, 200, 200);
//
//		}
//	}

}