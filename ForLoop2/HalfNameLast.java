package ForLoop2;

public class HalfNameLast {
	public static void main(String[] args) {
		String[] names= {"hari","mani","ravi","balu","naresh","franesh","priya","janu","ram"};
		for(int i=names.length/2;i<names.length;i++) {
	    System.out.println(names[i]);
		}
		System.out.println(" ");
		for(int i=names.length-1;i>=names.length/2;i--) {
		System.out.println(names[i]);
	}

	
}

}
