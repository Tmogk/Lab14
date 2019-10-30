package co.grandcircus;

public class RandomPlayer extends Player {

	public RandomPlayer() {
		super();
	}

	public RandomPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {

		int i = (int) (Math.random() * 3) + 1;

		switch (i) {

		case 1:
			return Roshambo.rock;
		case 2:
			return Roshambo.paper;
		default:
			return Roshambo.scissors;

		}

	}

}
