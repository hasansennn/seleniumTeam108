package day09_excell_screenshot_jsExecutor;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcell {


    @Test
    public void Test01() throws IOException {

        /*
        Biz kodlarimizla bilgisayardaki bir dosyaya direkt erisim saglayip
        anlik o dosyadan bilgi almaliyiz


        Bunun yerine classin basinda bilgisay arimizdaki excel dosyanin
        1- Bir kopyasini olusturur
        2- excel deki tum bilgileri kopya workbook a yukler
        3- workbook uzerinde yapacagimiz tum islemleri yapariz
        4- eger olusturdugumuz workbook da update yaparsak
           son halini excele islemek icin
           class in sonunda kopya workbook daki bilgileri excel e kaydederiz
         */

        // 1-  Bilgisayardaki excell'e ulasabilmek icin dosyaYolu gerekir
        String dosyoYolu ="src/test/java/day09_excell_screenshot_jsExecutor/ulkeler.xlsx";  // 1

        // 2- Dosya yolunu olusturdugumuz excell'den bilgileri almak icin
        // FileInputStream objesi olusturmaliyiz
        FileInputStream fis=new FileInputStream(dosyoYolu);   //    2

       // FileInputStream fis1=new FileInputStream(dosyoYolu);

        // 3- Bilgireni aldigimiz excel'de calisma yapabilmek icin
        // kod ortamimizda kopya bir workbook olusturmaliyiz
        Workbook workbook= WorkbookFactory.create(fis);

        // Bilgisayariminzdaki excel in icinde bulunan tum bilgiler
        // ortak workbook objesini kayitli
        // excell'in yapisi geregi istenen sayfa, istenen satir, istenen hucre
        // olusturmalidir / okunmalidir


        // 12. satirin, 3.hucresinin "Azerbaycan" oldugunu test edin
        Sheet sayfa1=workbook.getSheet("Sayfa1");
        Row row=sayfa1.getRow(11);
        Cell cell=row.getCell(2);
        System.out.println(cell);

        String expectedData="Azerbaycan";
        String actualData=cell.toString();

        Assert.assertEquals(expectedData,actualData);

    }
}
