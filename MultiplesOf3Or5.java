import java.util.*;

public class MultiplesOf3Or5 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		for (int i = 1; i < 1000; ++i) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
				list.add(i);
			}
		}
		System.out.println(sum);
	}
	
}