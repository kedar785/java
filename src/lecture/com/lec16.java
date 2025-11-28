package lecture.com;
//collection:  set:- eske andar kabhi bhi duplicate data store nhi hota.
import java.util.*;
public class lec16 {
    public static void main(String [] args){
        //LinkedHashmap me order mentaen hoat hai.


        TreeSet<Integer> set=new TreeSet<>();//esme hamesa data shorted hota hai.
        set.add(5);
        set.add(3);
        set.add(4);
        System.out.println(set);
//        LinkedHashSet<Integer> set=new LinkedHashSet<>();
//        set.add(7);
//        set.add(5);
//        set.add(6);
//        System.out.println(set);

        //int arr[]={2,3,4,2};
//        int arr1[]={1,2,3,4,};
//        int arr2[]={1,2,4};
//        HashSet<Integer> set=new HashSet<>();
//        for(int x:arr1){
//            set.add(x);
//
//        }
//        System.out.println(set);
//        HashSet<Integer> result=new HashSet<>();
//        for(int y: arr2){
//            if(set.contains(y)){
//                result.add(y);
//            }
//        }
//        System.out.println(result);
//        for(int x: arr){
//            set.add(x);
//        }
//        if(arr.length==set.size()){
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }

    }
}
