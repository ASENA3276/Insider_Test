package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.Assertions;

public class TestCs {
    WebDriver driver;
    HomePage homePage;
    CareersPage careersPage;
    QaJobsPage qaJobsPage;

     public TestCs()
     {
         WebDriverManager.chromedriver().setup();  // asagıdaki kod satırı yerine bunu yazdım konumda sıkıntı oldugu ve cözemedigim icin fark eder mi bunu kullanabilir miyim.
         //System.setProperty("webdriver.chrome.driver", "C:\Program Files\Google\Chrome\Application\chrome.exe");
         ChromeOptions options = new ChromeOptions();
         driver= new ChromeDriver(options);
         homePage = new HomePage(driver);
         careersPage = new CareersPage(driver);
         qaJobsPage = new QaJobsPage(driver);
     }

    @Test
    public void TestHomePage()
    {
        homePage.goToHomePage("https://useinsider.com/");
        Assertions.assertTrue(homePage.VerifyHomePage(),"Error: HomePage page not loaded.");   // Ana sayfada Company elementi görünüyor mu test etmek için olusturulan method. özet olarak ana sayfanın acıldıgının kanıtı.
        homePage.goToCareersPage();
        Assertions.assertTrue(homePage.VerifyCareersPage(),"Error: Careers page not loaded.");  // Careers sayfasinda oldugumuzu dogrulamak icin yazıllan Assert
        driver.quit();  // driver kapatma islemi
    }




    @Test
    public void TestCareerPage()
    {
        careersPage.viewAllQaJobs();
        Assertions.assertTrue(careersPage.verifyCareersPage(),"Error: Qa List page not loaded."); // Careers sayfasinda olduğumuzu  dogrulamak icin yazılan method.  TEKRAR BAKKKK
    }





    // bu kısımdan önce https://useinsider.com/careers/quality-assurance/ sayfasına gitmemiz gerekmez miydi daha sonra o sayfada olup olmadigimizi kontrol edip devam etmek.



    @Test
    public void TestQaJobsList()   { // Tüm QA islerini gormek icin tıklama ve filtreleme islemleri icin olusturulan test adimi


        qaJobsPage.filterJobs("Istanbul, Turkey", "Quality Assurance");   // locasyon ve departman kısımları verilmesi icin yapilmis degerler filterjobs methodundan alınmıs sorun var kontrol et!
        Assertions.assertTrue(qaJobsPage.verifyJobsList(), "Error: Jobs list not displayed.");  // Job list görünürlügünü dogrulamak icin yazilan Assert
        Assertions.assertTrue(qaJobsPage.verifyPositionsAndDepartment("Quality Assurance", "Quality Assurance"), "Error: Positions or department incorrect."); // dogrulama icin ama burda bekelenen deger ve istenen deger yani expected mi kullanılmasi gerekirdi acaba
    }












}
