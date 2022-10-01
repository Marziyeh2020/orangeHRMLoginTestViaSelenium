package stepDefination;

import Utils.Utils;
import jdk.jshell.execution.Util;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class testSteps extends Utils {
    public static void main(String[] args) throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("iamettt");
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("mmmmm5648");
        WebElement btnLogin=driver.findElement(By.xpath("//button[@type='submit']"));
        btnLogin.click();

        List<WebElement> spanMessage=driver.findElements(By.xpath("//div[@class='oxd-alert oxd-alert--error']"));
        if (spanMessage.size()>0){

            System.out.println("Login olamadı. Hata mesajı gözüktü");


            TakesScreenshot ts=(TakesScreenshot) driver;
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(hafizadakiHali, new File("takeScreenShot/LoginKontrol.png"));

        }





        BekleKapat();
    }
}
