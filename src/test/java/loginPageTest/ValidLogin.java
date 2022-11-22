package loginPageTest;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import locators.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import testUtils.DriverUtils;

public class ValidLogin extends DriverUtils {

    LoginPage login = new LoginPage();
    @Test(priority = 3, groups = "Log in", description = "Login with valid data")
    @Severity(SeverityLevel.CRITICAL)
    public void loginWithValidData() {
        String title = "TestProject";
        login.setEmail().sendKeys("");
        login.setPassword().sendKeys("");
        login.rememberMe().click();
        login.clickingLoginButton().click();
        Assert.assertEquals(driver.getTitle(), "TestProject");
        login.setEmail().clear();
        login.setPassword().clear();
    }
}
