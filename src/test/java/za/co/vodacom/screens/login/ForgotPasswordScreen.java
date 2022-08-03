package za.co.vodacom.screens.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordScreen {
    public final WebDriver driver;
    @FindBy(xpath = "//button[normalize-space()='password']")
    public WebElement forgotPassLink;

    @FindBy(id = "menu-category--706522961-heading")
    public WebElement shopMenu;

    public ForgotPasswordScreen(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


    public void forgotPasswordLink(){forgotPassLink.click();}
    public void shopeMenuHover(){
        Actions act = new Actions(driver);
        act.moveToElement(shopMenu).build().perform();
    }
}
