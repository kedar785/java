package Recursion_2;

import java.util.ArrayList;

public class recursionOnstring {
    public static void main(String[] args) {
        String s="aman";
        change(s);
        System.out.println(s);
        System.out.println();
        String[] arr ={"sahil" , "ajay" , "kanak" , "salman" , "jaya"};
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");

        }

        ArrayList<String> al=new ArrayList<>();
        al.add("shree");
        al.add("pavni");
        al.add("suresh");
        System.out.println(al);
      change1(al);
        System.out.println(al);
    }
    public static void  change1( ArrayList<String> al){
     al.add("ansh");

    }
    public static void change(String s){
        s="sonu";
    }
}
