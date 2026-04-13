package cls_recursion;

public class revers_num {
    static int revers(int n){
        int rev=0;
        if(n==0) {
            return 0;
        }
        rev=rev*10+n%10;
        return revers(n/10);
    }
    public static void main(String[] args) {
        int n=1234;
        System.out.println(revers(n));
    }
}
