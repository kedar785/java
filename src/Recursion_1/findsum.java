package Recursion_1;

public class findsum {
    public static int findsum(int n){
        if(n==1) return 1;
        return n+findsum(n-1);
    }
    public static void main(String[] args) {
      int   n=50;
        System.out.println(findsum(n));
    }
}
