package Oops1;

public class Laptop {
	 private String brand;
	 private int price;
	 private boolean isGamingLaptop;
	 private Battery battery;
	 
	 
	 public void setbrand(String brand) {
		 this.brand=brand;
	 }
	 public String getbrand() {
		 return brand;
		 }
	 public void setprice(int price) {
		 this.price=price;
	 }
	 public int getprice() {
		 return price;
		 
	 }
	 public void setisGamingLaptop(boolean isGamingLaptop) {
		 this.isGamingLaptop=isGamingLaptop;
	 }
	 public boolean getisGamingLaptop() {
		 return isGamingLaptop;
	 }
     public Laptop(String brand,int price,boolean isGamingLaptop) {
    	 this.brand=brand;
    	 this.price=price;
    	 this.isGamingLaptop=isGamingLaptop;
    	 this.battery=battery;
     }
     
     
     public String toString() {
    	 return "Laptop Brand="+brand+" "+"Laptop price="+price+" "+"Laptop Gaming="+isGamingLaptop;
     }
     
}   
     
     
     
     
     
      
    

