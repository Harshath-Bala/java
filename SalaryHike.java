import java.util.Scanner;
public class SalaryHike{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int salary=sc.nextInt();
        double hike=sc.nextDouble();
        double newSal=salary + (hike/100 * salary);
        System.out.println(String.format("%.1f", newSal));
    }
}