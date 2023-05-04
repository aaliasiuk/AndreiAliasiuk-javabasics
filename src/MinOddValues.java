public class MinOddValues {
    public static void main(String[] args) {
        int[] arr = {1, 45, 12, 48, 113, 32, 5};
        int min = arr[1];
        int index = 1;

        for (int i = 3; i < arr.length; i += 2) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Min value is: " + min + " index: " + index);

    }

}