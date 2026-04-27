package clsDP;

public class arr_subsiquence {
    static void count(int[] arr,int i,int sum,int k,int []ans,int size){
        if(i==arr.length){
            if(sum==k){
                for(int j=0;j<size;j++){
                    System.out.print(ans[j]+" ");
                }
                System.out.println();
            }
            return ;
        }
        ans[size]=arr[i];
        count(arr,i+1,sum+arr[i],k,ans,size+1);
        count(arr,i+1,sum,k,ans,size);

    }
    public static void main(String[] args) {
        int [] arr={1,2,1};
        int k=2;
        int i=0;
        int sum=0;
        int[] ans=new int[arr.length];
        int size=0;
        count(arr,i,sum,k, ans , size);
    }
}
