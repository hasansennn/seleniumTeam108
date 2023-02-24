package day08_explivtilyWait_cookies_webTables;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class C06_WebTables extends TestBase {

    @Test
    public void test01() {

        //   1. “https://demoqa.com/webtables” sayfasina gidin
        Actions actions = new Actions(driver);
        driver.get("https://demoqa.com/webtables");
        System.out.println("=============*========================");
        //    2. Headers da bulunan basliklari yazdirin
        WebElement headers = driver.findElement(By.xpath("(//div[@class='rt-resizable-header-content'])[1]"));
        headers.click();

        List<WebElement> headersBaslik =
                driver.findElements(By.xpath("(//div[@class='rt-resizable-header-content'])"));

        int satirBaslikNo = 1;
        for (WebElement eachBasliklar : headersBaslik
        ) {
            System.out.println(satirBaslikNo + "- " + eachBasliklar.getText());
            satirBaslikNo++;
        }
            // String expentedHeaders="First Name";
            // String actualsHeaders=headers.getText();
            // Assert.assertEquals(expentedHeaders,actualsHeaders);
            //       (//div[@class="rt-resizable-header-content"])[1]
        System.out.println("=============*========================");
            //    3. 3.sutunun basligini yazdirin

            WebElement ucuncuSutun= driver.findElement(By.xpath("(//div[@class='rt-resizable-header-content'])[3]"));
            System.out.println("ucuncu sutun basligi :" + ucuncuSutun.getText());

        System.out.println("=============*========================");

            //   4. Tablodaki tum datalari yazdirin
            List<WebElement>tumData=driver.findElements(By.xpath("//div[@class='rt-table']"));
            // List<WebElement> tumBodyElementleri=driver.findElements(By.xpath("//div[@class='rt-tr-group']//div[@class='rt-td']"))
        int siraNo=1;
        for (WebElement each:tumData) {
            System.out.println(siraNo+"-->"+each.getText());
            siraNo++;
        }
        System.out.println(tumData.size());

            //    5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
            //    6. Tablodaki satir sayisini yazdirin
            //    7. Tablodaki sutun sayisini yazdirin
            //    8. Tablodaki 3.kolonu yazdirin
            //    9. Tabloda “First Name” i Kierra olan kisinin Salary’sini yazdirin
            //   10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin


    }
}
