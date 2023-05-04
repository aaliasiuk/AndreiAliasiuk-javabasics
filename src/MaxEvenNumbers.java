public class MaxEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {11, 4, 6, 13, 909, 1, 7, 89};
        int max = arr[0];
        int index = 0;

        for (int i = 2; i < arr.length; i += 2) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Max value is: " + max + " index: " + index);
    }
}
