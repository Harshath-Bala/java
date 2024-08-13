import java.util.Scanner;

public class Circle23{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        printAreaAndCircumference(radius);
        scanner.close();
    }

    public static void printAreaAndCircumference(double radius) {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.printf("The area of the circle with radius %.2f is %.2f.%n", radius, area);
        System.out.printf("The circumference of the circle with radius %.2f is %.2f.%n", radius, circumference);
    }
}
