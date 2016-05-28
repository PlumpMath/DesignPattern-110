package factory;

import java.awt.Color;

import Prototype.PrototypeUnitCache;
import utilities.PlayerUtilities;
import model.team.Heroes;
import model.team.Team;
import model.team.Villains;
import model.unit.Avatar;
import model.unit.FireLord;
import model.unit.Henchman;
import model.unit.Marksman;
import model.unit.Scout;
import model.unit.Soldier;

public class VilliansFactory  extends AbstractTeamfactory{

			@Override
			public Team createTeam() {
				Villains v= new Villains();
				//String s = "";
				if(PrototypeUnitCache.i ==0){
				PrototypeUnitCache.loadCache();
				 System.out.print("i value"+PrototypeUnitCache.i);
				}
				for(String  s  :PlayerUtilities.fetchvillians() ) {
				
					if(s == "Henchman"){
						
				
						 v.getUnits().add(PrototypeUnitCache.getUnit("Henchman"));
						
					}
					
					if(s == "Marksman"){
						
						 v.getUnits().add(PrototypeUnitCache.getUnit("Marksman"));
					}
					
					if(s == "FireLord"){
						 v.getUnits().add(PrototypeUnitCache.getUnit("FireLord"));
				}
			}
				
				v.setColour(Color.blue);
				v.setName("Villains");
				
				return v;
			}
		
			}
			
	
	
	

