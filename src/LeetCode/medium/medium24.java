package LeetCode.medium;

import LeetCode.Common.ListNode;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-13 10:52
 **/

public class medium24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }
}
