import java.util.*;

public class HighlyDivisibleTriangularNumber {
	public static void main(String[] args) {
		LinkedList<Long> triangleNumbers = new LinkedList<>();
		triangleNumbers.add(1L);
		for (int i = 2; ; ++i) {
			long next = triangleNumbers.getLast() + i;
			triangleNumbers.add(next);
			System.out.println(next + " " + checkNoDivisors(next));
			if (checkNoDivisors(next) > 500) {
				break;
			}
		}
		System.out.println(triangleNumbers.getLast());
	}
	public static int checkNoDivisors(long number) {
		int no = 0;
		for (int i = 1; i < number/2 + 1; ++i) {
			if (number % i == 0) {
				no++;
			}
		}
		no++; // for the number itself
		return no;
	}
}