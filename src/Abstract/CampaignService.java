package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface CampaignService {
	void addCampaign(Campaign campaign,Gamer gamer,Game game);
	void deleteCampaign(Campaign campaign,Gamer gamer,Game game);
	void updateCampaign(Campaign campaign,Gamer gamer,Game game);
}
