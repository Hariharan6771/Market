package Lms;

public class UseFridge {
	public static void main(String[] args) {
	String[] name=args[0].split(",");
	Fridge fridge=new Fridge();
	fridge.brand=name[0];
	fridge.color=name[1];
	fridge.price=Integer.parseInt(args[2]);
	fridge.isWarranty=Boolean.parseBoolean(args[3]);
	System.out.println("Brand"+" "+"="+" "+fridge.brand.toUpperCase()+","+"Color"+" "+"="+" "+fridge.color.toUpperCase()+","+" "+"Price"+" "+"="+" "+fridge.price+","+" "+"Warranty"+" "+"="+" "+fridge.isWarranty+","+" "+"First letter of the brand"+" "+"="+" "+fridge.brand.toUpperCase().charAt(0)+","+"Last letter of the color"+" "+"="+" "+fridge.color.toUpperCase().charAt(5));
	
	
	}

}
