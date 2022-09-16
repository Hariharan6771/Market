package ExceptionHandling;

public class NumFor {
	public static void main(String[] args) {
		String a="Hariharan";

		try {
			int b=Integer.parseInt(a);
			
			System.out.println(b);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Invalid");
		
		}
	}

}



