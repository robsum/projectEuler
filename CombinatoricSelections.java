import java.math.BigInteger;
import java.util.LinkedList;

public class CombinatoricSelections {
    public static void main(String[] args) {
        LinkedList<BigInteger> list = new LinkedList<>();
        for (int n = 1; n <= 100; ++n) {
            for (int r = 0; r <= n; ++r) {
                BigInteger current = combinatoricSelection(n, r);
                int comparition = current.compareTo(BigInteger.valueOf(1_000_000));
                if (comparition == 1)
                    list.add(current);
            }
        }
        System.out.println(list.size());
    }
    private static BigInteger factorial(int n) {
        if (n == 0) return BigInteger.ONE;
        else return factorial(n - 1).multiply(BigInteger.valueOf(n));
    }
    private static BigInteger combinatoricSelection(int n, int r) {
        return factorial(n).divide(factorial(r).multiply(factorial(n - r)));
    }
}
