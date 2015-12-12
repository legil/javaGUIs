package gui;

public class Cel2FarGUI extends UnaryGUI {

	public String calcText() {
		return "Find Farhrenhiet";
	}

	public String resultText() {
		return "Farhrenhiet: ";
	}

	public String inputText() {
		return "Celsius";
	}
	public int calculate(int cel){
		
		cel=9*cel/5+32;
		
		return cel;
	}
}
