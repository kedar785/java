package Recursion_1;

import java.util.Scanner;

public class oneToN {
    static int n;
    public static void main(String[] args) {

        System.out.println("written the any No : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
             priya(n);
      //  priya(1,n);
    }
      public static void priya( int n){
        if(n==0) return;
          System.out.print(n+" ");
        priya(n-1);
        if(n!=1) System.out.print(n+" ");
    }
//    public static void priya( int x, int n){
//        if(x>n) return;
//        //  System.out.println("sachin");
//        System.out.println(x);
//        priya(x+1,n);
//    }
}
