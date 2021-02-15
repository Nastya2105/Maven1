package pageobjekt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement zipCodeFld;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement contunieBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")
    private WebElement nameBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
    private WebElement lastNameBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")
    private WebElement emailBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")
    private WebElement passwordBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")
    private WebElement confirmPasswordBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input")
    private WebElement register;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[4]/td/span")
    private WebElement creationMessage;

    public void sendKeysZipCodeFld(String k) {
        zipCodeFld.sendKeys(k);
    }
    public void clickContinueBtn() {
        contunieBtn.click();
    }
    public void enterName(String k) {
        nameBtn.sendKeys(k);
    }
    public void enterLastName(String k) {
        lastNameBtn.sendKeys(k);
    }
    public void enterEmail(String k) {
        emailBtn.sendKeys(k);
    }
    public void enterPassword(String k) {
        passwordBtn.sendKeys(k);
    }
    public void enterConfirmPassword(String k) {
        confirmPasswordBtn.sendKeys(k);
    }
    public void clickRegisterBtn() {
        register.click();
    }

    public String getTextConfirmationMessage() {
        return creationMessage.getText();
    }
}