package Recursion_1;

public class fibonacciNo {
    public static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {

      int  result=  fibo( 15);
        System.out.println("fibonacci of n: "+result);
    }
}
