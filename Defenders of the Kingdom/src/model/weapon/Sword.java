package model.weapon;

import java.util.ArrayList;

import interfaces.Weapons;
import utilities.Direction;

public class Sword  extends WeaponDecorator{
String name;
	public Sword(Weapons weapons,String name) {
		super(weapons);
	this.name =name;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public int getAttackRadius()
	{
		return super.getAttackRadius() +3 ;
	}
	
	@Override
	public int getDamage()
	{
		return super.getDamage() +2 ;
	}
	

	public int getNumWeapons()
	{
		return super.getNumWeapons()+1;
	}
	
	
	
		public 	ArrayList<Direction> geDirection()
		{
			ArrayList<Direction> d =new  	ArrayList<Direction>();
			//d.add(Direction.STRAIGHT_LINE);
			//d.add(Direction.DIAGONAL);
			d.add(Direction.CIRCULAR);
			d.add(Direction.DIAGONAL);
			return d;
		}

	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
