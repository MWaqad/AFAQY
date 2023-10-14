package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationExerciseLandingPage extends Keywords{
    public AutomationExerciseLandingPage(WebDriver driver) {
        super(driver);
    }

    static By SignUpLocator = By.xpath("//*[@href='/login']");

    public static AutomationExerciseRegistrationPage click_SignUPBtn(){
        WebElement SignUp	= waitUntilElementToBeClickable(SignUpLocator);
        click(SignUp);
        return new AutomationExerciseRegistrationPage(driver);
    }


}
