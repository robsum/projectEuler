import java.math.BigInteger;

public class PowerDigitSum {
	public static void main(String[] args) {
		BigInteger number = BigInteger.TWO;
		for (int i = 1; i < 1_000; ++i) {
			number = number.multiply(BigInteger.TWO);
		}
		String s = number.toString();
		long sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += Integer.parseInt(Character.toString(s.charAt(i)));
		}
		System.out.println(sum);
	}
}