package tests;

import org.testng.annotations.Test;
import pages.*;

import java.security.SecureRandom;
public class AutomationPractice extends TestBase {



    final long randomValue = System.currentTimeMillis();
    String randomMail = "autopractice_" + randomValue + "@test.com";
    String complexPW = "P@ssw0rd";

    private String[] names = {"mahmoud", "mostafa", "mohammed", "ahmed"
            , "ali", "hassan", "salem", "hussain"};
    private String[] states = {"Ontario", "Quebec", "Nova Scotia", "New Brunswick"
            , "Manitoba", "British Columbia", "Prince Edward Island", "Saskatchewan"};
    private String[] cities = {"Saskatoon", "Regina", "Calgary", "Edmonton"
            , "St. John's", "Charlottetown", "Vancouver", "Winnipeg"};
    private String[] companies = {"Shopify", "Canadian Natural", "Canadian Pacific", "BMO Financial Group"
            , "BMO Financial Group", "Brookfield Asset Management", "Scotiabank", "BMO Financial Group"};
    private int index = (int) (Math.random() * names.length);
    private String frstNme = names[index];
    private String lstNme = names[index+1];
    private String rState = states[index];
    private String rCity = cities[index];
    private String rCompany = companies[index];

    SecureRandom randCode = new SecureRandom();
    int num = randCode.nextInt(100000);
    String RandomPostalCode = String.format("%05d", num);
    String RandomMobileNumber = "1541751"+RandomPostalCode;
    String address = RandomPostalCode + ", " + rCity + ", " + rState + ", " + "Canada";


    @Test(priority = 1)
    public void reg()
    {
        //AutomationExerciseLandingPage automationExerciseLandingPage = new AutomationExerciseLandingPage(driver);
        AutomationExerciseLandingPage.click_SignUPBtn();
        AutomationExerciseRegistrationPage.setUsernameEmailClickSignUP(frstNme, randomMail);
        //AutomationExerciseSignupPage automationExerciseSignupPage = new AutomationExerciseSignupPage(driver);
        AutomationExerciseSignupPage.fillRegistrationInformation(complexPW, frstNme, lstNme, rCompany, address, rState, rCity, RandomPostalCode, RandomMobileNumber);
        //AutomationExerciseHomePage automationExerciseHomePage = new AutomationExerciseHomePage(driver);
        AutomationExerciseHomePage.validateAccountCreatedAndLogout();
    }
}
