package com.example.StrakAI.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StreakServiceImpl implements StreakService{

    @Override
    public List<int[]> sumPair (int[] nums, int target) {
        List<int []> res=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff= target-nums[i];
            if(map.containsKey(diff)){
                res.add(new int[] {map.get(diff),i});
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
