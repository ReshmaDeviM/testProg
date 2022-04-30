# Reward points Calculation

## Overview

The service expose endpoint to calculate the reward points awarded to the customer as per bill amount.

## Dependencies

### Internal libraries

+ [spring-boot-starter-web]
+ [spring-boot-starter-data-jpa]
+ [com.h2database:h2]
+ [junit.junit.4.12]

## Endpoints

### GET `/getRewardpoints/{customerId}`
#### Overview
This endpoint will return the reward points of the customer based on customerIdentifier we requested for.

### Service execution

1) To execute the service local, clone the service and run the application in any IDE.
2) open any browser or postman and execute the below endpoint url 

    http://localhost:9001/getRewardpoints/1
    
3) service will return calculated reward points based on bill amount.

data.sql contains customer data as follows ,

| ID  | NAME  | TOTAL_BILL |
|-----|-------|------------|
| 1   | John  | 110        |
| 2   | Sam   | 80         |
| 3   | Clare | 180        |
| 4   | Tim   | 260        |
| 5   | Jack  | 20         |
| 6   | Mike  | 870       |



