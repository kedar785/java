package LINK_LIST1;

public class RemoveNthNodeFromEndOfLL {
    public Node removeNthFromEnd(Node head, int n) {

        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int step=count -n;
        if(step==0){
            return head.next;
        }
        temp=head;
        for(int i=1;i<step;i++)
            temp=temp.next;

        temp.next=temp.next.next;

        return head;
    }
}
