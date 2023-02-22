package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup (){
        System.out.println("Before sceranio is running");
    }

    @After
    public void tearDown(){
        System.out.println("After sceranio is running");
    }
}
