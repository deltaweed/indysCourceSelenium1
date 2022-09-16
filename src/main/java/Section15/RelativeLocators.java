package Section15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement editBoxName = driver.findElement(By.cssSelector("[name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(editBoxName)).getText());
        WebElement date = driver.findElement(By.cssSelector("div label[for='dateofBirth']"));
        driver.findElement(with(By.tagName("input")).below(date)).click();
        WebElement text = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(text)).click();
        WebElement empStatus = driver.findElement(By.cssSelector("[for='exampleFormControlRadio1']"));
        driver.findElement(with(By.tagName("input")).toRightOf(empStatus)).click();
    }
}
