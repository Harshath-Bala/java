public class Circle13{
    public static void main(String[] args) {
        final double RADIUS = 5.0; // Hard-coded radius value
        printAreaAndCircumference();
    }

    public static void printAreaAndCircumference() {
        final double RADIUS = 5.0; // Hard-coded radius value
        double area = Math.PI * RADIUS * RADIUS;
        double circumference = 2 * Math.PI * RADIUS;
        System.out.printf("The area of the circle with radius %.2f is %.2f.%n", RADIUS, area);
        System.out.printf("The circumference of the circle with radius %.2f is %.2f.%n", RADIUS, circumference);
    }
}
