package Binary_search;

public class square_root {
    static int squareroot(int n) {
        long lo = 0;int hi = n;
        while(lo<=hi){
            long mid=(lo+hi)/2;
            if(mid*mid==n) return (int)mid;
            else if(mid*mid>n) hi=(int)mid-1;
            else lo=mid+1;
        }
        return hi;
    }
    public static void main(String[] args) {
        int n=16;
        long result =squareroot(n);
        System.out.println("square root is a : "+result);
    }
}
