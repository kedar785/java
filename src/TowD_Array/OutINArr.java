package TowD_Array;

import java.util.*;
public class OutINArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int [][] arr=new int[3][4];
        int [][] arr={{1,2,3,4},{5,2,4,3},{2,7,8,3}};
        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                arr[i][j]=sc.nextInt();
//                //System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) {

              //  System.out.print(arr[i][j]+" ");
                sum +=arr[i][j];

            }


           // System.out.print();
            }
        //System.out.println(sum);
    }
}
