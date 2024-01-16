import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println(generateInt(3, 5));
        System.out.println(isPalindromeFiveLetterWord("ротор"));
        printDivisors(12);
        printNumberSumOfMultidigitNumber(456);
    }

    public static int generateInt(int a, int b) {
        return new Random().nextInt(a, ++b);
    }

    public static boolean isPalindromeFiveLetterWord(String word) {
        for (int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void printDivisors(int a) {
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void printNumberSumOfMultidigitNumber(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a%10;
            a /= 10;
        }
        System.out.println(sum);
    }
}