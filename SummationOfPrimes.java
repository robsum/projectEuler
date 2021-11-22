public class SummationOfPrimes {
	public static void main(String[] args) {
		long sum = 0;
		for (int i = 2; i < 2_000_000; ++i) {
			if (isPrime(i)) { sum += i; System.out.println(i); }
		}
		System.out.println(sum);
	}

	public static boolean isPrime(long number) {
		boolean flag = false;
		for (int i = 2; i <= number / 2; ++i) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		return !flag;
	}
}