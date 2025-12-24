package Array;

public class misssingArr {
    public static void main(String[] args) {
        int []arr={1,2,4,5,6,7};
        int n=arr.length+1;
        int ArrSum=0;
        int Sum= n*(n+1)/2;
     for (int ele : arr){
           ArrSum +=ele;
     }
        System.out.println(Sum-ArrSum+" ");
    }
}
