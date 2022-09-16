package ExceptionHandling;

public class Strindx {
	public static void main(String[] args) {

		try {
			String a="Hariharan";
            char b=a.charAt(6);
			System.out.println(b);
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Invalid");
		
		}
	}

}



