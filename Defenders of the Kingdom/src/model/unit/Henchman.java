package model.unit;

import model.board.Cell;
import model.weapon.Weapon;

public class Henchman extends Unit
{
 	Weapon weapon; 
	
	public Henchman(String name, int health, int damage, boolean meleeAttack, int startingX, int startingY,
			int attackRadius, boolean cannotUseSpecialPower, int movementRadius)
	{   super(name,health,damage,meleeAttack,startingX,startingY,attackRadius,cannotUseSpecialPower,movementRadius);

	
		icon = 'H';
		
	}
	
	
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public boolean isMoveValid(Cell initialCell, Cell finalCell)
	{
		return validMovement.isValidDiagonal(initialCell, finalCell, movementRadius);
	}

public int doubleAttackRadius(int r ){
	return 2*r;
	
}


	

}
