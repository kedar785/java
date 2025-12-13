package lecture.com;

import java.util.ArrayList;
import java.util.List;

public class lec21 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        List<Integer>  res=  list.stream().filter(n->n%2!=0).toList();    //esme conditin work karti hai
        List<Integer> mapData=   list.stream().map(n->n*2).toList();  //esme conditio work nhi karti hai
        int data=  list.stream().reduce(0,(a,b)->a+b);  //esme hamesa 1 element hi print hota hai
        List<Integer> skip= list.stream().skip(2).toList();
        List<Integer>  limit= list.stream().limit(2).toList();
        List<Integer> sort= list.stream().sorted((a,b)->a-b).toList();
        System.out.println(res);
        System.out.println(mapData);
        System.out.println(data);
        System.out.println(skip);
        System.out.println(limit);
        System.out.println(sort);
    }
}
