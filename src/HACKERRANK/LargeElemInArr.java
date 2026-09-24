package HACKERRANK;

import java.util.*;
public class LargeElemInArr {
    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x > max) {
                    max = x;
                }
            }

            System.out.println(max);


        }
    }


