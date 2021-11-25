import java.math.BigInteger;

public class FactorialDigitSum {
    public static void main(String[] args) {
        BigInteger fact = factorial(100);
        String str = fact.toString();

        long sum = 0;
        for (int i = 0; i < str.length(); ++i) {
            sum += Long.parseLong(Character.toString(str.charAt(i)));
        }

        System.out.println(sum);
    }

    public static BigInteger factorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        } else {
            return factorial(n - 1).multiply(BigInteger.valueOf(n));
        }
    }
}
