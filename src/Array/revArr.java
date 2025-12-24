package Array;

public class revArr {
    public static void main(String[] args) {
        int []arr ={2,4,3,5,6,23,54,7,8,12};
        int n=arr.length;
        int i=2 , j=n-3;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        for(int ele:arr) System.out.print(ele+" ");

//        for(int i=arr.length-1 ;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
    }
}
