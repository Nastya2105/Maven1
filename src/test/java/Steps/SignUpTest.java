package Steps;

import org.junit.Assert;
import org.junit.Test;
import pageobject.MainPage;
import pageobject.SignUpPage;

public class SignUpTest extends BaseTest {
    MainPage mainPage = new MainPage(getDriver());
    SignUpPage signUpPage = new SignUpPage(getDriver());

    String success = "Account is created!";

    @Test
    public void signUpTest() {
        mainPage.clickEnterBtn();
        mainPage.clickSignUpLink();

        enterZipCode();
        enterMainData();

        sleep(8000);

        Assert.assertTrue(checkThatConfirmationMessageAppears());
    }

    public void enterZipCode() {
        signUpPage.sendKeysZipCodeFld("11111");
        signUpPage.clickContinueBtn();
    }

    public void enterMainData() {
        signUpPage.enterName("ssss");
        signUpPage.enterLastName("wwww");
        signUpPage.enterEmail("eeee@example.com");
        signUpPage.enterPassword("1111");
        signUpPage.enterConfirmPassword("1111");
        signUpPage.clickRegisterBtn();
    }

    public boolean checkThatConfirmationMessageAppears() {
        String textConfirmationMessage = signUpPage.getTextConfirmationMessage();
        boolean equals = success.equals(textConfirmationMessage);
        return equals;
    }

}
