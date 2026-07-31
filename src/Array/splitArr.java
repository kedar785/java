package Array;

public class splitArr {
    public boolean isPossibleToSplit(int[] nums) {
        int[] freq=new int[101];
        for(int x:nums){
            if(++freq[x]>2)
                return false;
        }
        return true;
    }
}
