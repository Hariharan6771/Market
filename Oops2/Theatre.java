package Oops2;

public class Theatre {
	public String movie(String name) {
		if(name.equals("endhiran")) {
			return "Endhiran";
		}
		else {
			return "not a Action Movie";
		 
		}
		
		
	}

public String rating(int name) {
	if(name>=4) {
		return "extradinory movie";
		}
	if(name>=2) {
		return "ordinary movie";
	}
	else {
		return "not a good movie";
	}
   }
}


