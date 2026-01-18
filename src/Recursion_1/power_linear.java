package Recursion_1;

import java.util.*;
public class power_linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base: ");
        int a=sc.nextInt();
        System.out.println("Enter power: ");
        int b=sc.nextInt();

        System.out.println(a+" raised to the power "+b+" is :  "+pow(a,b));


    }
    public static int pow(int a,int b){
        // time complexity  b(logb)
        if(b==0) return 1;
        int call= pow(a,b/2);
        if(b%2==0)  return  call*call;

        else return a*call*call;
    }

//    public static int pow(int a,int b){
    //time complexity  b(b)
//        if(b==0) return 1;
//        return a*pow(a,b-1);
//}
}
