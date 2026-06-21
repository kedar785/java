package LINK_LIST1;

public class reverseLinkList_2 {
    class Solution {
        public Node reverseBetween(Node head, int left, int right) {
            if(head==null || left==right) return head;
            Node dummy=new Node(0);
            dummy.next=head;
            Node prev =dummy;
            for(int i=1;i<left;i++){
                prev=prev.next;
            }
            Node curr=prev.next;
            for(int i=0;i<right-left;i++){
                Node temp=curr.next;
                curr.next=temp.next;
                temp.next=prev.next;
                prev.next=temp;
            }
            return  dummy.next;
        }
    }
}
