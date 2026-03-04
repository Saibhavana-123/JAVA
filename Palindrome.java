import java.util.Scanner;
class Palindromecheck
    {   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
        int rev = 0;
        int dup= n;
        while(n != 0){
            int ld = n % 10;
            rev = (rev * 10) + ld;
            n = n /10;
        }
        if(rev == dup) {
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
       }
    }
