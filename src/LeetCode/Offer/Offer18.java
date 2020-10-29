package LeetCode.Offer;

import LeetCode.Common.ListNode;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-29 10:56
 **/

public class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) return head.next;
        ListNode foo = head;
        while (foo != null) {
            if (foo.next != null && foo.next.val == val) {
                foo.next = foo.next.next;
            }
            foo = foo.next;
        }
        return head;
    }
}
