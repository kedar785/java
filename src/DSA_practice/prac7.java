package DSA_practice;
import java.util.*;
//while loop
public class prac7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
    int    pow=1;
        for(int i=1;i<=m;i++){
            pow *=n;
        }
        System.out.println(pow);
//        int fact=1;
//        for(int i=1;i<=n;i++){
//            fact *=i;
//        }
//        System.out.println(fact);
//
//        int rev=0;
//        while(n!=0){
//            rev*=10;
//            rev+=n%10;
//            n/=10;
//        }
//        System.out.println(rev+" ");

//        int x=Integer.MIN_VALUE;
//        System.out.println(x);

//        int sum=0;
//        while(n!=0){
//            sum+=n%10;
//            n/=10;
//        }
//        System.out.println(sum);

//        int count=0;
//        while(n!=0){
//            n/=10;
//            count++;
//        }
//        System.out.print(count+" ");
//        int i=1;
//        while(i<=10){
//            System.out.print(i+" ");
//            i++;
//        }

    }
}
