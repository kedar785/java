package Heaps;
import java.util.*;
public class priorityQueueSTL {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);     pq.add(20);     pq.add(30);     pq.add(40);
        System.out.println(pq.peek());
        pq.add(35);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq);
        pq.add(3);     pq.add(5);     pq.add(7);     pq.add(0);
        pq.add(21);     pq.add(90);     pq.add(25);     pq.add(1);
        for(int ele:pq){
            System.out.print(ele+" ");
        }
    }
}
