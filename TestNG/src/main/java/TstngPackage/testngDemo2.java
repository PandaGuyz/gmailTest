package TstngPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testngDemo2 {


    @Test()
    public void c_method() {
        System.out.println("I'm in method C");
    }

    @Test()
    public void b_method() {
        System.out.println("I'm in method B");
    }

    @Test(priority = 6)
    public void a_method() {
        System.out.println("I'm in method A");
    }

    @Test(priority = 0)
    public void e_method() {
        System.out.println("I'm in method E");
    }

    @Test(priority = 6)
    public void d_method() {
        System.out.println("I'm in method D");
    }

    @BeforeSuite
    public void fnBeforesuite() {
        System.out.println("fnBeforesuite");
    }



   /* @BeforeMethod
    public void fnBeforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void fnAfterMethod() {
        System.out.println("After Method");
    }*/

}
