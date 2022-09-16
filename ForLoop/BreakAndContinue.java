package ForLoop;

public class BreakAndContinue {
	public static void main(String[] args) {
	int num=1000;
	for(int i=0;i<=num;i++) {
	if(i%5==0) {
	continue;
	}
	else {
	System.out.println(i);
	}
	if(i==600) {
    break;
	}
	
	
	}
	}

}
