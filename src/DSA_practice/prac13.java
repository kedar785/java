package DSA_practice;

//Array List
class ArrayList{
    int[]arr=new int [10];
    int ind=0;
    int suze=0;
    ArrayList(int capacity){
        arr= new int[capacity];
    }
    void add(int ele){

    }
    int capacity(){
        return arr.length;
    }
}
public class prac13 {
    public static void main(String[] args) {
        ArrayList arr= new ArrayList(8);
        System.out.println(arr.capacity());
    }
}
