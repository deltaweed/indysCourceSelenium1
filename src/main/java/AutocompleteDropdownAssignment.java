import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AutocompleteDropdownAssignment {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.id("autocomplete")).sendKeys("uk");
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[class='ui-menu-item']")));
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("United Kingdom (UK)")) {
                option.click();
                break;
            }
        }
        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
    }
}
/*
INDUS VARIANT
WebDriver driver = new ChromeDriver();
    driver.get("http://qaclickacademy.com/practice.php");
    driver.findElement(By.id("autocomplete")).sendKeys("ind");
    Thread.sleep(2000);
    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
 */