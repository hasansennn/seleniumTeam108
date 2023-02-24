package day08_explivtilyWait_cookies_webTables;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import utilities.TestBassClass;

public class soru3AyseHoca extends TestBase{

 /*..........Exercise1............
        BeforeClass ile driver'i olusturun ve class icinde static yapin
        Maximize edin ve 10 sn bekletin
        http://www.google.com adresine gidin
        arama kutusuna "The Lord of the Rings" yazip, cikan sonuc sayisini yazdirin
        arama kutusuna "Brave Heart" yazip, cikan sonuc sayisini yazdirin
        arama kutusuna "Harry Potter" yazip, cikan sonuc sayisini yazdirin
        AfterClass ile kapatin.

         */




    @Test
    public  void Test01(){
       driver.get("https://www.google.com");

      WebElement searcBox= driver.findElement(By.xpath("//input[@class='gLFyf']"));
       searcBox.sendKeys("The Lord of the Rings" + Keys.ENTER);
      WebElement sonuc1= driver.findElement(By.id("result-stats"));
        System.out.println(sonuc1.getText());
    }


    @Test
    public void Test02(){

        WebElement searcBox= driver.findElement(By.xpath("//input[@class='gLFyf']"));
        searcBox.sendKeys("Brave Heart" + Keys.ENTER);
        WebElement sonuc2= driver.findElement(By.id("result-stats"));
        System.out.println(sonuc2.getText());

    }

    @Test
    public  void Test03(){

        WebElement searcBox= driver.findElement(By.xpath("//input[@class='gLFyf']"));
         searcBox.sendKeys( "Harry Potter" + Keys.ENTER);
        WebElement sonuc3= driver.findElement(By.id("result-stats"));
        System.out.println(sonuc3.getText());

    }
}
