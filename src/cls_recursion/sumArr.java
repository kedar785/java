package cls_recursion;

public class sumArr {
    static int sumOfdigit(int[] arr,int i){
        if(i==arr.length) return 0;
        return arr[i]+  sumOfdigit(arr,i+1);
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int i=0;
        System.out.println( sumOfdigit(arr ,i));
    }
}
