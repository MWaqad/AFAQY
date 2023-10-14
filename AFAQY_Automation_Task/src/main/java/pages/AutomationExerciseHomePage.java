package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AutomationExerciseHomePage extends Keywords{
    public AutomationExerciseHomePage(WebDriver driver) {
        super(driver);
    }

    static String AccountCreatedMsg = "ACCOUNT CREATED!";
    static By AccountCreatedLocator = By.xpath("//*[@data-qa='account-created']");
    static WebElement AccountCreatedLabel = driver.findElement(By.xpath("//*[@data-qa='account-created']"));
    static By LogoutBtn = By.xpath("//*[@href='/logout']");
    static By LoginBtn = By.xpath("//*[@href='/login']");

    private static void validate_AccountCreated()
    {
        waitUntilElementToBeVisible(AccountCreatedLocator);
        Assert.assertEquals(AccountCreatedMsg, AccountCreatedLabel.getText());
    }

    private static void Logout() {
        waitUntilElementToBeClickable(LoginBtn);
        WebElement Login = waitUntilElementToBeClickable(LoginBtn);
        click(Login);
        waitUntilElementToBeVisible(LogoutBtn);
        WebElement Logout = waitUntilElementToBeClickable(LogoutBtn);
        click(Logout);
    }

    public static void validateAccountCreatedAndLogout()
    {
        validate_AccountCreated();
        Logout();
    }
}
