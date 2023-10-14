package tests;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.AutomationExerciseLandingPage;
import java.util.concurrent.TimeUnit;


public class TestBase {
    public AutomationExerciseLandingPage automationExerciseLandingPage;
    protected WebDriver driver;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        automationExerciseLandingPage = new AutomationExerciseLandingPage(driver);
    }


    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}