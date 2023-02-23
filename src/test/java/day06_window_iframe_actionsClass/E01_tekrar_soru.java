package day06_window_iframe_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class E01_tekrar_soru extends TestBase {
@Test
    public void test01(){
    //2- https://the-internet.herokuapp.com/basic_auth sayfasina gidin
    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    bekle(3);


    //3- asagidaki yontem ve test datalarini kullanarak authentication’i yapin
    //
    //  Html komutu : https://username:password@URL
    //  Username     : admin
    //  password      : admin
    //
    //4- Basarili sekilde sayfaya girildigini dogrulayin
    String actualGiris= driver.findElement(By.tagName("p")).getText();
    String expectedIcerik="Congratulations!";
    Assert.assertTrue(actualGiris.contains(expectedIcerik));
}

}
