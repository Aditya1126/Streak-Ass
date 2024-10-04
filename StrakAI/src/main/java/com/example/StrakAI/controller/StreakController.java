package com.example.StrakAI.controller;

import com.example.StrakAI.dto.dtoRequest;
import com.example.StrakAI.service.StreakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StreakController {

    @Autowired
    private StreakService streakService;

    @PostMapping("/find-pairs")
    public List<int[]> sumPair(@RequestBody dtoRequest dtoRequest){
        int [] nums=dtoRequest.getNumbers();
        int target=dtoRequest.getTarget();
        List<int []> result=streakService.sumPair(nums,target);
        return result;
    }
}
