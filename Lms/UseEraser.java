package Lms;

public class UseEraser {
	public static void main(String[] args) {
		String[] name=args[0].split(",");
		Eraser eraser=new Eraser();
		eraser.brand=name[0];
		eraser.price=Integer.parseInt(name[1]);
		eraser.isQuality=Boolean.parseBoolean(name[2]);
		eraser.length=(eraser.brand);
		System.out.println("Brand"+" "+"-"+" "+eraser.brand.toUpperCase()+","+" "+"Price"+" "+"-"+" "+eraser.price+","+" "+"Quality"+" "+"-"+" "+eraser.isQuality+","+" "+"Length"+" "+"-"+" "+eraser.length.toUpperCase()+","+" "+"Second letter"+" "+"-"+" "+eraser.brand.charAt(1));
		
	}

}
