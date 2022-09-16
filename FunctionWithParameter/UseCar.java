package FunctionWithParameter;

public class UseCar {
	public static void main(String[] args) {
    Car c1=new Car();
    c1.brand="Toyota";
    c1.color="Black";
    c1.price=100000;
    
    Car c2=new Car();
    c2.brand="Hyundai";
    c2.color="White";
    c2.price=150000;
    
    Car c3=new Car();
    c3.brand="Tata";
    c3.color="Blue";
    c3.price=200000;
    
    Car c4=new Car();
    c4.brand="Kia";
    c4.color="Yellow";
    c4.price=250000;
    
    Car c5=new Car();
    c5.brand="Boleno";
    c5.color="pink";
    c5.price=100000;
    
    Car[] c=new Car[5];
    c[0]=c1;
    c[1]=c2;
    c[2]=c3;
    c[3]=c4;
    c[4]=c5;
    
    c1.findIPrice(c);
    c1.findLowPrice(c);
    
    
    
    

    
    
    
	}

}
