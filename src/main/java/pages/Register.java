package pages;

import engine.ActionsBot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register extends Pages {
    private final By firstname = By.id("input-firstname");
    private final By lastname = By.id("input-lastname");
    private final By email = By.id("input-email");
    private final By telephone = By.id("input-telephone");
    private final By password = By.id("input-password");
    private final By confirmPassoword = By.id("input-confirm");
    private final By agreeCheckBox = By.id("input-agree");

    private final By continueButton = By.xpath("//input[@type='submit']");

    public Register(WebDriver driver, ActionsBot bot){
        super(driver, bot);
    }

    public Register goTo(){
        String url = "https://ecommerce-playground.lambdatest.io/index.php?route=account/register";
        bot.navigate(url);
        return this;

    }

    public Register fillOutInfo(){

        driver.findElement(firstname).sendKeys("Muneera");
        driver.findElement(lastname).sendKeys("AlAli");
        driver.findElement(email).sendKeys("akmuneera19@gmail.com");
        driver.findElement(telephone).sendKeys("+966553665037");
        driver.findElement(password).sendKeys("TestingTesting123");
        driver.findElement(confirmPassoword).sendKeys("TestingTesting123");


       return this;
    }


}
