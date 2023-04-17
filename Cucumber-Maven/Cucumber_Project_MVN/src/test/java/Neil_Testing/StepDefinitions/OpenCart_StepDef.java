package Neil_Testing.StepDefinitions;

import Neil_Testing.UiPages.openCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenCart_StepDef
{
    @Given("^User Navigate to AUT$")
    public void User_Navigate_to_AUT()
    {
        //making chromedefault for LaunchingAUT
        openCartPage.launchingOperation();
    }
    @When("Click on MyAccount to {string}")
    public void userClicksMyAccount(String args){

    }
    @Then("User enter details {string},{string},{string},{string}")
    public void userEnterDetails(String arg0, String arg1, String arg2, String arg3) {
    }

    @Then("User enter {string} details")
    public void userEnterDetails(String arg0) {
    }


    @Then("User Clicks on MyAccount to {string}")
    public void userClicksOnMyAccountTo(String arg0) {
    }


}
