package clsDP;

public class strLength {


        static int length(String str, int index) {
            if (index == str.length()) return 0;

            return 1 + length(str, index + 1);
        }

        public static void main(String[] args) {
            String str = "hello";

            System.out.println(length(str, 0));
        }

}
