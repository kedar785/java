package Sorting;

public class Selection_sort {
    public static void print(int []arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
    int []arr ={-3,2,0,9,7,8};
   int n=arr.length;
            print(arr);
for(int i=0;i<n;i++){
    int min=Integer.MAX_VALUE;
    int mindex=-1;
    for(int j=i;j<n;j++){
        if(arr[j]<min){
            min=arr[j];
            mindex=j;
        }
    }
    //swap
    int temp=arr[i];
    arr[i]=arr[mindex];
    arr[mindex]=temp;

}
        print(arr);
    }

}
