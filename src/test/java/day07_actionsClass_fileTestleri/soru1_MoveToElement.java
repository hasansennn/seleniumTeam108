package day07_actionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.AcceptedW3CCapabilityKeys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class soru1_MoveToElement extends TestBase {
    @Test
    public void test(){

        //1- https://www.amazon.com/ adresine gidin
        driver.get("https:/www.amazon.com");

        //2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin
        //   mouse’u bu menunun ustune getirin
        WebElement accuntList= driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'] )[1] "));
        Actions actions=new Actions(driver);
        actions.moveToElement(accuntList).perform();
        //3- “Create a list” butonuna basin
       driver.findElement(By.xpath("(//span[@class='nav-text'])[1]")).click();

        //4- Acilan sayfada “Your Lists” yazisi oldugunu test edin
        WebElement yourList= driver.findElement(By.id("my-lists-tab"));
       // String expectedList="Your Lists";
       // String actualList= yourList.getText();
      //  Assert.assertTrue(actualList.contains(expectedList));
          Assert.assertTrue(yourList.isDisplayed());

    }
}
