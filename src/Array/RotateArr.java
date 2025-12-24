package Array;

public class RotateArr {
    public static void revers() {
int []arr ={2,3,4,5,6};
int n=arr.length;
   int d=2;
   revers(arr,0,d-1);
   revers(arr, d,n-1);
   revers(arr,0,n-1);
   for(int num: arr){
       System.out.print(num + " ");
   }
    }
     static void revers(int[]arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        revers();
    }
}
