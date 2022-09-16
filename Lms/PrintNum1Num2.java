package Lms;

public class PrintNum1Num2 {
	public static void main(String[] args) {
	int num1=Integer.parseInt(args[0]);
	int num2=Integer.parseInt(args[1]);
	int temp=1;
	 
	for(int i=num1;i<=num2;i++) {
		
		temp=temp*i;
	}

	
	System.out.println(temp);
	
	
	
	}

}
