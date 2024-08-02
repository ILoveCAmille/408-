package com.zhj.linkedlist;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月02日 9:46
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null) return null;
        ListNode A=headA,B=headB;
        while(A!=B)
        {
            A=A==null?headB:A.next;
            B=B==null?headA:B.next;
        }
        return A;
    }
}
