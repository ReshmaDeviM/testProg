package com.example.testProg.controller;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit4.*;
import org.springframework.test.web.servlet.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class RewardPointsControllerTest {
    @Autowired
    private MockMvc mockMvc;


    @Test
    public void givenCustomerId_shouldReturnRewardPoints() throws Exception {
        mockMvc.perform(get("/getRewardpoints/1"))
                .andExpect(status().isOk());
    }
}
