public class Circle1 {
    private double radius;
    private double perimeter;
    private double area;
    public Circle1(double radius) {
        this.radius = radius;
        calculatePerimeter();
        calculateArea();
    }
    private void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }
    private void calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
    }
    public void displayResults() {
        System.out.println("Perimeter (Circumference) of the circle: " + perimeter);
        System.out.println("Area of the circle: " + area);
    }
    public static void main(String[] args) {
        Circle1 myCircle = new Circle1(5);
        myCircle.displayResults();
    }
}
