public class Program10001stPrime {
	public static void main(String[] args) {
		int no = 0;
		int i = 2;
		while (true) {
			if (isPrime(i)) {
				no += 1;
				if (no == 10_001) {
					System.out.println(i);
					break;
				}
			}
			++i;
		}

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