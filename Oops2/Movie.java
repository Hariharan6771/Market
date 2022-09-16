package Oops2;

public class Movie {
	String movieName;
	int budget;
	int songs;
	int ticketPrice;
	
	int findNetPrice(int gst) {
		int netprice=ticketPrice+gst;
		return netprice;
		
	}

}
