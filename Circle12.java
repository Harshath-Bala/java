public class Circle12{
    public static void main(String[] args) {
        final double RADIUS = 3.5; // Hard-coded radius value
        double[] results = calculateAreaAndCircumference(RADIUS);
        System.out.printf("The area of the circle with radius %.2f is %.2f.%n", RADIUS, results[0]);
        System.out.printf("The circumference of the circle with radius %.2f is %.2f.%n", RADIUS, results[1]);
    }

    public static double[] calculateAreaAndCircumference(double radius) {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        return new double[] { area, circumference };
    }
}
