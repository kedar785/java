package Sorting;

public class Kth_missing_sortArr {
    static int kth_missing(int  []arr,int k){
        int lo=0, hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int currentNo=mid+1;
            int missingNo=arr[mid]-currentNo;
            if(missingNo>=k) hi=mid-1;
            else lo=mid+1;
        }
        return hi+1+k;
    }
    public static void main(String[] args) {
        int []arr={2,3,5,7,9,11,12,13};
        int  k= 5;
        int KTHmissing= kth_missing(arr,k);
        System.out.println(KTHmissing);
    }
}
