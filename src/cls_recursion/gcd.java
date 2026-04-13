package cls_recursion;

public class gcd {
    static int gcd_num(int n ,int x){
        if(x==0) return n;
        return gcd_num(x,n%x);
    }
    public static void main(String[] args) {
        System.out.println(gcd_num(12,18));
    }
}
