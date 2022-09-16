package Oops1;

public class UseMarker {
	public static void main(String[] args) {
	Marker m=new Marker();
	m.setcolor("Black");
	m.setprice(20);
	m.setisRefillable(true);
	
	
	Marker m1=new Marker();
	m1.setcolor("White");
	m1.setprice(25);
	m1.setisRefillable(false);
	
	Marker m2=new Marker();
	m2.setcolor("Blue");
	m2.setprice(50);
	m.setisRefillable(true);
	
	
	Marker[] markers= {m,m1,m2};
	for(int i=0;i<markers.length;i++) {
	System.out.println(markers[i].getcolor()+" "+markers[i].getprice()+" "+markers[i].getisRefillable());
	}
	
	
	
	
	System.out.println(m.getcolor()+" "+m.getprice()+" "+m.getisRefillable());
	}
	

}
