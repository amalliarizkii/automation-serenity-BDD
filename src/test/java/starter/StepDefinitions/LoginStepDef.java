package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.LoginPage;

import static org.junit.Assert.*;
public class LoginStepDef {

    LoginPage loginPage;

    @Given("I am already on login page")
    public void IamAlreadyOnLoginPage(){
        loginPage.open();

    }

    @When("I input username {string}")
    public void InputUsername(String username){
        loginPage.InputUsername(username);

    }

    @And("I input password {string}")
    public void InputPassword(String password){
        loginPage.InputPassword(password);

    }

    @And("I click login button")
    public void ClickLoginButton(){
        loginPage.ClickButtonLogin();

    }

    @Then("I redirected to inventory page")
    public void RedirectedToInventoryPage(){
        assertEquals("https://www.saucedemo.com/inventory.html",loginPage.getUrl());
    }



}
