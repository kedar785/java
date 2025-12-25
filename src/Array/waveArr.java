package Array;

public class waveArr {
    public static void main(String[] args) {
        int []arr ={2,3,5,6,8};
        for(int i=0;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}
