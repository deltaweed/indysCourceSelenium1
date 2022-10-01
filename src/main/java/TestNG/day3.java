package TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class day3 {
    @BeforeClass
    public void BClass(){
        System.out.println("I will be printed before methods of day3 class");
    }
    @Parameters({"URL", "APIKey/Username"})
    @Test
    public void webLoginCarLoan(String urlname, String key){
        //selenium
        System.out.println(key);
        System.out.println(urlname);
        System.out.println("webLoginCarLoan");
    }
    @Test(dataProvider = "getData")
    public void mobileLoginCarLoan(String username, String password){
        //Appium
        System.out.println("mobileLoginCarLoan");
        System.out.println(username +" "+ password);
        Assert.assertTrue(false);
    }
    @BeforeSuite
    public void BFSuite(){
        System.out.println("BeforeSuite");
    }
    @BeforeMethod
    public void BfMethod(){
        System.out.println("I will execute before methods of day3 class");
    }
    @AfterMethod(timeOut = 4000)
    public void AfMethod(){
        System.out.println("I will execute after methods of day3 class");
    }
    @Test(enabled = false)
    public void mobileSingInCarLoan(){
        //Appium
        System.out.println("mobileSingInCarLoan");
    }
    @Test(groups = {"Smoke"})
    public void mobileSignOutCarLoan(){
        //Appium
        System.out.println("mobileSignOutCarLoan");
    }
    @Test(dependsOnMethods = {"mobileLoginCarLoan","mobileSignOutCarLoan"})
    public void loginAPICarLoan(){
        //REST API automation
        System.out.println("loginAPICarLoan");
    }
    @AfterClass
    public void AClass(){
        System.out.println("I will be printed AFTER all methods of day3 class");
    }
    @DataProvider
    public Object[][] getData(){
        //1st comb = user, password - good credit history
        //2nd comb - no credit history
        //3rd comb - bad credit history
        Object[][] data = new Object[3][2];
        //1st set
        data[0][0] = "firsruserusername";
        data[0][1] = "firstuserpassword";
        //2nd
        data[1][0]= "seconduserusername";
        data[1][1]= "seconduserpassword";
        //3rd
        data[2][0]= "thirduserusername";
        data[2][1]= "thirduserpassword";
        return data;
    }
}
