package org.example.seminar4.cw4.Zadanie1;


public class Zadanie1 {
    public ListNode reverseList(ListNode head) {
        ListNode pred = null;
        ListNode current = head;
        while(current != null){
            ListNode nextElem = current.next;
            current.next= pred;
            pred = current;
            current = nextElem;
        }
        return pred;
    }

}
