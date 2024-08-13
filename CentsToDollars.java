import java.util.Scanner;
public class CentsToDollars{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cents=sc.nextInt();
        double dollars=cents/100.0;
        System.out.println(String.format("%.2f",dollars));
    }
}