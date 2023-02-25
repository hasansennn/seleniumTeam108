package day08_explivtilyWait_cookies_webTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

import java.time.Duration;
import java.util.List;

public class soru4_yansıSoru {

    /*
    1. Yeni bir package olusturalim : day01
    2. Yeni bir class olusturalim : C03_GetMethods
    3. trendyol sayfasina gidelim. https://www.trendyol.com/
    4. Sayfa basligini(title) yazdirin
    5. Sayfa basliginin “trendyol” icerdigini test edin
    6. Sayfa adresini(url) yazdirin
    7. Sayfa url’inin “trendyol” icerdigini test edin.
    8. Sayfa handle degerini yazdirin
    9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
    10. Sayfayi kapatin.
     */
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void teardown() {
        // driver.close();

    }


    @Test

    public void Test01() {
        // 1 - "https://www.trendyol.com" sayfasina gidelim ve kabul et butonuna basalim
        driver.get("https://www.trendyol.com");
        WebElement kabulEt = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        kabulEt.click();
        System.out.println("*************//*****************");

        // 2 - logoTest => trendyol logosunun görüntülendigini test edin
        WebElement titleBaslik = driver.findElement(By.xpath(" //*[@id='logo']"));
        Assert.assertTrue(titleBaslik.isDisplayed());


        // 3 - trendyol arama butonunu locate edip,click yapip ardindan 'Akıllı Telefon' yazdirin
        WebElement aramaButonu = driver.findElement(By.xpath("//input[@data-testid='suggestion']"));
        aramaButonu.click();
        aramaButonu.sendKeys("Akıllı Telefon" + Keys.ENTER);
        System.out.println("*************//*****************");


        // 4 - Bulunan sonuc sayisini yazdiralim
        System.out.println(driver.findElement(By.xpath("//div[@class='dscrptn']")).getText());
        System.out.println("*************//*****************");


        // 5 - Sayfa url’inin “trendyol” icerdigini test edin.
        String expectedUrl = "trendyol";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));


        // 6- Ilk urunu tiklayin
        driver.findElement(By.xpath("(//span[@class='prdct-desc-cntnr-name hasRatings'])[1]")).click();

        //7- Sayfadaki tum basliklari yazdiralim
        //   soldaki aramayi daraltabilecegimiz basliklar
        System.out.println("*************//*****************");
        driver.navigate().back();
        List<WebElement> tumBasliklarElementi = driver.findElements(By.xpath("// a[@class='category-header']"));
        int basliklar = 1;
        for (WebElement foreach : tumBasliklarElementi
        ) {
            System.out.println(basliklar + "--" + foreach.getText());
            basliklar++;


        }
    }
}

