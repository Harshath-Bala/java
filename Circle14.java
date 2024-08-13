public class Circle14{
    public static void main(String[] args) {
        double[] results = getAreaAndCircumference();
        System.out.printf("The area of the circle with radius %.2f is %.2f.%n", 4.0, results[0]);
        System.out.printf("The circumference of the circle with radius %.2f is %.2f.%n", 4.0, results[1]);
    }

    public static double[] getAreaAndCircumference() {
        final double RADIUS = 4.0; // Hard-coded radius value
        double area = Math.PI * RADIUS * RADIUS;
        double circumference = 2 * Math.PI * RADIUS;
        return new double[] { area, circumference };
    }
}
