/*
public class FractionPart {
    public static void main(String[] args) {
        double number = 145.033;
        int fractionPart = (int) ((number % 1) * 10000);


        System.out.println("Fraction part of " + number + " is " + fractionPart);
    }
}
*/


/*
public class FractionPart {
    public static void main(String[] args) {
        double number = -1.0123456789;
        long fractionPart;
        fractionPart = (long) Math.round(Math.abs(number) * 1000000000) % 1000000000;
        double fractionPart2 = fractionPart;
        while (fractionPart2 % 10 == 0 && fractionPart2 != 0) {
            fractionPart2 /= 10;
        }
        System.out.println("Дробная часть числа " + number + " равна " + (long) fractionPart2 + ".");
    }
}*/
public class FractionPart {
    public static void main(String[] args) {
        double number = -3.000101230;
        long fractionPart;
        long fraction;
        int i = 1;
        int k = 1;
        String zero = "";
        fractionPart = Math.round(Math.abs(number) * 1000000000) % 1000000000;
        double fractionPart2 = fractionPart;
        while (fractionPart2 % 10 == 0 && fractionPart2 != 0) {
            fractionPart2 /= 10;
        }
        fraction = Math.round(Math.abs(number) * 1000000000);
        double fraction2 = fraction;
        while (fraction2 % 10 == 0 && fraction2 != 0) {
            fraction2 /= 10;
        }
        while (fractionPart2 >= i) {
            i *= 10;
            k *= 10;
        }
        double result = fraction2 / k;
        result = (int) result;
        i = 1;
        k = 0;
        while (result >= i) {
            i *= 10;
            k++;
        }
        if (k > 1) {
            int h = 1;
            while (k > h) {
                zero = zero + "0";
                h++;
            }
        }
        System.out.println("Дробная часть числа " + number + " равна " + zero + (long) fractionPart2 + ".");
    }
}