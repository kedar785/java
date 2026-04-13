package cls_recursion;

public class ArrCountdigit {
    static boolean count(int[] arr,int i,int key){
        if(i==arr.length) return false;
        if(arr[i]==key) return true;
        return count(arr,i+1,key);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,2,4,2,5,6,2};
        int key=2;
        int i=0;
        System.out.println(count(arr,i,key));
    }

}
