import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7WebTablesAssignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        WebElement column = driver.findElement(By.id("product"));
        System.out.println(column.findElements(By.xpath("(//table[@id='product'])[1]//tr")).size());
        System.out.println(column.findElements(By.xpath("(//table[@id='product'])[1]//tr//th")).size());
        System.out.println(column.findElement(By.xpath("(//table[@id='product'])//tr[3]")).getText());
    }
}
/*
INDUS VARIANT
System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://qaclickacademy.com/practice.php");
WebElement table=driver.findElement(By.id("product"));
System.out.println(table.findElements(By.tagName("tr")).size());
System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
System.out.println(secondrow.get(0).getText());
System.out.println(secondrow.get(1).getText());
System.out.println(secondrow.get(2).getText());
 */