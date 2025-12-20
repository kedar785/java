package methods;


public class argument {
    public static void sum(int a,int b ,int c){  //parameter
   // System.out.println(a+b+c+" ");
        if(a>=b && a>=c)  System.out.println(a);
        else if(b>=a && b>=c)  System.out.println(b);
        else  System.out.println(c);
}
    public static void main(String[] args) {
       sum(5,6,9); //Argument
    }
}
