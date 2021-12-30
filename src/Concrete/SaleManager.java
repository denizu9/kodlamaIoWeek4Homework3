package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void newSale(Gamer gamer) {
		System.out.println("Game Sold : " + gamer.firstName + " Earn Stars");
}
}
