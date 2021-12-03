public class CoinSums {
    private static final int[] COINS = {1, 2, 5, 10, 20, 50, 100, 200};
    private static final int TARGET = 200;
    public static void main(String[] args) {
        long ways = 0;
        for (int a = TARGET; a >= 0; a -= COINS[7]) {
            for (int b = a; b >= 0; b -= COINS[6]) {
                for (int c = b; c >= 0; c -= COINS[5]) {
                    for (int d = c; d >= 0; d -= COINS[4]) {
                        for (int e = d; e >= 0; e -= COINS[3]) {
                            for (int f = e; f >= 0; f -= COINS[2]) {
                                for (int g = f; g >= 0; g -= COINS[1]) {
                                    ways++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ways);
    }
}