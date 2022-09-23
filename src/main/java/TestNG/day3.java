package TestNG;

import org.testng.annotations.*;

public class day3 {
    @BeforeClass
    public void BClass(){
        System.out.println("I will be printed before methods of day3 class");
    }
    @Test
    public void webLoginCarLoan(){
        //selenium
        System.out.println("webLoginCarLoan");
    }
    @Test
    public void mobileLoginCarLoan(){
        //Appium
        System.out.println("mobileLoginCarLoan");
    }
    @BeforeSuite
    public void BFSuite(){
        System.out.println("BeforeSuite");
    }
    @BeforeMethod
    public void BfMethod(){
        System.out.println("I will execute before methods of day3 class");
    }
    @AfterMethod
    public void AfMethod(){
        System.out.println("I will execute after methods of day3 class");
    }
    @Test
    public void mobileSingInCarLoan(){
        //Appium
        System.out.println("mobileSingInCarLoan");
    }
    @Test(groups = {"Smoke"})
    public void mobileSignOutCarLoan(){
        //Appium
        System.out.println("mobileSignOutCarLoan");
    }
    @Test
    public void loginAPICarLoan(){
        //REST API automation
        System.out.println("loginAPICarLoan");
    }
    @AfterClass
    public void AClass(){
        System.out.println("I will be printed AFTER all methods of day3 class");
    }
}
