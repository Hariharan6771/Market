package ForLoop2;

public class HalfName {
	public static void main(String[] args) {
		String[] names= {"hari","mani","ravi","balu","naresh","franesh","priya","janu","ram"};
		for(int i=0;i<names.length/2;i++) {
	    System.out.println(names[i]);
		}
		System.out.println(" ");
		for(int i=names.length/2-1;i>=0;i--) {
	    System.out.println(names[i]);
			
		}
	}
}

