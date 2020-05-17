package com.betVictor.challenge.restService.documentController;

import com.betVictor.challenge.restService.BaseTest;
import com.betVictor.challenge.restService.model.GenericRecord;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class InsertTest extends BaseTest {
    private String collectionName;
    private String id;
    private String content;
    private GenericRecord genericRecord;
    private String httpResponse;

    @Given("I have a {string}, an {string}")
    public void iHaveACollectionNameAndAContent(String collectionName, String id) {
        this.collectionName = collectionName;
        this.id = id;
    }

    @Given("I have a {string}, an {string} and a {string}")
    public void iHaveACollectionNameAndAContent(String collectionName, String id, String content) {
        this.collectionName = collectionName;
        this.id = id;
        this.content = content;
    }

    @When("I insert a document create with those attributes")
    public void iInsertADocumentCreateWithThoseAttributes() throws IOException {
        this.genericRecord = new GenericRecord(id, content);
        this.httpResponse = postResponse(API_BASE_PATH + "insertDocument?collection="+collectionName+"&id="+id+"&content=" + content);
    }

    @When("I delete a document create with those attributes")
    public void iDeleteADocumentCreateWithThoseAttributes() throws IOException {
        this.httpResponse = deleteResponse(API_BASE_PATH + "deleteDocument?collection="+collectionName+"&id="+id);
    }

    @When("I get a document create with those attributes")
    public void iGetADocumentCreateWithThoseAttributes() throws IOException {
        this.httpResponse = getResponse(API_BASE_PATH + "getDocument?collection="+collectionName+"&id="+id);
    }

    @When("I update a document create with those attributes")
    public void iUpdateADocumentCreateWithThoseAttributes() throws IOException {
        this.httpResponse = postResponse(API_BASE_PATH + "updateDocument?collection="+collectionName+"&id="+id+"&content=" + content);
    }

    @Then("I should receive a success confirm json")
    public void iShouldReceiveASuccessConfirmJson() {
        assertTrue(httpResponse.contains("statusCode: 200"));
    }
}
