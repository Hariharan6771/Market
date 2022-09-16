package FunctionWithParameter;

public class UseAc {
	public static void main(String[] args) {
    Ac ac1=new Ac();
    ac1.brand="Voltas";
    ac1.color="White";
    ac1.price=35000;
    ac1.isFiveStar=true;
    
    Ac ac2=new Ac();
    ac2.brand="Carrier";
    ac2.color="Blue";
    ac2.price=30000;
    ac2.isFiveStar=false;
    		
    		
    Ac ac3=new Ac();
    ac3.brand="Ogeneral";
    ac3.color="Pink";
    ac3.price=25000;
    ac3.isFiveStar=true;
    
    
    Ac[] acs={ac1,ac2,ac3};
    		
    
    
	}

}
