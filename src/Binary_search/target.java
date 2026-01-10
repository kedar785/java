package Binary_search;
 import java.util.*;
public class target {
    public static int search(int[] nums, int target){
    int n = nums.length;
    int lo = 0, hi = n - 1;
     while(lo<=hi)

    {
        int mid = (lo + hi) / 2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] < target) lo = mid + 1;
        else hi = mid - 1;
    }
     return -1;
}
    public static void main(String[] args) {
        int [ ] nums={2,4,5,6,7,8,9,11,33,65,76,87,99};
        int target=65;
        int result=search(nums,target);
        System.out.println("index: "+result);
    }
}
