package ExceptionHandling;

public class NlPointer {
	public static void main(String[] args) {
		try {
		String a=null;
			int b=a.length();
			System.out.println(b);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Invalid");
		
		}
	}

}



