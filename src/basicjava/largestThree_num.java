package basicjava;

import java.util.Scanner;

public class largestThree_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("larget num : "+a);
        }
        else if(b>c){
            System.out.println("largets num : "+b);
        }
        else {
            System.out.println("largets num : "+c);
        }
    }
}
