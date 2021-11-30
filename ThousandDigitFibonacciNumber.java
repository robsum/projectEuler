import java.math.BigInteger;

public class ThousandDigitFibonacciNumber {
    public static void main(String[] args) {
        int i = 0;
        int count = 2;
        BigInteger limit = (new BigInteger("10")).pow(999);
        BigInteger[] fibonacci = new BigInteger[3];
        fibonacci[0] = BigInteger.ONE;
        fibonacci[2] = BigInteger.ONE;

        while ((fibonacci[i]).compareTo(limit) < 0) {
            i = (i + 1) % 3;
            count++;
            fibonacci[i] = fibonacci[(i + 1) % 3].add(fibonacci[(i + 2) % 3]);
        }
        System.out.println(count);
    }
}
