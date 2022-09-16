package Oops1;

public class Chair {
	private int noOfLegs;
	private String material;
	private boolean isRockingChair;
	
	public Chair(int noOfLegs,String material,boolean isRockingChair) {
	 this.noOfLegs=noOfLegs;
	 this.material=material;
	 this.isRockingChair=isRockingChair;
	}
	public String toString() {
	 return "No of Legs="+noOfLegs+" "+"Material="+material+" "+"Rocking Chair="+isRockingChair;
	
	}

}
