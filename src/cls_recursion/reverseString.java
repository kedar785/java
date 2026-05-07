package cls_recursion;

public class reverseString {

        static String reverse(String str) {
            if (str.isEmpty()) {   // base case
                return str;
            }
            return reverse(str.substring(1)) + str.charAt(0); // recursive case
        }

        public static void main(String[] args) {
            String s = "nihcaS";
            System.out.println("Reversed: " + reverse(s));
        }
    }


