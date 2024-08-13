public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0); // Example radius
        double area = myCircle.calculateArea();
        System.out.println("Area of the circle: " + area);
        double perimeter = myCircle.calculatePerimeter();
        System.out.println("Perimeter of the circle: " + perimeter);
    }
}
