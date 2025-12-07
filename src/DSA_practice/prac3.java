package DSA_practice;

import java.util.*;
public class prac3 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter cp: ");
        int cp= s.nextInt();

        System.out.println("Enter sp: ");
        int sp= s.nextInt();

        if(cp<sp) System.out.println("profit");
        else if(cp==sp) System.out.println( "no profit and no loss");
        else System.out.println("loss");

//        if (n % 2 == 0) System.out.println("Even");
//        if (n >=0) System.out.println(n);
//        else {
//            System.out.println(-1*n);
//        }


    }
}
