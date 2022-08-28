import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Scope {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());
        WebElement firstFooterColum = driver.findElement(By.cssSelector("tbody tr td:nth-child(1) ul:nth-child(1)")); //My VARIANT
//        WebElement firstFooterColum = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(firstFooterColum.findElements(By.tagName("a")).size());
        for (int i = 1; i < firstFooterColum.findElements(By.tagName("a")).size(); i++) {
            String clickOnLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
            firstFooterColum.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);
            Thread.sleep(5000);
        }
            Set<String> windows = driver.getWindowHandles();
            Iterator<String > id = windows.iterator();
            while (id.hasNext()){
                driver.switchTo().window(id.next());
                System.out.println(driver.getTitle());
            }
    }
}
