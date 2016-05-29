package model.weapon;
import java.util.ArrayList;

import interfaces.Weapons;
import utilities.Direction;
public class WeaponDecorator  implements Weapons
{private Weapons weapons;
	protected int attackDirection;
	protected int damage;
	protected int range;
	protected String name;
	protected WeaponDecorator weaponDecorator;
	
	public WeaponDecorator(Weapons weapons)
	{
       
		this.weapons = weapons;
		
	}
	
	@Override
	public int getAttackRadius()
	{
		return weapons.getAttackRadius() ;
	}
	
	@Override
	public int getDamage()
	{
		return weapons.getDamage() ;
	}
	

	public int getNumWeapons()
	{
		return 0;
	}
	
	@Override
	public 	ArrayList<Direction> getDirection()
	{
		ArrayList<Direction> d =  new ArrayList<Direction>();
		d.add(Direction.VERTICAL);
		return d;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return weapons.getName();
	}
}
	
	