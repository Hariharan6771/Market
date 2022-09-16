package FunctionWithParameter;

public class Palindrome {
	public String findPalindrome(String word) {
		String temp="";
		for(int i=word.length()-1;i>=0;i--) {
		temp=temp+word.charAt(i);
		}
		if(word.equals(temp)) {
		return ("palindrome");
		}
		return ("not a palindrome");
		}
		
	}


