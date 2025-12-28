package TowD_Array;

import java.util.*;
public class rotate90degree {
    public static void main(String[] args) {
        int [][] arr={{2,4,5,6},{8,2,4,5},{1,3,6,8},{1,2,9,4}};
        print (arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }  System.out.println();
        print (arr);
        for(int i=0;i<arr.length;i++){
            int stCol=0, endCol=arr[0].length-1;
            while(stCol<endCol){
            int temp = arr[i] [stCol];
            arr[i][stCol]=arr[i][endCol];
            arr[i][endCol]=temp;
            stCol++;
            endCol--;
            }
        }
        System.out.println();
    print (arr);
    } private static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }




}
