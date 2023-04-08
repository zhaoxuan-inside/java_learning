package leetcode;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class topic_0019 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null){
            return head;
        }

        ListNode pre = head;
        ListNode last = head;

        int size = 0;
        while (last.next != null){
            if (size == n){

                pre = pre.next;
                last = last.next;

            } else {

                last = last.next;
                size++;

            }
        }

        if (size < n) {
            return pre.next;
        }

        pre.next = pre.next.next;
        return head;
    }

}
