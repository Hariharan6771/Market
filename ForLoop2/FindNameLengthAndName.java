package ForLoop2;

public class FindNameLengthAndName {
	public static void main(String[] args) {
	String[] names= {"surya","viji","suresh","preethi","sekar"};
	int max=0;
	String temp=" ";
	for(int i=0;i<names.length;i++) {
	if(names[i].length()>max) {
	max=names[i].length();
	temp=names[i];
	}
	}
	System.out.println(temp);
	System.out.println(max);
	}

}
