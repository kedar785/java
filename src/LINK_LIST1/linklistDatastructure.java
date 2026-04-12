package LINK_LIST1;
class Node {  //usre difine data type
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
class LinkList {
    Node head; //null
    Node tail; //null
    int size;

    void addAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void addAtTail(int val) {
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;

            tail = temp;
        }
        size++;
    }

    void deleteAtHead(int val) {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        if (head == null) tail = null;
        size--;
    }
    void display(){
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }

    }
    void insert(int val, int idx){
        if(idx<0 || idx>size) System.out.println("invalid index");
        else if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);

        else{
            Node temp=head;
            for(int i=1;i<=idx-1;i++ ){
                temp=temp.next;
            }
            Node t=new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;

        }
    }
    void delete(int idx){
        if(idx<0 || idx>size) System.out.println("invalid index");
        if(idx==0){
            deleteAtHead(70);
            return;
        }
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next; //delete
        if(idx== size-1) tail=temp; //we are deleting tail
        size--;
    }
}
public class linklistDatastructure {
    public static void main(String[] args) {
        LinkList ll=new LinkList();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(50);
        ll.addAtHead(70);
        ll.addAtHead(80);
        ll.deleteAtHead(80);
        ll.insert(25,3);
        ll.delete(2);

        ll.display();
        System.out.println( "   size of link list : "+ ll.size);
    }
}
