package co.grandcircus;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String cont = "y";

		Player opponent;

		System.out.println("Welcome to Rock, Paper, Scissors");
		String name = Validator.getString(scnr, "Enter your name: ");

		int choice = Validator.getInt(scnr, "Would you like to play against \n1. Dwayne \n2. Randy", 1, 2);

		if (choice == 1) {
			opponent = new RockPlayer("Dwayne");
		} else {
			opponent = new RandomPlayer("Randy");
		}

		while (cont.equalsIgnoreCase("y")) {

			String input = Validator.getString(scnr, "Rock, Paper, or Scissors?");

			HumanPlayer user = new HumanPlayer(name);
			user.setUserChoice(input);

			Roshambo userRo = user.generateRoshambo();
			Roshambo opponentRo = opponent.generateRoshambo();

			System.out.println(name + ":" + userRo);
			System.out.println(opponent.getName() + ":" + opponentRo);
			Player winner = getWinner(opponent, user);

			if (winner == null) {
				System.out.println("Draw!");
			} else {
				System.out.println(winner.getName() + " wins!");
			}
			cont = Validator.getString(scnr, "Play again? (y/n)?");
		}
		scnr.close();
		System.out.println("Goodbye");
	}

	public static Player getWinner(Player player1, Player player2) {
		Roshambo r1 = player1.generateRoshambo();
		Roshambo r2 = player2.generateRoshambo();

		if (r1.equals("Rock") && r2.equals("Scissors") || r1.equals("Scissors") && r2.equals("Paper")
				|| r1.equals("Paper") && r2.equals("Rock")) {
			System.out.println("Win");
		} else if (r1.equals(r2)) {
			System.out.println("Loss");
			return null;
		}

		else {
			return player2;
		}
		return player2;

	}
}
