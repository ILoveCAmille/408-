package com.zhj.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月29日 10:51
 *
代码
测试用例
测试结果
测试结果
373. 查找和最小的 K 对数字
中等
相关标签
相关企业
给定两个以 非递减顺序排列 的整数数组 nums1 和 nums2 , 以及一个整数 k 。

定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2 。

请找到和最小的 k 个数对 (u1,v1),  (u2,v2)  ...  (uk,vk) 。
 */
public class KSmallestPairs {
        public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
            //类似归并排序的思想
            PriorityQueue<int[]> pq = new PriorityQueue<>(k, (o1, o2)->{
                return nums1[o1[0]] + nums2[o1[1]] - nums1[o2[0]] - nums2[o2[1]];
            });
            List<List<Integer>> ans = new ArrayList<>();
            int m = nums1.length;
            int n = nums2.length;
            for (int i = 0; i < Math.min(m, k); i++) {
                pq.offer(new int[]{i,0});
            }
            while (k-- > 0 && !pq.isEmpty()) {
                int[] idxPair = pq.poll();
                List<Integer> list = new ArrayList<>();
                list.add(nums1[idxPair[0]]);
                list.add(nums2[idxPair[1]]);
                ans.add(list);
                if (idxPair[1] + 1 < n) {
                    pq.offer(new int[]{idxPair[0], idxPair[1] + 1});
                }
            }

            return ans;

        }

}
