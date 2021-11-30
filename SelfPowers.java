import java.math.BigInteger;

public class SelfPowers {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 1_000; ++i) {
            BigInteger current = BigInteger.valueOf(i).pow(i);
            sum = sum.add(current);
        }
        System.out.println(sum);
    }
}
