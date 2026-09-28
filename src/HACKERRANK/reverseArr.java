package HACKERRANK;

import java.util.*;
public class reverseArr {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Two pointer reversal
        int l = 0, r = N - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        for (int x : arr) System.out.print(x + " ");

    }
}
