package SwordFingerOffer50;

/**
 * @Author: Wukun
 * @Date: 2021/8/25上午10:55
 */
public class FirstUniqChar {

    public static char firstUniqChar(String s){
        int[] count = new int[26];
        for (char ch : s.toCharArray()){
            count[ch - 'a']++;
        }

        for (char ch : s.toCharArray()){
            if (count[ch - 'a'] == 1){
                return ch;
            }
        }

        return ' ';
    }

    public static void main(String[] args) {
        String s = "abaccdeff";
        System.out.println(firstUniqChar(s));
    }
}
