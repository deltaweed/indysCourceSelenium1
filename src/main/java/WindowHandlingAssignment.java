import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandlingAssignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.cssSelector("a[href='/windows']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String > id = windows.iterator();
        String parentID = id.next();
        String childID = id.next();
        driver.switchTo().window(childID);
        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
        driver.switchTo().window(parentID);
        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
    }
}
/* idus variant
driver.get("http://the-internet.herokuapp.com/");
driver.findElement(By.linkText("Multiple Windows")).click();
driver.findElement(By.cssSelector("a[href*='windows']")).click();
Set<String> abc=driver.getWindowHandles();
Iterator<String> it=abc.iterator();
String parentWindow=it.next();
driver.switchTo().window(it.next());
System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
driver.switchTo().window(parentWindow);
System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
 */