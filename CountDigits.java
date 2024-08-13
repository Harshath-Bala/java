import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String input = scanner.nextLine();
        scanner.close();
        input = input.trim();
        if (input.matches("-?\\d+")) {
            int digitCount = input.length();
            System.out.println("The total number of digits is: " + digitCount);
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
