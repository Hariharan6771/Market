package Lms;

public class Input8WithQube {
	public static void main(String[] args) {
	int num=Integer.parseInt(args[0]);
	int temp=0;
	for(int i=0;i<=num;i++) {
	temp=temp+(i*i*i);
	}
	System.out.println(temp);
	}

}
