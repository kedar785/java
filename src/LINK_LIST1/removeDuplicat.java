package LINK_LIST1;

import java.util.*;
public class removeDuplicat {
    public Node deleteDuplicates(Node head) {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {

                current.next = current.next.next;
            } else {

                current = current.next;
            }
        }
        return head;
    }
}
