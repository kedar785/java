package clsDP;

public class count {
    static int coutt(int n){
        if(n==0) return 0;

            return 1+coutt(n/10);
    }
    public static void main(String[] args) {
        int n=1234;

        System.out.println(coutt(n));
    }
}
