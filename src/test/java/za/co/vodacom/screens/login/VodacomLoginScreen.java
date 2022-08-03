package za.co.vodacom.screens.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VodacomLoginScreen {

    public final WebDriver driver;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement clickAcceptCookies;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameTextBox;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//button[normalize-space()='NEXT']")
    public WebElement nextButton;

    public VodacomLoginScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAcceptCookies(){
        clickAcceptCookies.click();
    }

    public void entervodacomusername(String username) throws InterruptedException {
        usernameTextBox.sendKeys(username);
        Thread.sleep(1000);
    }
    public void entervodacompassword(String password) throws InterruptedException {
        passwordTextBox.sendKeys(password);
        Thread.sleep(1000);
    }

    public void clickNextButton() {
        nextButton.click();
    }

}
