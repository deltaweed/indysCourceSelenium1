package TestNG;

import org.testng.annotations.Test;

public class day4 {
    @Test
    public void webLoginHomeLoan(){
        //selenium
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
