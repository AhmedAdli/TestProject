package loginPageTest;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import locators.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import testUtils.DriverUtils;


public class InvalidLogin extends DriverUtils {

    LoginPage login = new LoginPage();

    @Test(priority = 1, groups = "Log in", description = "Click on login button on logout page")
    @Severity(SeverityLevel.CRITICAL)
    public void loginFromLogoutPage() {
        login.mainLoginButton().click();
    }

    @Test(priority = 2, groups = "Log in", description = "Login with invalid data")
    @Severity(SeverityLevel.CRITICAL)
    public void LoginWithInvalidData() {
        login.setEmail().sendKeys("");
        login.setPassword().sendKeys("");
        login.rememberMe().click();
        login.clickingLoginButton().click();
        Assert.assertEquals(login.getErrorMessage(), "Invalid username or password.");
        login.setEmail().clear();
        login.setPassword().clear();
    }
}
