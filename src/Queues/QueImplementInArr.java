package Queues;

class circularQueue{
    int[] arr;
    int f;
    int r;
    int size;
    circularQueue(int capacity){
        arr = new int[capacity];
    }
    void add(int val){
        if(size==arr.length){
            System.out.println("Queue is full");
            return ;

        }
        arr[r++]=val;
        if(r==arr.length) r=0;
        size++;
    }
    int remove(){
        if(size==arr.length){
            System.out.println("Queue is Empty");
            return -1;
        }
        int front=arr[f];
        f++;
        if(r==arr.length) f=0;
        size--;
        return  front;
    }
    int remove(int val){
        if(size==arr.length){
            System.out.println("Queue is Empty");
            return -1;
        }

        return  arr[f];
    }
    void display(){
        if(size==0) return;;
        if(f>r){
            for(int i=f;i<arr.length;i++){
                System.out.println(arr[i]+" ");
            }
            for(int i=0;i<r;i++){
                System.out.println(arr[i]+" ");
            }
        }
        else{
            for(int i=0;i<r;i++){
                System.out.println(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
public class QueImplementInArr {
    public static void main(String[] args) {
        designcircularQueue q= new designcircularQueue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        System.out.println(q.remove());
        q.display();
        q.add(50);
        q.add(60);
        q.display();
    }
}
