package Array;

public class zerosOnes {
    public static void main(String[] args) {
        int[] arr ={0,1,1,0,0,1,1};
        int zero=0;
        int one=0;
        for(int ele : arr){
            if(ele==0)  zero++;
        }
        for(int i=0;i<arr.length;i++){
            if(i<zero) arr[i]=0;
            else arr[i]=1;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
