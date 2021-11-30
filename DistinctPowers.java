import java.math.BigInteger;
import java.util.HashSet;

public class DistinctPowers {
    public static void main(String[] args) {
        HashSet<BigInteger> hashSet = new HashSet<>();
        for (int a = 2; a <= 100; ++a) {
            for (int b = 2; b <= 100; ++b) {
                BigInteger current = BigInteger.valueOf(a).pow(b);
                hashSet.add(current);
            }
        }
        System.out.println(hashSet.size());
    }
}
