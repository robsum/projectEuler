import java.math.BigInteger;

public class LychrelNumbers {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 0; i < 10_000; ++i) {
            if (isLychrel(i))
                sum++;
        }
        System.out.println(sum);
    }

    public static boolean isLychrel(Integer number) {
        boolean lychrel = true;

        BigInteger n = new BigInteger(number.toString());
        n = n.add(new BigInteger(new StringBuilder(n.toString()).reverse().toString()));

        for (int i = 0; i < 50; ++i) {
            if (isPalindromic(n)) {
                lychrel = false;
                break;
            }
            n = n.add(new BigInteger(new StringBuilder(n.toString()).reverse().toString()));
        }

        return lychrel;
    }

    public static boolean isPalindromic(BigInteger number) {
        StringBuilder string = new StringBuilder(number.toString());
        return string.toString().equals(string.reverse().toString());
    }
}
