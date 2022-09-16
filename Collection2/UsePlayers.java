package Collection2;

import java.util.HashMap;
import java.util.Iterator;

public class UsePlayers {
	public static void main(String[] args) {
    Players p1=new Players("Rohit",33,264,45,"MI");
    Players p2=new Players("Virat",32,55,18,"RCB");
    Players p3=new Players("Jadeja",30,48,12,"CSK");
    Players p4=new Players("Dhoni",50,7,5,"PWI");
    Players p5=new Players("Pant",28,72,24,"DC");
    Players p6=new Players("Dhawan",31,100,11,"SRH");
    
    HashMap<Integer,Players>p=new HashMap<>();
    p.put(p1.getJerseyNo(),p1);
    p.put(p2.getJerseyNo(),p2);
    p.put(p3.getJerseyNo(),p3);
    p.put(p4.getJerseyNo(),p4);
    p.put(p5.getJerseyNo(),p5);
    p.put(p6.getJerseyNo(),p6);
    
    System.out.println(p);
    System.out.println(" ");
    for(Integer k:p.keySet()) {
    	System.out.println(p.get(k));
    }
        System.out.println(" ");
        p.keySet().forEach((x)->System.out.println(p.get(x)));
        System.out.println(" ");
        
    HashMap <Integer,Players> q =new HashMap<>();
    for(Integer n:p.keySet()) {
    if(p.get(n).getAge()>30) {
    	q.put(n,p.get(n));
    }
    }
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    for(Integer i : q.keySet()) {
    	if(q.get(i).getAge()>40) {
    	System.out.println(q.get(i));
    	System.out.println("+++++++++++++");
    	}
    }
 Iterator <Integer>s=p.keySet().iterator();
   	while(s.hasNext()) {
    System.out.println(s.next());
    System.out.println(p.get(s.next()));
   	}
    System.out.println("++++++++++ ");
	
     Iterator<Players>z=p.values().iterator();
     while(z.hasNext()) {
     if(z.next().getAge()>30){
     z.remove();
     System.out.println(p);

     }
     }
     System.out.println("++++++++++ ");

     System.out.println(p);

     }
     }
	
    	
    






