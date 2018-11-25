package cn.code;

import java.util.Arrays;

public class s5 {
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        if(nums.length<=1){
            return nums[0];
        }
        Arrays.sort(nums);
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        for(int i = 1 ; i<nums.length-1;i++){
            if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return 0 ;
    }
}
