package basicjava;
import java.util.*;
public class Hashset {
public static void main(String[] args){
    HashSet<Integer> set=new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1);
    //print all element

    System.out.println(set);

  System.out.println ("size of set" +set.size());

//     //search  contains

//    if(set.contains(1)){
//        System.out.println("set contains 1");
//    }
//    if(!set.contains(6)){
//        System.out.println("set not contains 6");
//    }
//    //Delete
//    set.remove(1);
//    if(!set.contains(1)){
//        System.out.println("does not contains 1");
//    }
//
     //Iteretor
    Iterator it=set.iterator();
    while(it.hasNext()) {
        System.out.println(it.next());
    }
}
}
