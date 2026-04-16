package cls_recursion;

public class oneTOn {
  //  table 5 ka
        static void print(int n) {
            if (n==0) return;
            print(n-5);
            System.out.print(n + " ");
        }

        public static void main(String[] args) {
            print(50); // 1 2 3 4 5
        }
    }

