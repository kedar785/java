package Binary_search;

public class singleAmoung_Doboul {
    static int findOnce(int arr[]){
        int n=arr.length;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-2]!=arr[n-1]) return arr[n-1];
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid]) return arr[mid+1];
            int f=mid,s=mid;
            if(arr[mid-1]!=arr[mid]) f=mid-1;
            else s=mid+1;
            int leftCount=f-lo;
            int rightCount=hi-s;
            if(leftCount%2==0) lo=s+1;
            else hi=f-1;

        }
        return 344;
    }
    public static void main(String[] args) {
        int [] arr={1,1,2,3,3,4,4,6,6,9,9};
        int result= findOnce(arr);
        System.out.println("single among Doubles in a sorted array : "+result);
    }
}

