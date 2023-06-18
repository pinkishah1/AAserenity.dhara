package com.virgin.games.cucumber;

import com.virgin.games.steps.CurrencySteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

public class VirginGameSteps {
    static ValidatableResponse response;
    @Steps
    CurrencySteps currencySteps;

    @Given("^Display all the records with currency GBP$")
    public void displayAllTheRecordsWithCurrencyGBP() {
        response = currencySteps.getUserByGBP();
    }

    @When("^User sends a GET request to GBP endpoint$")
    public void userSendsAGETRequestToGBPEndpoint() {
        response = currencySteps.getUserByGBP();
    }

    @Then("^User should see currency in GBP and status code 200$")
    public void userShouldSeeCurrencyInGBPAndStatusCode() {
        response.statusCode(200);
    }

    @Given("^Display all the records with currency SEK$")
    public void displayAllTheRecordsWithCurrencySEK() {
        response = currencySteps.getAllPotsSEK();
    }

    @When("^User sends a GET request with SEK query parameter$")
    public void userSendsAGETRequestWithSEKQueryParameter() {
        response = currencySteps.getAllPotsSEK();
    }

    @Then("^User should see currency in SEK and status code 200$")
    public void userShouldSeeCurrencyInSEKAndStatusCode() {
        response.statusCode(200);
    }

    @Given("^Display all the records with currency EUR$")
    public void displayAllTheRecordsWithCurrencyEUR() {
        response = currencySteps.getAllCurrencyEUR();
    }

    @When("^User sends a GET request with EUR query parameter$")
    public void userSendsAGETRequestWithEURQueryParameter() {
        response = currencySteps.getAllCurrencyEUR();
    }

    @Then("^User should see currency in EUR and status code 200$")
    public void userShouldSeeCurrencyInEURAndStatusCode() {
        response.statusCode(200);
    }
}
