package ForLoop2;

public class FindTemperatures {
	public static void main(String[] args) {
	int [] temperatures= {-5,6,-7,8,-9,10,-11,12,-13};
	int positiveCount=0;
	int negativeCount=0;
	for(int i=0;i<9;i++) {
	if(temperatures[i]>0) {
	positiveCount++;
	System.out.println(temperatures[i]+" "+"The Positive Number");
	}
	else {
    negativeCount++;
    System.out.println(temperatures[i]+" "+"The Negative Number");
	}
		
	}
	System.out.println("PositiveCount="+" "+positiveCount);
	System.out.println("NegativeCount="+" "+negativeCount);
	}

}
