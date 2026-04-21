package stack;

import java.util.Stack;
public class BasicSTLOFStack {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
       // System.out.println(st.peek());
        //st.pop();    //under flow
        st.push("kedar");
        st.push("sachin");
        st.push("bais");
        st.push("charka");
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
  String s=st.pop();
        System.out.println(s);
    }
}



