package model.weapon;

import java.util.ArrayList;

import interfaces.Weapons;
import utilities.Direction;

public class Spear  extends WeaponDecorator{
String name;
int distance  ;
	public Spear(Weapons weapons,String name) {
		super(weapons);
		distance =3;
	this.name =name;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public int getAttackRadius()
	{
		return super.getAttackRadius() +2 ;
	}
	
	@Override
	public int getDamage()
	{
		if(distance == super.getAttackRadius())
		return super.getDamage() +3 ;
		else if(distance<super.getAttackRadius())
			return  super.getDamage() -1;
		else return super.getAttackRadius() -2; 
				
		
	}
	
	
	public 	ArrayList<Direction> geDirection()
	{
		ArrayList<Direction> d =new  	ArrayList<Direction>();
		d.add(Direction.STRAIGHT_LINE);
		return d;
	}

	public int getNumWeapons()
	{
		return super.getNumWeapons()+1;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
