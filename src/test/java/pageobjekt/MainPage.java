package pageobjekt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/center/table/tbody/tr[20]/td/p/a/b")
    private WebElement enterBtn;

    @FindBy(xpath = "/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a")
    private WebElement signUpRef;

    public void clickEnterBtn() {
        enterBtn.click();
    }

    public void clickSignUpLink() {
        signUpRef.click();
    }
}
