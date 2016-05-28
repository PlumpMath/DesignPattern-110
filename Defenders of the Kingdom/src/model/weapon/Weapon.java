package model.weapon;


import interfaces.Weapons;

public class Weapon  implements Weapons
{
	protected int damage;
	protected int range;
	protected String name;
//	protected Weapons weapon ;
	
	public Weapon(int damage, int range,String name) {

		this.damage = damage;
		this.range = range;
		this.name = name;
	//	this.weapon = weapon;
	}
	
	public int getAttackRadius()
	{
		return range;
	}
	
	public int getDamage()
	{
		return damage;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	

}
