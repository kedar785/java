package cls_recursion;

public class binaaryStr {
    static void  binary(String str,int n){
        if(n==0){
            System.out.println(str);;
            return;
        }
        binary(str+'0',n-1);
        binary(str+'1',n-1);
    }
    public static void main(String[] args) {
        int n=2;
        binary("",n);
    }
}
