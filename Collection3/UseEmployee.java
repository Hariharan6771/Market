package Collection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Hari", "JRDev", 12, 31, 26000, 2);
		Employee e2 = new Employee("Mani", "JRDev", 13, 36, 30000, 1);
		Employee e3 = new Employee("JP", "Manager", 14, 27, 500000, 4);
		Employee e4 = new Employee("Anirudh", "Assistant Manager", 15, 27, 100000, 5);
		ArrayList<Employee> e = new ArrayList<>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		
		List<Employee>m=e.stream().filter(x->x.getSal()>30000).collect(Collectors.toList());
		System.out.println("--------------Using Lambda Expression---------------------");
		m.forEach(y->System.out.println(y));
		System.out.println("--------------Using Enhanced for Loop---------------------");
	    for(Employee z:m)  {
		System.out.println(z);
		}
	    System.out.println("--------------Using Lambda Expression---------------------");

		List<Employee>p=e.stream().filter(x->x.getName().startsWith("A")).collect(Collectors.toList());
		p.forEach(y->System.out.println(y));
		System.out.println("--------------Using Lambda Expression---------------------");
		List<Employee>n=e.stream().filter(x->x.getName().length()%2==0).collect(Collectors.toList());
		n.forEach(y->System.out.println(y));
		System.out.println("--------------Using Lambda Expression without Using collector and List method---------------------");
		e.stream().filter(y->y.getDesig().equals("JRDev")).forEach(a->System.out.println(a));
		System.out.println("--------------Using Lambda Expression without using collector and List method---------------------");
        e.stream().filter(y->y.getAge()>30).forEach(b->System.out.println(b));
		System.out.println("--------------Using Lambda Expression without using collector and List method---------------------");
        e.stream().filter(y->y.getSal()>30000).forEach(c->System.out.println(c));

		
	   System.out.println("--------------Using Lambda Expression Using Map---------------------");
       List<String>q=e.stream().map(x->x.getName()).collect(Collectors.toList());
       q.forEach(y->System.out.println(y));
	   System.out.println("--------------Using Enhanced For Using Map---------------------");
	   for(String str:q) {
		   System.out.println(str);
	   System.out.println("--------------Using Lambda Expression without Using collector and List method---------------------");
       e.stream().map(y->y.getDesig()).forEach(c->System.out.println(c));
       
	   System.out.println("--------------Using Lambda Expression Using Map and Using Filter in Same Time---------------------");

       List<String>d=e.stream().filter(x->x.getSal()>27000).map(y->y.getName()).collect(Collectors.toList());
       d.forEach(a->System.out.println(a));
       
	   System.out.println("--------------Using Lambda Expression Using Map and Using Filter in Same Time---------------------");
       e.stream().filter(y->y.getSal()>27000).map(x->x.getName()).forEach(c->System.out.println(c));
       
	   System.out.println("--------------Using Lambda Expression Using Map and Using Filter in Same Time---------------------");
        List<Integer>f=e.stream().filter(x->x.getDesig().equals("Manager")).map(y->y.getAge()).collect(Collectors.toList());
        f.forEach(c->System.out.println(c));
 	   System.out.println("--------------Using Lambda Expression Using Map and Using Filter in Same Time---------------------");
       e.stream().filter(y->y.getDesig().equals("Manager")).map(x->x.getAge()).forEach(c->System.out.println(c));
       
       
       
       
 	   System.out.println("--------------Using Lambda Expression Using Map and Using Key and Values in Same Time---------------------");
       Map<Integer, Employee>h=e.stream().collect(Collectors.toMap(Employee::getId,Function.identity()));
       System.out.println(h);
 	   System.out.println("--------------Using Lambda Expression Using Map and Using Key and Values in away arraylist---------------------");
       h.forEach((k,v)->System.out.println(k+" "+v));
       
 	   System.out.println("--------------Using Lambda Expression Using Map and Using Key and Values in away arraylist---------------------");
       Map<String,String>t=e.stream().collect(Collectors.toMap(Employee::getName,Employee::getDesig));
       t.forEach((k,v)->System.out.println(k+" "+v));
       
 	   System.out.println("--------------Using Count Find How Many Objects---------------------");

       long l=e.stream().count();
       System.out.println(l);
 	   System.out.println("--------------Using Count With  Conditon---------------------");
       long l1=e.stream().filter(x->x.getSal()>27000).map(y->y.getName()).count();
       System.out.println(l1);

	   }

 	}

}
 