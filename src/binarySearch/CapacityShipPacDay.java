package binarySearch;

import java.util.*;
public class CapacityShipPacDay {
    // Main method for ArrayList input
        public int leastWeightCapacity(ArrayList<Integer> arr, int d) {
            // Convert ArrayList to int[] for reuse
            int[] nums = new int[arr.size()];
            for (int i = 0; i < arr.size(); i++) {
                nums[i] = arr.get(i);
            }
            return leastWeightCapacity(nums, nums.length, d);
        }

        // Helper method for int[] input
        static int leastWeightCapacity(int[] arr, int n, int d) {
            int max = Integer.MIN_VALUE, sum = 0;
            for (int ele : arr) {
                max = Math.max(max, ele);
                sum += ele;
            }

            int lo = max, hi = sum, ans = -1;
            while (lo <= hi) { // O(n * log(sum-max))
                int mid = lo + (hi - lo) / 2;
                if (days(mid, arr) <= d) {
                    ans = mid;
                    hi = mid - 1; // try smaller capacity
                } else {
                    lo = mid + 1; // need larger capacity
                }
            }
            return ans;
        }

        // Count how many days needed for given capacity
        static int days(int capacity, int[] arr) {
            int days = 1; // start with day 1
            int load = 0;
            for (int ele : arr) {
                if (load + ele <= capacity) {
                    load += ele;
                } else {
                    days++;
                    load = ele; // start new day with this package
                }
            }
            return days;
        }
    }


