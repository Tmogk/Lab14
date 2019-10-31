package co.grandcircus;

public class RockPlayer extends Player {

	private String userChoice;

	public Roshambo generateRoshambo() {
		return Roshambo.rock;

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
