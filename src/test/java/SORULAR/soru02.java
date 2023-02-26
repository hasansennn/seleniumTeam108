package SORULAR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.security.Key;
import java.util.List;

public class soru02 extends TestBase {

    @Test
    public void test05() {

        /*

        1- Bir test class’i olusturun ilgili ayarlari yapin
        2- https://www.automationexercise.com/ adresine gidin
        3- Category bolumundeki elementleri locate edin
        4- Category bolumunde 3 element oldugunu test edin
        5- Category isimlerini yazdirin
        6- Sayfayi kapatin

         */
        driver.get("https://www.automationexercise.com/");
        WebElement women = driver.findElement(By.xpath("(//a[@data-toggle='collapse'])[1]"));
        WebElement men = driver.findElement(By.xpath("(//a[@data-toggle='collapse'])[2]"));
        WebElement kids = driver.findElement(By.xpath("(//a[@data-toggle='collapse'])[3]"));
        WebElement ucElement = driver.findElement(By.xpath("//a[@data-toggle='collapse']"));
        int catogarysize = 1;
        List<WebElement> catogoryElemenleri = driver.findElements(By.id("accordian"));
        for (WebElement eachCatagory : catogoryElemenleri) {
            System.out.println(eachCatagory.getText());
            Assert.assertEquals(catogoryElemenleri.size(), catogarysize);
            driver.close();
        }
    }
        @Test
        public void test06(){

         //   1- https://www.amazon.com/ sayfasına gidin.
              driver.get("https://www.amazon.com/");

         //   2- Arama kutusuna “city bike” yazip aratin
              WebElement aramaKutuusu=driver.findElement(By.id("twotabsearchtextbox"));
              aramaKutuusu.sendKeys("city bike"+ Keys.ENTER);

         //   3- Görüntülenen sonuçların sayısını yazdırın
              WebElement sonucSayisi= driver.findElement(By.xpath("//span[text()='1-16 of 153 results for']"));
              System.out.println("SONUC : " + sonucSayisi.getText());

            //   4- Listeden ilk urunun resmine tıklayın.
            WebElement ilkUrun= driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
            ilkUrun.click();
            driver.close();
        }

    @Test
    public void test07(){




    }





    }








