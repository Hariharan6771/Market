package Oops2;

public class Bike {
	String brand;
	int price;
	String model;
	
	public int findnetprice(int taxPercentage) {
		int netprice=price+(taxPercentage*price/100);
		return netprice;
		
	}
	


}
