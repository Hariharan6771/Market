package ForLoop2;

public class FindMaxAndMin {
	public static void main(String[] args) {
	int[] ages= {54,62,53,5,90,87,32};
	int max=0;
	for(int i=0;i<ages.length;i++) {
	if(ages[i]>max) {
	max=ages[i];
	}
	
	}
	System.out.println(max);
	}

}
