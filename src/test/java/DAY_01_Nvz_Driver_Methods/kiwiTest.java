package DAY_01_Nvz_Driver_Methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class kiwiTest {
    WebDriver driver;

    // https://www.kiwi.com sayfasina gidin
    // Cookies i reddedin
    // Sag ust kisimdan dil ve para birimi secenegini Turkiye ve TL olarak secin
    // Sectiginiz dil ve para birimini dogrulayin
    // Ucus secenegi olarak tek yon secelim
    // Kalkis ve varis boxlarini temizleyerek kalkis ve varis ulkesini kendimiz belirleyelim
    // Gidis tarihi kismina erisim saglayarak gidecegimiz gunu secelim ve booking i iptal edelim
    // Sadece aktarmasiz ucuslar olarak filtreleme yapalim ve en ucuz secenegine tiklayalim
    // Filtreleme yaptigimiz en ucuz ucusun fiyatini getirerek 5000 tl den kucuk oldgunu dogurlayalim

    @Before
    public void setUP(){
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        // ilgili kurulumlari tamamlayalim
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void testKiwi() throws InterruptedException {
        // https://www.kiwi.com sayfasina gidin
        driver.get("https://www.kiwi.com");
        driver.findElement(By.xpath("(//div[@class='ButtonPrimitiveContent__StyledButtonPrimitiveContent-sc-1nfggrh-0 iFkUjC'])[1]")).click();

        // Sag ust kisimdan dil ve para birimi secenegini Turkiye ve TL olarak secin
        // Sectiginiz dil ve para birimini dogrulayin
        driver.findElement(By.xpath("(//div[@class='CountryFlag__StyledShadow-sc-m27t9u-2 jjikbK'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='ButtonPrimitiveContent__StyledButtonPrimitiveContent-sc-1nfggrh-0 iFkUjC'])[23]")).click();


        // Ucus secenegi olarak tek yon secelim
        WebElement tekYon= driver.findElement(By.xpath("(//div[@class='ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-mra4yy-0 dkQFNd'])[10]"));
        tekYon.click();

       // Select select=new Select(tekYon);





    }

    @After
    public void tearDown(){
        //driver.close();
    }
}