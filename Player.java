package co.grandcircus;

public abstract class Player {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	public Player() {
		super();
	}

	public abstract Roshambo generateRoshambo();

}
