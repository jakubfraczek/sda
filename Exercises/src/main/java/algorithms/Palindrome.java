package algorithms;

public class Palindrome {

	public void isPalindrome(String userStringInput) {
		boolean isPalindrome = false;
		
		String dupa = userStringInput.replaceAll("\\s+", "");
		
		for (int i = 0; i < dupa.length(); i++) {
			char increasing = dupa.charAt(i);
			char decreasing = dupa.charAt(dupa.length() - i - 1);
			System.out.println("increasing: " + increasing + " || decreasing " + decreasing);
			
			if (increasing == decreasing) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println("Fraza " + userStringInput + " to jest palindrom");
		} else {
			System.out.println("Fraza " + userStringInput + " to nie jest palindrom");
		}
	}

}
