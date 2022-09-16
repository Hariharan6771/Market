package day3;

public class SplitAlpha {
	public static void main(String[] rgs) {
		String school="i am 10th standard";
		String[] words=school.split("\\D");
		System.out.println(words[0]);
		System.out.println(words[words.length-1]);
		
	}

}
