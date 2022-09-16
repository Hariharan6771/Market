package day3;

public class SplitPunctuation {
	public static void main(String[] args) {
		String word="who?when?okay!money$hash#";
		String[] words=word.split("\\p{Punct}");
		System.out.println(words[3]);
		System.out.println(words[words.length-1]);
				
	}

}
