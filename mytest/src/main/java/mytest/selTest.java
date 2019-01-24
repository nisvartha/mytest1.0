package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class selTest {
	
	//This is my ttest checkin

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriver driver = null; 
			
//		   @Given("^I have open the browser$") 
		   
		   //		      driver = new FirefoxDriver();
		   driver = new ChromeDriver();
		   
		   System.setProperty("webdriver.gecko.driver", "/Users/vijaygovind/Downloads/Brave-Browser-VNI569.pkg");
		   //driver = WebDriver. 
		   driver.getCurrentUrl();
			//    System.setProperty("webdriver.gecko.driver", "/Users/vijaygovind/Downloads/Firefox 64.0.2.dmg");

			  // WebDriver driver=new FirefoxDriver();
			   
//			   driver.get("http://seleniumhq.com");
			  
			    String baseUrl = "http://demo.guru99.com/test/newtours/";
		        String expectedTitle = "Welcome: Mercury Tours";
		        String actualTitle = "";
		        
		        System.out.println("Add simple title"+expectedTitle);
		        
		        driver.get(baseUrl);

		        // get the actual value of the title
		        actualTitle = driver.getTitle();

		        /*
		         * compare the actual title of the page with the expected one and print
		         * the result as "Passed" or "Failed"
		         */
		        if (actualTitle.contentEquals(expectedTitle)){
		            System.out.println("Test Passed!");
		        } else {
		            System.out.println("Test Failed");
		        }
		        
//			   System.out.println("hello opened browser");
//		      driver.navigate().to("https://www.facebook.com/"); 
			
		      if(driver.findElement(By.id("u_0_v")).isEnabled()) { 
		         System.out.println("Test 1 Pass"); 
		      } else { 
		         System.out.println("Test 1 Fail"); 
		      } 
		      driver.close(); 
	}

}
