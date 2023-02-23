package day06_window_iframe_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class E04_tekrar_soru extends TestBase {
    String ikinciUrunTitle;
    String urunTitle;
    @Test
    public void test01(){
        //1- amazon gidin
        driver.get("https://www.amazon.com");
        //2- Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
        WebElement allTusu=driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(allTusu);
        List<WebElement> list=select.getOptions();
        for (WebElement each:list) {
            System.out.println(each.getText());
        }
        //3- dropdown menude 40 eleman olduğunu doğrulayın
        int selectSayisi=select.getOptions().size();
        int expectedSayi=40;
        Assert.assertEquals(expectedSayi,selectSayisi);
    }
    @Test
    public void test02(){
        //1- dropdown menuden elektronik bölümü seçin
        WebElement allTusu=driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(allTusu);
        select.selectByVisibleText("Electronics");
        //2- arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone"+ Keys.ENTER);
        WebElement sonuc=driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        String sonucSayisi=sonuc.getText();
        String[] sonucArr=sonucSayisi.split(" ");
        String deger=sonucArr[3];
        deger=deger.replaceAll("\\D","");
        int sayi=Integer.parseInt(deger);
        System.out.println(sayi);
        //3- sonuc sayisi bildiren yazinin iphone icerdigini test edin
        Assert.assertTrue(sonuc.getText().contains("iphone"));
        //4- ikinci ürüne relative locater kullanarak tıklayin
        WebElement ilkUrun=driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        WebElement ikinciUrun=driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(ilkUrun));
        ikinciUrun.click();
        //5- ürünün title'ni ve fiyatını variable’a assign edip ürünü sepete ekleyelim
        ikinciUrunTitle=driver.getTitle();
        String ikinciUrunFiyat=driver.findElement(By.xpath("(//span[@class='a-offscreen'])[1]")).getText();
        WebElement sepetEkleme=driver.findElement(By.xpath("(//input[@title='Add to Shopping Cart'])[1]"));
        sepetEkleme.click();
        WebElement sepetTest= driver.findElement(By.xpath("(//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold'])[1]"));
        Assert.assertTrue(sepetTest.isDisplayed());
    }
    @Test
    public void test03(){
        String ilkWHD= driver.getWindowHandle();
        String ikinci="";
        //1- yeni bir sekme açarak amazon anasayfaya gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");
        //2-dropdown’dan bebek bölümüne secin
        WebElement allTusu=driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(allTusu);
        select.selectByVisibleText("Baby");
        //3-bebek puset aratıp bulundan sonuç sayısını yazdırın
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("bebek puset"+Keys.ENTER);
        //4-sonuç yazsının puset içerdiğini test edin
        String actualSonucYazisi=driver.findElement(By.xpath("//*[text()='1-16 of 34 results for']")).getText();
        String expectedSonucYazisi="puset";
        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucYazisi));
        //5-üçüncü ürüne relative locater kullanarak tıklayin
        WebElement ustUrun= driver.findElement(By.xpath("//*[text()='FridaBaby Baby Nasal Aspirator NoseFrida the Snotsucker by Frida Baby']"));
        WebElement altUrun= driver.findElement(RelativeLocator.with(By.tagName("span")).below(ustUrun));
        altUrun.click();
        //6-title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin
        urunTitle=driver.getTitle();
        String urunFiyat=driver.findElement(By.xpath("(//span[@class='a-offscreen'])[1]")).getText();
        driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
    }
    @Test
    public void test04(){
        //1-sepetteki ürünlerle eklediğimiz ürünlerin aynı olduğunu isim ve fiyat olarak doğrulayın
        driver.findElement(By.xpath("(//span[@aria-hidden='true'])[1]")).click();
        String besinciUrun=driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[5]")).getText();
        String altinciUrun=driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[6]")).getText();
        Assert.assertTrue(urunTitle.contains(altinciUrun));
        Assert.assertTrue(ikinciUrunTitle.contains(besinciUrun));
    }
}
