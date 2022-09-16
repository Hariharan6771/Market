package FunctionWithParameter;

public class PrimeNumber {
	public void findPrimeNumber(int num) {
    boolean isPrime=true;
    for(int i=2;i<num;i++) {
    if(num%i==0) {
    isPrime=false;
    }
    }
    if(isPrime==true) {
    System.out.println("PrimeNumber");
    }
    else {
    System.out.println("is not PrimeNumber");
    }
	}

}
