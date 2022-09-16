package ExceptionHandling;

public class Iob {
	public static void main(String[] args) {
		int[] a= {5,6,15,25,45};

		try {
			int b=a[6];
			System.out.println(b);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Invalid");
		
		}
	}

}



