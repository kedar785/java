package TowD_Array;

public class forEachLoop {
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4},{5,2,4,3},{2,7,8,3}};
        for(int [] a:arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
//        for(int i=0;i<arr.length;i++) {
//            for (int ele : arr[i]){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }
    }
}
