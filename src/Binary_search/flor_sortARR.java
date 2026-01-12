package Binary_search;

public class flor_sortARR {
    static int findFlor(int []arr,int target){
        int lo=0,hi=arr.length-1,idx=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>target) hi=mid-1;
            else{ //arr[mid]<=target
               idx=mid;
               lo=mid+1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int []arr={0,1,2,4,4,10,10,11,12};
        int target=5;
        int result=findFlor(arr,target);
        System.out.println("flor in a sorted arr : "+result);
    }
}
