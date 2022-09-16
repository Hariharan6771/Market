package Day2;

public class UseMarker {
	public static void main(String[] args) {
		Marker m=new Marker();
		m.colour="blue";
		m.size=12;
		m.brand="Faber castle";
		m.price=30;
		System.out.println(m.colour+" "+m.size+" "+m.brand+" "+m.price);
		
		Marker m1 = new Marker();
		m1.colour="white";
		m1.size=15;
		m1.brand="reynolds";
		m1.price=60;
		System.out.println(m1.colour+" "+m1.size+" "+m1.brand+" "+m1.price);
		
		Marker m2= new Marker();
		m2.colour="pink";
		m2.size=85;
		m2.brand="shift";
		m2.price=56;
		System.out.println(m2.colour+" "+m2.size+" "+m2.brand+" "+m2.price);
		
		
				
		
		
	}

}
