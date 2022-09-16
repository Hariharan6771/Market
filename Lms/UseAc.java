package Lms;

public class UseAc {
	public static void main(String[] args) {
	String[] a=args[0].split(",");
	String brand=a[0];
	int price=Integer.parseInt(a[1]);
	float capacity=Float.parseFloat(a[2]);
	Compressor compressor=new Compressor(brand,price,capacity);
	
	String[] b=args[1].split(",");
	String brand1=b[0];
	int price1=Integer.parseInt(b[1]);
	boolean isAutomatic1=Boolean.parseBoolean(b[2]);
	Ac ac=new Ac(brand1,price1,isAutomatic1);
	
	System.out.println(ac+","+" "+compressor);
	}

}
