import java.util.*;

public class LongestCollatzSequence {
	public static void main(String[] args) {
		int longestChain = 1;
		long longestChainNumber = 1;
		for (int i = 1; i < 1_000_000; ++i) {
			int howLong = 0;
			long number = i;
			LinkedList<Long> list = new LinkedList<>();
			list.add(number);
			do {
				if (number % 2 == 0) {
					number = getNextEven(number);
				} else {
					number = getNextOdd(number);
				}
				list.add(number);
			} while (number != 1);
			if (list.size() > longestChain) {
				longestChainNumber = i;
				longestChain = list.size();
			}
		}
		System.out.println(longestChainNumber);
	}
	public static long getNextEven(long number) {
		return number / 2;
	}
	public static long getNextOdd(long number) {
		return 3 * number + 1;
	}
}