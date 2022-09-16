package Oops1;

public class UseMobile {
	public static void main(String[] args) {
	
	Processor p1=new Processor();
	p1.brand="Snapdragon";
	p1.price=5000;
	p1.antetmScore=24898;
	
	Mobile mobile1=new Mobile();
	mobile1.brand="Redmi";
	mobile1.color="Black";
	mobile1.price=15000;
	mobile1.processor=p1;
	
	System.out.println(mobile1.brand+" "+mobile1.price+" "+mobile1.color+" "+mobile1.processor.brand+" "+mobile1.processor.price+" "+mobile1.processor.antetmScore);
	
	}

}
