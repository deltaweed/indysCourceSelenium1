package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.URL;

public class day4 {
    @Parameters({"URL"})
    @Test
    public void webLoginHomeLoan(String someUrl){
        //selenium
        System.out.println(someUrl);
        System.out.println("webLoginHomeLoan");
    }
    @Test(groups = {"Smoke"})
    public void mobileLoginHomeLoan(){
        //Appium
        System.out.println("mobileLoginHomeLoan");
    }
    @Test
    public void loginAPIHomeLoan(){
        //REST API automation
        System.out.println("loginAPIHomeLoan");
    }
}
