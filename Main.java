package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.TableHeaderUI;

import java.time.Duration;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1920,1880");

        WebDriver driver = new ChromeDriver(options);

//        driver.get("https://suninjuly.github.io/text_input_task.html");
//        driver.get("https://suninjuly.github.io/simple_form_find_task.html");
//        driver.get("https://suninjuly.github.io/find_link_text");
//        driver.get("https://rutube.ru/video/b93d73737bd4445b5618d8cdc4e93d32/?playlist=363538");

   //     driver.get("https://suninjuly.github.io/redirect_accept");

        /*
        driver.get("https://suninjuly.github.io/math");
        Thread.sleep(20);
        //ln(abs(12*sin(x)))
        String x = driver.findElement(By.id("input_value")).getText();
        int a = parseInt(x);
        double z = Math.log(Math.abs(12*Math.sin(a)));
        WebElement answer = driver.findElement(By.id("answer"));
        String c = "" + z;
        answer.sendKeys(c);
        Thread.sleep(200);
        WebElement textarea = driver.findElement(By.id("robotCheckbox"));
        textarea.click();
        Thread.sleep(200);
        WebElement robRul = driver.findElement(By.id("robotsRule"));
        robRul.click();
        Thread.sleep(200);
        WebElement sub = driver.findElement(By.cssSelector(".btn-default"));
        sub.click();

         */

        /*
    try{
      //  driver.get("https://suninjuly.github.io/selects1");
        driver.get("https://suninjuly.github.io/selects2");
        Thread.sleep(20);

        String num1  = driver.findElement(By.id("num1")).getText();
        int num11 = parseInt(num1);

        Thread.sleep(20);

        String num2 = driver.findElement(By.id("num2")).getText();
        int num22 = parseInt(num2);

        Thread.sleep(20);

        WebElement selectElement = driver.findElement(By.id("dropdown"));
        Select select = new Select(selectElement);

        Thread.sleep(20);

        int num33 = num11 + num22;
        String num3 = "" + num33;
        select.selectByValue(num3);

        Thread.sleep(20);

//        WebElement sub = driver.findElement(By.tagName("button"));
//        sub.click();

        JavascriptExecutor js = (JavascriptExecutor)driver;


        js.executeScript("document.title = 'Baby'");
        js.executeScript("alert('Ilia')");
    }
    finally {
        Thread.sleep(5000);
        driver.quit();
    }
*/

        /*
        try{
            driver.get("https://suninjuly.github.io/execute_script");
            Thread.sleep(20);
            String x = driver.findElement(By.id("input_value")).getText();
            int z = parseInt(x);
            double c = Math.log(Math.abs(12*Math.sin(z)));
            String v = "" + c;
            WebElement input = driver.findElement(By.id("answer"));
            input.sendKeys(v);
            Thread.sleep(20);
            JavascriptExecutor js = (JavascriptExecutor)driver;
            WebElement textarea = driver.findElement(By.id("robotCheckbox"));
            js.executeScript("arguments[0].scrollIntoView(true)", textarea);
            Thread.sleep(20);
            textarea.click();
            Thread.sleep(20);
            WebElement robRul = driver.findElement(By.id("robotsRule"));
            robRul.click();
            Thread.sleep(20);
            WebElement sub = driver.findElement(By.tagName("button"));
            sub.click();

        }
        finally {
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("document.title = 'errroooooorrrrrrr'");
            Thread.sleep(5000);
            driver.quit();
        }

         */
/*
        try{
            driver.get("https://suninjuly.github.io/alert_accept");
            Thread.sleep(20);
            WebElement firstStep = driver.findElement(By.cssSelector(".btn"));
            firstStep.click();
            Thread.sleep(20);
            driver.switchTo().alert().accept();
            //ln(abs(12*sin(x)))
            String secondStep = driver.findElement(By.id("input_value")).getText();
            int x = parseInt(secondStep);
            double z = Math.log(Math.abs(12*Math.sin(x)));
            String secondStepFin = "" + z;
            WebElement answer = driver.findElement(By.id("answer"));
            answer.sendKeys(secondStepFin);
            Thread.sleep(20);
            WebElement sub = driver.findElement(By.tagName("button"));
            sub.click();
        }
        finally {
            Thread.sleep(2000);
            driver.quit();
        }
        */

        try{
            driver.get("https://suninjuly.github.io/redirect_accept");
            Thread.sleep(20);
            WebElement as = driver.findElement(By.tagName("button"));
                    as.click();
            Thread.sleep(20);
            Object[] windowHandles=driver.getWindowHandles().toArray();
            driver.switchTo().window((String) windowHandles[1]);
            Thread.sleep(29);
            String secondStep = driver.findElement(By.id("input_value")).getText();
            int x = parseInt(secondStep);
            double z = Math.log(Math.abs(12*Math.sin(x)));
            String secondStepFin = "" + z;
            driver.findElement(By.id("answer")).sendKeys(secondStepFin);
            Thread.sleep(20);
            driver.findElement(By.tagName("button")).click();
        }
        finally {
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("document.title = 'errroooooorrrrrrr'");
            Thread.sleep(2000);
            driver.quit();
        }



//        try{
//            driver.get("https://suninjuly.github.io/wait1");
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//            driver.findElement(By.tagName("button")).click();
//            String message = driver.findElement(By.id("verify_message")).getText();
//            assert "Verification was successful!".equals(message);
//        }
//        finally {
//            Thread.sleep(2000);
//            driver.quit();
//        }


//        driver.getTitle();
//        driver.get("https://clc.li/aowYH");
//        WebElement textarea = driver.findElement(By.cssSelector(".textarea"));
//        textarea.sendKeys("ajfhef");

//        WebElement textFirstName = driver.findElement(By.name("first_name"));
//        textFirstName.sendKeys("FirstName");

//        Thread.sleep(150);

//        WebElement textLastName = driver.findElement(By.name("last_name"));
//        textLastName.sendKeys("LastName");

//        WebElement textCity = driver.findElement(By.name("lastname"));
//        textFirstName.sendKeys("FirstName");

//        WebElement textCity = driver.findElement(By.name("firstname"));
//        textCity.sendKeys("fc");

//        Thread.sleep(150);
//
//        WebElement fruits = driver.findElement(By.id("country"));
//        fruits.sendKeys("SAn");
//        Thread.sleep(150);
//
//        Thread.sleep(200);

//        WebElement button = driver.findElement(By.id("submit_button"));
//        WebElement button = driver.findElement(By.id("submit_button"));
//
//        button.click();

//        Thread.sleep(500);
//        String alertText = driver.switchTo().alert().getText();

//        System.out.println(alertText);
//        Thread.sleep(500);
//        Thread.sleep(9000);
//        driver.quit();
    }
}
