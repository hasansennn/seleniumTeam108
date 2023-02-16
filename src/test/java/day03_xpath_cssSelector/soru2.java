package day03_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class soru2 {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.hepsiburada.com");
    WebElement aramaKutusu= driver.findElement(By.xpath("//*[@id=\"SearchBoxOld_89b8da2f-a29f-406d-1044-67ba0548afc6\"]/div/div/div[1]/div[2]/input"));
    driver.quit();

    /*
   1- Selenium browser lari otomate edecek too larin calisabilecegi bir suit dir Kendi
    sitesin 'Selenium browser lari otomasyonla calistirir thats it,bu gucle ne yapacagınız size kalmis

   2-  Selenium bu otomasyonu Webdriver sayesinde yapar. Webdriver herhangi bir browserin ozelliklerini
    tasir, bunun icin oncelikle hangi browser ile calismak istiyorsak onun objesini yuklemeliyiz

   3- Bu islem sayesinde Webdriver istenen browser in ozelliklerini sahip kopya bir browser olusturur
    Bu kopya browser ile istedigimiz islemleri yapar.

   4- Maven ise build tooll dur.Selenium ile browserleri otomasyon yaparken Selenium kutuphanesi
    ve ihtiyacimiz olan baska kutuphaneleri projemize eklememiz gerekir.

  5- Kutuphaneleri projemize yüklemek onlari update guncel tutmak ve ihtiyacimiz oldugunda degistirmek
    jar dosyalari ile cok zor olur.
    Maven projelerin build ve maintenance asamasinda islemlerini ustlenmistir.

   6- Mavenin diger bir amacida sonradan inceleyen bir collabrator in projemiizi daha rahat bir sekilde
    anlamisini saglamaktir.

   7- POM excemel projemizin kalbi hersey ordan yonetilir. Hangi tool kullanacaksak buraya ekliyoruz,
    Kutuphaleri buraya  ekliyoruz


     */

    }
}
