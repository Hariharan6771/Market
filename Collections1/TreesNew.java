package Collections1;

import java.util.ArrayList;

public class TreesNew {
	public static void main(String[] args) {
		ArrayList<String>t=new ArrayList<>();
		t.add("neem");
		t.add("almond");
		t.add("banyan");
		t.add("palm");
		t.add("tea");
		ArrayList<String>et=new ArrayList<>();
        for(int i=0;i<t.size();i++) {
	    if(t.get(i).length()%2==0) {
	    et.add(t.get(i));
	    
		}
		System.out.println(et);
	}
		for(String str:t) {
			if(str.length()%2==0) {
		    et.add(str);
			}
		}
			//System.out.println((et));
			}
	}



