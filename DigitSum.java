import java.util.Scanner;
public class DigitSum {
    public static void main(String args[]) {
        int revN = 0;
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int ld = n % 10;
            cnt = cnt+ ld;
            n = n / 10;
        }
        System.out.println(cnt);
        sc.close();
    }
}
