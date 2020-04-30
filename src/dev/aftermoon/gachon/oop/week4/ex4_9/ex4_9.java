package dev.aftermoon.gachon.oop.week4.ex4_9;

import java.util.Scanner;

public class ex4_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BasketballGame game = new BasketballGame();
		
		// Team A = 1 / Team B = 2
		System.out.print("Set Team A Name : ");
		game.setTeamName(1, scanner.nextLine());
		
		System.out.print("Set Team B Name : ");
		game.setTeamName(2, scanner.nextLine());
		
		while (true) {
			String teamname = "";
			int score = 0;
			System.out.print("\nEnter a score (score : 1, 2, 3 / Quit : Enter 'quit') : ");
			teamname = scanner.next().toLowerCase();
			
			if(teamname.equals("quit")) {
				game.setGameFinish();
				break;
			}
				
			score = scanner.nextInt();
			
			int team = 0;
			if(teamname.equals("a")) {
				team = 1;
			}
			else if(teamname.equals("b")) {
				team = 2;
			}
			else {
				System.out.println("Only Team A and Team B exists!");
				continue;
			}
			
			switch(score) {
				case 1:
					game.addOnePoint(team);
					break;
				case 2:
					game.addTwoPoint(team);
					break;
				case 3:
					game.addThreePoint(team);
					break;
				default:
					System.out.println("Only 1, 2, 3 allowed.");
					continue;
			}
			
			System.out.println(game.getTeamName(1) + " " + game.getTeamScore(1) + ", " + game.getTeamName(2) + " " + game.getTeamScore(2) + "; " + game.getWinningTeamName() + " are winning.");
		}
		scanner.close();
	}
}
