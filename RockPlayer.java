package co.grandcircus;

public class RockPlayer extends Player {

	private String userChoice;

	public Roshambo generateRoshambo() {
		if (userChoice.equalsIgnoreCase("Rock")) {
			return Roshambo.rock;
		} else if (userChoice.equalsIgnoreCase("Paper")) {
			return Roshambo.rock;
		} else {
			return Roshambo.rock;
		}
	}

	public RockPlayer() {
		super();
	}

	public RockPlayer(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "RockPlayer [userChoice=" + userChoice + ", getName()=" + getName() + "]";
	}

}
