package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CareersPage {
    private WebDriver driver;


    public CareersPage(WebDriver driver) {
        this.driver = driver;
    }



    public boolean verifyCareersPage() {

        return driver.getTitle().contains("Careers"); // bu kısmı tam anlamadım sebebine TEKRAR BAKKKKK
    }





   @Test   // yanlislikla koyulmus olabilir mi? @Test notasyonlari sadece test siniflarinde bulunmaz mi SADECE METHOD OLARAK KALSA OLUR MU?

public void viewAllQaJobs() {                           //
        WebElement allQaJobsLink = driver.findElement(By.linkText("Find your dream job")); // link icindeki dogru mu ? Anladigim kadariyla bu kisimde Find your dream job kismina tiklanmiş ama See all QA jobs bölümüne tiklanmasi isteniyor diye anladim ben yanliş mi?
        allQaJobsLink.click(); // See al QA Job butonuna tıklama islemi olarak düzenlenmesi gerekebilir unutma!
    }






    public Boolean  VerifyQaJobsPage(){               // https://useinsider.com/careers/quality-assurance/ sayfasına gelinmis olundugunu Quality Assurence elemntinin görünür olması ile dogrulamak icin yapılmıs method.

        return driver.findElement(By.linkText("Quality Assurance")).isDisplayed();
    }





}
