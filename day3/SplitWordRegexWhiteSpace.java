package day3;

public class SplitWordRegexWhiteSpace {
	public static void  main(String[] args) {
		String name="my name is khan";
		String[] words=name.split("\\s");
		System.out.println(words[0]);
		System.out.println(words[words.length-1]);
		System.out.println(words[1]);
	}

}
