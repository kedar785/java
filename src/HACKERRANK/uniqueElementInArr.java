package HACKERRANK;

import java.util.*;

public class uniqueElementInArr {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int unique = 0;

        for (int i = 0; i < n; i++) {
            unique = unique ^ sc.nextInt();
        }

        System.out.println(unique);

    }
}
