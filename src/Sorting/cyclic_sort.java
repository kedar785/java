package Sorting;


    import java.util.*;

    public class cyclic_sort {
        public static List<Integer> findDuplicates(int[] arr) {
            int i = 0;
            int n = arr.length;

            // Cyclic sort
            while (i < n) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    // swap to correct position
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                } else {
                    i++;
                }
            }

            // Collect duplicates
            List<Integer> duplicates = new ArrayList<>();
            for (i = 0; i < n; i++) {
                if (arr[i] != i + 1) {
                    duplicates.add(arr[i]);
                }
            }
            return duplicates;
        }

        public static void main(String[] args) {
            int[] arr = {4,3,2,7,8,2,3,1};
            System.out.println("Duplicates: " + findDuplicates(arr));
        }
    }

