package Entities;

import Abstract.Entity;

public class Gamer implements Entity{
	public Gamer(int id,String firstName,String lastName,int dateOfBirt,long nationalityId) {
		this.id =id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth =dateOfBirt;
		this.nationalityId = nationalityId;
	}
	public int id;
	public String firstName;
	public String lastName;
	public int dateOfBirth;
	public long nationalityId;
}
