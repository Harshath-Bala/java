public class Circle11 {
    public static void main(String[] args) {
        final double RADIUS = 7.0; // Hard-coded radius value
        printAreaAndCircumference(RADIUS);
    }

    public static void printAreaAndCircumference(double radius) {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.printf("The area of the circle with radius %.2f is %.2f.%n", radius, area);
        System.out.printf("The circumference of the circle with radius %.2f is %.2f.%n", radius, circumference);
    }
}
