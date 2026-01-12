package Binary_search;

public class search_mountainArr {
    public static int peak(int[] arr){
        int lo=1,hi=arr.length-2;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[mid+1]  && arr[mid]>arr[mid-1] ) return mid;
            if(arr[mid]<arr[mid+1]  && arr[mid]>arr[mid-1]) lo=mid+1;
            else{
                hi=mid-1;
            }
        }
        return 23;
    }
    public static void main(String[] args) {
        //peak :- sabse large element hai.means - vo apne left and right element se large hai
int [] arr={1,3,5,78,33,2,4};
int result=peak(arr);
        System.out.println("peak element: "+result);
    }
}
