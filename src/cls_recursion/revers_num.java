package cls_recursion;

public class revers_num {
    static int revers(int n ,int rev){

        if(n==0) {
            return rev;
        }
        rev=rev*10+n%10;
        return revers(n/10,rev);
    }
    public static void main(String[] args) {
        int n=1234;
        System.out.println(revers(n,0));
    }
}
