package com.automation.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("Before each scenario ");
    }
    @After
    public void cleanUp(){
        System.out.println("After each scenario");
    }
}

