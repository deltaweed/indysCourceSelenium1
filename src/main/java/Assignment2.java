import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Max");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("(//input[@id='exampleInputPassword1'])[1]")).sendKeys("qwerty");
        driver.findElement(By.cssSelector("#exampleCheck1")).click();
        WebElement staticDropdown = driver.findElement(By.xpath("(//select[@id='exampleFormControlSelect1'])[1]"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText("Female");
        driver.findElement(By.cssSelector("input[value='option1']")).click();
        driver.findElement(By.name("bday")).sendKeys("16101991");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        Thread.sleep(2000);
//        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
        String qq = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
        String [] qqq = qq.split("\n");
        System.out.println(qqq[1]);

    }
}
