package ExceptionHandling;

public class CheckMailId {
	public static void main(String[] args)throws CheckMail,Exception {
		String id="hari123@gmail.com";
		try {
			if(id.contains("gmail")) {
				throw new CheckMail("Is Google ID");
			}
			else {
				System.out.println("Is not a Google Id");
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Invalid");
				
			}
		}
	}


