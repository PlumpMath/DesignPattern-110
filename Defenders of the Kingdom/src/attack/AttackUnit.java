package attack;

import interfaces.Weapons;
import model.board.Cell;
import model.manager.ValidMovement;
import model.unit.Unit;
import utilities.Direction;

public class AttackUnit {

	
	public boolean attack()
	{
		Cell attacker=null;
		Cell victim =null;
	Unit attacking =	(Unit)attacker.getEntity();
    Unit  	receiveattack =  (Unit)victim.getEntity();
	    Weapons w =attacking.getWeapons();
	    ValidMovement  isvalid =attacking.getValidMovement();
	for (Direction d: w.getDirection()){
	                if (d.equals(Direction.HORIZONTAL))
	                		{
	                	    
	                	           if( isvalid.isValidHorizontal(attacker, victim,attacking.getMovementRadius())){
	                	        	
	                	        	    receiveattack.setHealth(receiveattack.getHealth()-attacking.getDamage());
	                	           }
	                	
	                		}
	                if(d.equals(Direction.VERTICAL))
	                {
	                    if( isvalid.isValidHorizontal(attacker, victim,attacking.getMovementRadius())){
	                	    receiveattack.setHealth(receiveattack.getHealth()-attacking.getDamage());
         	           }
	                	
	                }
	                	
	              		
		                if(d.equals(Direction.DIAGONAL))
		                {
		                    if( isvalid.isValidHorizontal(attacker, victim, attacking.getMovementRadius())){
             	        	   
		                	    receiveattack.setHealth(receiveattack.getHealth()-attacking.getDamage());
		                	
		                } 
	                 
		                }
		
	}
	//	w
		//return true;
		//else 
			return false;
			
		
	}
	
}
