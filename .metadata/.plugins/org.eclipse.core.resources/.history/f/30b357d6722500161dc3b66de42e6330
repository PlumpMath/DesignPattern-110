package model.unit;
import java.util.Scanner;

import interfaces.Weapons;
import model.board.Cell;
import model.weapon.Weapon;

public class Scout extends Unit
{	
	Weapons weapon; 

	public Scout(String name, int health, int damage, boolean meleeAttack, int startingX, int startingY,
			int attackRadius, boolean cannotUseSpecialPower, int movementRadius)
	{   super(name,health,damage,meleeAttack,startingX,startingY,attackRadius,cannotUseSpecialPower,movementRadius);

	
		icon = 'C';
	
	}
	
	
	public Weapons getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapons weapon) {
		this.weapon = weapon;
	}
	public boolean isMoveValid(Cell initialCell, Cell finalCell)
	{
		return validMovement.isValidVertical(initialCell, finalCell, movementRadius)
				|| validMovement.isValidHorizontal(initialCell, finalCell, movementRadius);
	}
	
	@SuppressWarnings("unused")
	public void specialAttack(){
		
		System.out.println("Choose any Villian on the board to attack");
		
		Scanner sc = new Scanner(System.in);
			int opponentX = sc.nextInt();
			
			int opponentY = sc.nextInt();
			
		
			// Unit opponent;

			this.cannotUseSpecialPower = true;
			
		sc.close();
	}
}
