package com.sparta.waj;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class CucumberStepDefs
{
    //Scenario I am able to run a test in cucumber
    @Given("cucumber is set up correctly")
    public void cucumber_is_set_up_correctly() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(false);
    }

    @When("I run the tests")
    public void i_run_the_tests() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("this is the when method\n");
    }

    @Then("I can see them run")
    public void i_can_see_them_run() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("This is the then method\n");
    }


    //Scenario: Using cucumber I can grab details from my steps and use them.

    private int int1;
    private int int2;
    private int result;

    @Given("I have the number {int}")
    public void i_have_the_number(Integer int1) {
        this.int1 = int1;
    }

    @Given("I wish to add {int}")
    public void i_wish_to_add(Integer int2) {
        this.int2 = int2;
    }

    @When("I add them together")
    public void i_add_them_together() {
        result = int1 + int2;
    }

    @Then("I get {int}")
    public void i_get(Integer int1) {
        Assert.assertEquals((long) result, (long) int1);
    }




}
