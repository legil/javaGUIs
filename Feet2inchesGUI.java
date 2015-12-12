package gui;



public class Feet2inchesGUI extends UnaryGUI {
	public String calcText() {
		return "Find Inches";
	}

	public String resultText() {
		return "Inches:";
	}

	public String inputText() {
		return "Feet";
	}
public int calculate(int cel){
		
		cel=cel*12;
		
		return cel;
}
}
