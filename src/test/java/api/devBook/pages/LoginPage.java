package api.devBook.pages;



import api.devBook.utilities.ConfigurationReader;
import api.devBook.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

//    public LoginPage() {
//        PageFactory.initElements(Driver.get(), this);
//    }

//    @FindBy(css = "#rcc-confirm-button")
//    public WebElement understandBtn;
    @FindBy(id = "loginpage-input-email")
    public WebElement emailInputBox;
    @FindBy(xpath = "//input[@id='loginpage-form-pw-input']")
    public WebElement passwordInputBox;
    @FindBy(id = "loginpage-form-btn")
    public WebElement loginBtn;
    @FindBy(xpath = "//*[.='Invalid Credentials!']")
    public WebElement warningMessage;
    @FindBy(xpath = "//*[text()='Please include a valid email!']")
    public WebElement warningMessage2;
    @FindBy(xpath = "//*[contains(text(),'valid')]")
    public WebElement warningMessageValid;


    public void loginAsTeacher(){
        String userName= ConfigurationReader.get("usernameTeacher");
        String password=ConfigurationReader.get("passwordTeacher");
        emailInputBox.sendKeys(userName);
        passwordInputBox.sendKeys(password);
        understandBtn.click();
        loginBtn.click();
    }

    public void loginAsStudent(){
        String userName= ConfigurationReader.get("usernameStudent");
        String password=ConfigurationReader.get("passwordStudent");
        emailInputBox.sendKeys(userName);
        passwordInputBox.sendKeys(password);
        understandBtn.click();
        loginBtn.click();
    }
    public void loginAsDeveloper(){
        String userName= ConfigurationReader.get("usernameDeveloper");
        String password=ConfigurationReader.get("passwordDeveloper");
        emailInputBox.sendKeys(userName);
        passwordInputBox.sendKeys(password);
        understandBtn.click();
        loginBtn.click();
    }


    public void login(String email,String password){
        emailInputBox.sendKeys(email);
        passwordInputBox.sendKeys(password);
        understandBtn.click();
        loginBtn.click();
    }

    public String getDisappearingWarningMessage(String message){

        String actualMessage= null;
        if (message.contains("@")){
            actualMessage = emailInputBox.getAttribute("validationMessage");
            System.out.println("actualMessage = " + actualMessage);
        } else if (message.contains("valid")) {
            actualMessage= warningMessageValid.getText();
            System.out.println("actualMessage = " + actualMessage);
        }
        return actualMessage;
    }

    public void setUp() throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url"));
        login(ConfigurationReader.get("email"),ConfigurationReader.get("password"));
        Thread.sleep(2000);
    }
    public String getCompany(String companyName){
        return Driver.get().findElement(By.xpath("//td[text()='"+companyName+"']")).getText();
    }

}
