import java.util.Scanner;
public class EveOdd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while( n > 1){
            n = n -2;
        }
        if ( n == 0 ){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        sc.close();
    }
}
