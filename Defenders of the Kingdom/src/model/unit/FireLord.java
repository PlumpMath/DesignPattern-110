package model.unit;

import model.board.Cell;
import model.weapon.Weapon;

public class FireLord extends Unit
{
	int lifelost;
	
	Weapon weapon; 

	
	public FireLord(String name, int health, int damage, boolean meleeAttack, int startingX, int startingY,
			int attackRadius, boolean cannotUseSpecialPower, int movementRadius)
	{   super(name,health,damage,meleeAttack,startingX,startingY,attackRadius,cannotUseSpecialPower,movementRadius);

		
	
		icon = 'F';
	
	}
	
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public boolean isMoveValid(Cell initialCell, Cell finalCell)
	{
		return validMovement.isValidHorizontal(initialCell, finalCell, movementRadius)
				|| validMovement.isValidVertical(initialCell, finalCell, movementRadius)
				|| validMovement.isValidDiagonal(initialCell, finalCell, movementRadius);
	}

	public void specialAttack(int health,int lifelost){
     
		this.health =+ lifelost;
	}
	
	
}
