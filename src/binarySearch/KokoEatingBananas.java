
package binarySearch;

public class KokoEatingBananas {
    public int kokoEat(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            max = Math.max(max, ele);
        }

        int lo = 1, hi = max, speed = max;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (hours(mid, arr) <= k) {
                speed = mid;   // possible answer
                hi = mid - 1;  // try smaller speed
            } else {
                lo = mid + 1;  // need larger speed
            }
        }
        return speed;
    }

    private int hours(int speed, int[] arr) {
        int h = 0;
        for (int ele : arr) {
            // ceil(ele/speed) → (ele + speed - 1) / speed
            h += (ele + speed - 1) / speed;
        }
        return h;
    }
}

