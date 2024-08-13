import java.util.Scanner;

public class Circle24{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double[] results = getAreaAndCircumference(radius);
        System.out.printf("The area of the circle with radius %.2f is %.2f.%n", radius, results[0]);
        System.out.printf("The circumference of the circle with radius %.2f is %.2f.%n", radius, results[1]);
        scanner.close();
    }

    public static double[] getAreaAndCircumference(double radius) {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        return new double[] { area, circumference };
    }
}
