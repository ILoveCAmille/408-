package com.zhj.heap;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月30日 9:33
 */
public class NthUglyNumber {
    public int nthUglyNumber(int n) {
        int[] factors={2,3,5};
        int cur=1;
        Set<Long> seen = new HashSet<Long>();
        PriorityQueue<Long> heap = new PriorityQueue<Long>();
        seen.add(1L);
        heap.offer(1L);
        int ugly = 0;
        for (int i = 0; i < n; i++) {
            long curr = heap.poll();
            ugly = (int) curr;
            for (int factor : factors) {
                long next = curr * factor;
                if (seen.add(next)) {
                    heap.offer(next);
                }
            }
        }
    return ugly;
    }
}
