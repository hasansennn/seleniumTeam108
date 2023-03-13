package EXERCISE;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import javax.swing.*;

public class E03_tekrar_soru extends TestBase {

    @Test
    public void test01(){
        // amazon anasayfaya gidip, arama kutusunun erisilebilir oldugunu test edin
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(aramaKutusu.isEnabled());
        String amazonWHD= driver.getWindowHandle();


        // yeni bir tab olarak wisequarter.com'a gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wisequarter.com");

        //  url'in wisequarter icerdigini test edin
       String expectedUrl="wisequarter";
       String actualUrl= driver.getCurrentUrl();
       Assert.assertTrue(actualUrl.contains(expectedUrl));
        String wiseWindowHandleDegeri= driver.getWindowHandle();

       // amazon'un acik oldugu tab'a geri donup
        driver.switchTo().window(amazonWHD);

        // Nutella icin arama yapin
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // Sonuclarin Nutella icerdigini test edin
        String actualsonucYazisi= driver
                .findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"))
                .getText();
        String expectedIcerik="Nutella";
        Assert.assertTrue(actualsonucYazisi.contains(expectedIcerik));

        // yeni bir window olarak youtube.com'a gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");

        // Url'in youtube icerdigini test edin
         expectedUrl="youtube";
         actualUrl= driver.getCurrentUrl();
         Assert.assertTrue(actualUrl.contains(expectedUrl));
         bekle(2);

        // wisequarter'in acik oldugu sayfaya donun
        driver.switchTo().window(wiseWindowHandleDegeri);

        // Title'in Wise Quarter icerdigini test edin
        String expectedTitle="Wise Quarter";
        String actualTitle= driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        bekle(3);
        driver.quit();
    }
}
