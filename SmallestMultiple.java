public class SmallestMultiple {
	public static void main(String[] args) {
		long number = 1;
		while (true) {
			//System.out.println(number);
			boolean isEvenlyDivisible = true;
			for (int i = 1; i < 21; ++i) {
				if (number % i != 0) {
					isEvenlyDivisible = false;
				}
			}
			if (isEvenlyDivisible) {
				System.out.println(number);
				break;
			}
			number++;
		}
	}
}