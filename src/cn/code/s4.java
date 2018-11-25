package cn.code;

import java.util.Arrays;

public class s4 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);//先对数组进行排序,再进行查找
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
    /**
     * 我的答案
    public static boolean containsDuplicate(int[] nums) {
        for(int i = 0 ; i<nums.length;i++){
            for(int j = i+1 ; j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
}
     **/


}
