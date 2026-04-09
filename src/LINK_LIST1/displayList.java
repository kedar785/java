package LINK_LIST1;
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
public class displayList {
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
//        for(Node temp=head;temp!=null;temp=temp.next){
//            System.out.print(temp.val+" ");
//        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a =new Node(10);
        Node b =new Node(20);
        Node c =new Node(30);
        Node d =new Node(40);
        Node e =new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
   display(a);
    }
}
