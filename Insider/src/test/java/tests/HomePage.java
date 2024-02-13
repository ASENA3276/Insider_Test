package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {


    public boolean goToHomePage;
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }



    public void goToHomePage(String url) {   // Ana sayfa url gitmek icin olusturulmus method
        driver.get(url);
    }



     public Boolean  VerifyHomePage(){

        return driver.findElement(By.linkText("Company")).isDisplayed();  // Ana sayfada Company elementi görünüyor mu test etmek için olusturulan method.
     }






   @Test    // yanlislikla koyulmus olabilir mi? @Test notasyonlari sadece test siniflarinde bulunmaz mi

    public void goToCareersPage() {

        WebElement companyMenu = driver.findElement(By.linkText("Company"));  // Ana sayfadaki company tiklayince gelen acilir menü element tanimlamasi.
        companyMenu.click();                                                  //acilir menüye tikla.
        WebElement careerLink = driver.findElement(By.linkText("Careers")); // Company tikladiktan sonra acilir menüdeki careers elementini bulma.
        careerLink.click();                                                 // bulunan careers elementine tıklama.
    }



    public Boolean  VerifyCareersPage(){

        return driver.findElement(By.linkText("Find your dream job")).isDisplayed(); // Careers sayfasinda olduğumuzu Find your Job elentinin görünür olmasi ile dogrulamak icin yazılan method.
    }




}
