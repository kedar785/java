package LINK_LIST1;

public class LinkedListCycle {
    public boolean hasCycle(Node head) {
        Node l1=head;
        Node l2=head;

        while(l1!=null  && l1.next!=null){

            l2=l2.next;
            l1=l1.next.next;
            if(l1==l2) return true;
        }

        return false;
    }
}
