package factory;

import model.player.PlayerCreator;
import model.team.Team;

public abstract class AbstractTeamfactory {

	public static  AbstractTeamfactory  getabstractTeamFactory(){
		
		if(PlayerCreator.str == "Heroes")
			
		{
			
					//PlayerCreator.heroes.get(0)
		
			
			
		return	new HeroesFactory();
		
		}
		else{
			
		return	new VilliansFactory();
		}
	}
	
	public abstract Team createTeam();
	
	
}
