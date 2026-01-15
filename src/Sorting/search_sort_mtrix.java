package Sorting;

public class search_sort_mtrix {
    public static boolean searchSort(int[][]arr,int target){
        int rows=arr.length, cols=arr[0].length;
        int lo=0,hi=rows*cols-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int midRow=mid/cols, midCol=mid%cols;
            if(arr[midRow][ midCol]==target) return true;
            else if(arr[midRow][ midCol]>target) hi=mid-1;
            else lo=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
     int [][]arr={{11,14,16,17,19},
                       {23,24,25,26,28},
                       {31,32,35,37,38},
                       {41,66,78,79,89}};
     int target=26;
      boolean result=   searchSort(arr,target);
        System.out.println("target is a given matrix : "+result);
    }
}
