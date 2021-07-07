package com.demoqa.step_def;
import com.demoqa.page_object.PracticeFormPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.awt.*;

public class Demoqa_Stepdef1 {
    PracticeFormPage pf = new PracticeFormPage();

    @Given("i am on homepage")
    public void i_am_on_homepage() {
        pf.homePage();
        System.out.println("1");
    }

    @When("i entered  first name and last name")
    public void i_entered_first_name_and_last_name() {
        pf.firstLastName();
        System.out.println("2");
    }

    @When("i enter email address")
    public void i_enter_email_address() {
        pf.emailAdderess();
        System.out.println("3");
    }

    @When("i click on gender male")
    public void i_click_on_gender_male() {
        pf.setGender();
        System.out.println("4");
    }

    @When("i enter my mobile number, birthdate and subject")
    public void i_enter_my_mobile_number_birthdate_and_subject() {
        pf.mobileBirthSubject();
        System.out.println("5");
    }

    @When("i click on my hobby and upload my image")
    public void i_click_on_my_hobby_and_upload_my_image() {
        try {
            pf.hobbyImage();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        System.out.println("6");
    }

    @When("i enter my address")
    public void i_enter_my_address() {
        pf.setCurrentAddress();
        System.out.println("7");
    }

    @When("select state and city")
    public void select_state_and_city() {
        pf.stateAndCity();
        System.out.println("8");
    }

    @When("i click on submit button")
    public void i_click_on_submit_button() {
        pf.clickSubmit();
    }

    @Then("i can see registration conformation with all details")
    public void i_can_see_registration_conformation_with_all_details() {
        String expected = "Thanks for submitting the form";
        String actualMessage = pf.RegConfirm();
        Assert.assertEquals(actualMessage, expected);
        System.out.println("10");


    }


}
