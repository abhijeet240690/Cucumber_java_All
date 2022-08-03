package za.co.vodacom.steps.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import za.co.vodacom.screens.login.VodacomLoginScreen;
import za.co.vodacom.utils.GlueCommon;

public class VodacomLoginSteps {

    private final GlueCommon glueCommon;
    private final VodacomLoginScreen vodloginscreen;

    public VodacomLoginSteps(GlueCommon glueCommon) {
        this.glueCommon = glueCommon;
        this.vodloginscreen =new VodacomLoginScreen(glueCommon.getDriver());
    }

    @Given("I Visit the Vodacom Login page")
    public void IVisittheVodacomLoginpage(){
        glueCommon.getDriver().get(System.getProperty("host"));
    }

    @When("I enter my vodacom username {string}")
    public void entervodacomusername(String username) throws InterruptedException {
        vodloginscreen.entervodacomusername(username);
    }
    @When("I enter my vodacom password {string}")
    public void entervodacompassword(String password) throws InterruptedException {
        vodloginscreen.entervodacompassword(password);
    }
    @Then("I click on the Accept Cookies Button")
    public void IclickontheAcceptCookiesButton(){vodloginscreen.clickAcceptCookies();}

    @Then("I click on the Next button")
    public void iClickOnTheNextButton() {vodloginscreen.clickNextButton();
    }
}
