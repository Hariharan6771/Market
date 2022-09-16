package Collection2;

import java.util.HashMap;
import java.util.Iterator;

public class UseGamers {
	public static void main(String[] args) {
		    Gamers p1=new Gamers("Rohit",33,264,45,"MI");
		    Gamers p2=new Gamers("Virat",32,55,18,"RCB");
		    Gamers p3=new Gamers("Jadeja",30,48,12,"CSK");
		    Gamers p4=new Gamers("Dhoni",50,7,5,"PWI");
		    Gamers p5=new Gamers("Pant",28,72,24,"DC");
		    Gamers p6=new Gamers("Dhawan",31,100,11,"SRH");
		    
		    HashMap<Integer,Gamers>p=new HashMap<>();
		    p.put(p1.getJerseyNo(),p1);
		    p.put(p2.getJerseyNo(),p2);
		    p.put(p3.getJerseyNo(),p3);
		    p.put(p4.getJerseyNo(),p4);
		    p.put(p5.getJerseyNo(),p5);
		    p.put(p6.getJerseyNo(),p6);
		    
		    Iterator<Integer>b=p.keySet().iterator();
		    while(b.hasNext()) {
		    System.out.println(b.next());
		   System.out.println(p.get(b.next()));
		    }
			   System.out.println("++++++");

		    Iterator<Gamers>c=p.values().iterator();
		    while(c.hasNext()) {
		    	System.out.println(c.next());
		       }
			   System.out.println("++++++");

		    for(Integer i:p.keySet()) {
		    	System.out.println(p.get(i));
		    	}
			   System.out.println("++++++");
			   
			HashMap<Integer,Gamers>q=new HashMap<>();

			for(Integer v:p.keySet()) {
				if(p.get(v).getAge()>30) {
					q.put(v, p.get(v));
					
				}
			}

			for(Integer n:q.keySet()) {
				if(q.get(n).getAge()>45) {
				System.out.println(q.get(n));
				}
			    }
			   System.out.println("++++++");
             Iterator<Gamers>z=p.values().iterator();
			while(z.hasNext()) {
				if(z.next().getAge()>40) {
					z.remove();
					System.out.println(p);
				}
				}
			   System.out.println("++++++");
			   for(Integer k:p.keySet()) {
				   if(k%2==0){
					  //p.remove();
					System.out.println(k);   
				   
				   }
			   }
			   
			 
			}
	
}

            		    
		    
		    
		    

	


