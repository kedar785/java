package Array;

public class ArrNesting {
    public int arrayNesting(int[] nums) {
        int ans=0, n=nums.length;
        for(int i=0;i<n;i++){
            int cnt=0, j=i;
            while(nums[j]<n){
                int next=nums[j];
                nums[j]=n;
                j=next;
                cnt++;
            }
            ans=Math.max(ans,cnt);
        }
        return ans;
    }
}
