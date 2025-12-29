package TowD_Array;

import java.util.*;
public class ArrList {
    public static void main(String[] args) {
        //ArrList<Integer> ac=new ArrList();
   ArrayList<Integer> a =new ArrayList<>();
   a.add(3); a.add(23); a.add(1); a.add(7);
        ArrayList<Integer> b =new ArrayList<>();
        b.add(6); b.add(9); b.add(5); b.add(1);
        ArrayList<Integer> c =new ArrayList<>();
        c.add(2); c.add(8); c.add(4); c.add(7);
        ArrayList<Integer> d =new ArrayList<>();
        d.add(4); d.add (11);d.add(13); d.add(4);
        ArrayList<  ArrayList<Integer>> arr =new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);

        //System.out.println(arr);

//        for(int i=0;i<arr.size();i++){
//            for(int j=0;j<arr.get(i).size();j++){
//                System.out.print(arr.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }

        for(ArrayList<Integer> List : arr){
            for(int ele : List){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
