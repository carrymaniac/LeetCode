package cn.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class s6 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap();
        //初始化检索器
        for(int i = 0 ;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                //map集合中已有该数字,加一位
                map.put(nums1[i],map.get(nums1[i])+1);
            }else{
                //没有该数字,添加新数字
                map.put(nums1[i],1);
            }
        }
        List<Integer> integers = new ArrayList<>();
        for(int i = 0 ; i<nums2.length ; i++){
            if(map.containsKey(nums2[i])&&map.get(nums2[i])>0){
                //map集合已有该数据,减一位
                map.put(nums2[i],map.get(nums2[i])-1);
                integers.add(nums2[i]);
            }
        }
        int[] result = new int[integers.size()];
        for(int i = 0 ;i<result.length;i++){
            result[i] = integers.get(i);
        }
        return result;
    }
}
