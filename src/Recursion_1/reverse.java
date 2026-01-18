package Recursion_1;

public class reverse {
    public static int rev(int n,int r){
        if(n==0) return r ;
        r=rev(n/10,r*10+n%10);
        return r;
    }

    public static void main(String[] args) {
        int n=2345;
        System.out.println(rev(n,0));
    }
}
