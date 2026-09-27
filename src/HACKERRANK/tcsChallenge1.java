package HACKERRANK;
 import java.util.*;
public class tcsChallenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of hours
        int T = sc.nextInt();

        int[] E = new int[T]; // entries
        int[] L = new int[T]; // exits

        // Read entries
        for (int i = 0; i < T; i++) {
            E[i] = sc.nextInt();
        }

        // Read exits
        for (int i = 0; i < T; i++) {
            L[i] = sc.nextInt();
        }

        int currentGuests = 0;
        int maxGuests = 0;

        // Calculate guests hour by hour
        for (int i = 0; i < T; i++) {
            currentGuests += E[i] - L[i];
            maxGuests = Math.max(maxGuests, currentGuests);
        }

        System.out.println(maxGuests);
    }
}
