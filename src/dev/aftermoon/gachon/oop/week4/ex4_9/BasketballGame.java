package dev.aftermoon.gachon.oop.week4.ex4_9;

public class BasketballGame {
	private String[] teamName = new String[2];
	private int[] teamScore = new int[2];
	private int gameStatus = 0;
	
	
	public void setTeamName(int team, String name) {
		if(team == 1 || team == 2) {
			assert (team == 1 || team == 2);
			teamName[team-1] = name;
		}
		else {
			System.out.println("Only Team 1 and Team 2 exists!");
		} 
	}
	
	public void addOnePoint(int team) {
		if(team == 1 || team == 2) {
			assert (team == 1 || team == 2);
			teamScore[team-1] += 1;
		}
		else {
			System.out.println("Only Team 1 and Team 2 exists!");
		}
	}
	
	
	public void addTwoPoint(int team) {
		if(team == 1 || team == 2) {
			assert (team == 1 || team == 2);
			teamScore[team-1] += 2;
		}
		else {
			System.out.println("Only Team 1 and Team 2 exists!");
		}
	}
	
	public void addThreePoint(int team) {
		if(team == 1 || team == 2) {
			assert (team == 1 || team == 2);
			teamScore[team-1] += 3;
		}
		else {
			System.out.println("Only Team 1 and Team 2 exists!");
		}
	}
	
	public void setGameFinish() {
		if(gameStatus != 1) {
			assert gameStatus != 1;
			gameStatus = 1;
		}
		else {
			System.out.println("Already Finish!");
		}
	}
	
	public int getTeamScore(int team) {
		if(team == 1 || team == 2) {
			assert (team == 1 || team == 2);
			return teamScore[team-1];
			
		}
		else {
			System.out.println("Only Team 1 and Team 2 exists!");
			return -1;
		}
	}
	
	public String getWinningTeamName() {
		if(teamScore[0] > teamScore[1]) {
			assert (teamScore[0] > teamScore[1]);
			return teamName[0];
		}
		else if(teamScore[0] < teamScore[1]){
			assert (teamScore[0] < teamScore[1]);
			return teamName[1];
		}
		else {
			return "Tie";
		}
	}
	
	public String getTeamName(int team) {
		if(team == 1 || team == 2) {
			assert (team == 1 || team == 2);
			return teamName[team-1];
		}
		else {
			System.out.println("Only Team 1 and Team 2 exists!");
			return null;
		}
	}
}
