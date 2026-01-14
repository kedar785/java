package Binary_search;

public class sort_rotate {
    public static int Search(int arr[],int target){
        int lo=0, hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target) return mid;
            else if(arr[lo]<=arr[mid]){
                if(arr[lo]<=target && target<arr[mid]) hi=mid -1;
                else lo=mid +1;
            }
            else {
                if(arr[mid]<target && target<=arr[hi]) lo=mid+1;
                else hi=mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int [] arr={-1,-3,-4,0,2,4,5,8,9,12,34,67,87,98};
        int target=-3;
        int result=Search(arr,target);
        System.out.println("sorted in a rotate arr is a target : "+result);
    }
}
