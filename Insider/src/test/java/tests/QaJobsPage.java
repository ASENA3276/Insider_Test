package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class QaJobsPage {
    private WebDriver driver;


   public QaJobsPage(WebDriver driver) {

       this.driver = driver;
    }





    public void filterJobs(String location, String department) {

        Select locationFilter = new Select(driver.findElement(By.xpath("//select[@name='locations']")));  // burda sorun var kontrol et !!!!
        locationFilter.selectByVisibleText(location);  // tam anlamadım bak locasyon secimi yapılıyor ama selectByVisibleText tanımlanması gereken bir sey mi yoksa kalıp mı ?

        Select departmentFilter = new Select(driver.findElement(By.xpath("//select[@name='departments']")));
        departmentFilter.selectByVisibleText(department);

    }


    public boolean verifyJobsList() {

       return driver.findElement(By.className("jobs-list")).isDisplayed(); // is listesinin görünür olup olmadigini kontrol etmek icin method.
    }



    public boolean verifyPositionsAndDepartment(String expectedPosition, String expectedDepartment) {


        List<WebElement> positions = driver.findElements(By.className("job-title"));

        for (WebElement position : positions) {

            if (!position.getText().contains(expectedPosition)) {
                return false;
            }
        }



        WebElement selectedDepartment = driver.findElement(By.className("selected-department"));   //  selectedDepartment  Element tanımlama Locator alma
        WebElement selectedLocation = driver.findElement(By.className("selected-location"));        // selectedLocation    Element tanımlama Locator alma

        return selectedDepartment.getText().contains(expectedDepartment) && selectedLocation.getText().contains("Istanbul, Turkey");  // Bu kismi anlamadim. Konum ve departman girmek icin ama neden bu sekilde.
    }
}
