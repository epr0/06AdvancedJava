package com.demo.enums.example1;

public class GameLevelTester {
	public static void main(String[] args) {
		Game game = new Game();
		game.setName("Devil may cry 4");
		game.setGameLevel(GameLevel.HARD);
		
		System.out.println("Game is called " + game.getName());
		System.out.println("game level is set to " + game.getGameLevel());
		System.out.println("you will be provided " + game.getGameLevel().getHealth() + " HP");
		System.out.println("Also your armor is " + game.getGameLevel().getArmorType());
		System.out.println(game.getGameLevel());
	}

}
