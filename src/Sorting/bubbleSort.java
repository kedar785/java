package Sorting;

public class bubbleSort {
    public static void print(int [] arr)   {
        for(int ele :arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr ={8,4,2,3,5,9,1,6};
        int n=arr.length;
        print(arr);
        for(int j=0;j<n-1;j++) {//n-1 pass
//            boolean isSorted=true;
//            for(int k=0;k<n-1;k++){
//                if(arr[k]>arr[k+1]){
//                    isSorted=false;
//                    break;
//                }
//            }
//            if(isSorted)  break;
            //bubble sort optimise
            for (int i = 0; i < n - 1-i; i++) {
                if (arr[i] >arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        print(arr);
    }
}
