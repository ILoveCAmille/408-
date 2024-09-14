package com.zhj.backtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年09月13日 10:52
 */
public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits.length()==0)
            return res;
        Map<Character,String> phoneMap=new HashMap<>(){{put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
            }};
        backtrack(res,phoneMap,digits,0,new StringBuffer());
        return res;
    }

    private void backtrack(List<String> res, Map<Character, String> phoneMap, String digits, int cur,
                           StringBuffer stringBuffer) {
        if(cur==digits.length())
        {
            res.add(stringBuffer.toString());
            return;
        }
        char digit=digits.charAt(cur);
        String letters=phoneMap.get(digit);
        int letterCount=letters.length();
        for(int i=0;i<letterCount;i++)
        {
            stringBuffer.append(letters.charAt(i));
            backtrack(res,phoneMap,digits,cur+1,stringBuffer);
            stringBuffer.deleteCharAt(cur);
        }

    }
}
