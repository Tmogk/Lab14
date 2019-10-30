package co.grandcircus;

public enum Roshambo {

	rock, paper, scissors;

	@Override
	public String toString() {
		switch (this) {
		case rock:
			return "You chose rock";

		case paper:
			return "You chose paper";

		default:
			return "You chose scissors";
		}
	}

}
