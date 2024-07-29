package com.zhj.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月29日 10:24
 */
public class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        queue=new ArrayDeque<>();

    }

    public int ping(int t) {
        queue.add(t);
        while(queue.peek()<t-3000)
        {
            queue.remove();
        }
        return queue.size();
    }
}
