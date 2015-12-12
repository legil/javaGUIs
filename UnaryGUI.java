package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class UnaryGUI extends Panel implements ActionListener {

	Label inputLB = new Label(inputText());

	TextField inputTF = new TextField();

	Label resultLB = new Label(resultText());

	Button calcBN = new Button(calcText());

	public UnaryGUI() {
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
		
		int result = calculate(input);
		
		resultLB.setText(resultText()+result);
		
		
		}
	
	
	public void clear(){
		
		inputTF.setText("");
		
		resultLB.setText("");
		
		
	}
	
	public abstract int calculate(int input);

	public abstract String calcText();

	public abstract String resultText();

	public abstract String inputText();

}
