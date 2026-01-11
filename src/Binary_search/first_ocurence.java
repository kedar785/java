package Binary_search;

public class first_ocurence {

        public static int search(int[] nums, int target){
            int n = nums.length;
            int lo = 0, hi = n - 1,idx=-1;
            while(lo<=hi)

            {
                int mid = (lo + hi) / 2;
                if (nums[mid] >target) return hi=mid-1;
                else if (nums[mid] < target) lo = mid + 1;
                else{
                    idx=mid;
                    hi=mid-1;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int [ ] nums={2,2,2,2,4,5,6,7,8,9};
            int target=9;
            int result=search(nums,target);
            System.out.println("index: "+result);
        }


}

