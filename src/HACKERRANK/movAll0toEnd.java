package HACKERRANK;


import java.util.*;
public class movAll0toEnd {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeroes(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void moveZeroes(int[] arr) {
        int pos = 0; // position for next non-zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }
        // Fill remaining with 0
        while (pos < arr.length) {
            arr[pos] = 0;
            pos++;
        }


    }
}
