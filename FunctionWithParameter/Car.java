package FunctionWithParameter;  

public class Car {
	String brand;
	String color;
	int price;
	
	public void findIPrice(Car[] c) {
    int max=0;
	for(int i=0;i<c.length;i++) {
	if(c[i].price>max) {
	max=c[i].price;
	}
		
	}
	System.out.println(max);
    
	}
	
	public void findLowPrice(Car[] c) {
	int mini=c[0].price;
	for(int i=0;i<c.length;i++) {
	if(c[i].price<mini) {
    mini=c[i].price;
	}
	}
	System.out.println(mini);	
	}

}

