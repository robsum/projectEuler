import java.util.LinkedList;

public class PermutedMultiples {
    public static void main(String[] args) {
        int number = 1;
        while (true) {
            int x = number;
            int x2 = 2 * x;
            int x3 = 3 * x;
            int x4 = 4 * x;
            int x5 = 5 * x;
            int x6 = 6 * x;

            if (containsSameDigits(Integer.toString(x), Integer.toString(x2))) {
                if (containsSameDigits(Integer.toString(x), Integer.toString(x3))) {
                    if (containsSameDigits(Integer.toString(x), Integer.toString(x4))) {
                        if (containsSameDigits(Integer.toString(x), Integer.toString(x5))) {
                            if (containsSameDigits(Integer.toString(x), Integer.toString(x6))) {
                                break;
                            }
                        }
                    }
                }
            }
            number++;
        }
        System.out.println(number);
    }
    private static boolean containsSameDigits(String a, String b) {
        if (a.length() != b.length())
            return false;
        LinkedList<Character> listOfDigitsA = new LinkedList<>();
        for (int i = 0; i < a.length(); ++i) {
            listOfDigitsA.add(a.charAt(i));
        }
        boolean toReturn = true;
        for (int i = 0; i < b.length(); ++i) {
            if (!listOfDigitsA.contains(b.charAt(i))) {
                toReturn = false;
                break;
            } else {
                listOfDigitsA.remove(Character.valueOf(b.charAt(i)));
            }
        }
        return toReturn;
    }
}
