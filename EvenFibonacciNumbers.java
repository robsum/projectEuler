public class EvenFibonacciNumbers {
	public static void main(String[] args) {
		long previousPrevious = 1;
		long previous = 2;
		long next = 3;
		long sum = 2;
		for (int i = 0; next < 4_000_001; ++i) {
			next = previous + previousPrevious;
			//long temp = previousPrevious;
			previousPrevious = previous;
			previous = next;
			if (next % 2 == 0) {
				sum += next;
			}
			System.out.println(next);
		}
		System.out.println(sum);
	}
}