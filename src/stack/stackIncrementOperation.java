package stack;

import java.util.*;
public class stackIncrementOperation {
    Stack<Integer> stack;
    int capacity;
    int [] value;

    public stackIncrementOperation(int maxSize) {
        stack=new Stack<>();
        capacity=maxSize;
        value=new int[capacity];
    }

    public void push(int x) {
        if(stack.size()<capacity) stack.push(x);
    }

    public int pop() {
        if(stack.isEmpty()) return -1;
        int top=stack.pop();
        int inc=value[stack.size()];
        if(stack.size()>0) value[stack.size()-1]+=inc;
        value[stack.size()]=0;
        return top+inc;

    }

    public void increment(int k, int val) {
        int temp=Math.min(k-1,stack.size()-1);
        if(temp>=0){
            value[temp]+=val;
        }
    }
}
