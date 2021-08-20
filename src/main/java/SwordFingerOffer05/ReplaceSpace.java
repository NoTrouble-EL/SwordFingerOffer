package SwordFingerOffer05;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/20 21:45
 */
public class ReplaceSpace {
    public static String replaceSpace(String s){
        //
        StringBuilder res = new StringBuilder();
        //
        for (char ch : s.toCharArray()){
            if (ch == ' '){
                res.append("%20");
            }else{
                res.append(ch);
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
}
