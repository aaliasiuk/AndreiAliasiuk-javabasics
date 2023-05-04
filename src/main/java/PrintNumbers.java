public class PrintNumbers {
    public static void main(String[] args) {
        int count = 5;

        for (int i = 0; i <= count; i++) {
            for (int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
