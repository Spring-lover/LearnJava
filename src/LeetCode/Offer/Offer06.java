package LeetCode.Offer;

import LeetCode.Common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-27 09:17
 **/

public class Offer06 {
    public int[] reversePrint(ListNode head) {
        ListNode newHead = reverseListNode(head);
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (newHead != null) {
            result.add(newHead.val);
            newHead = newHead.next;
        }
        int[] res = new int[result.size()];
        for (Integer num : result) {
            res[i++] = num;
        }
        return res;
    }

    public ListNode reverseListNode(ListNode head) {
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
