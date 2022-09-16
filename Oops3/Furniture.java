package Oops3;

public abstract class Furniture {
	public abstract void durability();
	public String materialType(String plastic) {
		if(plastic.equals("wood")) {
	    return "Good Material";
		}
		else {
	    return "Bad material";
			
		}
	}

}
