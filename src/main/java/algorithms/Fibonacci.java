/*Simple program whitch prints i element of fibonacci*/
package algorithms;

public class Fibonacci {

    public static void main(String[] args) {
        int i = 6;
        int result;

        result = fibonacci(i);
        System.out.println(result);
    }

    private static int fibonacci(int i) {
        int fib1 = 0;
        int fib2 = 1;
        int sum;

        for (int n = 1; n <= i; n++) {
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
        }
        return fib2;
    }
}
