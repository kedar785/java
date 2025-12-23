package Array;

public class linearSearch {
    public static void main(String[] args) {
        int [] arr={12,4,27,56,34,27};
        int target=27;
        boolean flag=false; //false means target arr me nhi hai
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag=true; //target arr me nhi hai
            }
        }
        if(flag) System.out.println("Target in exist in arr");
        else System.out.println("target missing in arr");
    }
}
