package SORULAR;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

public class soru01 extends TestBase {

    // 1. Yeni bir class olusturun (TekrarTesti)
    // 2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
    //  doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
    //  3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
    //  doğru URL'yi yazdırın.
    // 4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
    // 5. Youtube sayfasina geri donun
    // 6. Sayfayi yenileyin
    //7. Amazon sayfasina donun
    // 8. Sayfayi tamsayfa yapin
    // 9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
    //Yoksa doğru başlığı(Actual Title) yazdırın.
    //   10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse
    //doğru URL'yi yazdırın
    //   11.Sayfayi kapatin



    @Test
    public void test01() {
        driver.get("https://www.youtube.com");
        bekle(5);
        String expectedTitle="YouTube";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        String expectedUrl="https://www.youtube.com";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));

        driver.get("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();
    }
}
