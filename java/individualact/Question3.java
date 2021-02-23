package individualact;

import java.io.File;
import java.util.List;

 

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 

 

public class Question3 {
    
    public static void main (String[] args) {
        
        File file = new File("drivers/chromedriver_new.exe");
        String filePath = file.getAbsolutePath();
        System.out.println(filePath);
        
        
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        WebDriver driver =  new ChromeDriver(chromeOptions);
        driver.navigate().to("https://cosmocode.io/automation-practice-webtable/");
        
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='countries']")));
        driver.findElement(By.xpath("//table/tbody/tr[1]/td"));
        driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
        
        List<WebElement> lstRowWebelements = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
        List<WebElement> lstColWebelements = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td"));
        
        int rowCount = lstRowWebelements.size();
        int colCount = lstColWebelements.size();
        int row = 0; 
        int col=0;
       
        for(row = 0;row<rowCount;row++) {
            for(col=0; col<colCount;col++) {
               
                System.out.println(driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+(row+1)+"]/td["+(col+1)+"]")).getText());
              
            }
     
        }
          
        driver.quit();
    }
}