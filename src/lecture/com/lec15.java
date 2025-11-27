package lecture.com;
import java.util.*;

class student{
    String name;
    int RollN;
    public student(int RollN,String name){
        this.name=name;
        this.RollN=RollN;
    }
    public String toString(){
        return RollN+" "+name;
    }
}
class nameSorted implements Comparator<student>{
    public int compare(student s1,student s2){
        return s1.name.compareTo(s2.name);
    }
}

public class lec15 {
    public static void main(String[] args){
        ArrayList<student>list=new ArrayList<>();
        list.add(new student(1,"om"));
       list.add(new student(2,"ankit"));
       Collections.sort(list,new nameSorted());
       for(student s:list){
           System.out.println(s.RollN +""+s.name);
       }
    }
}
//import java.util.ArrayList;
//import java.util.Collections;


//class student implements Comparable<student>{
//    String name;
//    int RollN;
//    public student(int RollN,String name){
//        this.name=name;
//        this.RollN=RollN;
//    }
//    public int compareTo(student s1){
//        return this.RollN-s1.RollN;
//    }
//    public String toString(){
//        return RollN +" "+name;
//    }
//}
//public class lec15 {
//    public static void main(String[] args){
//        ArrayList<student>list=new ArrayList<>();
//        list.add(new student(1,"om"));
//        list.add(new student(2,"ankit"));
//        Collections.sort(list);
//        System.out.println(list);
//    }
//}
