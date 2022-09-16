package ForLoop2;

public class FindEvenAndOdd {
	public static void main(String[] args) {
	int[] ages= {27,25,24,24,25,24,23,27,25};
	int evenCount=0;
	int oddCount=0;
	for(int i=0;i<ages.length;i++) {
	if(ages[i]%2==0) {
	evenCount++;
	System.out.println(ages[i]+" "+"Is Even Number");
	}
	else {
	oddCount++;	
	System.out.println(ages[i]+" "+"Is Odd Number");
	}
	}
	System.out.println("Even count="+evenCount);
	System.out.println("Odd count="+oddCount);
}

}
