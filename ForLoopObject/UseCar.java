package ForLoopObject;

public class UseCar {
  public static void main(String[] args) {
  Car car1=new Car();
  car1.brand="Mahindra";
  car1.price=700000;
  car1.colour="Black";
  
  Car car2=new Car();
  car2.brand="TATA";
  car2.price=600000;
  car2.colour="White";
   
  Car car3=new Car();
  car3.brand="Hyundai";
  car3.price=1000000;
  car3.colour="Pink";
  
  Car[] cars= {car1,car2,car3};
  int max=0;
  int index=0;
  for(int i=0;i<cars.length;i++) {
  if(cars[i].price>max) {
  max=cars[i].price;
  index=i;
  }
  }
  System.out.println(max-(max*5/100));
  System.out.println(cars[index].brand);
  }
}
 


  
	 
 


