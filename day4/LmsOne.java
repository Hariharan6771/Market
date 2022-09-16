package day4;

public class LmsOne {
	public static void main(String[] args) {
	String name=args[0];
	int age=Integer.parseInt(args[1]);
	float height=Float.parseFloat(args[2]);
	boolean ismale=Boolean.parseBoolean(args[3]);
	String mailid=args[4];
	System.out.println("Name="+name.toUpperCase()+" "+"age="+age+" "+"Height="+height+" "+"is Male="+ismale+" "+"Mailid="+mailid);
	}
	
	
}


