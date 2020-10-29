package LeetCode.easy;

import LeetCode.Common.ListNode;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-23 22:24
 **/

public class easy234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode reversedNode = reverseList(head);
        while (reversedNode != null && head != null) {
            if (reversedNode.val != head.val) return false;
            reversedNode = reversedNode.next;
            head = head.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
}
