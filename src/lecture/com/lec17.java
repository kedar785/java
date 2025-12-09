package lecture.com;

import java.util.*;

public class lec17 {
    public static void main(String[] args) {
        //collection.
        ArrayList<Integer> list=new ArrayList<>();

        list.add(15);
        list.add(6);
        list.add(7);
        list.add(14);
        list.add(8);
        list.add(9);
        list.add(10);
        int a= list.size();
            int m=a/2;
            int  t=14;
        ListIterator<Integer> it= list.listIterator();  //ListIterator:- esko backward ,forward  and data manuplation bhi kar sakte hai.


//        while(it.hasNext()){
//            Integer  x=it.next();
//            if(x==t){
//                break;
//            }
//
//
//        }
//        while(it.hasPrevious()  ){
//            Integer y=it.previous();
//
//            if(y<t){
//              it.remove();
//            }
//            System.out.println(it.previous());
//
//        }

//      while(it.hasNext()){
//          Integer x=it.next();
//          if(x<0){
//              System.out.println(-x);
//          }
//          else if(x>0){
//              System.out.println(x);
//          }
//      }

//        while(it.hasNext() && it.nextIndex()<=m){
//            Integer  z=it.next();
//            System.out.println(z);
//        }
//        while(it.hasPrevious()){
//            Integer y=it.previous();
//            System.out.println(y);
//        }
//



//        while(it.hasPrevious()){
//            Integer y=it.previous();
//
//            System.out.println(y);
//
//        }
//        while(it.hasNext()){
//            Integer x=it.next();
//           //System.out.println(x);
//            if(x==7){
//                //it.add(10);
//                it.set(10);
//            }
//        }



//        Iterator<Integer> it=list.iterator();  //Iterator: - ese modify nhi kar sakte (previous use nhi kar sakte)
//        while(it.hasNext()){
//            System.out.println(it.next());
//            if(it.next()==6){
//                it.remove();
//            }
//        }
    }
}
