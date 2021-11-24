public class LatticePaths {
	public static void main(String[] args) {
		int size = 21;
		long array[][] = new long[size][size];

		// initialize all with 1
		for (int i = 0; i < size; ++i) {
			for (int j = 0; j < size; ++j) {
				array[i][j] = 1;
			}
		}

		// sum up the ways
		for (int i = 1; i < size; ++i) {
			for (int j = 1; j < size; ++j) {
				array[i][j] = array[i-1][j] + array[i][j-1];
			}
		}

		System.out.println(array[size-1][size-1]);
	}
}