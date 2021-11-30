import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

public class NamesScores {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("p022_names.txt"));
        LinkedList<String> list = new LinkedList<>();
        try {
            //StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            String[] names = line.split(",");

            for (String name : names) {
                list.add(name);
            }
            //String everything = sb.toString();
        } finally {
            br.close();
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('A', 1);
        hashMap.put('B', 2);
        hashMap.put('C', 3);
        hashMap.put('D', 4);
        hashMap.put('E', 5);
        hashMap.put('F', 6);
        hashMap.put('G', 7);
        hashMap.put('H', 8);
        hashMap.put('I', 9);
        hashMap.put('J', 10);
        hashMap.put('K', 11);
        hashMap.put('L', 12);
        hashMap.put('M', 13);
        hashMap.put('N', 14);
        hashMap.put('O', 15);
        hashMap.put('P', 16);
        hashMap.put('Q', 17);
        hashMap.put('R', 18);
        hashMap.put('S', 19);
        hashMap.put('T', 20);
        hashMap.put('U', 21);
        hashMap.put('V', 22);
        hashMap.put('W', 23);
        hashMap.put('X', 24);
        hashMap.put('Y', 25);
        hashMap.put('Z', 26);
        hashMap.put('"', 0);

        list.sort(Comparator.naturalOrder());

        int position = 1;
        long sum = 0;
        for (String name : list) {
            long score = 0L;

            for (int i = 0; i < name.length(); ++i) {
                score += hashMap.get(name.charAt(i));
            }
            score *= position;

            sum += score;
            position++;
        }
        System.out.println(sum);
    
    }
        
}
