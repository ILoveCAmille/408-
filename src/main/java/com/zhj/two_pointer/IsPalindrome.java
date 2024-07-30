package com.zhj.two_pointer;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月30日 11:48
 */
public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        StringBuffer stringBuffer=new StringBuffer();
        while(i<=j){
            if(Character.isLetterOrDigit(s.charAt(i))) stringBuffer.append(s.charAt(i));
            i++;
        }
        if(stringBuffer.length()==0) return true;
            i=0;j=s.length()-1;
        while(i<j)
        {   Character ch=Character.toLowerCase(s.charAt(i));
            while(!Character.isLetterOrDigit(ch)&&i<j) {i++;ch=s.charAt(i);}
            ch=Character.toLowerCase(s.charAt(j));
            while(!Character.isLetterOrDigit(ch)&&i<j) {j--;ch=s.charAt(j);}
            if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))) {i++;j--;}
            else return false;
        }
        return true;
    }
}
