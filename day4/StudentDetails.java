package day4;

public class StudentDetails {
	public static void main(String[] args) {
		String[] details=args[0].split(",");
		String name=details[0];
		int age=Integer.parseInt(details[1]);
		float height=Float.parseFloat(details[2]);
		boolean ispresent=Boolean.parseBoolean(details[3]);
		System.out.println("Name ="+name+","+"age ="+age+","+"Height ="+height+","+"Ispresent ="+ispresent); 
	}


}
