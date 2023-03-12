package EXERCISE;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class soru01_Exercise  {

    /*
            1) Bir class oluşturun: YoutubeAssertions
            2) https://www.youtube.com adresine gidin
            3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
            ○ titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
            ○ imageTest   => YouTube resminin görüntülendiğini (isDisplayed()) test edin
            ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
            ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin

     */
    static WebDriver driver;
    @BeforeClass
    public static void setup(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://www.youtube.com adresine gidin

    }
    @AfterClass
    public static void treadown(){
      //  driver.quit();
    }
    @Test
    public void Test01(){
        driver.get("https://www.youtube.com");
     //  ○ titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
     String expectedTitle2="YouTube";
     String actualTitle2= driver.getTitle();
     Assert.assertEquals(expectedTitle2,actualTitle2);

    }
    @Test
    public void Test02(){
     // ○ imageTest   => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        WebElement imajdisplay= driver.findElement(By.xpath(" //*[@id=\"logo-icon\"]"));
        Assert.assertTrue(imajdisplay.isDisplayed());

    }
    @Test
    public void Test03(){
     // ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
     WebElement searchBox= driver.findElement(By.xpath("//input[@id='search']"));
     // WebElement logoElement= driver.findElement(By.xpath("//input[@id='search']"));
     Assert.assertTrue( searchBox.isEnabled());
    }
    @Test
    public void Test04(){
    //  ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        String unexpectedTitle="youtube";
        String actualTitle2= driver.getTitle();
        Assert.assertNotEquals(unexpectedTitle,actualTitle2);


    }
}
