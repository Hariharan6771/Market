package Oops2;

public class Exam {
	public String subjects(int maths,int social) {
	return maths+social+" is the addition of 2 subjects";
	}
	public String subjects(String name) {
		if(name.equals("science")) {
	    return name+" "+"this is this semester subject";
		}
		else {
			return name+" "+"this is not a valid sub for this semester";
		}
	}
}
	


