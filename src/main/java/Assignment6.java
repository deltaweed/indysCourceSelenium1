import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        String mainText = driver.findElement(By.cssSelector("label[for='honda']")).getText();
        System.out.println(mainText);
        driver.findElement(By.id("checkBoxOption3")).click();
        WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText(mainText);
        driver.findElement(By.id("name")).sendKeys(mainText);
        driver.findElement(By.id("confirmbtn")).click();
        String confirm = driver.switchTo().alert().getText();
        if (confirm.contains(mainText)){
            System.out.println("Successfully");
            driver.switchTo().alert().accept();
        }else {
            System.out.println("Something go wrong");
        }
    }
}
