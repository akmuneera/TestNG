package testng.pageObjectModel;

           /*
            go to url : https://ecommerce-playground.lambdatest.io/index.php?route=account/register
            register account test with fluent page object approach
         */


import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Register;
import testng.Tests;


public class fluentPOM extends Tests {

    @Test
    public void registerTest() {



            Register test = new Register(driver, bot)
                    .goTo().fillOutInfo();



    }


}
