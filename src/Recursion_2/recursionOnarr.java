package Recursion_2;

public class recursionOnarr {
    public static void main(String[] args) {
        int []arr={2,3,5,12,24,6,9,7};
        int target=8;
        System.out.println(exited(arr,target,0));
    }
    public static boolean exited(int []arr,int target,int idx){
        if(arr[idx]==arr.length) return false;
        if(arr[idx]==target) return true;
        return exited(arr,target,idx+1);
    }
}
