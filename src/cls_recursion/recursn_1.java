package cls_recursion;

public class recursn_1 {
    static void printnum(int n){
        if(n>10){
            return;
        }
        System.out.println(n);
        printnum(n+1);

    }
    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static void rev(String str1, int i){
    if(i<0) return ;
        System.out.print(str1.charAt(i));
        rev(str1,i-1);
    }
    public static void main(String[] args) {
       printnum(1);
            System.out.println(fact(5));
          rev("hello",4);
    }
}
