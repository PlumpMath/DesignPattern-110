package utilities;

import java.util.ArrayList;

public class PlayerUtilities {

	public static ArrayList<String>villians = new ArrayList<String>();
	public static ArrayList<String> heroes = new ArrayList<String>();
	
	public static ArrayList<String> fetchheroes(){
	heroes.add("Soldier");
	heroes.add("Scout");
	heroes.add("Avatar");
	
	return heroes;

	
	
	}
	
	
	public static ArrayList<String> fetchvillians(){
		villians.add("FireLord");
		villians.add("Henchman");
		villians.add("Marksman");
		
	return villians;

	
	
	}	
	
	
	
	
}