package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	GamerCheckService _gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		_gamerCheckService = gamerCheckService;
	}
	@Override
	public void add(Gamer gamer) {
		if(_gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Gamer successfully registered : " + gamer.firstName);
		}
		else
			System.out.println("Not a valid person");
		
		
	}

}
