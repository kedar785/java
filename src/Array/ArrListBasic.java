package Array;

import p1.A;

import java.util.*;
public class ArrListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(55);
        arr.add(23);
        arr.add(34);
        arr.add(7);
        System.out.println(arr.get(3)); //arr[2
        arr.set(2,37); //arr[3]=37

        System.out.println(arr); //not traversing the arr by ourselves
        int n=arr.size(); //arr.length
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        //55, 23, 37, 7
        arr.add(22); //55, 23, 37, 7,22
        arr.add(1,90);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
         int i=0,j=arr.size()-1;
        while (i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;

        }
      //  Collections.reverse(arr);
        System.out.println(arr);


         }
}
