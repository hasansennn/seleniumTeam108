package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.T;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Q09_exercise_Amazon extends TestBase {

  static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Test
    public void test01() throws IOException {
      //  1- amazon anasayfaya gidin
        driver.get("http://www.amazon.com");
     //   2- amazon anasayfaya gittiginizi test edin ve tum sayfanin goruntusunu kaydedin
      // WebElement aramaKutusu=  driver.findElement(By.id("twotabsearchtextbox"));
       // Assert.assertTrue(aramaKutusu.isDisplayed());
      // WebElement Icerik=driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-progressive-attribute']"));
       String expectedIcerik="Amazon";
       String actualIcerik=driver.getTitle();
       Assert.assertTrue(actualIcerik.contains(expectedIcerik));
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("path/to/screenshot.png"));

     //   3- Nutella icin arama yapin
        WebElement aramaKutusu=  driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
      //  4- sonucun Nutella icerdigini test edin ve ilk urunun goruntusunu alin
        String expectedSonuc="Nutella";
        String actualSonuc=driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
        Assert.assertTrue(actualSonuc.contains(expectedSonuc));
    }
    @Test
    public void test02() throws IOException {
        //1- google anasayfaya gidin
        driver.get("http://www.google.com");
      //  2- google anasayfaya gittiginizi test edin ve tum sayfanin goruntusunu kaydedin
        String expectedTitle="Google";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
        /*
        // Ekran görüntüsü alın
    File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    // Ekran görüntüsünü kaydedin
    FileUtils.copyFile(screenshot, new File("path/to/screenshot.png"));
         */

        // ve rapora eklenmek icin tum sayfanin fotografini cekin
        // Tum sayfa screenshot icin
        // 1- TakeScreenshot objesi olustur
        TakesScreenshot ts = (TakesScreenshot) driver;
        File tumSayfaSs = new File("target/screenshot.png");
        // 3- gecici bir dosya olusturup ts objesi ile cekilen fotografi dosyaya kaydediyoruz
        File geciciResim= ts.getScreenshotAs(OutputType.FILE);
        // 4- gecici dosyayi, tumSayfaSs dosyasina kopyalayalim
        FileUtils.copyFile(geciciResim,tumSayfaSs);
      bekle(2);
    }

    @After
    public void thearDown(){
       // driver.quit();
    }

}
