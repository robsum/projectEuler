public class LargestPalindromeProduct {
	public static void main(String[] args) {
		long largestPalindrome = 0;
		for (int i = 0; i < 1_000; ++i) {
			for (int j = 0; j < 1_000; ++j) {
				long number = i * j;
				if (isPalindrome(number)) {
					largestPalindrome = number > largestPalindrome ? number : largestPalindrome;
				}
			}
		}
		System.out.println(largestPalindrome);
	}

	public static boolean isPalindrome(long number) {
		String strNumber = String.valueOf(number);

		boolean palindrome = true;

		int length = strNumber.length();

		for (int i = 0; i < length; ++i) {
			if (!(strNumber.charAt(i) == strNumber.charAt(length - 1 - i))) {
				palindrome = false;
			}
		}
		return palindrome;
	}
}