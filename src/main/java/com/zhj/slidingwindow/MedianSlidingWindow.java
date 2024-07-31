package com.zhj.slidingwindow;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月31日 10:56
 *
代码
测试用例
测试用例
测试结果
480. 滑动窗口中位数
尝试过
困难
相关标签
相关企业
提示
中位数是有序序列最中间的那个数。如果序列的长度是偶数，则没有最中间的数；此时中位数是最中间的两个数的平均数。

例如：

[2,3,4]，中位数是 3
[2,3]，中位数是 (2 + 3) / 2 = 2.5
给你一个数组 nums，有一个长度为 k 的窗口从最左端滑动到最右端。窗口中有 k 个数，每次窗口向右移动 1 位。你的任务是找出每次窗口移动后得到的新窗口中元素的中位数，并输出由它们组成的数组。



示例：

给出 nums = [1,3,-1,-3,5,3,6,7]，以及 k = 3。

窗口位置                      中位数
---------------               -----
[1  3  -1] -3  5  3  6  7       1
1 [3  -1  -3] 5  3  6  7      -1
1  3 [-1  -3  5] 3  6  7      -1
1  3  -1 [-3  5  3] 6  7       3
1  3  -1  -3 [5  3  6] 7       5
1  3  -1  -3  5 [3  6  7]      6
因此，返回该滑动窗口的中位数数组 [1,-1,-1,3,5,6]。
 */
public class MedianSlidingWindow {

    //排序算法会超时，O（nlogn）

//    public static double[] medianSlidingWindow(int[] nums, int k) {
//        List<Integer> windows=new ArrayList<>();
//        List<Integer> windows1=new ArrayList<>();
//        double[] mid=new double[nums.length-k+1];
//        int i=0,j=0,k1=0;
//        while(j<nums.length)
//        {
//            while(Math.abs(j-i)<k&&j<nums.length)
//            {   windows1.add(nums[j]);
//                windows.add(nums[j]);
//                j++;
//            }
//            windows.sort(Comparator.naturalOrder());
//            if(k%2==1) {mid[k1]=windows.get(k/2);k1++;}
//            else {mid[k1]=((double)windows.get(k/2)+(double)windows.get((k-1)/2))/2;k1++;}
//            i++;windows1=windows1.subList(1,k);windows.clear();windows.addAll(windows1);
//        }
//        return mid;
//    }

    //优先队列+队列记录出队顺序
    PriorityQueue<Integer> queMin;
    PriorityQueue<Integer> queMax;
    Queue<Integer> queue;
    public  double[] medianSlidingWindow(int[] nums, int k) {
        //记录中位数
        double[] mid=new double[nums.length-k+1];
        queMin=new PriorityQueue<>();
        queMax=new PriorityQueue<>((a,b)->(b-a));
        //记录窗口的进出顺序
        queue=new ArrayDeque<>();
        int i=0,j=0,k1=0;
        while(j<nums.length)
        {
            while(Math.abs(j-i)<k&&j<nums.length)
            {
                if(queMin.isEmpty()||nums[j]>queMin.peek())
                {   queue.offer(nums[j]);
                    queMin.offer(nums[j]);
                    j++;
                    if(queMax.size()+1<queMin.size())
                    {
                        queMax.offer(queMin.poll());
                    }
                }
                else {
                    queue.offer(nums[j]);
                    queMax.offer(nums[j]);
                    j++;
                    if(queMax.size()>queMin.size())
                    {
                        queMin.offer(queMax.poll());
                    }
                }
            }
                if(k%2==1&&queMin.size()!=0) {
                    mid[k1]=queMin.peek();k1++;
                    if(queMax.contains(queue.peek())) queMax.remove(queue.poll());
                    else queMin.remove(queue.poll());
                }
            else
            {   if(queMin.size()!=0&&queMax.size()!=0)
                mid[k1]=((double)queMin.peek()+(double)queMax.peek())/2;k1++;
                if(queMax.contains(queue.peek())) queMax.remove(queue.poll());
                else queMin.remove(queue.poll());
            }
            i++;

        }
        return mid;
    }
}
