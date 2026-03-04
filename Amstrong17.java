import java.util.Scanner;
public class amstrong17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int amstrong = 0 ;
        int dup = n;
        while (n>0){
           int ld = n % 10 ;
           amstrong = (amstrong*10)+(ld*ld*ld);
           n = n / 10;
        }
        if(amstrong == dup){
            System.out.println("Amstrong");
        }
        else{
            System.out.println("Not Amstrong");
        }
        sc.close();
    }
}
