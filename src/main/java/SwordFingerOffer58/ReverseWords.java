package SwordFingerOffer58;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/23 22:23
 */
public class ReverseWords {

    public static String reverseWords(String s){
        s = s.trim();
        StringBuilder res = new StringBuilder();
        int i = s.length()-1, j = s.length()-1;
        while (i >= 0){
            while (i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            res.append(s.substring(i+1, j+1)).append(' ');
            while (i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            j = i;
        }

        return res.toString().trim();
    }

    public static void main(String[] args) {
        String s = "  hello world!  ";
        System.out.println(reverseWords(s));
    }
}
