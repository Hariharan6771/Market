package Oops2;

public class ActionMovie extends Movie{
	String heroName;
	int noOfFights;
	
	
	public static void main(String[] args) {
		ActionMovie c=new ActionMovie();
		c.movieName="Paiya";
		c.budget=5500000;
		c.songs=5;
		c.ticketPrice=350;
		System.out.println(c.movieName+" "+c.budget+" "+c.songs+" "+c.ticketPrice+" "+c.findNetPrice(25));
		c.heroName="Karthi";
		c.noOfFights=2;
		
		
		
	}

}
