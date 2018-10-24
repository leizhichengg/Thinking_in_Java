package ch04;

public class Exercise9 {
    static int fib(int n) {
        if (n <= 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            System.out.println("Error!");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
