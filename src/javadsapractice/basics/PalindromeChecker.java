package javadsapractice.basics;

public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  if(isPalindrome("madam")) {
			  System.out.println("String is Palindrome");
		  } else {
			  System.out.println("String is not Palindrome");
		  }
	}
	
	private static Boolean isPalindrome(String word ) {
		
		StringBuilder sb = new StringBuilder(word);
			
		return word.equalsIgnoreCase(sb.reverse().toString());
	}

}
