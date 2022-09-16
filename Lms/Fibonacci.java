package Lms;

public class Fibonacci {
	public static void main(String[] args) {
	int num=Integer.parseInt(args[0]);
	int num1=1;
	int num2=0;
	int num3;
	for(int i=0;i<=num;i++) {
	System.out.println(num1);
	num3=num1+num2;
	num1=num2;
	num2=num3;
	}
	}

}
