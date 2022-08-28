import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class base {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Beans"};
        Thread.sleep(3000);
        addItems(driver, itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.cssSelector("div[class='cart-preview active'] button[type='button']")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector(".promoBtn")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
        System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
    }
    public static void addItems(WebDriver driver, String[] itemsNeeded ){
        int j = 0;
        List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < product.size(); i++) {
            String[] name = product.get(i).getText().split("-");
            String formattedName = name[0].trim();
            List<String> itemsList = Arrays.asList(itemsNeeded);
            if (itemsList.contains(formattedName)){
                j++;
                driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();
                if(j== itemsNeeded.length){
                    break;
                }
            }
        }
    }
}
