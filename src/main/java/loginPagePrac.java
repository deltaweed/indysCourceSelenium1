import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class loginPagePrac {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
//        driver.findElement(By.xpath("//label[2]//span[2]")).click();                              //My Variant
        driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        WebElement sd = driver.findElement(By.cssSelector("select[class='form-control']"));
        Select dropdown = new Select(sd);
        dropdown.selectByValue("consult");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='btn btn-info']")));
        List<WebElement> add = driver.findElements(By.cssSelector("button[class*='btn btn-info']"));
        for (int i = 0; i < add.size() ; i++) {
//            driver.findElements(By.cssSelector("button[class*='btn btn-info']")).get(i).click();    //My Variant
            add.get(i).click();
        }
        driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
    }
}
