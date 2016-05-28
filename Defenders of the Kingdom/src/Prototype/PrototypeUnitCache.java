package Prototype;

import java.util.HashMap;


import model.unit.Avatar;
import model.unit.FireLord;
import model.unit.Henchman;
import model.unit.Marksman;
import model.unit.Scout;
import model.unit.Soldier;
import model.unit.Unit;
import model.weapon.Weapon;

public class PrototypeUnitCache {
	public static int  i=0 ;
	   private static HashMap<String, Unit> unitMap  = new HashMap<String,Unit>(); 
	
   public static Unit getUnit(String Unitname){
	   
	   Unit getCacheUnit =  unitMap.get(Unitname);
	   return (Unit) getCacheUnit.clone();
   }
   
   
   public static void  loadCache(){
	   i++;
	   Weapon weapon =new Weapon(1, 1,"newweapon");
	   Avatar avatar = new  Avatar("Avatar",10,6,true,6,9,14,false,5); 
	  //name,health,damage,meleeAttack,
	 //  startingX,startingY,attackRadius,cannotUseSpecialPower,movementRadius
	   
	   unitMap.put(avatar.getName(),avatar);
	   
	   FireLord firelord = new  FireLord("FireLord",12,5,true,4,2,12,false,4); 
               firelord.setWeapon(weapon);
	   unitMap.put(firelord.getName(),firelord);
	   
		  Scout scout = new Scout("Scout",3,2,true,9,7,2,false,3); 

		  scout.setWeapon(weapon);

		   unitMap.put( scout.getName(), scout);
		   
		   scout.setWeapon(weapon);
			Soldier soldier = new Soldier("Soldier",7,3,true,3,8,1,false,2); 
			soldier.setWeapon(weapon);
			   unitMap.put( soldier.getName(), soldier);

				
				Henchman henchman = new Henchman("Henchman",9,4,true,2,4,2,false,3); 
				henchman.setWeapon(weapon);
				   unitMap.put( henchman.getName(), henchman);
				   
				
					Marksman marksman = new Marksman("Marksman",7,1,true,7,1,2,false,3); 
					marksman.setWeapon(weapon);
					   unitMap.put( marksman.getName(), marksman);
					   
					   
		   
		   
   }

	   

}
