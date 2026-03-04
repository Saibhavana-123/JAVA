import java.util.Scanner;
public class prime {
    public static void main(String args[]){
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i =1 ; i <=n;i++) {
            if (n % i == 0) {
                cnt += 1;
            }
        }
            if(cnt==2){System.out.println("Prime");}
            else{
                    System.out.println("Not Prime");
                }
    }
}
