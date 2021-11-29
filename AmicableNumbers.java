public class AmicableNumbers {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i < 10_000; ++i) {
            if (amicableNumber(i))
                sum += i;
        }
        System.out.println(sum);
    }

    private static int properDivisorsSum(int number) {
        int divisors = 0;
        for (int i = 1; i < (number / 2) + 1; ++i) {
            if (number % i == 0) {
                divisors += i;
            }
        }
        return divisors;
    }

    private static boolean amicableNumber(int n) { 
	    int b = properDivisorsSum(n);
        int a = properDivisorsSum(b);
	    return b != a && a == n;
    }
}