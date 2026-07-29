package Array;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i]) j--;
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
        }
        reverse(nums,i+1);
    }
    void reverse(int[] nums,int s){
        int e=nums.length-1;
        while(s<e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s++;
            e--;
        }
    }
}
