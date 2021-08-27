package SwordFingerOffer46;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/27 12:58
 */
public class TranslateNum {

    public static int translateNum(int num){
        String str = String.valueOf(num);
        int x = 1, y = 1;
        for (int i = 2; i <= str.length(); i++){
            String sub = str.substring(i-2, i);
            int z = sub.compareTo("10") >= 0 && sub.compareTo("25") <= 0 ? x+y : x;
            x = y;
            y = z;
        }

        return x;
    }

    public static void main(String[] args) {
        System.out.println(translateNum(12258));
    }
}
