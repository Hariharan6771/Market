package Collections1;

import java.util.ArrayList;

public class FruitsIfCond {
	public static void main(String[] args) {

	ArrayList<String> f=new ArrayList<>();
	f.add("Banana");
	f.add("Grapes");
	f.add("Apple");
	f.add("Mango");
	System.out.println(f);
	for(int i=0;i<f.size();i++) {
	if(f.get(i).startsWith("A")) {
    System.out.println(f.get(i)+" "+"Starts With A");
	}
    else {
    System.out.println(f.get(i)+" "+"Not Starts with A");
    }
	if(f.get(i).equalsIgnoreCase("banana")) {
	System.out.println(f.get(i)+" "+"It is Equal");
	}
	else {
    System.out.println(f.get(i)+" "+"It is Not Equal");
	}
	}
	}
}



