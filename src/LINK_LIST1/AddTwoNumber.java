
package LINK_LIST1;

public class AddTwoNumber {

    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0); // dummy head
        Node curr = dummy;        // yeh line zaroori hai
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            int digit = sum % 10;

            curr.next = new Node(digit); // new node banaya
            curr = curr.next;            // curr ko aage badhaya
        }

        return dummy.next; // dummy ke baad se result list
    }
}

