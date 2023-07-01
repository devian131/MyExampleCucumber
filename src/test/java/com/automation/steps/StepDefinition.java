package com.automation.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
    @Given("user open website")
    public void user_open_website() {
        System.out.println("User Opened the Website ");
    }
    @Given("user logged in to their account")
    public void user_logged_in_to_their_account() {
        System.out.println("User logged in to their account ");
    }
    @When("user comment the post")
    public void user_comment_the_post() {
        System.out.println("User comment the post ");
    }
    @Then("comment is displayed")
    public void comment_is_displayed() {
        System.out.println("Comment is displayed");
    }

    @When("user liked the photo")
    public void user_liked_the_photo() {
        System.out.println("user liked the photo");
    }
    @Then("photo received like")
    public void photo_received_like() {
        System.out.println("Photo received the like ");
    }
}
