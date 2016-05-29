package model.unit;

import java.util.ArrayList;

import interfaces.Weapons;
import model.board.Cell;
import model.weapon.Weapon;

public class Soldier extends Unit
{
	@SuppressWarnings("unused")
	private boolean attackflag;
	
	Weapons weapon; 

	public Soldier(String name, int health, int damage, boolean meleeAttack, int startingX, int startingY,
			int attackRadius, boolean cannotUseSpecialPower, int movementRadius)
	{   super(name,health,damage,meleeAttack,startingX,startingY,attackRadius,cannotUseSpecialPower,movementRadius);
		
		icon = 'S';
		attackflag = false;

	}
	public Weapons getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapons weapon) {
		this.weapon = weapon;
	}
	public boolean isMoveValid(Cell initialCell, Cell finalCell)
	{
		return validMovement.isValidHorizontal(initialCell, finalCell, movementRadius)
				|| validMovement.isValidVertical(initialCell, finalCell, movementRadius);
	}
	
	//special power
	public void attackAll(ArrayList<Unit> unit){
		
		//for(Unit u:unit)
			//u.setDamage(2);
		this.attackflag=true;
		
	}
	
}
