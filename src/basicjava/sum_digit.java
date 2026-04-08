package basicjava;

import java.util.Scanner;

public class sum_digit {
    public static void main(String[] args) {
        System.out.println("enter of digit : ");
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();

        int sum=0;
        while( digit >0){
            sum+=digit%10;
          digit=digit/10;
        }
        System.out.println("count digit : "+sum);
    }
}
