package LINK_LIST1;

import java.util.*;
public class reverseLL {
    public Node reverseList(Node head) {
        Node cur=head;
        Node prev=null;
        while(cur!=null){
            Node next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}
