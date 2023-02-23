package day06_window_iframe_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class E02_tekrar_soru extends TestBase {

    @Test
    public void test01(){


            // https://the-internet.herokuapp.com/iframe  adresine gidin
          driver.get("https://the-internet.herokuapp.com/iframe");
            // "Your content goes here." yazisinin gorunur oldugunu test edin
        WebElement yaziTest= driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(yaziTest);
        WebElement yaziElementi=driver.findElement(By.tagName("p"));
        Assert.assertTrue(yaziElementi.isDisplayed());
        /*
            Bazen locate islemimizden emin olmamiza ragmen
            Locator calismaz
            Bunun sebebi kullanmak istedigimiz webelement'in
            bir iframe'in child'i olmasi olabilir.
            Eger Kullanmak istedigimiz webelement
            anasayfa icine gomulen baska bir websayfasinin elementi ise
            once gomulu sayfaya gecmemiz gerekir
            HTML komutlarinda sayfa icerisine sayfa gomebilmek icin
            <iframe> kullanilir
            Biz de istedigimiz elementi kullanmak icin once
            o frame'e switch yapmaliyiz
            1- gecis yapmak istediginiz frame'i locate edin
            2- switchTo() ile o frame'e gecis yapin
            3- Sonra istediginiz element ile istediginiz islemi yapin
         */

            // Elemental Selenium linkine click yapin
        /*
            Bir frame'e gecis yaptiktan sonra
            oradan cikincaya veya baska bir frame'e gecinceye kadar
            driver o frame icerisinde kalir
            isimiz bittiginde veya baska frame'e gecmek istedigimizde
            once calisacagimiz yere gecis yapmaliyiz
         */

        }
    }




