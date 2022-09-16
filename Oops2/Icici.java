package Oops2;

	public class Icici extends RbiBank {
		public int getIntrest(int amount,int intrest) {
		return amount+intrest;
		}
		void display() {
	    System.out.println(super.getIntrest(5000,1000));
		}
		public static void main(String[] args) {
			Icici i=new Icici();
			System.out.println(i.getIntrest(5000,1000));
			System.out.println(i.getIntrest(5000,1000));
			i.display();
		}
	}
	
	


