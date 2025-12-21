package Array;

import java.util.*;
public class outinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int []arr={2,4,56,45,34,6};
//        System.out.println(arr.length);
//        for(int i=0;i<arr.length;i++)
//        System.out.print(arr[i]+" ");
        int [] karan=new int[7];
        //input
        for(int i=0;i<7;i++){
            karan[i]=sc.nextInt();
        }
        for(int i=0;i<7;i++){
            System.out.print(karan[i]+" ");
        }
    }
}
