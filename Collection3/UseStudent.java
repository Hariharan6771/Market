package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
	Student s1=new Student("Hari",01,"Adyar",450);
	Student s2=new Student("Mani",02,"Perungudi",440);
	Student s3=new Student("Manik",03,"Velacherry",390);
	Student s4=new Student("Kani",04,"Tharamani",290);

	ArrayList<Student> s=new ArrayList<>();
	s.add(s1);
    s.add(s2);
    s.add(s3);
    s.add(s4);
	
    
    System.out.println("--------------Using Lambda Expression---------------------");
    List<Student>m=s.stream().filter(x->x.getMark()>300).collect(Collectors.toList());
    m.forEach(y->System.out.println(y));
	System.out.println("--------------Using Enhanced for Loop---------------------");
    for(Student k:m) {
    System.out.println(k);
	System.out.println("--------------Using Lambda Expression without Using collector and List method---------------------");
    s.stream().filter(x->x.getName().startsWith("M")).forEach(b->System.out.println(b));
	System.out.println("--------------Using Lambda Expression Using Map---------------------");
    List<String>q=s.stream().map(x->x.getName()).collect(Collectors.toList());
    q.forEach(y->System.out.println(y));
	System.out.println("--------------Using Enhanced For Using Map---------------------");
    for(String str:q) {
    System.out.println(str);
    
	System.out.println("--------------Using Count Find How Many Objects---------------------");
    long l=s.stream().count();
    System.out.println(l);
    }
    }
	}

}
