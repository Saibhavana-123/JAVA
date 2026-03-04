import java.util.Scanner;
public class digitExtract {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
         n = n / 10;
         int digit = n % 10;
         System.out.println(digit);
    }
}
