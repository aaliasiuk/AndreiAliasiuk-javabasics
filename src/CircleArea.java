public class CircleArea {
    public static void main(String[] args) {
        double radius = 11;
        double square;
        //square = radius * radius * Math.PI;
        System.out.println(calcCircleArea(radius));
    }

    static double calcCircleArea(double r) {
        double square = r * r * Math.PI;
        return square;
    }
}
