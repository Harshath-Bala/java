import java.util.Scanner;
public class RevNum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int copy=num;
        int rev=0;
        while(copy != 0){
            int d=copy % 10;
            rev=(rev * 10) + d;
            copy = copy /10;
        }
        if(rev==num) System.out.println("The reversed number is "+rev+". It is same as the original.");
        else System.out.println("The reversed number is "+rev+". It is not the same as the original.");
    }
}