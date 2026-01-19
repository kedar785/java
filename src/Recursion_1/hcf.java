package Recursion_1;

public class hcf {
    public static void main(String[] args) {
        int a=12, b=16;

        System.out.println("hcf is: "+gcd(a,b));
    }
    public static int gcd(int a,int b){
        for(int i=Math.min(a,b);i>0;i--){
            if(a%i==0 && b%i==0)

                return i;
        }
        return 0;
    }
}
