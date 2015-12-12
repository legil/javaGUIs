package gui;

public class PeriSquare extends UnaryGUI {

	public String calcText() {
		return "Find Peri";
	}

	public String resultText() {
		return "Peri:";
	}

	public String inputText() {
		return "Side of Square";
	}
public int calculate(int cel){
		
		cel=4*cel;
		
		return cel;
}

}
