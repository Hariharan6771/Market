package Collections1;

import java.util.ArrayList;

public class Trees {
	public static void main(String[] args) {
	ArrayList<String>t=new ArrayList<>();
	t.add("neem");
	t.add("almond");
	t.add("banyan");
	t.add("palm");
	t.add("teak");
	System.out.println(t);
	for(int i=1;i<t.size();i++) {
	if(i%2==0) {
	System.out.println(t.get(i));
	}
	}
	ArrayList<String>et=new ArrayList<>();
	for(int i=1;i<t.size();i++) {
	if(i%2==0) {
	et.add(t.get(i));
	}
	}
	}

	}
