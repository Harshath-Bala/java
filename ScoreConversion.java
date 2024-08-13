import java.util.Scanner;
public class ScoreConversion{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double score=sc.nextDouble();
        int newScore=(int) score;
        System.out.println(newScore);
    }
}