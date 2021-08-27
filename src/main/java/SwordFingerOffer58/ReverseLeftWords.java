package SwordFingerOffer58;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/27 11:16
 */
public class ReverseLeftWords {

    public static String reverseLeftWords(String s, int n){
        StringBuilder res = new StringBuilder();
        for (int i = n; i < s.length(); i++){
            res.append(s.charAt(i));
        }

        for (int i = 0; i < n; i++){
            res.append(s.charAt(i));
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "lrloseumgh";
        System.out.println(reverseLeftWords(s, 6));
    }
}
