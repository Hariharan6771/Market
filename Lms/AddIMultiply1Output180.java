	package Lms;

public class AddIMultiply1Output180 {
	public static void main(String[] args) {
	int num=Integer.parseInt(args[0]);
	int temp=0;
	int count=1;
	for(int i=1;i<=num;i++) {
	temp=temp+i;
	count=count*temp;
	}
	System.out.println(count);
	}

}
