public class Circumference {
    public static void main(String[] args) {
        double radius = 10;
        System.out.println(calcCircumference(radius));
    }

    static double calcCircumference(double r) {
        double circumference = 2 * Math.PI * r;
        return circumference;
    }
}
