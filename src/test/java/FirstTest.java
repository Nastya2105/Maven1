import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main (String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
        element1.sendKeys("abc");
        WebElement element2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[3]/center/input[1]"));
        element2.click();
        Thread.sleep(5000);
        driver.quit();


    }

}
