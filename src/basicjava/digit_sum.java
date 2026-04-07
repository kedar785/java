package basicjava;
import java.util.*;
public class digit_sum {
    public static void main(String[] args) {
        System.out.println("enter of digit : ");
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();

        int count=0;
        while( digit >0){
          digit=digit/10;
          count+=1;
        }
        System.out.println("count digit : "+count);
    }
}
