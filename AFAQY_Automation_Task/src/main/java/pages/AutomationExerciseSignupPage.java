package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationExerciseSignupPage extends Keywords{
    public AutomationExerciseSignupPage(WebDriver driver) {
        super(driver);
    }

    static By MrLocator = By.xpath("//*[@id='id_gender1']");
    static By PasswordLocator = By.xpath("//*[@id='password']");
    static By DayLocator = By.xpath("//*[@id='days']");
    static By DayValueLocator = By.xpath("(//option[@value='1'])[1]");
    static By MonthLocator = By.xpath("//*[@id='months']");
    static By MonthValueLocator = By.xpath("(//option[@value='1'])[2]");
    static By YearLocator = By.xpath("//*[@id='years']");
    static By YearValueLocator = By.xpath("//option[@value='1992']");
    static By FirstNameLocator = By.xpath("//*[@id='first_name']");
    static By LastNameLocator = By.xpath("//*[@id='last_name']");
    static By CompanyLocator = By.xpath("//*[@id='company']");
    static By AddressLocator = By.xpath("//*[@id='address1']");
    static By CountryLocator = By.xpath("//*[@id='country']");
    static By CountryValueLocator = By.xpath("//*[@value='Canada']");
    static By StateLocator = By.xpath("//*[@id='state']"); //alberta
    static By CityLocator = By.xpath("//*[@id='city']"); //calgary
    static By ZipCodeLocator = By.xpath("//*[@id='zipcode']"); //T1W
    static By MobileNumberLocator = By.xpath("//*[@id='mobile_number']"); //250 555 0199
    static By CreateAccountLocator = By.xpath("//*[@data-qa='create-account']");



    private static void Set_Title() {
        waitUntilElementToBeVisible(MrLocator);
        WebElement Title = waitUntilElementToBeClickable(MrLocator);
        click(Title);
    }

    private static void Set_Password(String password) {
        waitUntilElementToBeVisible(PasswordLocator);
        WebElement Password = waitUntilElementToBeClickable(PasswordLocator);
        setTextElement(Password, password);
    }

    private static void Click_DoB() {
        waitUntilElementToBeVisible(DayLocator);
        WebElement Days = waitUntilElementToBeClickable(DayLocator);
        click(Days);
    }

    private static void Set_DoB() {
        waitUntilElementToBeVisible(DayValueLocator);
        WebElement DoBValue = waitUntilElementToBeClickable(DayValueLocator);
        click(DoBValue);
    }

    private static void Click_MoB() {
        waitUntilElementToBeVisible(MonthLocator);
        WebElement Month = waitUntilElementToBeClickable(MonthLocator);
        click(Month);
    }

    private static void Set_MoB() {
        waitUntilElementToBeVisible(MonthValueLocator);
        WebElement MoBValue = waitUntilElementToBeClickable(MonthValueLocator);
        click(MoBValue);
    }

    private static void Click_YoB() {
        waitUntilElementToBeVisible(YearLocator);
        WebElement YearOfBirth = waitUntilElementToBeClickable(YearLocator);
        click(YearOfBirth);
    }

    private static void Set_YoB() {
        waitUntilElementToBeVisible(YearValueLocator);
        WebElement YoBValue = waitUntilElementToBeClickable(YearValueLocator);
        click(YoBValue);
    }

    private static void Set_First_Name(String firstName) {
        waitUntilElementToBeVisible(FirstNameLocator);
        WebElement FirstName = waitUntilElementToBeClickable(FirstNameLocator);
        setTextElement(FirstName, firstName);
    }

    private static void Set_Last_Name(String lastName) {
        waitUntilElementToBeVisible(LastNameLocator);
        WebElement LastName = waitUntilElementToBeClickable(LastNameLocator);
        setTextElement(LastName, lastName);
    }

    private static void Set_Company(String company) {
        waitUntilElementToBeVisible(CompanyLocator);
        WebElement Company = waitUntilElementToBeClickable(CompanyLocator);
        setTextElement(Company, company);
    }

    private static void Set_Address(String address) {
        waitUntilElementToBeVisible(AddressLocator);
        WebElement Address = waitUntilElementToBeClickable(AddressLocator);
        setTextElement(Address, address);
    }

    private static void Click_Country() {
        waitUntilElementToBeVisible(CountryLocator);
        WebElement Country = waitUntilElementToBeClickable(CountryLocator);
        click(Country);
    }

    private static void Set_CountryValue() {
        waitUntilElementToBeVisible(CountryValueLocator);
        WebElement CountryValue = waitUntilElementToBeClickable(CountryValueLocator);
        click(CountryValue);
    }

    private static void Set_State(String state) {
        waitUntilElementToBeVisible(StateLocator);
        WebElement State = waitUntilElementToBeClickable(StateLocator);
        setTextElement(State, state);
    }

    private static void Set_City(String city) {
        waitUntilElementToBeVisible(CityLocator);
        WebElement City = waitUntilElementToBeClickable(CityLocator);
        setTextElement(City, city);
    }

    private static void Set_ZipCode(String zipCode) {
        waitUntilElementToBeVisible(ZipCodeLocator);
        WebElement ZipCode = waitUntilElementToBeClickable(ZipCodeLocator);
        setTextElement(ZipCode, zipCode);
    }

    private static void Set_MobileNumber(String mobileNumber) {
        waitUntilElementToBeVisible(MobileNumberLocator);
        WebElement MobileNumber = waitUntilElementToBeClickable(MobileNumberLocator);
        setTextElement(MobileNumber, mobileNumber);
    }

    public static AutomationExerciseHomePage Click_CreateAccount(){
        waitUntilElementToBeVisible(CreateAccountLocator);
        WebElement CreateAccount	= waitUntilElementToBeClickable(CreateAccountLocator);
        click(CreateAccount);
        return new AutomationExerciseHomePage(driver);
    }

    public static void fillRegistrationInformation(String password, String fname, String lname, String company, String address, String state, String city, String zipCode, String mobileNumber)
    {
        Set_Title();
        Set_Password(password);
        Click_DoB();
        Set_DoB();
        Click_MoB();
        Set_MoB();
        Click_YoB();
        Set_YoB();
        Set_First_Name(fname);
        Set_Last_Name(lname);
        Set_Company(company);
        Set_Address(address);
        Click_Country();
        Set_CountryValue();
        Set_State(state);
        Set_City(city);
        Set_ZipCode(zipCode);
        Set_MobileNumber(mobileNumber);
        Click_CreateAccount();
    }

}
