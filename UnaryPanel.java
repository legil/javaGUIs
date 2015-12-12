package gui;

import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnaryPanel extends Panel implements ActionListener {
	Label inputLB = new Label("hello");

	TextField inputTF = new TextField();

	Label resultLB = new Label();

	Button calcBN = new Button();

	public void init() {
		
		
		
		setLayout(null);

		inputLB.setBounds(10, 10, 150, 20);

		inputTF.setBounds(10, 30, 150, 20);

		resultLB.setBounds(10, 60, 150, 20);

		calcBN.setBounds(10, 90, 150, 20);

		add(inputLB);
		add(inputTF);
		add(resultLB);
		add(calcBN);

		calcBN.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e){
		
		int input=Integer.parseInt(inputTF.getText());
		
		int result = input+1;
		
		resultLB.setText(""+result);
		
		
		}

}
