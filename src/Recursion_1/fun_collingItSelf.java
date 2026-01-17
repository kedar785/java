package Recursion_1;

import java.util.*;

public class fun_collingItSelf {
    public static void main(String[] args) {
     //   priya(5);
        System.out.println("written the any No : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        priya(n);
    }
    public static void priya( int n){
        if(n==0) return;
      //  System.out.println("sachin");
        System.out.println(n);
        priya(n-1);
    }
}
