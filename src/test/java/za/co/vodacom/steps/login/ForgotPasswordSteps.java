package za.co.vodacom.steps.login;

import io.cucumber.java.en.Then;
import za.co.vodacom.screens.login.ForgotPasswordScreen;
import za.co.vodacom.utils.GlueCommon;

public class ForgotPasswordSteps {

    private final GlueCommon glueCommon;

    private final ForgotPasswordScreen vodforgotpass;

    public ForgotPasswordSteps(GlueCommon glueCommon) {
        this.glueCommon = glueCommon;
        this.vodforgotpass = new ForgotPasswordScreen(glueCommon.getDriver());
    }

    @Then("I click on the forgot password link")
    public void Iclickontheforgotpasswordlink(){vodforgotpass.forgotPasswordLink();}

    @Then("I hover on the shop menu")
    public void Ihoverontheshopmenu(){vodforgotpass.shopeMenuHover();}
}
