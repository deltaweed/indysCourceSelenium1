package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day1 {
    @Test
    public void Demo(){
        System.out.println("hello");
    }
    @AfterSuite
    public void AfSuite(){
        System.out.println("After Suite");
    }
    @Test
    public void Demo2(){
        System.out.println("world");
    }
}
