package cls_recursion;

public class factorial {


        static int factorial(int n) {
            // Base case
            if (n == 0 || n == 1) {
                return 1;
            }

            // Recursive call
            return n * factorial(n - 1);
        }

        public static void main(String[] args) {
            int result = factorial(5);
            System.out.println("Factorial: " + result);
        }
    }

