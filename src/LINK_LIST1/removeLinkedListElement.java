package LINK_LIST1;

public class removeLinkedListElement {
    public Node removeElements(Node head, int val) {
        Node dummy=new Node(0);
        dummy.next=head;
        Node temp=dummy;

        while(temp.next!=null){
            if(temp.next.val==val){
                //delete node by skipinig it
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return dummy.next;

    }
}
