package sel.practice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
 
public class Google {
 
public static void main(String[] args) {
 
	String a=10;
	
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
 
// Initialize browser
WebDriver driver=new ChromeDriver();
 
// Open google
driver.get("http://www.google.com");
 
// Maximize browser
 
driver.manage().window().maximize();



try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
System.out.println("tc passed"+a);
driver.quit();
}
 
}