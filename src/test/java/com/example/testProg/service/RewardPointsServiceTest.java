package com.example.testProg.service;

import com.example.testProg.model.*;
import com.example.testProg.repository.*;
import org.junit.*;
import org.junit.runner.*;
import org.mockito.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit4.*;

import java.util.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RewardPointsServiceTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private RewardPointsService rewardPointsService;

    @Before
    public void setUp() {
        Customer customer = new Customer();
        customer.setId("1");
        customer.setName("John");
        customer.setTotal_bill(110);
        Mockito.when(customerRepository.findById(ArgumentMatchers.anyString())).thenReturn(Optional.of(customer));
    }

    @Test
    public void getReward() throws Exception {
        int result = rewardPointsService.getRewardPoints("1");
        Assert.assertEquals(70, result);

    }
}
