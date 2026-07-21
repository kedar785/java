package Array;
import java.util.*;
public class BeautifulArr {
    public int[] beautifulArray(int n) {
        List<Integer> list=helper(n);
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
            ans[i]=list.get(i);
        return ans;
    }
    List<Integer> helper(int n){
        if(n==1) return new ArrayList<>(List.of(1));
        List<Integer> res=new ArrayList<>();
        for(int x:helper((n+1)/2))
            res.add(2*x-1);
        for(int x:helper(n/2))
            res.add(2*x);
        return res;
    }
}
