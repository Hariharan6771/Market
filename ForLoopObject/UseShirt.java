package ForLoopObject;

public class UseShirt {
	public static void main(String[] args) {
	Shirt shirt1=new Shirt();
	shirt1.price=2500;
	shirt1.brand="Lenin";
	shirt1.isChecked=true;
	
	
	Shirt shirt2=new Shirt();
	shirt2.price=3500;
	shirt2.brand="Reymond";
	shirt2.isChecked=true;
	

	Shirt shirt3=new Shirt();
	shirt3.price=1500;
	shirt3.brand="Lee Cooper";
	shirt3.isChecked=false;
	

	Shirt shirt4=new Shirt();
	shirt4.price=2000;
	shirt4.brand="Kenith parker";
	shirt4.isChecked=false;
	
	Shirt[] shirts=new Shirt[4];
	shirts[0]=shirt1;
	shirts[1]=shirt2;
	shirts[2]=shirt3;
	shirts[3]=shirt4;
	
	int min=shirts[0].price; int index=0;
	for(int i=0;i<shirts.length;i++) {
    if(shirts[i].price<min) {
    index=i;
    min=shirts[i].price;
    }
   
	}
	String brand=shirts[index].brand;
	if(brand.contains("a")||brand.contains("e")||brand.contains("i")||brand.contains("o")||brand.contains("u")) {
    System.out.println("it contains true"+" ");
	}
	else {
	System.out.println("false");
	}
	System.out.println(min);
	System.out.println(shirts[index].brand);
	
    }
		
}
