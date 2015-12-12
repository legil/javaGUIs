package gui;

public class SquareGUI extends UnaryGUI {

	public String calcText() {
		return "Find Area";
	}

	public String resultText() {
		return "Area:";
	}

	public String inputText() {
		return "Side of Square";
	}

	public int calculate(int cel) {

		cel = cel*4;

		return cel;
	}

}
