package SwordFingerOffer45;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/18 22:45
 */
public class MinNumber {

    /**
     *
     * @param nums
     * @return
     *
     * time:O(nlog(n))
     * space:O(n)
     */
    public static String minNumber(int[] nums){
        // Create a List collection to save the nums array
        List<String> list = new ArrayList<>();
        // Add nums to the list
        for (int n : nums){
            list.add(String.valueOf(n));
        }
        // Sort the list and pass in a custom comparator
        list.sort((a, b) -> (a+b).compareTo(b+a));
        // Create a StringBuilder to save the results
        StringBuilder res = new StringBuilder();
        for (String str : list){
            res.append(str);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        int[] nums = {3, 30, 34,5, 9};
        System.out.println(minNumber(nums));
    }
}
