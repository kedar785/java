package Array;

public class Rotate_first_fiveArr {
    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
//    public static void swap(int [] arr,int i, int j){
//      int temp=arr[i];
//      arr[i]=arr[j];
//      arr[j]=temp;
//    }
    public static void main(String[] args) {
        int [] arr={4,7,2,7,9,2,22,11};
        int n=arr.length;
        print(arr);
        int i=0,j=4;
        while(i<j){
            int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
            i++;
            j--;
        }
        print(arr);
    }
}
