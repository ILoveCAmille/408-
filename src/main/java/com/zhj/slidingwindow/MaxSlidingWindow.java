package com.zhj.slidingwindow;

import java.util.*;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月06日 11:22
 */
public class MaxSlidingWindow {
    public  static  void main(String[] args){
        int[] nums={9,10,9,-7,-4,-8,2,-6};
        int k=5;
        for (int i : MaxSlidingWindow.maxSlidingWindow(nums, k)) {
            System.out.printf(i+" ");
        }

    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        /*if(k==1) return nums;
        int n=nums.length,right=0,max;
        int[] res=new int[n-k+1];
        PriorityQueue<int[]> queue=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0]? o2[0]-o1[0]:o1[1]-o2[1];
            }
        });
        //一步一步移动窗口
        for(int left=0;left<n-k+1;left++)
        {
             while(right-left<k)
             {   queue.offer(new int[]{nums[right],right});
                 assert queue.peek() != null;
                 if(queue.peek()[1]<left||queue.peek()[1]>right)
                     queue.poll();

                 right++;
             }
             if(right ==n){
                 assert queue.peek() != null;
                 if(queue.peek()[1]<left||queue.peek()[1]>right)
                     queue.poll();
             }
            assert queue.peek() != null;
            res[left]=queue.peek()[0];
        }
        return res;*/
        //优先队列处理
       /* int n=nums.length;
        int[] res=new int[n-k+1];
        PriorityQueue<int[]> queue=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0]? o2[0]-o1[0]:o1[1]-o2[1];
            }
        });
        //先把窗口装满
        for(int i=0;i<k;i++)
        {
            queue.offer(new int[]{nums[i],i});
        }
        res[0]=queue.peek()[0];
        for(int left=k;left<n;left++){
            queue.offer(new int[]{nums[left],left});
            //每右移一个数字，去掉窗口最左边的数字
            while(queue.peek()[1]<=left-k)
            {
                queue.poll();
            }
            res[left - k + 1] = queue.peek()[0];
        }
        return res;*/
        //单调队列+滑动窗口
        int n=nums.length;
        Deque<Integer> deque=new LinkedList<>();
        int[] res=new int[n-k+1];
        for(int i=0;i<k;i++)
        {   //保证队列中序号的值单调递减
            while(!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()])
            {   //如果这个值小于进来的值，那么就不需要保存
                deque.pollLast();
            }
            //将数组的值加入单调队列
            deque.offerLast(i);
        }
        //队首就是当前窗口中的最大值
        res[0]=nums[deque.peekFirst()];
        for(int left=k;left<n;left++){
            //如果队尾序号的值小于新加入的值可以直接去掉
            while(!deque.isEmpty()&&nums[left]>=nums[deque.peekLast()])
            {
                deque.pollLast();
            }
            //将新值加入队列
            deque.offerLast(left);
            //判断当前窗口中，队首存不存在不合法的值。
            while(deque.peekFirst()<=left-k){
                //把不属于当前窗口的队首值去掉
                deque.pollFirst();
            }
            //窗口也即单调队列的队首就是当前窗口的最大值
            res[left-k+1]=nums[deque.peekFirst()];
        }
        return res;
    }
}
