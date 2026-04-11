package cls_recursion;

public class pldrm_recursn {
    //recursion se palindrome check .
        static boolean isPalindrome(String s) {
            return check(s, 0, s.length() - 1);
        }

        static boolean check(String s, int i, int j) {
            if (i >= j) return true;              // base case
            if (s.charAt(i) != s.charAt(j)) return false; // mismatch
            return check(s, i + 1, j - 1);        // recursion
        }

        public static void main(String[] args) {
            System.out.println(isPalindrome("madam"));  // true
            System.out.println(isPalindrome("hello"));  // false
        }
    }


