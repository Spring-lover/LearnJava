package LeetCode.easy;

import LeetCode.Common.ListNode;

public class test234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode mid = findMid(head);
        mid = reverse(mid.next);
        while (mid != null && head != null) {
            if (mid.val != head.val) return false;
            mid = mid.next;
            head = head.next;
        }
        return true;
    }

    public static ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode node) {
        ListNode pre = null;
        ListNode cur = node;
        while (cur != null) {
            ListNode nextTemp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextTemp;
        }
        return pre;
    }
}
