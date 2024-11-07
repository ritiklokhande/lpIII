public class d1 {
    public static int fibNonRecursive(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c = 1;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; 
        System.out.println(fibNonRecursive(n));
        System.out.println(fibNonRecursive(n));
    }
}
