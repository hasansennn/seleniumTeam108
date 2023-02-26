package SORULAR;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class soru01 extends TestBase {

   /*
    1- Bir test class’i olusturun ilgili ayarlari yapin
    2- https://www.amazon.com adresine gidin
    3- amazon arama kutusunu locate edin
    4- arama kutusuna “Nutella” yazdirin
    5- arama islemini yapabilmek icin ENTER tusuna basin
    */


    @Test
    public void test01() {


        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        bekle(3);
        driver.quit();
    }

    @Test
    public void test02() {


        //1- Bir test class’i olusturun ilgili ayarlari yapin
        // 2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkSayisi = driver.findElements(By.tagName("a"));
        int expectedlink = 147;
        int actuallink = linkSayisi.size();
        Assert.assertEquals(expectedlink, actuallink);
        System.out.println(linkSayisi.size());//147
        // 4- Products linkine tiklayin
        WebElement produçtsLink = driver.findElement(By.xpath("//i[@class='material-icons card_travel']"));
        produçtsLink.click();

        // 5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferElementi = driver.findElement(By.id("sale_image"));
        Assert.assertTrue(specialOfferElementi.isDisplayed());

        // 6- Sayfayi kapatin
        driver.close();

    }

    @Test
    public void test03() {

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin
        WebElement addElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        addElement.click();
        // 3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        Assert.assertTrue(deleteButton.isDisplayed());
        // 4- Delete tusuna basin
        deleteButton.click();

        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement removeElementi = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(removeElementi.isDisplayed());
        driver.close();
    }

    @Test
    public void test04() {

        // 1- bir class olusturun
        //  2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");

        // 3- Browseri tam sayfa yapin
        driver.manage().window().maximize();

        //  4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

        // 5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedTittle = "Spend less";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTittle));

        //  6- Gift Cards sekmesine basin
        WebElement giftCardsElementi = driver.findElement(By.xpath("(//*[@class='nav-a  '])[4]"));
        giftCardsElementi.click();

        // 7- Birthday butonuna basin
        WebElement birtdayButtonElementi =
                driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[ 29] "));
        birtdayButtonElementi.click();

        //  8- Best Seller bolumunden ilk urunu tiklayin
        WebElement bestSellerElementi = driver.findElement(By.xpath(" //*[@id=\"nav-subnav\"]/a[2]/span"));
        bestSellerElementi.click();
        WebElement ilkUrun = driver.findElement(By.xpath("(//div[@class='_cDEzb_p13n-sc-css-line-clamp-3_g3dy1'])[1]"));

        /// 9- Gift card details’den 25 $’i secin
        //  WebElement giftCardPay= driver.findElement(By.xpath("(//*[@class ='a-button-text'])[25]"));
        // giftCardPay.click();
        // 10-Urun ucretinin 25$ oldugunu test edin
        // int expectedUrunUcreti=25;
        // Assert.assertTrue(giftCardPay.equals(expectedUrunUcreti));
        // 11-Sayfayi kapatin
        driver.close();

    }

    @Test
    public void test05() {

        // 1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com");

        //  2- arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //  3- “Samsung headphones” ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones " + Keys.ENTER);

        //  4- Bulunan sonuc sayisini yazdiralim
        WebElement sonucSayisi =
                driver.findElement(By.xpath("   //*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        System.out.println("SONUC : " + sonucSayisi.getText());

        //  5- Ilk urunu tiklayalim
        WebElement IlkUrun =
                driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
        IlkUrun.click();
        //  6- Sayfadaki tum basliklari yazdiralim
        driver.navigate().back();
        List<WebElement> baslikElementleriListesi =
                driver.findElements(By.xpath("//a[@class='a-link-normal s-navigation-item']"));
        int baslikNo = 1;
        for (WebElement eachElement : baslikElementleriListesi
        ) {
            System.out.println(baslikNo + " --- " + eachElement.getText());
            baslikNo++;

            driver.close();

        }
    }
}






