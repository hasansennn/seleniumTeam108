package EXERCISE;

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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C001_Hasan {

     WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        driver= new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void thearDown(){
      //  driver.quit();
    }
    @Test
    public void test01(){
        driver.get("https://www.hepsiburada.com");
        //cookisi kabul edin ardından arama kutusuna "Akıllı Telefon"yazdirin
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        WebElement aramaKutusu = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        aramaKutusu.sendKeys("Akıllı Telefon"+ Keys.ENTER);
        //arama sonuclarinin sonucunu yazdirin
        String aramaSonuc= driver.findElement(By.xpath("//div[@class='searchResultSummaryBar-CbyZhv5896ASVcYBLKmx']")).getText();
        System.out.println(aramaSonuc);
        // arama sonucunun 2269 oldugunu test edin
        String expectedSonuc="2669";
        Assert.assertTrue(aramaSonuc.contains(expectedSonuc));
        /*
         //  Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45 oldugunu test edin
        WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select = new Select(ddm);
        int actualOptionSayisi = select.getOptions().size();
        int expectedOptionSayisi=44;
        Assert.assertEquals(expectedOptionSayisi,actualOptionSayisi);
         */
        WebElement elektronikTest= driver.findElement(By.tagName("Elektronik"));
       Select select=new Select(elektronikTest);
       // WebElement bilTab= driver.findElement(By.xpath("//body[@class='desktop    voltran-container   sf-moria complete']"));
       // select.selectByVisibleText("Bilgisayar/Tablet");


         List<WebElement> optionElementListesi= select.getOptions();
        System.out.println("======");
        for (WebElement eachelement: optionElementListesi
        ) {
            System.out.println(eachelement.getText());
        }





    }

}
