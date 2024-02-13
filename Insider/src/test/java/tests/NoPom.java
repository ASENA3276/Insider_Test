package tests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.Test;
public class NoPom {

//    WebDriver driver;
//    HomePage homePage;
//    CareersPage careersPage;
//    QaJobsPage qaJobsPage;

    public NoPom(){
//        System.setProperty("webdriver.chrome.driver", "D:\\selch\\chromedriver_win32\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        driver= new ChromeDriver(options);
//        homePage = new HomePage(driver);
//        careersPage = new CareersPage(driver);
//        qaJobsPage = new QaJobsPage(driver);
    }






    public static void main(String[] args) {
        TestCs cs =new TestCs();
        cs.TestHomePage();
        cs.TestCareerPage();
        cs.TestQaJobsList();
    }





//
//    @Test
//    public void TestHomePage()
//    {
//        homePage.goToHomePage("https://useinsider.com/");
//        Assertions.assertTrue(homePage.VerifyHomePage(),"Error: HomePage page not loaded.");
//        homePage.goToCareersPage();
//        Assertions.assertTrue(homePage.VerifyCareersPage(),"Error: Careers page not loaded.");
//    }
//    @Test
//    public void TestCareerPage()
//    {
//        careersPage.viewAllQaJobs();
//        Assertions.assertTrue(careersPage.verifyCareersPage(),"Error: Qa List page not loaded.");
//    }
//    @Test
//    public void TestQaJobsList()
//    {
//        qaJobsPage.filterJobs("Istanbul, Turkey", "Quality Assurance");
//        Assertions.assertTrue(qaJobsPage.verifyJobsList(), "Error: Jobs list not displayed.");
//        Assertions.assertTrue(qaJobsPage.verifyPositionsAndDepartment("Quality Assurance", "Quality Assurance"), "Error: Positions or department incorrect.");
//    }

}
