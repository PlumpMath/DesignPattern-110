package model.unit;

import interfaces.Weapons;
import model.board.Cell;
import model.weapon.Weapon;

public class Avatar extends Unit
{
	
	
	
	private boolean alreadyUsedWithFireLord;
	private boolean alreadyUsedWithHenchman;
	private boolean alreadyUsedWithMarksman;
	Weapons weapon; 
	public Avatar(String name, int health, int damage, boolean meleeAttack, int startingX, int startingY,
			int attackRadius, boolean cannotUseSpecialPower, int movementRadius)
	{   super(name,health,damage,meleeAttack,startingX,startingY,attackRadius,cannotUseSpecialPower,movementRadius);
	  
		icon = 'A';
		
	}
	
	public Avatar(String name, int health, int damage, boolean meleeAttack,
			int attackRadius, boolean cannotUseSpecialPower, int movementRadius) {
	
		super(name,health,damage,meleeAttack,attackRadius,cannotUseSpecialPower,movementRadius);
		  
		icon = 'A';

	}

	
	
	
	public Avatar(){
		icon = 'A';
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
				|| validMovement.isValidVertical(initialCell, finalCell, movementRadius)
				|| validMovement.isValidDiagonal(initialCell, finalCell, movementRadius);
	}
	
	@SuppressWarnings("unused")
	private void checkShieldAvailability (Unit opponent) {
		
		if(alreadyUsedWithFireLord && alreadyUsedWithHenchman && alreadyUsedWithMarksman) {
			
			System.out.println("You can't use the shield anymore");
			
		} else {
		
		
		if (opponent instanceof FireLord) {
			
			if(!alreadyUsedWithFireLord) {
				
				this.specialAttack(opponent);
				
				this.alreadyUsedWithFireLord = true;
				
				
			} else if (opponent instanceof Henchman) {
				
				if(!alreadyUsedWithHenchman) {
					
					this.specialAttack(opponent);
					
					this.alreadyUsedWithHenchman = true;
					
					
				}
				
				
			} else if (opponent instanceof Marksman) {
				
				if(!alreadyUsedWithMarksman) {
					
					this.specialAttack(opponent);
					
					this.alreadyUsedWithMarksman = true;
					
					
				}
			}
		 }
	  }
		
	}
	
	
	public void specialAttack(Unit opponent) {
		
		this.health = this.health + opponent.getHealth();
		
	}
	
	
}
