package com.example.testProg.controller;

import com.example.testProg.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class RewardPointsController {
    @Autowired
    private RewardPointsService rewardPointsService;

    @GetMapping("/getRewardpoints/{customerId}")
    public int getRewardsPoints(@PathVariable(name = "customerId") String customerId) throws Exception {
        return rewardPointsService.getRewardPoints(customerId);
    }
}
