package day09_excell_screenshot_jsExecutor;

import org.apache.commons.collections4.Get;
import org.apache.commons.io.input.ReaderInputStream;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_tekrar {

    @Test
            public void test01() throws IOException {


    // 1-  Bilgisayardaki excell'e ulasabilmek icin dosyaYolu gerekir
       String dosyaYolu="src/test/java/day09_excell_screenshot_jsExecutor/ulkeler.xlsx";

    // 2- Dosya yolunu olusturdugumuz excell'den bilgileri almak icin
    // FileInputStream objesi olusturmaliyiz
         FileInputStream fis=new FileInputStream(dosyaYolu);


    // 3- Bilgireni aldigimiz excel'de calisma yapabilmek icin
    // kod ortamimizda kopya bir workbook olusturmaliyiz
        Workbook workbook=WorkbookFactory.create(fis);

    // Bilgisayariminzdaki excel in icinde bulunan tum bilgiler
    // ortak workbook objesini kayitli
    // excell'in yapisi geregi istenen sayfa, istenen satir, istenen hucre
    // olusturmalidir / okunmalidir


    // 12. satirin, 3.hucresinin "Azerbaycan" oldugunu test edin
     Sheet sayfa1=workbook.getSheet("Sayfa1");
     Row row= sayfa1.getRow(11);
     Cell cell= row.getCell(2);
     System.out.println(cell);

     String actualTest="Azerbaycan";
     String expectedTest=cell.toString();
     Assert.assertEquals(actualTest,expectedTest);

}
}