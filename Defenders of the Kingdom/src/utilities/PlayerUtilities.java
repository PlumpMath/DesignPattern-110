package utilities;

import java.util.ArrayList;
import java.util.HashMap;

import interfaces.Weapons;
import model.weapon.Arrow;
import model.weapon.Bow;
import model.weapon.Spear;
import model.weapon.Sword;
import model.weapon.Weapon;

public class PlayerUtilities {

	public static ArrayList<String>villians = new ArrayList<String>();
	public static ArrayList<String> heroes = new ArrayList<String>();
	public static HashMap<String,String> lstweapon = new  HashMap<String,String>();
	
	public static ArrayList<String> fetchheroes(){
	/*heroes.add("Soldier");
	heroes.add("Scout");
	heroes.add("Avatar");*/
	
	return heroes;
	}
	
	
	
	
    public void addHeroes(String str){
    	
    	heroes.add(str);
    }
	
public void addVillains(String str){
    	villians.add(str);
    	
    }
    
	
	public static ArrayList<String> fetchvillians(){
		/*villians.add("FireLord");
		villians.add("Henchman");
		villians.add("Marksman");*/
		
	return villians;

	
	
	}	
	
	   public static void   setWeapons(String unit,String weaponname){
		 lstweapon.put(unit,weaponname);
		
		   
		//return lstweapon;
	}
		

	
	
	
}