package Array;

public class secondmax {
    public static void main(String[] args) {
        int [] arr ={2,6,70,8,7};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        //calculate max;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        //calculate second max
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max) smax=arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
