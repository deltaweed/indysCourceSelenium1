import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Clendar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.path2usa.com/travel-companion/");
        Thread.sleep(3000); //try to fix it with explicit wait
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)");
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        w.until(ExpectedConditions.elementToBeClickable(By.linkText("Got it!")));
        driver.findElement(By.linkText("Got it!")).click();
        driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
        while (!driver.findElement(By.cssSelector("[class='flatpickr-month'] [class='flatpickr-current-month'] [class='cur-month']"))
                .getText().contains("November")){
            driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
            Thread.sleep(1000);//try to fix it with explicit wait
//            w.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".flatpickr-next-month")));
        }
//        Grab the common attribute and iterate the date for handle of calendars
//        List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
        int count = driver.findElements(By.className("flatpickr-day")).size();
        for (int i = 0; i < count; i++) {
            String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
            if (text.equalsIgnoreCase("28")){
                driver.findElements(By.className("flatpickr-day")).get(i).click();
                break;
            }
        }
    }
}
