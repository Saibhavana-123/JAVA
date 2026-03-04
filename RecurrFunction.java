public class RecurFun {
    static boolean evvod(int n) {
        if (n == 0) return true;
        if (n == 1) return false;
        return evvod(n - 2);
    }

    public static void main(String []agrs) {
        System.out.println(evvod(3));
    }
}
