package SwordFingerOffer48;

import java.util.HashMap;

/**
 * @Author: Wukun
 * @Date: 2021/8/25上午10:48
 */
public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int start = 0, end = 0; end < s.length(); end++){
            char ch = s.charAt(end);
            if (map.containsKey(ch)){
                start = Math.max(start, map.get(ch));
            }
            count = Math.max(count, end - start + 1);
            map.put(ch, end+1);
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
