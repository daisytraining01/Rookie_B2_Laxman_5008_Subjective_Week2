package individualactivity1;

import java.io.File;
import java.util.List;

 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

 

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;

public class Registration_1 {
	@Before
    public void beforeScenario(){
        System.setProperty("webdriver.chrome.driver",
                "./src/main/resources/chromedriver.exe");

 

        driver = new ChromeDriver();
    } 
    WebDriver driver;
    @Given("^User in the registration form$")
    public void open_guru99() throws Throwable {
        driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");

 

        System.out.println("Registration page of the application is opened.");
    }
    @When("^User enters required data$")
    public void enter_valid_data(DataTable table) throws Throwable {
        List<List<String>> data=table.raw();
        driver.findElement(By.name("firstName")).sendKeys(data.get(1).get(1));
        Thread.sleep(2000);
        driver.findElement(By.name("lastName")).sendKeys(data.get(2).get(1));
        Thread.sleep(2000);
        driver.findElement(By.name("phone")).sendKeys(data.get(3).get(1));
        Thread.sleep(2000);
        driver.findElement(By.id("userName")).sendKeys(data.get(4).get(1));
        Thread.sleep(2000);
        driver.findElement(By.name("address1")).sendKeys(data.get(5).get(1));
        Thread.sleep(2000);
        driver.findElement(By.name("city")).sendKeys(data.get(6).get(1));
        Thread.sleep(2000);
        driver.findElement(By.name("state")).sendKeys(data.get(7).get(1));
        Thread.sleep(2000);
        driver.findElement(By.name("postalCode")).sendKeys(data.get(8).get(1));
        Thread.sleep(2000);
        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText(data.get(9).get(1));
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys(data.get(6).get(1));
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys(data.get(7).get(1));
        Thread.sleep(2000);
        driver.findElement(By.name("confirmPassword")).sendKeys(data.get(8).get(1));
        Thread.sleep(2000);
        System.out.println("List of Countries..");
        String getValues = driver.findElement(By.name("country")).getText();
        System.out.println(getValues);

        driver.findElement(By.name("submit")).click();
        System.out.println("data entered in the application");
        
    }
    @Then("^Registration should be success$")
    public void successful_login() throws Throwable {
        driver.getTitle().contains("Title");
        System.out.println("Matching the title of the page after successful Registration.");
        System.out.println("Successful Registration");
            TakesScreenshot ts =((TakesScreenshot)driver);
            File Src=ts.getScreenshotAs(OutputType.FILE);
            File Desti=new File("./target/ScreenShots/Regsuccess.png");
            FileUtils.copyFile(Src, Desti);
    }
    @After
    public void Close_the_browser() throws Throwable {
       driver.quit();
        System.out.println("Closes the browser opened through selenium");
       }    
    }
	
