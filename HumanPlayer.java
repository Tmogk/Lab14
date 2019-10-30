package co.grandcircus;

public class HumanPlayer extends Player {

	private String userChoice;

	@Override
	public Roshambo generateRoshambo() {
		if (userChoice.equalsIgnoreCase("Rock")) {
			return Roshambo.rock;
		} else if (userChoice.equalsIgnoreCase("Paper")) {
			return Roshambo.paper;
		} else {
			return Roshambo.scissors;
		}
	}

	public String getUserChoice() {
		return userChoice;
	}

	public HumanPlayer(String name) {
		super(name);
	}

	public HumanPlayer(String name, String userChoice) {
		super(name);
		this.userChoice = userChoice;
	}

	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}

	@Override
	public String toString() {
		return "HumanPlayer [userChoice=" + userChoice + "]";
	}

}
