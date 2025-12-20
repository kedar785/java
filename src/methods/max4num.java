package methods;

import java.util.*;
public class max4num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));

    }
}
