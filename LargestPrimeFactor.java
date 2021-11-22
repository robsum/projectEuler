import java.util.*;

public class LargestPrimeFactor {
	public static void main(String[] args) {
		final long  number = 600851475143L; // 13195;//
		long numberDivided = number;

		LinkedList<Long> primeFactors = new LinkedList<>();
		long primeFactor = getNextPrimeFactor(number);
		primeFactors.add(primeFactor);
		numberDivided = numberDivided / primeFactor;
		while (numberDivided != 1) {
			primeFactor = getNextPrimeFactor(numberDivided);
			primeFactors.add(primeFactor);
			numberDivided /= primeFactor;
		}

		long largestPrimeFactor = primeFactors.get(0);

		for (long factor : primeFactors) {
			largestPrimeFactor =
			factor > largestPrimeFactor ?
			factor : largestPrimeFactor;
		}
		
		System.out.println(largestPrimeFactor);	

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

	public static long getNextPrimeFactor(long number) {
		long primeFactor;
		int i = 3;
		while (true) {
			//System.out.println(i);
			if (!isPrime(i)) {
				++i;
				continue;
			}
			if (number % i == 0) {
				primeFactor = i;
				break;
			}
			if (i == number) {
				primeFactor = 1;
				break;
			}
			++i;
		}
		return primeFactor;
	}
}