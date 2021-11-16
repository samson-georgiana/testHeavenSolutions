package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
public class MyClass {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Georgiana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://politrip.com/account/sign-up";
        String expectedTitle = "Sign up | Politrip";
        String actualTitle = "";
        

        
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("sign-up-password-input"));
        WebElement heard = driver.findElement(By.id("sign-up-heard-input"));
        WebElement confirmPassword = driver.findElement(By.id("sign-up-confirm-password-input"));
        
//         compare the actual title of the page with the expected one and print
//         the result as "Passed" or "Failed"
//         
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test title of the page Passed!");
        } else {
            System.out.println("Test title of the page Failed");
        }
        
//        check if required field exist in page
//        the result as "Passed" or "Failed"
//        
        
        if(firstName.isDisplayed() & lastName.isDisplayed() & email.isDisplayed() & password.isDisplayed() & heard.isDisplayed() & confirmPassword.isDisplayed())
        {
        	System.out.println("Test required fields exist Passed!");
        	
        }
        else {
        	System.out.println("Test required fields exist Failed");
        }
        

        
        firstName.sendKeys("Samson");
        lastName.sendKeys("Georgiana-Alexandra");
        email.sendKeys("georgianasam2007@yahoo.com");
//        Password must contain at least 8 characters, 1 uppercase letter, 1 lowercase letter and 1 digit
        password.sendKeys("1234567");
        confirmPassword.sendKeys("1234567");
        heard.sendKeys("socialNetworks");
        System.out.println("Social ....");
        
	
		WebElement signUp = driver.findElement(By.id(" qa_loader-button"));
	/*	   System.out.println("SignUp...."); signUp.click();
		 * System.out.println("SignUp click...");
		 * 
		 * if(driver.getCurrentUrl().contentEquals(baseUrl) == false) {
		 * System.out.println("Test required fields exist Passed!");
		 * 
		 * } else { System.out.println("Test required fields exist Failed"); }
		 */
        
        //close Chrome
        driver.close();
       
    }

}