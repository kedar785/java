package Sorting;

public class merge_sort {
    public static void main(String[] args) {
        int[]arr={2,4,1,9,5,7,8,6};
        mergesort(arr);
        for(int ele:arr) System.out.print(ele+" ");
    }
    public static void mergesort(int[] arr){
        int n=arr.length;
        if(n==1) return;  // 1 length arr already sorted
        //step 1:- create two empty arr of size n/2 each
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        //step 2:-copy past arr into a and b
        int idx=0; // idx travel karega arr me
        for(int i=0;i<a.length;i++)
            a[i]=arr[idx++];

        for(int i=0;i<b.length;i++)
            b[i]=arr[idx++];

        //step 3:- magic
        mergesort(a);
        mergesort(b);
        //step 4:- marge
        merge(a,b,arr);
    }
    public static void merge(int[] a,int[] b,int[] c){
        int i=0 ,j=0,k=0;
        while(i<a.length && j<b.length) {
            if(a[i]<=b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];

        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }
}
