package Entities;

public class Campaign {
	public Campaign(int id,String campaignName,double percentOfCampaign) {
		this.id = id;
		this.campaignName = campaignName;
		this.percentOfCampaign = percentOfCampaign;
	}
	public int id;
	public String campaignName;
	public double percentOfCampaign;
}
