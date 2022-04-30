package com.example.testProg.service;

import com.example.testProg.model.*;
import com.example.testProg.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.util.ObjectUtils;

import java.util.Optional;

@Service
public class RewardPointsService {

    @Autowired
    private CustomerRepository customerRepository;

    public int getRewardPoints(String customerId) throws Exception {
        Optional<Customer> customerObject = customerRepository.findById(customerId);
        Customer customer = new Customer();
       if(!ObjectUtils.isEmpty(customerObject)){
           customer = customerObject.get();
       }
       else{
           throw new Exception("customer not found");
       }


        int calculatedRewardPoints = 0;
        int billAmount = customer.getTotal_bill();
        if (billAmount > 50 && billAmount < 100) {
            int amountGreaterThan50 = billAmount - 50;
            calculatedRewardPoints += billAmount - 50;
            billAmount = billAmount - amountGreaterThan50;
        } else if (billAmount > 100 && billAmount % 100 > 0) {
            calculatedRewardPoints = getrp(billAmount);

        }

        return calculatedRewardPoints;
    }

    private int getrp(int billAmount) {
        int rewardPoints = 50;
        while (billAmount > 100) {
            int billAmount1 = billAmount - 100;
            if (billAmount1 > 100) {
                rewardPoints += 100 * 2;
            } else {
                rewardPoints += billAmount1 * 2;
            }
            billAmount = billAmount - 100;
        }
        return rewardPoints;
    }

}
