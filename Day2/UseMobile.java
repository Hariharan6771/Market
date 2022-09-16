package Day2;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.colour="black";
		m.size=25;
		m.price=25000;
		m.brand="samsung";
		m.ram="8gb";
		System.out.println(m.colour+" "+m.size+" "+m.price+" "+m.brand+" "+m.ram);
		
		
		Mobile vivo=new Mobile();
		vivo.colour="blue";
		vivo.size=36;
		vivo.price=50000;
		vivo.brand="vivo";
		vivo.ram="16gb";
		System.out.println(vivo.colour+" "+vivo.size+" "+vivo.price+" "+vivo.brand+" "+vivo.ram);
		
		Mobile m2=new Mobile();
		m2.colour="white";
		m2.size=32;
		m2.price=80000;
		m2.brand="blackberry";
		m2.ram="85gb";
		System.out.println(m2.colour+" "+m2.size+" "+m2.price+" "+m2.brand+" "+m2.ram);
		
		
		Mobile m3=new Mobile();
		m3.colour="yellow";
		m3.size=36;
		m3.price=500;
		m3.brand="apple";
		m3.ram="16gb";
		int total=m.price+vivo.price+m2.price+m3.price;
		System.out.println(m3.colour+" "+m3.size+" "+m3.price+" "+m3.brand+" "+m3.ram);
		System.out.println(total);
		



		
	}

}
