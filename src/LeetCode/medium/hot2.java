package LeetCode.medium;

import LeetCode.Common.ListNode;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-09-12 09:50
 **/

public class hot2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode p = l1, q = l2, cur = res;
        int carry = 0;
        while (q != null || p != null) {
            int x = (q == null) ? 0 : q.val;
            int y = (p == null) ? 0 : p.val;
            int sum = x + y + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if(carry > 0) {
            cur.next = new ListNode(carry);
        }
        return res.next;
    }
}
