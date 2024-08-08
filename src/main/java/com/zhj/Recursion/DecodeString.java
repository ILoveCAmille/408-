package com.zhj.Recursion;

import java.util.Collections;
import java.util.LinkedList;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月08日 10:06
 */
public class DecodeString {
    int ptr;
    public String decodeString(String s) {
        LinkedList<String> stk=new LinkedList<>();
        int ptr=0;
        while(ptr<s.length())
        {
            char cur=s.charAt(ptr);
            if(Character.isDigit(cur)){
                String digits=getDigits(s);
                stk.addLast(digits);
            } else if (Character.isLetter(cur)||cur=='[') {
                stk.addLast(String.valueOf(s.charAt(ptr++)));
            }else {
                ++ptr;
                LinkedList<String> sub=new LinkedList<>();
                while(!"[".equals(stk.peekLast())){
                    sub.addLast(stk.removeLast());
                }
                Collections.reverse(sub);
                stk.removeLast();
                int repTime=Integer.parseInt(stk.removeLast());
                StringBuffer t=new StringBuffer();
                String o=getString(sub);
                while (repTime-- > 0) {
                    t.append(o);
                }
                // 将构造好的字符串入栈
                stk.addLast(t.toString());
            }
        }
        return getString(stk);
    }

    public String getDigits(String s)
    {
        StringBuffer sb=new StringBuffer();
        while(Character.isDigit(s.charAt(ptr))){
            sb.append(s.charAt(ptr++));
        }
        return sb.toString();
    }
    public String getString(LinkedList<String> v) {
        StringBuffer ret = new StringBuffer();
        for (String s : v) {
            ret.append(s);
        }
        return ret.toString();
    }

}
