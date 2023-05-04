public class MinValues {
    public static void main(String[] args) {
        int[] arr = {5, 7, 23, 1, 76};

        //int min1=Integer.MAX_VALUE;
        //int min2=Integer.MAX_VALUE;

        int min1 = arr[0];
        int min2 = arr[1];

        if (min1 > min2) {
            int temp = min1;
            min1 = min2;
            min2 = temp;
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }
        }
        System.out.println("Min values are: " + min1 + ", " + min2);

    }
}
