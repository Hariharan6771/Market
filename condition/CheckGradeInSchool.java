package condition;

public class CheckGradeInSchool {
	public static void main(String[] args) { 
		int mark=85;
		if (mark >0 &&mark<=40) {
			System.out.println("E Grade");
		}
		else if(mark>40 && mark<=60) {
			System.out.println("C Grade");
		}
		else if(mark>60 && mark<=80) {
			System.out.println("B Grade");
		}
		else {
			System.out.println("A Grade");
			
		}
		
	}

}
