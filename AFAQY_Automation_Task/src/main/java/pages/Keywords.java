package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keywords<Final, finalAppName>   {

    static WebDriver driver;
    static WebDriverWait webDriverWait;
    long timeoutInSeconds = 100;

    public Keywords(WebDriver driver){

        this.driver = driver;

        webDriverWait = new WebDriverWait(driver, timeoutInSeconds);

    }
    protected static void click(WebElement webElement)
    {
        webElement.click();
    }
    protected static void setTextElement(WebElement TextBox, String value)
    {
        TextBox.sendKeys(value);
    }
    public static WebElement waitUntilElementToBeVisible(By locator){

        WebElement Webelement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        return Webelement;
    }
    public static WebElement waitUntilElementToBeClickable(By locator){

        WebElement Webelement =	webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));

        return Webelement;
    }

}
