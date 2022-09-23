package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

    @AfterTest
    public void executeLast(){
        System.out.println("I will execute last");
    }
    @Test(groups = {"Smoke"})
    public void loan(){
        System.out.println("hey");
    }
    @BeforeTest
    public void prerequisite(){
        System.out.println("I will execute firs");
    }
}
