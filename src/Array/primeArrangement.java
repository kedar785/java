package Array;

public class primeArrangement {
    int MOD=1000000007;
    public int numPrimeArrangements(int n) {
        int p=0;
        for(int i=2;i<=n;i++)
            if(prime(i)) p++;

        return (int)((fact(p)*fact(n-p))%MOD);

    }
    boolean prime(int x){
        for(int i=2;i*i<=x;i++)
            if(x%i==0) return false;
        return true;
    }
    long fact(int n){
        long ans=1;
        for(int i=2;i<=n;i++)
            ans=ans*i%MOD;
        return ans;
    }
}
