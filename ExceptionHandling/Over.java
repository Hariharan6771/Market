package ExceptionHandling;

public class Over {
	public void findA() {
		findB();
	}
	public void findB() {
		findA();
		
	}
public static void main(String[] args) {
	Over of=new Over();
	of.findA();
}

}
   