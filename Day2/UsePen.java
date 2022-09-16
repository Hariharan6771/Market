package Day2;

public class UsePen {
	public static void main(String[] args) {
		Pen P1=new Pen();
		P1.brand="Reynolds";
		P1.price=200;
		P1.colour="white";
		P1.tipwidth=2;
		System.out.println(P1.brand+" "+P1.price+" "+P1.colour+" "+P1.tipwidth);
		
		Pen P2=new Pen();
		P2.brand="Cello";
		P2.price=500;
		P2.colour="pink";
		P2.tipwidth=4;
		System.out.println(P2.brand+" "+P2.price+" "+P2.colour+" "+P2.tipwidth);
		int total=P1.price+P2.price;
		System.out.println(total);
		int average=(total/5);
		System.out.println(average);
		
		
		
		
		
	}

}
