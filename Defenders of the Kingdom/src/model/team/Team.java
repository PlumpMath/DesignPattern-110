package model.team;

import java.awt.Color;
import java.util.ArrayList;

import model.unit.Unit;

public class Team
{
	protected String name;
	protected Color colour;
	protected ArrayList<Unit> units = new ArrayList<>();
	
	public int getNumUnits()
	{
		return units.size();
	}
	
	public Color getColour()
	{
		return colour;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setColour(Color colour) {
		this.colour = colour;
	}

	public void setUnits(ArrayList<Unit> units) {
		this.units = units;
	}

	public ArrayList<Unit> getUnits()
	{
		return units;
	}
}
