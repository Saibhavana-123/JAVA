import java.util.Scanner;
public class revnum {
    public static void main(String args[]) {
        int revN = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int ld = n % 10;
            revN = (revN * 10) + ld;
            n = n / 10;
        }
        System.out.println(revN);
        sc.close();
    }
}
