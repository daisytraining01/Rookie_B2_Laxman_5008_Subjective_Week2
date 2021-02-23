package individualactivity;


		import java.io.File;
		import java.io.IOException;
		import java.net.HttpURLConnection;
		import java.net.MalformedURLException;
		import java.net.URL;
		import java.util.Iterator;
		import java.util.List;
		
		 
		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		
		public class PrintLink_2 {

			public static void main(String[] args) {
				File file = new File("drivers/chromedriver_new.exe");
		        String filePath = file.getAbsolutePath();
		        System.out.println(filePath);
		        
		        
		        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		        
		        ChromeOptions chromeOptions = new ChromeOptions();
		        chromeOptions.addArguments("start-maximized");
		        WebDriver driver =  new ChromeDriver(chromeOptions);
		        String home="https://maveric-systems.com/";
		        driver.navigate().to(home);
		        String url = "";
		       
		        
		        List<WebElement> links = driver.findElements(By.tagName("a"));
		        
		        Iterator<WebElement> it = links.iterator();
		        
		        while(it.hasNext()){
		            
		            url = it.next().getAttribute("href");
		            
		            System.out.println(url);
		        
		           
		        }
		        
		        driver.quit();

		 

		    }
		}


