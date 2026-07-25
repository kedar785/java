package Array;
import java.util.*;
public class shuffleAnArr {

    int[] a;
    public shuffleAnArr (int[] nums) {
        a=nums.clone();
    }

    public int[] reset() {
        return a.clone();
    }

    public int[] shuffle() {
        int[] b=a.clone();
        for(int i=0; i<b.length;i++){
            int j=(int)(Math.random()*(i+1));
            int t=b[i];
            b[i]=b[j];
            b[j]=t;
        }
        return b;
    }
}
