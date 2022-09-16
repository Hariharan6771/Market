package Test;

public class Functional implements Fun {
	public void say(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {  
        Functional file = new Functional();  
        file.say("Hello there");  
	}
}
