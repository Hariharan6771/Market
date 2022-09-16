package ExceptionHandling;

public class CheckAge {
	public static void main(String[] args)throws FindAgeException,Exception {
		int age=27;
		try {
			if(age>=18) {
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


