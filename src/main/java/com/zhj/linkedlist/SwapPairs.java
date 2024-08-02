package com.zhj.linkedlist;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月02日 10:25
 */
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null) return head;
        ListNode l1=head,l2=head.next,tmp;
        while(l1!=null&&l2!=null)
        {
            tmp=l2.next;
            l2.next=l1;
            l1.next=tmp;
            l1=l1.next.next;
            l2=l2.next.next;
        }
        return head;
    }
}
