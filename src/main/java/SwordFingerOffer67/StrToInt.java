package SwordFingerOffer67;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/27 11:38
 */
public class StrToInt {

    public static int strToInt(String str){
        if (str == null){
            return 0;
        }

        str = str.trim();

        if (str.length() == 0){
            return 0;
        }

        char first = str.charAt(0);
        int sign = 1;
        long res = 0;
        int start = 0;

        if (first == '+'){
            start++;
        }else if (first == '-'){
            start++;
            sign = -1;
        }

        for (int i = start; i < str.length(); i++){
            if (!Character.isDigit(str.charAt(i))){
                return (int) res * sign;
            }
            res = res * 10 + str.charAt(i) - '0';
            if (sign == 1 && res > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(sign == -1 && res > Integer.MAX_VALUE){
                return Integer.MIN_VALUE;
            }
        }

        return (int) res * sign;
    }

    public static void main(String[] args) {
        String str = "   -42";
        System.out.println(strToInt(str));
    }
}
