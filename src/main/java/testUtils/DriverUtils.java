package testUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class DriverUtils {
    static String url = "https://app.testproject.io/logout/";
    public static WebDriver driver;

    @BeforeTest
    public void setDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get(url);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
