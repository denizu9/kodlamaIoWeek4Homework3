package Concrete;

import Abstract.GameService;
import Abstract.GamerCheckService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void addNewGame(Game game) {
		System.out.println("New Game Added : " + game.gameName);
	}

}
