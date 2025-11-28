package lecture.com;

//collection frame work;
import java.util.ArrayList;
import java.util.Collections;


public class lec13 {
    public static void main(String[] args){


        ArrayList<Integer> list=new ArrayList<>();
        list.add(80);
        list.add(10);
        list.add(30);
        list.add(100);
        System.out.println(list);

        //get element:- index no ke element ko print karta hai.
         int element=list.get(0);
         System.out.println(element);

//add element in between:- beech me add karna.
        list.add(1,20);
        System.out.println(list);

        //set el. :- pahle se jo index per rakha hua hai use change karne vale hai.
        list.set(2,9);
        System.out.println(list);

//remove el:- stor el ko hata dege.
        list.remove(2);
        System.out.println(list);

        //size :-el kitne hai ye batata hai.
        int size=list.size();
        System.out.println(size);

        //loop
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
 }
    }


