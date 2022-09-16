package ForLoopObject;

public class UseLaptop {
	public static void main(String[] args) {
	Laptop lap1=new Laptop();
    lap1.brand="Dell";
	lap1.price=70000;
    lap1.colour="Black";
    lap1.isTouchScreen=false;
    
    Laptop lap2=new Laptop();
    lap2.brand="lenovo"; 
	lap2.price=50000;
    lap2.colour="Blue";
    lap2.isTouchScreen=true;
    
    Laptop lap3=new Laptop();
    lap3.brand="Acer";
	lap3.price=2000;
    lap3.colour="Green";
    lap3.isTouchScreen=false;
    
    Laptop[] laps= {lap1,lap2,lap3};
    for(int i=0;i<laps.length;i++) {
    if(laps[i].isTouchScreen==true) {
    System.out.println(laps[i].brand);
    System.out.println(laps[i].price);
    }
    }
    
   
	}
}
   
    	
    
    	
    
	

    






