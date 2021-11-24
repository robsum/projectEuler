public class NumberLetterCounts {
	public static final String[] numbers = {
			"",			// 0
			"one",		// 1
			"two",		// 2
			"three",	// 3
			"four",		// 4
			"five",		// 5
			"six",		// 6
			"seven",	// 7
			"eight",	// 8
			"nine",		// 9
			"ten",		// 10
			"eleven",	// 11
			"twelve",	// 12
			"thirteen",	// 13
			"fourteen",	// 14
			"fifteen",	// 15
			"sixteen",	// 16
			"seventeen",// 17
			"eighteen",	// 18
			"nineteen",	// 19
			"twenty",	// 20
			"thirty",	// 21
			"forty",	// 22
			"fifty",	// 23
			"sixty",	// 24
			"seventy",	// 25
			"eighty",	// 26
			"ninety",	// 27
			"hundred",	// 28
			"onethousand"	// 29
		};

	public static void main(String[] args) {
		
		long sum = 0;
		for (int i = 1; i <= 1_000; ++i) {
			sum += toEnglish(i).length();
			System.out.println(toEnglish(i));
		}
		System.out.println(sum);
	}

	public static String toEnglish(int number) {
		if (number < 0 || number > 1000)
	   		throw new IllegalArgumentException();

		if (number < 21) return numbers[number];
		if (number < 30) return numbers[20] + numbers[number - 20];
		if (number < 40) return numbers[21] + numbers[number - 30];
		if (number < 50) return numbers[22] + numbers[number - 40];
		if (number < 60) return numbers[23] + numbers[number - 50];
		if (number < 70) return numbers[24] + numbers[number - 60];
		if (number < 80) return numbers[25] + numbers[number - 70];
		if (number < 90) return numbers[26] + numbers[number - 80];
		if (number < 100) return numbers[27] + numbers[number - 90];
		if (number == 1000) return numbers[29];

		String s = "";

		if (number < 200)      s += numbers[1] + numbers[28];
		else if (number < 300) s += numbers[2] + numbers[28];
		else if (number < 400) s += numbers[3] + numbers[28];
		else if (number < 500) s += numbers[4] + numbers[28];
		else if (number < 600) s += numbers[5] + numbers[28];
		else if (number < 700) s += numbers[6] + numbers[28];
		else if (number < 800) s += numbers[7] + numbers[28];
		else if (number < 900) s += numbers[8] + numbers[28];
		else if (number < 1_000) s += numbers[9] + numbers[28];

		if (number % 100 != 0) s += "and";

		s += toEnglish(number % 100);
		
		return s;
	}
}