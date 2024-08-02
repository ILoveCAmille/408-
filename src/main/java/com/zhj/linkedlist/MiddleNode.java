package com.zhj.linkedlist;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月02日 10:45
 */
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode fast=head,slow=head;
        while(fast!=null&&fast.next!=null)
        {
            slow= slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
