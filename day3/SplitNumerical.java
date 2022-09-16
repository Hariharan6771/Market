package day3;

public class SplitNumerical {
	public static void main(String[] args) {
		String school="I am 8th standard";
		String[] words=school.split("\\d");
		System.out.println(words[0]);
		System.out.println(words[words.length-1]);
		
		
	}

}
