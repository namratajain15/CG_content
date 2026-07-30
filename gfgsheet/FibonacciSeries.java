public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci (Iterative): ");
        fibonacciIterative(n);  //O(n)

        System.out.print("\nFibonacci (Recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");  //O(2^n)
        }
    }

    public static void fibonacciIterative(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); // 0 1 1 2 3
            int temp = a + b; // 1 2 3 5 8
            a = b;   // 1 1 2 3 5
            b = temp;  // 1 2 3 5 8
        }
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
