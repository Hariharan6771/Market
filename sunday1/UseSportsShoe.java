package sunday1;

public class UseSportsShoe {
	public static void main(String[] args) {
    SportsShoe shoe=new SportsShoe();
    shoe.price=Integer.parseInt(args[0]);
    shoe.colour=args[1];
    shoe.discountAmount=Integer.parseInt(args[2]);
    shoe.netPrice=shoe.price-shoe.discountAmount;
    System.out.println("COLOUR:"+" "+shoe.colour+","+" "+"NET PRICE:"+" "+shoe.netPrice+".");
    
    
    
    
	}

}
