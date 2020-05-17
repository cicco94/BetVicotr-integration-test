package com.betVictor.challenge.restService.systemController;

import com.betVictor.challenge.restService.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class SystemStateTest extends BaseTest {

    @Given("I want to know if app is on")
    public void iWantToKnowIfAppIsOn() { }

    @When("I check if app is up")
    public void iCheckIfAppIsUp() { }

    @Then("I should receive true")
    public void iShouldReceiveTrue() throws IOException {
        assertEquals("true", getResponse(API_BASE_PATH + "checkAppStatus"));
    }
}
