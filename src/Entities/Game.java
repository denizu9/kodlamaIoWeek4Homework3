package Entities;

import Abstract.Entity;

public class Game implements Entity{
	public Game(int id,String gameName,double gamePrice) {
		this.id = id;
		this.gameName =gameName;
		this.gamePrice = gamePrice;
	}
	public int id;
	public String gameName;
	public double gamePrice;
}
