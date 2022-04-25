package Testing;

import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webapplication {

	public static void main(String[] args) throws IOException, InterruptedException {
	
	        
        System.setProperty("webdriver.chrome.driver","E:\\Phase-5\\chromedriver\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		
		WebElement Email= driver.findElement(By.id("id_email"));
		Email.sendKeys("Lokesh194@gmail.com");
		
		WebElement name =driver.findElement(By.id("id_name"));
		name.sendKeys("Lokesh P R");
		
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9629353959");
		
		
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Lokesh@123");
			
	    WebElement button= driver.findElement(By.id("registerButton"));
	    button.click();
	        
    
		 //Login
	    
         System.setProperty("webdriver.chrome.driver","E:\\Phase-5\\chromedriver\\chromedriver.exe");
		
		
		 WebDriver driver1= new ChromeDriver();
		 driver1.get("https://www.shine.com/Login/");
	    
	    
	    
	        WebElement email =driver1.findElement(By.id("email"));
	    	email.getAttribute("placeholder");
	    	System.out.println(email.getAttribute("placeholder"));
	    	
	    	email.sendKeys("Lokesh98@gmail.com");
	    	email.submit();
	    	
	    	WebElement Pass1= driver1.findElement(By.id("id_password"));
	    	Pass1.sendKeys("Lokesh@123");
	    	
	    	WebElement login = driver1.findElement(By.name("login"));
	    	login.click();
	        
	        
	        
	}

}
