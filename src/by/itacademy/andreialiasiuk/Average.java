package by.itacademy.andreialiasiuk;

public class Average {
    public static void main(String[] args) {
        int a = 11;
        int b = 16;
        System.out.println("by.itacademy.andreialiasiuk.Average of " + a + " and " + b + " is: " + calcAverage(a, b));
    }

    static double calcAverage(int a, int b) {
        double avarage = Double.sum(a, b) / 2;
        return avarage;
    }
}
