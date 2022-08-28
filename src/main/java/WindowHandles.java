import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String > id = windows.iterator();
        String parentID = id.next();
        String childID = id.next();
        driver.switchTo().window(childID);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        String emailID = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim()
                .split(" ")[0];
        driver.switchTo().window(parentID);
        driver.findElement(By.id("username")).sendKeys(emailID);
        String password = driver.findElement(By.cssSelector(".text-center.text-white")).getText().split("is")[2]
                .split("\\)")[0].trim();
        driver.findElement(By.id("password")).sendKeys(password);

    }
}
