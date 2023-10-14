package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationExerciseRegistrationPage extends Keywords{
    public AutomationExerciseRegistrationPage(WebDriver driver) {
        super(driver);
    }
    static By UsernameLocator = By.xpath("//*[@name='name']");
    static By EmailLocator = By.xpath("(//*[@name='email'])[2]");
    static By SubmitBtnLocator = By.xpath("(//*[@type='submit'])[2]");

    private static void Set_Username(String username) {
        waitUntilElementToBeVisible(UsernameLocator);
        WebElement UserName = waitUntilElementToBeClickable(UsernameLocator);
        setTextElement(UserName, username);
    }
    private static void Set_Email(String email) {
        waitUntilElementToBeVisible(EmailLocator);
        WebElement Email = waitUntilElementToBeClickable(EmailLocator);
        setTextElement(Email, email);
    }

    private static AutomationExerciseSignupPage Click_SignUPBtn(){
        waitUntilElementToBeVisible(SubmitBtnLocator);
        WebElement SignUp	= waitUntilElementToBeClickable(SubmitBtnLocator);
        click(SignUp);
        return new AutomationExerciseSignupPage(driver);
    }

    public static void setUsernameEmailClickSignUP(String username, String email)
    {
        Set_Username(username);
        Set_Email(email);
        Click_SignUPBtn();
    }




}
