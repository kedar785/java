package Array;
 import java.util.*;
public class sortArrBuilten {
    public static void main(String[] args) {
        //sort -ascending order
        int[]arr={4,5,3,-3,4};
//        print (arr);
        Arrays.sort(arr);
      print(arr);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");



        }
        System.out.println();
    }
}
