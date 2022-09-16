package ForLoopObject;

public class UseAc {
	public static void main(String[] args) {
	 Ac ac1=new Ac();
	 ac1.brand="bluestar";
     ac1.price=70000;
	 ac1.colour="black";
	 ac1.isFiveStar=true;
	 
	 Ac ac2=new Ac();
	 ac2.brand="voltas";
     ac2.price=50000;
	 ac2.colour="white";
	 ac2.isFiveStar=false;
	 
	 Ac ac3=new Ac();
	 ac3.brand="tata";
     ac3.price=35000;
	 ac3.colour="pink";
	 ac3.isFiveStar=false;
	 
	 Ac ac4=new Ac();
	 ac4.brand="Ogen";
     ac4.price=25000;
	 ac4.colour="black";
	 ac4.isFiveStar=true;
	 
	 Ac ac5=new Ac();
	 ac5.brand="lg";
     ac5.price=40000;
	 ac5.colour="black";
	 ac5.isFiveStar=true;
	 
	 Ac[] Acs= {ac1,ac2,ac3,ac4,ac5};
	 for(Ac ac:Acs) {
	 if(ac.isFiveStar==true) {
		 System.out.println(ac.brand);
		 System.out.println(ac.price-(ac.price*8/100));
		 System.out.println(ac.colour);
		 System.out.println(" ");
		 
	 }
	 
     
		 
	
	
		 
	 }
		 
		 
		 
	 }
		 
	 

}
