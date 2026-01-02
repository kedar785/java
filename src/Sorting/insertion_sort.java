package Sorting;

public class insertion_sort {
    public static void main(String[] args) {
        int [] arr={9,4,5,1,6,8,7,2};
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int ele:arr)
            System.out.print(ele+" ");
    }
}
