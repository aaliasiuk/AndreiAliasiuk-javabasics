public class EvenNumber {
    public static void main(String[] args) {
        int number = 50;
        if (isEven(number)) System.out.println("Even");
        else System.out.println("Odd");
    }

    static boolean isEven(int number) {
        boolean result = false;
        if (number % 2 == 0 && number != 0) {
            result = true;
        }
        return result;
    }
}
