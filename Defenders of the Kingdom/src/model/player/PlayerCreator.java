package model.player;

import java.util.Iterator;
import java.util.Random;

import com.google.java.contract.Requires;

import controller.BoardController;
import factory.HeroesFactory;
import factory.VilliansFactory;
import model.team.Heroes;
import model.team.Team;
import model.team.Villains;
import model.unit.Unit;
import utilities.PlayerUtilities;

public class PlayerCreator
{
	private Player[] players = new Player[2];
	private BoardController boardController;
	private PlayerUtilities playerUtilities =new PlayerUtilities();
	public static String str = "";
	public PlayerCreator(BoardController boardController)
	{
		this.boardController = boardController;
		for (int i = 0; i < players.length; ++i)
			players[i] = new Player();
	}
	
	public boolean createPlayers()
	{
		
		try{
		for (int i = 0; i < players.length; ++i)
		{
			String name = null;
			do
			{
				name = boardController.getInput("Enter your name Player " + (i + 1) + ":");
				if (name == null)
					return false;
				name = name.trim();
			}
			while (name.equals(""));
			players[i].setName(name);
		}
		String[] options = new String[3];
		options[0] = "Heroes";
		options[1] = "Villains";
		options[2] = "Cancel";
		Random rand = new Random();
		int whichPlayer = rand.nextInt(players.length);
		int team = boardController.getChoice("Team", "Choose your team " + players[whichPlayer].getName() + ":", options);
		String[] options1 = new String[6];
		options1[0] = "Avatar";
		options1[1] = "Soldier";
		options1[2] = "Scout";
		options1[3] = "FireLord";
		options1[4] = "Henchman";
		options1[5] = "Marksman";
		int unit0 = boardController.getChoice("Team", "Choose your 1st unit " + players[whichPlayer].getName() + ":", options1);
		int unit1 = boardController.getChoice("Team", "Choose your 2nd unit " + players[whichPlayer].getName() + ":", options1);
		int unit2 = boardController.getChoice("Team", "Choose your 3rd unit " + players[whichPlayer].getName() + ":", options1);
		if(team==0){
			playerUtilities.addHeroes(options1[unit0]);
			playerUtilities.addHeroes(options1[unit1]);
			playerUtilities.addHeroes(options1[unit2]);
		}
		else{
			playerUtilities.addVillains(options1[unit0]);
			playerUtilities.addVillains(options1[unit1]);
			playerUtilities.addVillains(options1[unit2]);
		}
		
		for(String str :options1){
			if(str!=options1[unit0]&&str!=options[unit1]&&str!=options[unit2]){
				if(team==0)
				playerUtilities.addVillains(str);
				else
					playerUtilities.addHeroes(str);
			}
		}

		if (team == 0)
		{  str = 	options[0];
		HeroesFactory  objheroes =new HeroesFactory();
		              Team  hero = (Heroes)objheroes.createTeam();
			players[whichPlayer].setTeam(hero);
			
	   VilliansFactory  objvillain =   new VilliansFactory();
			Villains villain =   (Villains)objvillain.createTeam();	 
			players[whichPlayer == 0 ? 1 : 0].setTeam(villain);
		}
		
		else if (team == 1)
		{ str = 	options[1];
		   VilliansFactory  objvillain =   new VilliansFactory();
				Villains villain =   (Villains)objvillain.createTeam();	 
		
			players[whichPlayer].setTeam(villain);
			
			HeroesFactory  objheroes =new HeroesFactory();
            Team  hero = (Heroes)objheroes.createTeam();
			players[whichPlayer == 0 ? 1 : 0].setTeam(hero);
		}
		else
			return false;
		for (int i = 0; i < players.length; ++i)
		{
			Iterator<Unit> iter = players[i].getTeam().getUnits().iterator();
			while (iter.hasNext())
				iter.next().setTeam(players[i].getTeam());
		}
		return true;
		
		

		}
		catch(Exception ex){
			
			return false;
		}
		/*String[] options = new String[3];
		options[0] = "Heroes";
		options[1] = "Villains";
		options[2] = "Cancel";
		Random rand = new Random();
		int whichPlayer = rand.nextInt(players.length);
		int team = boardController.getChoice("Team", "Choose your team " + players[whichPlayer].getName() + ":", options);
		
		if (team == 0)
		{  str = 	options[0];
		HeroesFactory  objheroes =new HeroesFactory();
		              Team  hero = (Heroes)objheroes.createTeam();
			players[whichPlayer].setTeam(hero);
			
	   VilliansFactory  objvillain =   new VilliansFactory();
			Villains villain =   (Villains)objvillain.createTeam();	 
			players[whichPlayer == 0 ? 1 : 0].setTeam(villain);
		}
		
		else if (team == 1)
		{ str = 	options[1];
		   VilliansFactory  objvillain =   new VilliansFactory();
				Villains villain =   (Villains)objvillain.createTeam();	 
		
			players[whichPlayer].setTeam(villain);
			
			HeroesFactory  objheroes =new HeroesFactory();
            Team  hero = (Heroes)objheroes.createTeam();
			players[whichPlayer == 0 ? 1 : 0].setTeam(hero);
		}
		else
			return false;
		for (int i = 0; i < players.length; ++i)
		{
			Iterator<Unit> iter = players[i].getTeam().getUnits().iterator();
			while (iter.hasNext())
				iter.next().setTeam(players[i].getTeam());
		}
		return true;*/
	}
	
	
	public boolean createTeams(){
		String[] options = new String[3];
		options[0] = "Heroes";
		options[1] = "Villains";
		options[2] = "Cancel";
		Random rand = new Random();
		int whichPlayer = rand.nextInt(players.length);
		int team = boardController.getChoice("Team", "Choose your team " + players[whichPlayer].getName() + ":", options);
		String[] options1 = new String[6];
		options[0] = "Avatar";
		options[1] = "Soldier";
		options[2] = "Scout";
		options[3] = "FireLord";
		options[4] = "Henchman";
		options[5] = "Marksman";
		int unit0 = boardController.getChoice("Team", "Choose your 1st unit " + players[whichPlayer].getName() + ":", options1);
		int unit1 = boardController.getChoice("Team", "Choose your 2nd unit " + players[whichPlayer].getName() + ":", options1);
		int unit2 = boardController.getChoice("Team", "Choose your 3rd unit " + players[whichPlayer].getName() + ":", options1);

		for(String str :options1){
			if(str!=options1[unit0]&&str!=options[unit1]&&str!=options[unit2]){
				if(team==0)
				playerUtilities.addVillains(str);
				else
					playerUtilities.addHeroes(str);
			}
		}
		
		if (team == 0)
		{  str = 	options[0];
		HeroesFactory  objheroes =new HeroesFactory();
		              Team  hero = (Heroes)objheroes.createTeam();
			players[whichPlayer].setTeam(hero);
			
	   VilliansFactory  objvillain =   new VilliansFactory();
			Villains villain =   (Villains)objvillain.createTeam();	 
			players[whichPlayer == 0 ? 1 : 0].setTeam(villain);
		}
		
		else if (team == 1)
		{ str = 	options[1];
		   VilliansFactory  objvillain =   new VilliansFactory();
				Villains villain =   (Villains)objvillain.createTeam();	 
		
			players[whichPlayer].setTeam(villain);
			
			HeroesFactory  objheroes =new HeroesFactory();
            Team  hero = (Heroes)objheroes.createTeam();
			players[whichPlayer == 0 ? 1 : 0].setTeam(hero);
		}
		else
			return false;
		for (int i = 0; i < players.length; ++i)
		{
			Iterator<Unit> iter = players[i].getTeam().getUnits().iterator();
			while (iter.hasNext())
				iter.next().setTeam(players[i].getTeam());
		}
		return true;
		
	}
	
	@Requires("CreatePlayers()")
	public Player[] getPlayers()
	{
		return players;
	}
}
