package cls_recursion;

public class fibonaci {
    static int fibonacci(int n) {
            // Base case
            if (n == 0) return 0;
            if (n == 1) return 1;

            // Recursive call
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        public static void main(String[] args) {
            for (int i = 0; i < 6; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }

