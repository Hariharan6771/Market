package ExceptionHandling;

public class CheckRetirementAge {
	public static void main(String[] args)throws FindAgeException,Exception {
		int age=60;
		try {
			if(age>=60) {
				throw new FindAgeException("Eligible");
			}
			else {
				System.out.println("Not Eligible");
			}
		}catch(Exception e) {
				e.printStackTrace();
			}finally {
				System.out.println("Invalid");
			}
		}
	}

