package com.demoqa.step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DummyStepdef {
    @Given("am on homepage")
    public void am_on_homepage() {
        System.out.println("1");
    }
    @When("entered  first name and last name")
    public void entered_first_name_and_last_name(){
        System.out.println("2");
    }
    @Then("can see registration conformation with all details")
    public void can_see_registration_conformation_with_all_details() {
        System.out.println("3");
    }


}
