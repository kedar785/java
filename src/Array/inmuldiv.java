package Array;

public class inmuldiv {
    public static void main(String[] args) {
        int []arr={1,2,3,8,4,5,6};

        for(int i=0;i<arr.length;i++){
            if(i%2!=0 ){
                arr[i]*=2;
                System.out.println(arr[i]);
            }
            else {
                arr[i]+=10;
                System.out.println(arr[i]);
            }
        }
    }
}
