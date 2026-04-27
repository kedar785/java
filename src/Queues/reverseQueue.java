package Queues;

import java.util.Stack;
import java.util.Queue;

public class reverseQueue {
    public static void main(String[] args) {

    }
    public Queue<Integer> reverse(Queue<Integer>q){
        Stack<Integer> st=new Stack<>();
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        return q;
    }
}
