package day4;

public class UsePencil {
	public static void main(String[] args) {
		Pencil p1=new Pencil();
		p1.brand=args[0];
		p1.price=Integer.parseInt(args[1]);
		p1.colour=args[2];
		p1.quantity=Integer.parseInt(args[3]);
		p1.size=Integer.parseInt(args[4]);
		System.out.println("Brand="+p1.brand+" "+"Price="+p1.price+" "+"Colour="+p1.colour.toUpperCase()+" "+"Quantity="+p1.quantity+" "+p1.size);
		
		
		
		
	}

}
