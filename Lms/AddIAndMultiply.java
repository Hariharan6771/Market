package Lms;

public class AddIAndMultiply {
	public static void main(String[] args) {
	int num=Integer.parseInt(args[0]);
	int temp=0;
	int count=0;
	for(int i=1;i<=num;i++) {
	temp=temp+i;
	count=count+temp;
	
	}
	System.out.println(count);
	}

}
