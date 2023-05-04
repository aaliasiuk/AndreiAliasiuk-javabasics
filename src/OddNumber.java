public class OddNumber {
    public static void main(String[] args) {
        int number = 110;
        if (isOdd(number)) System.out.println("Number " + number + " is odd.");
        else System.out.println("Number " + number + " is even.");
    }
    static boolean isOdd(int number) {
        boolean result;
        if (number % 2 != 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
