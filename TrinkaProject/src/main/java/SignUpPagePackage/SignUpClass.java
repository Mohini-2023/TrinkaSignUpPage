package SignUpPagePackage;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpClass {

	@FindBy (xpath = "//input[@id='userEmail']")
	private WebElement generateRandomEmail;

	@FindBy (xpath = "//input[@id='userSignUpPassword']")
	private WebElement password;

	@FindBy (xpath = "//input[@id='userFirstName']")
	private WebElement firstName;
	
	@FindBy (xpath = "//input[@id='userLastName']")
	private WebElement lastName;
	
	@FindBy (xpath = "//button[@id='signUpRegister']")
	private WebElement createAccount;

	public SignUpClass(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);	
	}
	public void GenerateRandomEmail ()
	{
		Random randomGenerator = new Random();  
		  int randomInt = randomGenerator.nextInt(1000);  
		  generateRandomEmail.sendKeys("mohinimagar"+ randomInt +"@gmail.com");
	//  emailId.sendKeys("mohiimagar186@gmail.com");
		
	}
	public void Password ()
	{
		password.sendKeys("Mohini@123");
	}
	
	public void FirstName ()
	{
		firstName.sendKeys("Mohini");
	}
	public void LastName ()
	{
		lastName.sendKeys("Magar");
	}
	public void CreateAccount ()
	{
		createAccount.click();
	}
}

