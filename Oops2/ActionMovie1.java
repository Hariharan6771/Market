package Oops2;

public class ActionMovie1 extends NewMovie {
	public String getActionSeq(int noOfFights) {
		if(noOfFights<3) {
		return "Noraml Action Movie";
		}
		else if(noOfFights==4) {
	    return "Good Action Movie";
	    }
		else {
		return "Full Packed Action Movie";
		}
	}
		public static void main(String[] args) {
			ActionMovie1 m=new ActionMovie1();
			System.out.println(m.getActionSeq(5));
			System.out.println(m.getActionSeq(5));
			
		
		}
 

}