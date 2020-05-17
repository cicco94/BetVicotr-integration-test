package com.betVictor.challenge.restService.systemController;

import com.betVictor.challenge.restService.BaseTest;
import com.betVictor.challenge.restService.model.SystemVersion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class SystemVersionTest extends BaseTest {

    @Given("I want to know the version of the app")
    public void iWantToKnowTheVersionOfTheApp() { }

    @When("I check the version of the app")
    public void iCheckTheVersionOfTheApp() { }

    @Then("I should receive a SystemVersion json")
    public void iShouldReceiveASystemVersionJson() throws IOException {
        SystemVersion res = gson.fromJson(getResponse(API_BASE_PATH + "checkSystemVersion"), SystemVersion.class);
        assertNotNull(res);
    }
}
