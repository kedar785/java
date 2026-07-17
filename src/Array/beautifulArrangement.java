package Array;

public class beautifulArrangement {
    int c=0;
    public int countArrangement(int n) {
        dfs(1,n,new boolean[n+1]);
        return c;
    }
    void dfs(int i, int n, boolean[] v){
        if(i>n){
            c++;
            return;
        }
        for(int j=1;j<=n;j++)
            if(!v[j]&&(j%i==0 || i%j==0)){
                v[j]=true;
                dfs(i+1,n,v);
                v[j]=false;
            }
    }
}
