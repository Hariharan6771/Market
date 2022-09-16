package Collections1;

import java.util.ArrayList;

public class UseEmployeeCons {
	public static void main(String[] args) {
		EmployeeCons e1=new EmployeeCons("hari",12,25000,"jrDeveloper");
		EmployeeCons e2=new EmployeeCons("mani",13,26000,"jrDeveloper");
		EmployeeCons e3=new EmployeeCons("jeni",14,27000,"jrDeveloper");
		EmployeeCons e4=new EmployeeCons("kani",15,55000,"srDeveloper");
		EmployeeCons e5=new EmployeeCons("sugu",16,56000,"srDeveloper");
		
		
		ArrayList<EmployeeCons>ab=new ArrayList<>();
		ab.add(e1);
		ab.add(e2);
		ab.add(e3);
		ab.add(e4);
		ab.add(e5);
		
		for(int i=0;i<ab.size();i++) {
	    if(ab.get(i).getsal()>50000) {
	    System.out.println(ab.get(i).getname()+" "+"Is Having Highest Salary");
	    }
	   else {
	    System.out.println(ab.get(i).getname()+" "+"Is Having Lowest Salary");
	    	
	}
		}
		System.out.println(" ");
	    
	    for(EmployeeCons a:ab) {
	    System.out.println(a);
	    }
		//System.out.println(ab.get(i));
		}

		

		
	}


