package SingUpPagePackage;

import SignUpPagePackage.SignUpClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SignUpClassNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//home//mohinimagar//eclipse-workspace//TrinkaProject//target//Externaljars//chromedriver");
		  WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://cloud.trinka.ai/signup?_rg=GB&source=(direct)&medium=(none)");
       SignUpClass signUpClass = new SignUpClass(driver);
       signUpClass.GenerateRandomEmail();
       signUpClass.Password();
       signUpClass.FirstName();
       signUpClass.LastName();
       signUpClass.CreateAccount();
	
	}

}
