import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (R) in percentage: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time in years (T): ");
        double time = scanner.nextDouble();
        scanner.close();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.printf("The Simple Interest is: %.2f\n", simpleInterest);
    }
}
