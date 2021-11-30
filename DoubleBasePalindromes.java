public class DoubleBasePalindromes {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i < 1_000_000; ++i) {
            StringBuilder iAsAStringBuilderBase10 = new StringBuilder(Integer.toString(i, 10));
            StringBuilder iAsAStringBuilderBase2 = new StringBuilder(Integer.toString(i, 2));

            if (isPalindromic(iAsAStringBuilderBase10) && isPalindromic(iAsAStringBuilderBase2)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isPalindromic(StringBuilder string) {
        return string.toString().equals(string.reverse().toString());
    }
}
