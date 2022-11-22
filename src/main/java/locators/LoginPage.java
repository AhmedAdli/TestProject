package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testUtils.DriverUtils;

import java.time.Duration;

public class LoginPage extends DriverUtils {

    By mainLoginButton = By.id("tp-signup-action");
    By signUp = By.id("tp-signup-link");
    By email = By.id("username");
    By password = By.id("password");
    By rememberMeButton = By.id("rememberMe");
    By loginButton = By.id("tp-sign-in");
    By errorMessage = By.id("tp-message-error");
    By forgotPassword = By.linkText("Forgot your password?");

    public WebElement setEmail() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(email));
    }

    public WebElement setPassword() {
        return driver.findElement(password);
    }

    public WebElement clickingLoginButton() {
        return driver.findElement(loginButton);
    }
    public WebElement rememberMe() {
        return driver.findElement(rememberMeButton);
    }

    public WebElement mainLoginButton() {
        return driver.findElement(mainLoginButton);
    }

    public String getErrorMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).getText();
    }

    public WebElement signUp() {
        return driver.findElement(signUp);
    }
}
