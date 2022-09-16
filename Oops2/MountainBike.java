package Oops2;

public class MountainBike extends Bike{
	int climbingSpeed;
	int weight;
	
	void show() {
		System.out.println(super.brand);
		System.out.println(super.price);
		System.out.println(super.model);
		System.out.println(super.findnetprice(10));

	}

public static void main(String[] args) {
	MountainBike b=new MountainBike();
	b.brand="Yamaha";
	b.price=100000;
	b.model="FZ";
	b.climbingSpeed=180;
	b.weight=80;
	System.out.println(b.findnetprice(10));
	
	b.show();
}
	


}
