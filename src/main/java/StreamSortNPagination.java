import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class StreamSortNPagination {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        //click on column
        driver.findElement(By.xpath("//tr/th[1]")).click();
        //capture all webelements into list
        List<WebElement> product = driver.findElements(By.xpath("//tr/td[1]"));
        //capture text of all web elements into new(original) list
        List<String> origList = product.stream().map(s -> s.getText()).collect(Collectors.toList());
        //sort origList into sorted list, here we grab text from webelement into list string
        List<String>originalList = origList.stream().sorted().collect(Collectors.toList());
        //compare origList and originalList
        Assert.assertTrue(origList.equals(originalList));
        //scan the name column with getText -> Beans -> get price
        List<String> price;
        do {
            List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
            price = elementList.stream().filter(s -> s.getText().contains("Rice"))
                    .map(s -> getPriceOfVeggie(s)).collect(Collectors.toList());
            price.forEach(s -> System.out.println(s));
            if (price.size() < 1) {
                driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
            }
        }while (price.size() < 1);
    }
    private static String getPriceOfVeggie(WebElement s) {
        String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;
    }
}
