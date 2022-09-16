package ForLoopObject;

public class UsePen {
	public static void main(String[] args) {
    Pen p1=new Pen();
    p1.brand="Reynolds";
	p1.price=70;
    p1.refillColour="black";
    p1.isRefillable=true;
    
    Pen p2=new Pen();
    p2.brand="cello";
	p2.price=50;
    p2.refillColour="blue";
    p2.isRefillable=false;
    
    Pen p3=new Pen();
    p3.brand="gel";
	p3.price=20;
    p3.refillColour="blue";
    p3.isRefillable=true;
    
    Pen p4=new Pen();
    p4.brand="apsara";
	p4.price=20;
    p4.refillColour="pink";
    p4.isRefillable=false;
    
    Pen p5=new Pen();
    p5.brand="nataraj";
	p5.price=20;
    p5.refillColour="green";
    p5.isRefillable=true;
    
    
    Pen[] Pens= {p1,p2,p3,p4,p5};
    int count=0;
    for(Pen p:Pens) {
    if(p.refillColour.equals("blue")) {
    count++;
    }
    }
    System.out.println(count);
    
    
	}
}
    	
    
    
    
    
    
    
    
    
    
    
    
	
    
    
    
    
    
    




