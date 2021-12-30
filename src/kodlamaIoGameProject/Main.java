package kodlamaIoGameProject;

import Adapters.MernisCheckService;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1, "Name", "Surname", 1955, 58978432509L);
		Game game = new Game(12648, "Cyberpunk 2077", 299);
		Campaign campaign = new Campaign(5489,"New Year Festival", 50);
		
		GamerManager gamerManager = new GamerManager(new MernisCheckService());
		gamerManager.add(gamer);
		
		GameManager gameManager = new GameManager();
		gameManager.addNewGame(game);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign, gamer, game);
		campaignManager.deleteCampaign(campaign, gamer, game);
		campaignManager.updateCampaign(campaign, gamer, game);
	}

}
