package day02_webelements_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_implicitlyWait {
    public static void main(String[] args) {

      //  System.setProperty("Webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       /*
       Driver i bir web uygulamasina gonderdigimizde
       o sayfanin acilmasi, orada istedigimiz islemleri yapmasi ,elementleri bulmasi
       gibi islemler zaman gerektirebilir.


       ImplicitlyWait bu tur zaman isteyen islemle
       icin driver in max. ne kadar bekleyecegini belirler
        */
    }
}
