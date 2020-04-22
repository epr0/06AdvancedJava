package com.demo.enums.example1;

//Used to represent some specific ranged data like numeric or textual.
//Needed when a variable can take only small set of possible values like contract status - expired, approved, cancelled, terminated.
public enum GameLevel {
	//In the regular case you could determine game level like
	// setGameLevel(int level) -> setGameLevel(1); 1 - EASY. 2 - MEDIUM, 3 - HARD.
	EASY(300, "Golden"),
	MEDIUM(200, "Metal"),
	HARD(100, "Wooden"),
	HARDCORE(50, "Cloth");
	
	private int health;
	private String armorType;
	
	GameLevel(int health, String armorType) {
		this.health = health;
		this.armorType = armorType;
	}
	
	public int getHealth() {
		return health;
	}
	
	public String getArmorType() {
		return armorType;
	}
	
	@Override
	public String toString() {
		return "Armor type - " + armorType + ", health points - " + health;
	}
}
