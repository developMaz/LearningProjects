package com.learning.patterns.strategy;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTestSuite {

    @Test
    public void testDefaultInvestingStratgies(){
        //Given
        Customer company = new CorporateCustomer("Company");
        Customer user = new IndividualCustomer("User");
        Customer student = new IndividualYoungCustomer("Student");

        //when
        String cBuy = company.predict();
        System.out.println(company.getName() + " should use: " + cBuy);

        String uBuy = user.predict();
        System.out.println(user.getName() + " should use: " + uBuy);

        String sBuy = student.predict();
        System.out.println(student.getName() + " should use: " + sBuy);

        //then
        Assert.assertEquals("Balanced predictor", cBuy);
        Assert.assertEquals("Conservative predictor", uBuy);
        Assert.assertEquals("Aggressive predictor", sBuy);
    }

    @Test
    public void testIndividualInvestingStrategy(){
        //Given
        Customer customer = new IndividualYoungCustomer("Customer Name");
        //when
        // String sBuy = customer.predict();
        //System.out.println(customer.getName() + " should use: " + sBuy);
        customer.setBuyingStratego(new BalancedPredictor());
        String sBuy = customer.predict();
        System.out.println(customer.getName() + " should use: " + sBuy);
        //then
        Assert.assertEquals("Balanced predictor", sBuy);
    }
}
