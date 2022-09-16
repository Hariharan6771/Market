package Lms;

public class UseTelevision {
	public static void main(String [] args) {
		String[] a=args[0].split(",");
		//Remote remote=new Remote(brand,price,color);

		String brand=a[0];
		int price=Integer.parseInt(a[1]);
		String color=a[2];
		Remote remote=new Remote(brand,price,color);
		
		String[] b=args[1].split(",");
		String brand1=b[0];
		//Television television=new Television(brand1,price1,model);

		int price1=Integer.parseInt(b[1]);
		String model=b[2];
		Television television=new Television(brand1,price1,model);
		
		System.out.println(remote+","+" "+television);
		//System.out.println(television);
		
	}

}
