package ForLoop2;

public class FindMinLengthAndNames {
	public static void main(String[] args) {
		String[] names= {"surya","viji","suresh","preethi","sekar"};
		int mini=names[0].length();
		String temp=" ";
		for(int i=0;i<names.length;i++) {
		if(names[i].length()<mini) {
		mini=names[i].length();
		temp=names[i];
		}
		}
		System.out.println(temp);
		System.out.println(mini);
		}

	}



