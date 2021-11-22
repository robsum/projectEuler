public class SpecialPythagoreanTriplet {
	public static void main(String[] args) {
		for (int i = 1; i < 1_000; ++i) {
			for (int j = 1; j < 1_000; ++j) {
				for (int k = 1; k < 1_000; ++k) {
					if (i + j + k == 1000) {
						if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) {
							System.out.println(i*j*k);
						}
					}
				}
			}
		}
	}
}