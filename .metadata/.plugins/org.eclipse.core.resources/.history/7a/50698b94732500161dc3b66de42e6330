package factory;

import java.awt.Color;

import Prototype.PrototypeUnitCache;
import utilities.PlayerUtilities;
import model.team.Heroes;
import model.team.Team;
import model.unit.Avatar;
import model.unit.Scout;
import model.unit.Soldier;

public class HeroesFactory  extends AbstractTeamfactory{

	@Override
	public Team createTeam() {
		Heroes h = new Heroes();
		//String s = "";
		if(PrototypeUnitCache.i ==0)
		{ 
			PrototypeUnitCache.loadCache();
			  System.out.print("i value"+PrototypeUnitCache.i);
		}
		for(String  s  :PlayerUtilities.fetchheroes() ) {
		
			if(s == "Scout"){
				
		
				 h.getUnits().add(PrototypeUnitCache.getUnit("Scout"));
				
			}
			
			if(s == "Soldier"){
				
				 h.getUnits().add(PrototypeUnitCache.getUnit("Soldier"));
			}
			
			if(s == "Avatar"){
				 h.getUnits().add(PrototypeUnitCache.getUnit("Avatar"));
		}
	}
		
		h.setColour(Color.red);
		h.setName("Heroes");
	return  h;
	
	}
	

}
