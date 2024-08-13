public class CircleCalculator {
    public void printPerimeter(double radius) {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter (Circumference) of the circle with radius " + radius + " is: " + perimeter);
    }
    public void printArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }
    public static void main(String[] args) {
        CircleCalculator calculator = new CircleCalculator();
        double radius = 5.0;
        calculator.printPerimeter(radius);
        calculator.printArea(radius);
    }
}
