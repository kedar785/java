package Array;

public class subarr_sum {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int l = 1; // start index
            int r = 3; // end index

            int sum = 0;
            for (int i = l; i <= r; i++) {
                sum += arr[i];
            }

            System.out.println("Subarray sum = " + sum);
        }
    }


