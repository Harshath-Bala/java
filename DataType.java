import java.util.Scanner;
public class DataType{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int testcases=sc.nextInt();
        for(int i=0; i<testcases; i++){
            long inp=sc.nextLong();
            System.out.println(inp+" can be fitted in:");
            if(inp>Byte.MIN_VALUE && inp<Byte.MAX_VALUE) System.out.println("*Byte");
            if(inp>Short.MIN_VALUE && inp<Short.MAX_VALUE) System.out.println("*Short");
            if(inp>Integer.MIN_VALUE && inp<Integer.MAX_VALUE) System.out.println("*Int");
            if(inp>Long.MIN_VALUE && inp<Long.MAX_VALUE) System.out.println("*Long");
        }
    }
}