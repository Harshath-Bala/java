class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber add(ComplexNumber other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new ComplexNumber(realPart, imaginaryPart);
    }
    public void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        }
    }
}

public class ComplexNumberAddition {

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3.5, 2.5); // Example complex number 3.5 + 2.5i
        ComplexNumber c2 = new ComplexNumber(1.5, 4.5); // Example complex number 1.5 + 4.5i
        ComplexNumber sum = c1.add(c2);
        System.out.print("Sum of ");
        c1.display();
        System.out.print("and ");
        c2.display();
        System.out.print("is ");
        sum.display();
    }
}
