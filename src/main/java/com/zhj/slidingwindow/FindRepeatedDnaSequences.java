package com.zhj.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月31日 9:40
 * 187. 重复的DNA序列
 * 已解答
 * 中等
 * 相关标签
 * 相关企业
 * DNA序列 由一系列核苷酸组成，缩写为 'A', 'C', 'G' 和 'T'.。
 *
 * 例如，"ACGAATTCCG" 是一个 DNA序列 。
 * 在研究 DNA 时，识别 DNA 中的重复序列非常有用。
 *
 * 给定一个表示 DNA序列 的字符串 s ，返回所有在 DNA 分子中出现不止一次的 长度为 10 的序列(子字符串)。你可以按 任意顺序 返回答案。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
 * 输出：["AAAAACCCCC","CCCCCAAAAA"]
 * 示例 2：
 *
 * 输入：s = "AAAAAAAAAAAAA"
 * 输出：["AAAAAAAAAA"]
 */
public class FindRepeatedDnaSequences {
    static final int L=10;
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res=new ArrayList<>();//存放结果
        Map<String,Integer> cnt=new HashMap<>();//用哈希表存放子串出现的次数
        for(int i=0;i<s.length()-L+1;i++)
        {   String sub=new String();
            sub=s.substring(i,L+i);
            cnt.put(sub,cnt.getOrDefault(sub,0)+1);
            if(cnt.getOrDefault(sub,0)==2)//出现三次就一定会出现两次，只需要记录出现两次的即可。
                res.add(sub);
        }
        return res;
    }
}
