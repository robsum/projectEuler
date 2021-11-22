//import java.Math.*;

public class SumSquareDifference {
	public static void main(String[] args) {
		long sum_squares = 0;
		for (int i = 1; i < 101; ++i) {
			sum_squares += Math.pow(i, 2);
		}

		long square_sum = 0;
		for (int i = 1; i < 101; ++i) {
			square_sum += i;
		}

		square_sum = (long) Math.pow(square_sum, 2);

		long difference = square_sum - sum_squares;

		System.out.println(difference);
	}
}