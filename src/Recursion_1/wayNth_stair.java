package Recursion_1;

public class wayNth_stair {
    public static int wayfibo(int n){

        if(n<=2) return n;
        return wayfibo(n-1)+wayfibo(n-2);
    }
    public static void main(String[] args) {
        wayfibo(7);
        System.out.println(wayfibo(7));
    }
}
