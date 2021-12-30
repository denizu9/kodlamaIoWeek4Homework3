package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign,Gamer gamer,Game game) {
		double saleOff;
		saleOff = (game.gamePrice - (game.gamePrice * campaign.percentOfCampaign / 100));
		System.out.println(
	"Game Name : " + game.gameName +
	" " + " Game Price : " + game.gamePrice +
	" " + "Campaign Name : " + campaign.campaignName + " "
	+ "Campaign Percent :  " + campaign.percentOfCampaign
	+ " " + "After Campaign Price : " + saleOff);
	}

	@Override
	public void deleteCampaign(Campaign campaign,Gamer gamer,Game game) {
		System.out.println("Campaign Deleted : " + campaign.campaignName);
		
	}

	@Override
	public void updateCampaign(Campaign campaign,Gamer gamer,Game game) {
		System.out.println("Campaign Updated : " + campaign.campaignName);
		
	}

}
