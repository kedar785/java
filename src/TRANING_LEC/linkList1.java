package TRANING_LEC;

public class linkList1 {           //link list:- insert first and last Node
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    class MyLinkList{
        Node head;
        void insertAtBeginning(int data){
            Node newNode=new Node(data);
                newNode.next=head;
                head=newNode;

        }
        void insertAtLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;

            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        linkList1 list=new linkList1();
   MyLinkList ll=list.new MyLinkList();
     ll.insertAtBeginning(10);
     ll.insertAtBeginning(20);
     ll.insertAtBeginning(30);
     ll.insertAtBeginning(40);
     ll.insertAtLast(60);

     ll.display();
    }
}
